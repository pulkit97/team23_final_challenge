
import Login from "./pages/LoginPage/Login";
import { BrowserRouter as Router, Routes } from "react-router-dom";
import Dashboard from "./pages/DashboardPage/Dashboard";
import LandingPage from "./pages/LandingPage/LandingPage";
import DetailPage from "./pages/DetailPage/DetailPage";
import React, { useState, useEffect } from "react";
import UserBonds from "./pages/UserBondsPage/UserBonds";
import { Route } from "react-router-dom";
import { Navigate } from "react-router-dom";
import "./App.css"

const App = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <>
      <Router>
        <Routes>
          <Route path="/login" element={<Login setIsLoggedIn={setIsLoggedIn} />} />
          
          <Route 
            path="/dashboard" 
            element={isLoggedIn ? <Dashboard /> : <Navigate to="/login" replace />} 
          />

          <Route 
            path="/landingpage" 
            element={isLoggedIn ? <LandingPage /> : <Navigate to="/login" replace />} 
          />

          <Route 
            path="/detail/:isin" 
            element={isLoggedIn ? <DetailPage /> : <Navigate to="/login" replace />} 
          />

          <Route 
            path="/userbonds" 
            element={isLoggedIn ? <UserBonds /> : <Navigate to="/login" replace />} 
          />
        </Routes>
      </Router>
    </>
  );
};


export default App;
