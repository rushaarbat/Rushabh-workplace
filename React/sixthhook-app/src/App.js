import logo from "./logo.svg";
import "./App.css";
import ClassComponentConversion from "./ClassComponentConversion";
import FunctionComponent from "./FunctionComponent";
import OnlineOrder1 from "./OnlineOrder1";
import UseEffectExample from "./UseEffectExample";
import Reconcilliation from "./Reconcilliation";
import NewReconcilliation from "./NewReconcilliation";
// import OnlineOrders from './OnlineOrders';
// import OfflineOrders from './OfflineOrders';

function App() {
  return (
    <div className="App">
      <h1>I am from App</h1>
      {/* <ClassComponentConversion/>
      <FunctionComponent/> */}
      <OnlineOrder1 />
      {/* <OfflineOrders /> */}
      {/* <OnlineOrder1/> */}
      {/* <UseEffectExample /> */}
      {/* <Reconcilliation /> */}
      {/* <NewReconcilliation /> */}
    </div>
  );
}

export default App;
