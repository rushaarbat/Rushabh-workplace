import "./App.css";
import { Routes, Route } from "react-router";
import Navbar from "./Navbar";
import UserRead from "./UserRead";
import UserDelete from "./UserDelete";
import UserCreate from "./UserCreate";
import UserUpdate from "./UserUpdate";
import UserUpdate2 from "./UserUpdate2";

function App() {
  return (
    <div className="container-xxl">
      <Navbar />
      <Routes>
        <Route path={"/read"} element={<UserRead />}></Route>
        <Route path={"/delete"} element={<UserDelete />}></Route>
        <Route path={"/create"} element={<UserCreate />}></Route>
        <Route path={"/update"} element={<UserUpdate />}></Route>
        <Route path={"/update2"} element={<UserUpdate2 />}></Route>
      </Routes>
    </div>
  );
}

export default App;
