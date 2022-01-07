import react from "react";
import React from "react";

export default () => {
  // //return <h1> InDemoComponent   </h1>

  // return React.createElement("h1",null, "In DemoComponent");

  //-----------------------------------------------------//

  // //retun
  //     <div>
  //         <h1> In DemoComponent</h1>
  //     </div>

  //   return react.createElement(
  //     "div",
  //     null,
  //     React.createElement("h1", null, "In DemoComponent")
  //   );

  //----------------------------------------------//
  // //retun
  //     <div>
  //         <h1 style={{backgroundColor:"red"}}> In DemoComponent</h1>
  //         <h2> In DemoComponent</h2>
  //     </div>

  //   return react.createElement(
  //     "div",
  //     null,
  //     React.createElement(
  //       "h1",
  //       { style: { backgroundColor: "red" } },
  //       "In DemoComponent"
  //     ),
  //     React.createElement(
  //       "h2",
  //       { style: { backgroundColor: "yellow" } },
  //       "In DemoComponent"
  //     )
  //   );

  //------------------------------------------------------------//
  //   return (
  //     <div>
  //       <h1 style={{ backgroundColor: "red" }}>My Heading </h1>
  //       <h2 style={{ backgroundColor: "green" }}>My Sub-Heading</h2>
  //       <div style={{ backgroundColor: "yellow" }}>
  //         <p style={{ color: "orange" }}> This is my first paragraph</p>
  //         <p style={{ color: "blue" }}> This is my second paragraph</p>
  //       </div>
  //     </div>
  //   );

  //******************** */
  return react.createElement(
    "div",
    null,
    React.createElement(
      "h1",
      { style: { backgroundColor: "red" } },
      "My Heading"
    ),
    React.createElement(
      "h2",
      { style: { backgroundColor: "green" } },
      "My Sub-Heading"
    ),
    React.createElement(
      "div",
      { style: { backgroundColor: "yellow" } },
      React.createElement(
        "p",
        { style: { color: "orange" } },
        "This is my first paragraph"
      ),
      React.createElement(
        "p",
        { style: { color: "blue" } },
        "This is my second paragraph"
      )
    )
  );
};
