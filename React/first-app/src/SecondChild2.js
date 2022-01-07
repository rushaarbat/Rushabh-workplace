export default (props) => {
    const {parentComponentName} = props
    return (

        <>

        <h2> It'S Second Child from {parentComponentName}</h2>
        </>
    );
};