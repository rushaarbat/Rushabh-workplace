
function MyThirdComponent(props){
    // const { name,age } = props;
    console.log (props);
    const {name,age,children } = props;
    console.log(name);
    console.log (age);
    return (
        <>   
        <h2> HELLO I AM {name} ,I AM{age} YRS OLD AN I AM INSIDE MyThirdComponent</h2>
        {children}
        
            </>
    );
}
export default MyThirdComponent;