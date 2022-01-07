import FirstChild1 from "./FirstChild1";
import SecondChild2 from "./SecondChild2";
import ThirdChild from "./ThirdChild";

function MySecondComponent(props){
    const{parentComponentName} = props
    return(

        <>
        <h2> Hello form My second Component called from app</h2>
        <FirstChild1 parentComponentName={"MySecondComponent"}/>
        <SecondChild2 parentComponentName={"MySecondComponent"}/>
        <ThirdChild parentComponentName={"MySecondComponent"}/>
        </>
    );
};
export default MySecondComponent;