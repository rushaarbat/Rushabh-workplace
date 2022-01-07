const redux = require("redux");
// consol.log(redux);


//create base state object

const initialState = {
    counter : 0
};

//create a new reducer

 const reducer = (state = initialState, action)=>{
//     if (action.type === "increment"){
//         return{
//             counter: state.counter +1,
//         };


//     }else if (action.type === "decrement"){
//         return{
//             counter:state.counter - 1,
//         }
//     }else{
//         return state;
//     }
// }

//********** by switch case********* */
const { value, type }=action;
    switch (type ){
        case "increment":
            return{
                counter: state.counter +value,
                 
    };
    case "decrement":
        
        return{
            counter:state.counter - value,
        }
        
        default :
        return state;
   
    }
}

//create a new store 
const store  = redux.createStore(reducer);


//consol.log(store)

//subcription Handler
 const storeSubscriber =()=>{
     const currentState = store.getState();
     console.log(currentState);
 };

 //Subcribe to the store
 store.subscribe(storeSubscriber);

 //Dispatch
 store.dispatch({ type: "increment",value: 8});
 s
 store.dispatch({type: "decrement",value: 1})


