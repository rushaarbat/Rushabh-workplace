import logo from './logo.svg';
import './App.css';
import HooksSample from './HooksSample';
import PortalDemo from './PortalDemo';
import ProfilerDemo from './ProfilerDemo';
import UserCreate from './UserCreate';
import UserRead from './UserRead';
import UserDelete from './UserSample';
import UserSample from './UserSample';

function App() {
  const onClickHandler = () =>{
    console.log("Clicked");
  }
  return (
    <div className="App" onClick={onClickHandler}>
     {/* <HooksSample/> */}
     {/* <PortalDemo/>
     <ProfilerDemo/> */}
     {/* <UserCreate/> */}
     <UserSample/>
     
         </div>
  );
}

export default App;
