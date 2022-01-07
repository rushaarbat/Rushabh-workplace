import React from "react";

//create a new contexrt
const PersonContext =React.createContext();

//Provider
 const PersonProvider =PersonContext.Provider;

 //consumer

const PersonConsumer = PersonContext.Consumer;

//expose object                                 
export { PersonProvider, PersonConsumer};