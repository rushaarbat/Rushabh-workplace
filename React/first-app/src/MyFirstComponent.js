import FirstChild1 from "./FirstChild1";
import SecondChild2 from "./SecondChild2";
import ThirdChild from "./ThirdChild";

function MyFirstComponent(props){
    const {parentComponentName} = props
    return(

        <>
        <h2> Hello form first component called from app</h2>
        <FirstChild1 parentComponentName={"MyFirstComponent"} />
        <SecondChild2 parentComponentName={"MyFirstComponent"}/>
        <ThirdChild parentComponentName={"MyFirstComponent"}/>
        </>
    );
};
export default MyFirstComponent;