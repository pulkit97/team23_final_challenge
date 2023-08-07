import React, { useEffect, useState } from "react";
import {
  Grid,
  Card,
  CardContent,
  CardHeader,
  Select,
  MenuItem,
  Modal,
  List,
  ListItem,
  ListItemText,
  Box,
  Typography,
} from "@mui/material";
import NavBar from "../../components/NavBar/NavBar";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 400,
  height: 500,
  overflowY: "scroll",
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
};

const Dashboard = ({ setIsLoggedIn }) => {
  const [groupedDates, setGroupedDates] = useState([]);
  const [selectedValue, setSelectedValue] = useState("");
  const [openModal, setOpenModal] = useState(false);
  const [selectedBonds, setSelectedBonds] = useState([]);
  const [selectedDate, setSelectedDate] = useState("");
  const [bondDetails, setBondDetails] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    fetchNextOrPreviousDates(0);
  }, []);

  const fetchNextOrPreviousDates = (days) => {
    const endpoint =
      days > 0
        ? "http://localhost:8080/api/v1/calendar/next-five-days"
        : "http://localhost:8080/api/v1/calendar/previous-five-days";

    axios
      .get(endpoint)
      .then((response) => {
        console.log("Response data:", response.data);

        const dataByDate = response.data.reduce((acc, curr) => {
          const date = curr.maturityDate.split("T")[0];
          if (!acc[date]) {
            acc[date] = [];
          }
          acc[date].push(curr);
          return acc;
        }, {});

        setGroupedDates(Object.entries(dataByDate));
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  };

  const handleChange = (event) => {
    setSelectedValue(event.target.value);
    fetchNextOrPreviousDates(event.target.value);
  };

  const handleCardClick = (dateString, bonds) => {
    setSelectedBonds(bonds);
    setSelectedDate(dateString);
    setOpenModal(true);
  };

  const handleCloseModal = () => {
    setOpenModal(false);
  };

  const handleISINClick = (isin) => {
    console.log("Trying to navigate to details for ISIN:", isin); 
 
    navigate(`/detail/${isin}`);

};


  return (
    <>
      <NavBar setIsLoggedIn={setIsLoggedIn} />
      <Select value={selectedValue} onChange={handleChange}>
        <MenuItem value={-5}>-5 days</MenuItem>
        <MenuItem value={5}>+5 days</MenuItem>
      </Select>
      <Grid
        container
        spacing={2}
        direction="row"
        justify="center"
        className="container"
      >
        {groupedDates &&
          groupedDates.map(([dateString, bonds], index) => {
            const date = new Date(dateString);
            return (
              <Grid item xs={2} key={index} className="grid-content">
                <Card onClick={() => handleCardClick(dateString, bonds)}
                sx={{cursor:"pointer"}}>
                  <CardHeader
                    title={date.toLocaleDateString("en-US", {
                      weekday: "long",
                      day: "numeric",
                      month: "long",
                      year: "numeric",
                    })}
                    subheader={`Total Bonds: ${bonds.length}`}
                  />
                </Card>
              </Grid>
            );
          })}
      </Grid>
      <Modal
        open={openModal}
        onClose={handleCloseModal}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Typography id="modal-modal-title" variant="h6" component="h2">
            {`Bonds for ${new Date(selectedDate).toLocaleDateString("en-US", {
              weekday: "long",
              day: "numeric",
              month: "long",
              year: "numeric",
            })}`}
          </Typography>
          <List>
            {selectedBonds &&
              selectedBonds.map((bond) => (
                <ListItem
    key={bond.id}
    button
    onClick={() => handleISINClick(bond.isin)}
>
                  <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                    {bond.isin}
                  </Typography>
                </ListItem>
              ))}
          </List>
        </Box>
      </Modal>
    </>
  );
};

export default Dashboard;
