import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Login from "../components/Login";
import Home from "../components/Home";
import Authenticate from "../components/Authenticate";

const AppRoutes = () => {
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/authenticate" element={<Authenticate />} />
        <Route path="/" element={<Home />} />
      </Routes>
    </Router>
  );
};

export default AppRoutes;
