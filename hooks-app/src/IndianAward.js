import {useState} from "react";
import withLogic from "./withLogic";

const IndianAward= (props)=>{
    const award=["Padmashree","Padma-Bhushan","Padma-vibhushan","BharatRatna"]
    // const [value, setValue] = useState(0);
    // const onClickHandler=()=>{setValue(value+1)} // We'll get this logic from Parent comp "withLogic"
    return(
        <>
        <h1>Indian Awards</h1>
        <i><h2>Civilian Awards: {award[props.value]}</h2></i>
        <button onClick={props.onClickHandler}>Next Award</button>
        </>
    )
}
export default withLogic(IndianAward);