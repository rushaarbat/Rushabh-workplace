import { useState } from "react";

export default (WrappedComponent) =>{
    //return Testcomponent;
    return ()=>{
        const [value, setValue] = useState(0);

        const onClickHandler =()=>{
            setValue(value +1);
        };
        return <WrappedComponent value ={value} onClickHandler={onClickHandler}/>;


        //Const TestComponent = ( )=>{
            //return <h1> I AM IN withOrder</h1>
        }
    }
