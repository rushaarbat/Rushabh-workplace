import { createStore } from "redux";

//Initial State
const initialState = {
  personList: [],
  // courseList: [],
};

//reducer

const reducer = (state = initialState, action) => {
  const { type, payload } = action;
  const personListCopy = [...state.personList];
  switch (type) {
    case "PERSON_ADD":
      const id = payload.id ? payload.id : state.personList.length + 1;
      personListCopy.push({ ...payload, id });

      return {
        personList: personListCopy,
      };

    case "PERSON_UPDATE":
      let objectToBeUpdatedIndex = personListCopy.findIndex(
        (person) => person.id === payload.id
      );
      personListCopy[objectToBeUpdatedIndex] = {
        ...personListCopy[objectToBeUpdatedIndex],
        ...payload,
      };
      return {
        ...state,
        personList: personListCopy,
      };

    case "PERSON_DELETE":
      console.log(payload);
      personListCopy.splice(payload, 1);
      alert("Deleted");
      return {
        personList: personListCopy,
      };
    default:
      return state;
  }
};

// const reducer=(state=initialState,action)=>{
//     const { type, payload }= action;
//  const courseListCopy = [...state.courseList];
//  switch (type){
// case "COURSE_ADD":
// console.log(payload);
// courseListCopy.push(payload);
//     console.log(courseListCopy);
//   return{
//     courseList: courseListCopy,

//     };

//     case "COURSE_DELET":
//         console.log(payload);
//         courseListCopy.splice(payload, 1);
//   alert("Deleted");
//   return{
//     courseList:courseListCopy,
//    }
//     default:
//    return state

// }
// }

//store
const store = createStore(reducer);

export default store;
