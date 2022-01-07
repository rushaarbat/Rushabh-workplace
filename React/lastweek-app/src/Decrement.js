import { useState } from "react";   
 

export default (props)=>{
return(
    <>
    <h1> In Decrement</h1>
    value : {props.value}
    <button onClick={props.onNewClickHandeler}>Decrement</button>
    </>

)
}