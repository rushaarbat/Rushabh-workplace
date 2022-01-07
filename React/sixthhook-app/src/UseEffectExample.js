import { render } from "@testing-library/react";
import { useEffect, useState } from "react";        
import UseMyLog from "./UseMyLog";
import UseUserStatus from "./UseUserStatus";

export default ()=>{
    const [value, setValue] = useState(0);
    const [newValue,setNewValue]= useState(0);
//useMyLog(value);
//useMyLog(newValue);

//
const Status = UseUserStatus(value);
    const onClickHandler = ()=>{
        setValue(value + 1);

    };
    const onNewValueClickHandler = () =>{
        setNewValue(newValue + 1);
    };
    // useEffect(() =>{
    //     console.log("rendered");     //execute every time after component is rendered/updated
    // });
    useEffect(() =>{
        console.log("rendered");    //execute only once after component is rendered

    },[]);

    // useEffect(()=> {
    //     console.log("value Update");
    //  return () =>{     
    //      //clean up                   // clean up function
    //      console.log("Clean Up");
    //  }
    // }, [value]);  //exicute everytime when value will get update

    return (
        <> 
        <h1> Use Effect Example Component</h1>
        <div>user:{Status}</div>
        <div> Value:{value}</div>
        <div> New Value :{newValue}</div>
        <button onClick={onClickHandler}>Click Me</button>
        <button onClick={onNewValueClickHandler}>
            Click Me to Update new Value
        </button>
        </>

    )
}