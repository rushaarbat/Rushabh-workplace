import logo from "./logo.svg";
import "./App.css";
import Navbar from "./Navbar";
import Header from "./Header";
import Body from "./Body";
import Footer from "./Footer";

import { Route, Routes } from "react-router-dom";
import ResultComponent from "./ResultComponent";
import PostComponent from "./PostComponenet";
import TodoComponent from "./TodoComponent";

function App() {
  return (
    <div className="App">
      <Header />
      <Navbar />
      <Routes>
        <Route path={"/post"} element={<PostComponent />} />
        <Route path={"/todo"} element={<TodoComponent />} />
      </Routes>

      <Footer />
    </div>
  );
}

export default App;
