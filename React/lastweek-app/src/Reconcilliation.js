import react from "react";
import { useEffect, useState } from "react/cjs/react.development";

export default () => {
  const [value, setvalue] = useState(0);
  useEffect(() => {
    setInterval(() => {
      console.log("hi");
      setvalue(value + 1);
    }, 2000);
  });
  return (
    <h1 style={{ backgroundColor: value % 2 ? "red" : "green" }}>
      {" "}
      In Reconcillaiation
    </h1>
  );
};
