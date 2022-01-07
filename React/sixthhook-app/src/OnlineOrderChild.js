export default(props)=>{
    console.log(props);
    const {onClickHandler}=props;
    return(
        <>
        <h1>InChild </h1>
        <button onClick={props.onClickHandler}>Click from Child</button></>
    )
}