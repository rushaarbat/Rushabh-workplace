
const redux = require("redux");
//console.log("redux");


const initialState = {
counter :0,
};

// creat a new reducer
const reducer = (state = initialState, action) => {

const {value, type} = action; // type is used to indentify the key and
// value used to provide the values of destructure keys.
switch (type) {
case "increement": return {counter : state.counter + value } ;

case "decreement": return { counter : state.counter - value};

case "multiply": return{ counter : state.counter * value};


case "division": return{ counter : state.counter / value};
case "modulus": return{ counter : state.counter % value};

default: return state;
}

}



// if (action.type === "increement") {
// return{
// counter : state.counter + 1,
// }

// }

// else if (action.type === "decreement") {
// return{
// counter : state.counter - 1,
// }

// }

// else if (action.type === "multiply") {
// return{
// counter : state.counter * state.counter,
// }
// }
// else if (action.type === "division") {
// return{
// counter : state.counter / 3,
// }

// }

// else {
// return state;
// }
// };





// create a new store

const store = redux.createStore(reducer);

// subscription Handler
const storeSubsriber = () =>{
const currentState = store.getState();
console.log(currentState);
}

// subscriber to the store
store.subscribe(storeSubsriber);

//Dispatch


store.dispatch({type:"increement", value:5})
store.dispatch({type:"decreement",value:2})
store.dispatch({type:"multiply",value:5})
store.dispatch({type:"division",value:2})
store.dispatch({type:"modulus",value:2})