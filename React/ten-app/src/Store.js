import {createStore} from "redux";
import CourseList from "./CourseList";
 //initialstate

 const initialState={
    personList:[],
    courseList:[],
}

 //reducer
 const reducer=(state=initialState, action)=>{
    const{type, payload}=action;
    
    const personListCopy=[...state.personList]
    const courseListCopy=[...state.courseList]
    switch(type){
        case "PERSON_ADD": 
        const id =payload.id? payload.id : state.personList.length+1; //here we created unique id
        personListCopy.push({...payload, id})
        const newState={
            ...state,
            personList:personListCopy,
        };
        return newState;

        case "PERSON_UPDATE":
            let objectToBeUpdatedIndex=personListCopy.findIndex((person)=>person.id===payload.id);
            personListCopy[objectToBeUpdatedIndex]={
                ...personListCopy[objectToBeUpdatedIndex],
                ...payload,
            };
            return{
                ...state,
                personList:personListCopy,
                
            };

        case "PERSON_DELETE":
            
            personListCopy.splice(payload, 1);
            alert("Deleted");
            return{
                ...state,
                personList:personListCopy
            };
        case "COURSE_ADD":
            console.log(payload)
            courseListCopy.push(payload);
            const newState1={
                ...state,
                courseList:courseListCopy
            };
            return newState1;

            case "COURSE_DELETE":
            
                courseListCopy.splice(payload, 1);
                alert("Deleted");
                return{
                    ...state,
                    courseList:courseListCopy
                };

        default: return state;
    }
}
 //store
 const store=createStore(reducer);

 export default store;