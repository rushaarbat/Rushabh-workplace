
// import './App.css';
// import ConditionalComponent from './ConditionalComponent';
import FormComponent from './FormComponent';
import LifeCycle from './LifeCycle';
import LifeCycleUpdate from './LifeCycleUpdate';
import ListComponent from './ListComponent';
import NewPersonComponent from './NewPersonComponent';
import PersonFormComponent from './PersonFormComponent';
// import FalseComponent from './FalseComponent';
// import TrueComponent from './TrueComponent';
// import MySecondParentsClass from './MySecondParentsClass';
function App() {
  //const name="Rushabh";
  return (
     <div className="App">
    {/* <MySecondParentsClass/> */}               
    <h1> from app</h1>
{/* 
    {name ==="Rushabh" ? <TrueComponent/>:<FalseComponent/>}
    {name==="Rushabh" && <TrueComponent/>} */}

    {/* <ConditionalComponent/> */}
    {/* <ListComponent/> */}
    {/* <FormComponent/> */}
    {/* <PersonFormComponent/> */}
    {/* <NewPersonComponent/> */}
    <LifeCycle/>
    <LifeCycleUpdate/>
    </div>
    
  );
};

export default App;
