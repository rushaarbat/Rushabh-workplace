import { useState } from "react";       

export default ()=>{

    //const stateArr = useState(0)
    //const [ value, setValue] =stateArr;
    const [value, setValue] = useState(0);  //same as above 2 line
const onclickHandler = ()=>{
    setValue(value +1);
}
    const onClickDecrementkHandler =()=>{
        if (value<=0){
            return
        }
        setValue(value -1);
        
    }

return(
    <>
    <h1> value: {value}</h1>
    <button onClick={onclickHandler}>Increment</button>
    <button onClick={onClickDecrementkHandler}>Decrement</button>
    </>
)
}