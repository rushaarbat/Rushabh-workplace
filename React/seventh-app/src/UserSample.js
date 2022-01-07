import axios from "axios"
import { useEffect, useState } from "react"

export default ()=>{
    const [userList, setUserList] = useState([]); 

    //const [name, setName] = useState(""); 

    //const [userName, setUserName] = useState("")

  //  const [email, setEmail] = useState("");  
      
    //const [phone, setPhone] = useState("");  

    const [id, setUserId] = useState(0);

    const [isEditMode, setIsEditMode] = useState(false)

    const [editObject, setEditObject] = useState({});

    const [ userObject, setUserObject] = useState({});

    const [selectedUserId, setSelectedUserId] = useState(-1);
    useEffect(()=>{
        fetchData();
        
    },[]);


    const fetchData=()=>{
        axios.get("https://jsonplaceholder.typicode.com/users").then((response)=>{
            console.log(response);
            if(response && response.data){                          //method to fetch data from server
                setUserList(response.data)
            }

        })
    }

   //-----------------------------

    const onEditObjectHandler = (event) =>{
        if (event) {
            const { name, value } = event.target;
            setEditObject({
                ...editObject,
                [name]: value,
            });
        }
    };

    const onUserChangeHandler = (event) =>{
        if (event){
            const { name, value } = event.target;
            setUserObject({
                ...userObject,
                [name]: value,
            });
        }
    }

//-------------------------------

    const onSubmitClickHandler=(event)=>{     // submit activity
        event.preventDefault();
        //console.log(name, email,phone);
        if(!isEditMode){axios.post("https://jsonplaceholder.typicode.com/users",{
           ...userObject,
             id:1,
            })
        .then((response)=>{
            console.log(response);
            alert("User Added")

            //fetch data again
            fetchData();

            //reset input fields
            setUserObject({
                name:"",
                username:"",
                email:"",
                phone:"",
            });
        })
    }
    };

    const onDeleteClickHandler=(id)=>{
        axios.delete("https://jsonplaceholder.typicode.com/users/" +id)
        .then((response)=>{
            alert("User Deleted");
            fetchData();
        })
    }
    const onResetEditRow = (event) => {
       setSelectedUserId(-1);
       setEditObject({
        name:"",
        username:"",
        email:"",
        phone:"",
       })
        
    }
       
    const onEditClickHandler = (userObject) =>{
    console.log(userObject);
    //setIsEditMode(true);
    //setName(userObject.name);
   //setUserName(userObject.username);
   // setEmail(userObject.email);
   // setPhone(userObject.phone);
    //setUserId(userObject.id);
    setEditObject({
        ...userObject
    });
    setSelectedUserId(userObject.id);
    setUserId(userObject.id);
    };


    const onResetClickHandler = (event) => {
        if (event) {
          event.preventDefault();
        }
        setIsEditMode(false);
    
        setUserObject({
            name:"",
            username:"",
            email:"",
            phone:"",
        });
      };

      const onUpdateClickHandler = (event)=>{
        if (selectedUserId > 0) {
              axios
                .put("https://jsonplaceholder.typicode.com/users/" + selectedUserId, {
                  id: selectedUserId,
                ...editObject,
                  userId: 1,
                })
                .then((response) => {
                  if (response) {
                    fetchData();
                    alert("Updated...!");
                    onResetEditRow();
                  }
                });
      }
    }
   
    return(
        <>
        <h1>User List</h1>
        <form onSubmit={onSubmitClickHandler}>

            <label>Name</label>
            <input name="name" value={userObject.name}  onChange={onUserChangeHandler}/>

            <label>UserName</label>
            <input name="userName" value={userObject.username} onChange={onUserChangeHandler}/>

            <label>Email</label>
            <input name="email" value={userObject.email} onChange={onUserChangeHandler}/>

            <label>phone</label>
            <input name="phone" value={userObject.phone} onChange={onUserChangeHandler}/>



            <button type="submit">{isEditMode ? "update" : "Submit"}</button>
            {isEditMode && <button onClick={onResetClickHandler}>Reset</button>}
        </form>
        <br/>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>UserName</th>
                    <th>Email</th>
                    <th>Phone</th>
                   
                </tr>
            </thead>
            <tbody>

{userList.map((user,index) =>{
return(

<tr key={user.id}>

<td>{user.id}</td>

<td>{selectedUserId===user.id ? (
<input 
name="name" 
value={editObject.name}
onChange={onEditObjectHandler}/>
):(
user.name)}</td>

<td>{selectedUserId===user.id ? (
<input 
name="userName"
value={editObject.username}
onChange={onEditObjectHandler}/>
):(
user.username)}
</td>

<td>{selectedUserId===user.id ? (
<input
 name="email" 
 value={editObject.email}
onChange={onEditObjectHandler}/>
):(
user.email)}
</td>

<td>{selectedUserId===user.id ? (
<input
 name="phone" 
 value={editObject.phone}
onChange={onEditObjectHandler}/>
):(
user.phone)}
</td>

<td>
{selectedUserId===user.id ?
(<>
<button onClick={onUpdateClickHandler}>Update</button>
<button onClick={onUpdateClickHandler}>Reset</button>
</>
)
:(
<>
<button onClick={()=>
onDeleteClickHandler(user.id)}>
Delete
</button>
<button onClick={()=>{
onEditClickHandler(user)
}}>Edit:</button>

</>
)}
</td>

{/* <td>{user.address.city}</td>
<td>{user.address.geo.lat}</td> */}
{/* <button onClick={onDeleteHandler}>Delete:</button>
<button onClick={()=>{
onEdit(user)
}}>Edit:</button> */}
</tr>
);
})}
</tbody>
        </table>
        </>

    )
}
