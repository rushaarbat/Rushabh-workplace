import React from "react";
export default React.forwardRef((props, ref)=>{
    return(
        <>
        <input ref={ref} className="my-custom-class"></input>
        {/* <button onClick={ref}>Click Me</button> */}
        </>
    )
})