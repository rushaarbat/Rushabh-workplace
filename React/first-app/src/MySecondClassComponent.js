import React, {Component, component} from "react";
class MySecondClassComponent extends Component {

    
     state = {
      balance:0,
        
     };


    balancceIncrement = (value) => {
        this.setState({balance: this.state.balance + value})
    }


    // profitHandler = ()=>{
    //     console.log("Profit");
    //     this.balancceIncrement(1);
    // }

    // doubleProfitHandler = ()=>{
    //         console.log("Doublerofit");
    //         this.balancceIncrement(100);
    //     }
    



    render() {
        const {name,age} =this.props;
        return (<>



        <h1> In Parent</h1>
        <Child/>
            {/* <h2> I am  {name},{age} years of old and my balance is {" "} {this.state.balance}
            </h2>
            <button onClick = {this.profitHandler}>
                Profit
            </button>

            <button onClick = {this.doubleProfitHandler}>
             DoubleProfit
            </button> */}
            </>
        );
    }
}
export default MySecondClassComponent;