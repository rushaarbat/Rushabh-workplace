import { Profiler, useState } from "react"

export default ()=>{
    const[value, setValue]= useState("");
    const onChangeHandler=(event)=>{
        setValue(event.target.value);
    }
    return(
        <>
        <h1>in Profiler Demo</h1>
        {/* <Profiler id={"inputProfiler"} onRender={(...args)=>{console.log(args);}}> */}
        <Profiler id={"inputProfiler"} onRender={(...interactions)=>{console.log(interactions);}}>
        <input value={value} onChange={onChangeHandler}></input>
        </Profiler>
        </>
    )
}