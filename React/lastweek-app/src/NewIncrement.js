import { useState } from "react";       

export default (props)=>{

    return(
        <>
        <h1> IN New Increment</h1>
        value : {props.value}
        <button onClick={props.onClickHandeler}>Increment </button>
        </>
    )
}