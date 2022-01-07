import React from "react";  

//we create New Context
const UserContext = React.createContext();

//provider
const UserProvider = UserContext.Provider;

//consumer
const UserConsumer = UserContext.Consumer;

//expose object
export { UserProvider, UserConsumer};