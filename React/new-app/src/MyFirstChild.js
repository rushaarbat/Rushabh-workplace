import react,{ Component } from "react";
class MyFirstChild extends Component{
  state = {
    balance:0,
   };



   onChildProfit= ()=>{
this.setState({balance:this.state.balance+1})
   }

   onChildExpence= ()=>{
    if (this.state.balance===0){
      return;
  }
    this.setState({balance:this.state.balance-1})
       }




    render() {
        const {name,balanceIncrement,onExpence} = this.props;

        const onProfitOfChild=()=>{
          console.log("Hellow this isfor profit from child");
          balanceIncrement();
          this.onChildProfit();
          
        }
        const onExpenceOfChild=()=>{
          console.log("Hellow this is for expence from child");
          this.onChildExpence();
          onExpence();

        }

        return (
          <>
            <h1> {name} : {this.state.balance} </h1>
            {/* <button onClick={balanceIncrement}> profit</button> */}
            <button onClick={onProfitOfChild}> profit</button> 
            {/* <button onClick={onExpence}> Expence</button> */}
            <button onClick={onExpenceOfChild}> Expence</button>
          </>
        );
      }
};
export default MyFirstChild;