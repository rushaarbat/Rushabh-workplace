import { useState } from "react";
import OnlineOrderChild from "./OnlineOrderChild";
// import OnlineOrderChild from "./OnlineOrderChild";

const OnlineOrder1 =()=>{
    // console.log(props);
    const status = [
        "Order Placed  ",
        "pending",
        "preparing",
        "Out Of delivery",
        "delivered",
    ]
    const [value, setValue] = useState(0);

    const onClickHandler =()=>{
        setValue(value +1);
    };
    return(
        <>
<h1> Online Order</h1>
<div> Current Status:{status[value]}</div>
<button onClick={onClickHandler}>Next status</button>
<OnlineOrderChild onClickHandler={onClickHandler}/>

        </>
    );
};
export default OnlineOrder1;