//import logo from './logo.svg';
//import './App.css';

// import MyFourthComponent from "./MyFourthComponent";
// import MyThirdComponent from "./MyThirdComponent";
import MySecondClassComponent from "./MySecondClassComponent";

// import MyFirstComponent from "./MyFirstComponent";
// import MySecondComponent from "./MySecondComponent";
import MyFirstClassComponent from "./MyFirstClassComponent";
import PropsValidate from "./PropsValidate";
function App() {
 const name = " RUSHABH";

  return (
    <>
      <MyFirstClassComponent name={"Chetan"} age={24}/>
      
      <>
      <MySecondClassComponent name={"Rushabh"} age={23}/>
      </> 
      {/* <PropsValidate name = {"Rushabh"} age={24} 
      renderable={"some String"}
      rollNumber={10}
      remark={"Some Remark"}
      myArr ={[1,2,3]}
      myObject= {{name: "Rushabh",age: 25,mobail:"12345654"}}
      
      >

        <h1> Hello</h1>

        </PropsValidate> 
    </div> 

    {/* // <>
    //   <h1> HELLO {name && name.length ? name : "World"} </h1>
    //   <>
       <MyFirstComponent parentComponentName={"App"}/> 
    //   </>
    //   <>
    //   <MySecondComponent parentComponentName={"App"}/> 
    //   </>
      
    //    {/* <MyFirstComponent />z
    //  <MySecondComponent />  */}

       {/* <MyThirdComponent name ={name} age={25}> 
       <h2> ITS MyThirdComponenet called from app</h2>
       </MyThirdComponent>

       <MyFourthComponent name ={name} age={29}> 
       <h2> ITS MyForthComponenet called from app</h2>
       </MyFourthComponent> */}
       </>
  );
};

export default App;
