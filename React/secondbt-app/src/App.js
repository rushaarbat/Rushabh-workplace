import logo from './logo.svg';
import './App.css';
import HeaderComponent from './HeaderComponent';
import NavbarComponent from './NavbarComponent';
import BodyComponent from './BodyComponent';
import FooterComponent from './FooterComponent';
//import { Route, Routes } from "react-router-dom"; 
//import PostComponent from './PostComponenet';
import React from 'react';
import { Suspense } from 'react';
import ErrorBoundry from './ErrorBoundry';
import SampleError from './SampleError';
import FragmentSample from './FragmentSample';
const PostComponent = React.lazy(()=> import("./PostComponenet"));
//import TodoComponent from './TodoComponent';
const TodoComponent = React.lazy(()=> import("./TodoComponent"));

const codesplitting = React.lazy(()=> import("./CodeSplitting"));
//import ResultComponent from "./Resultcomponent";

function App() {
  return (
    <div className="App">
     <HeaderComponent/>
     {/* <NavbarComponent/> */}
     <FragmentSample/>
     {/* <ErrorBoundry>
<SampleError/>
     </ErrorBoundry> */}

{/*      
<Suspense fallback={<h1> Loading.........</h1>}>
  <codesplitting/>
  

     <Routes>
     <Route path={"/post"} element={<PostComponent />} />
        <Route path={"/todo"} element={<TodoComponent />} />
        {/* <Route path={"/user"} element={<UserComponents />} /> */}
     

 

     
     
     {/* <FooterComponent/> */}
    </div>
  );
}

export default App;
