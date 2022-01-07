import $ from "jquery";
export default () => {
  const onClickHandler = () => {
    const element = document.getElementById("jquery-operation");
    if (element) {
      console.log("element found");
      $(element).slideToggle();
    } else {
      console.log("element not found");
    }
  };
  return (
    <>
      <h1>jquery Demo</h1>
      <div id="jquery-operation" style={{ backgroundColor: "cyan" }}>
        I'm aaplying Jquery to this text
      </div>
      <button onClick={onClickHandler}>Click Me</button>
    </>
  );
};
