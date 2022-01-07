

function MyFourthComponent(props){
    const { name,age } = props;
    
    console.log (name);
    console.log (age);
  
    return (
        <>   
        <h2> HELLO I AM {name} ,I AM{age} YRS OLD AN I AM INSIDE MyForthComponent</h2>
        
            </>
    );
}
export default MyFourthComponent;