import React from "react";
import RefChild from "./RefChild";
export default()=>{
    const inputRef = React.createRef();
    const onButtonClick=()=>{
        console.log(inputRef);
        inputRef.current.focus();
    }
    
    return(
        <>
        <h1>In RefParent</h1>
        <RefChild ref={inputRef}/>
        <button onClick={onButtonClick}>Click Me</button>
        </>
    )
}