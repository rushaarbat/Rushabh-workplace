import logo from "./logo.svg";
import "./App.css";
// import "./Styles.scss";
import NormalProp from "./NormalProp";
import Incrementer from "./Incrementer";
import Increment from "./Increment";
import NewIncrement from "./NewIncrement";
import Decrementer from "./Decrementer";
import Decrement from "./Decrement";
import NewDecrement from "./NewDecrement";
import DemoComponent from "./DemoComponent";
import ConditionalRenderedComponent from "./ConditionalRenderedComponent";
import SassDemo from "./SassDemo";
import RadiumDemo from "./RadiumDemo";
import TestComponent from "./TestComponent";
import JqueryDemo from "./JqueryDemo";
function App() {
  // const [showcomponent, setShowComponent] = useState(true);
  // const onClickhandler = () => {
  //   console.log("clicked");
  //   setShowComponent(!showcomponent);
  // };
  return (
    <div className="App">
      <h1>I Im IN App</h1>
      <JqueryDemo />

      {/* <TestComponent name={"Rushabh"} /> */}
      {/* <SassDemo /> */}
      {/* <RadiumDemo /> */}
      {/* <NormalProp render={(someValue) =>{
        return "old Name  "  +someValue;
      }}/>

      <Incrementer 
      render ={(value, onClickHandler) =>{
        return < Increment value={value} onClickHandler={onClickHandler} />
      }}/>

      <Incrementer 
      render ={( value, onClickHandeler) =>{
        return< NewIncrement value={value} onClickHandeler={onClickHandeler}/>
      }}/>


      <Decrementer 
       render ={(value, onNewClickHandeler) =>{
        return <Decrement value={value} onNewClickHandeler={onNewClickHandeler} />;
      }}/>

<Decrementer 
       render ={(value, onNewClickHandeler) =>{
        return < NewDecrement value={value} onNewClickHandeler={onNewClickHandeler} />;
      }}/> */}

      {/* <DemoComponent/> */}
      {/* 
      <br />
      <button onClick={onClickhandler}>Toggle Component</button>
      {showcomponent && <ConditionalRenderedComponent />} */}
    </div>
  );
}

export default App;
