import {useState} from "react";
import withLogic from "./withLogic";

const CricketCareer=(props)=>{

    const steps=["School level","District Level","Domestic level","IPL level","International level"]

    // const [value, setValue] = useState(0);
    // const onClickHandler=()=>{setValue(value+1);}
    
    return(
        <>
        <h1>Cricket Career</h1>
        <i><h2>Steps are: {steps[props.value]}</h2></i>
        <button onClick={props.onClickHandler}>Next Step</button>
        </>
    )
}
export default withLogic(CricketCareer);