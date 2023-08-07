import React from "react";
import { Link, NavLink } from "react-router-dom";
import { AppBar, Toolbar, Typography, Button } from "@mui/material";
import { useNavigate } from "react-router-dom";
import ".//NavBar.css"
import logo from "./logo.svg";
import { createTheme, ThemeProvider } from "@mui/material/styles";
const theme = createTheme({
  palette: {
    primary: {
      main: "#81D4FA", // Baby blue color
    },
  },
});
const NavBar = ({  setIsLoggedIn }) => {
  
  const navigate = useNavigate();
  const handleLogout = () => {
    // Remove the loggedInUser from local storage
    localStorage.removeItem("loggedInUser");
    
    // Set the loggedIn state to false
    setIsLoggedIn(false);
  };
  

  return (
    <AppBar position="static" className="AppBar" style={{ backgroundColor: theme.palette.primary.main }} >
      <Toolbar>
      <div className="logoContainer" >
          <img src={logo} alt="Logo" className="logoImage" />
          <Typography variant="h6" component="div" sx={{buttonStyles, color:"blue"}}>
            Deutsche Bank
          </Typography>
          </div>
          <div className="navLinks">
          <Button
            color="inherit"
            component={NavLink}
            to="/dashboard"
            className="linkButton"
          sx={buttonStyles}
          
        >
          Calendar View
        </Button>
        <Button
          color="inherit"
          component={NavLink}
          to="/landingpage"
          className="linkButton"
          sx={buttonStyles}
        >
        
          Bonds
        </Button>
      

        <Button
          color="inherit"
          component={NavLink}
          to="/userbonds"
          className="linkButton"
          sx={buttonStyles}
        >
         My Bonds
        </Button>
</div>
<div className="logoutButtonContainer" >
          <Button
            color="inherit"
            component={Link}
            onClick={handleLogout}
            className="linkButton logoutButton"
      sx={{buttonStyles, color:'white'}}
    >
      LogOut
    </Button>
    </div>
      </Toolbar>
    </AppBar>
  );
};

export default NavBar;
const buttonStyles = {
  fontFamily: "Montserrat, sans-serif", // Utilizăm fontul Montserrat, importat din Google Fonts
  fontSize: "1rem",
  fontWeight: "bold",
  color: "#fff",
  textTransform: "none",
  marginRight: "10px", // Spațiere între butoane
};






