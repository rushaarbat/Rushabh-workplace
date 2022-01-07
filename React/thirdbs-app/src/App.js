import logo from './logo.svg';
import './App.css';
import Accessibility from './Accessibility';
//  import { PersonProvider } from './PersonContext';
//  import ContextCunsumer from './ContextConsumer';
 import { UserProvider } from './UserContext';
 import ContextUserConsumer from './ContextUserConsumer';
import React from 'react';
const codesplitting = React.lazy(()=> import("./CodeSplitting"));
function App() {
 
  
  return (
    <div className="App">
      {/* <PersonProvider value={{ name: "Rushabh", age :29}}> 
      <ContextCunsumer/>
      
      </PersonProvider> */}
      {/* <Accessibility/> */}
      <h1> From App</h1>
<UserProvider value={{ name: "Rushabh", id: 101, password:"*****"}}>
  <ContextUserConsumer/>

</UserProvider>

    </div>
  );
}

export default App;
