export default (props) => {
    const {parentComponentName} = props
    return (

        <>

        <h2> ITS FirstChild  called from {parentComponentName}</h2>
        </>
    );
};