import react,{ Component } from "react";
import MyFirstChild from './MyFirstChild';
class MySecondParentsClass extends Component{
   
    state = {
        balance:0,
          
       };
  
      balancceIncrement = (value) => {
          this.setState({balance: this.state.balance + 1})
      }
  
      onExpence = (value) => {
          if (this.state.balance===0){
              return;
          }
        this.setState({balance: this.state.balance - 1})
    }
render(){

          return(<>
              <h1> parents: {this.state.balance}</h1>
              <button onClick={this.balancceIncrement}>family profit</button>
              <button onClick={this.onExpence}>family Expence</button>
              <MyFirstChild name={"Rushabh"} balanceIncrement={this.balancceIncrement} onExpence={this.onExpence}/>
              <MyFirstChild name={"Chetan"} balanceIncrement={this.balancceIncrement} onExpence={this.onExpence}/>
           
              </>
          );

      }
};

export default MySecondParentsClass;