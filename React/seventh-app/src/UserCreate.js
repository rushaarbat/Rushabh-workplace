
  
import axios from "axios"
import { useEffect, useState } from "react"

export default ()=>{
    const [userList, setUserList] = useState([]); 
    const [name, setName] = useState("");        
    const [userName, setUserName] = useState("")
    const [email, setEmail] = useState("");       
    const [phone, setPhone] = useState("");       

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

    const onNameChange=(event)=>{
        setName(event.target.value);
    }

    const onUserNameChange=(event)=>{
        setUserName(event.target.value);
    }

    const onEmailChange=(event)=>{
        setEmail(event.target.value);
    }
    const onPhoneChange=(event)=>{
        setPhone(event.target.value);
    }
    
    const onSubmitClickHandler=(event)=>{     // submit activity
        event.preventDefault();


        console.log(name, email,phone);
        axios.post("https://jsonplaceholder.typicode.com/users", {name, email, phone, id:1,}).then((response)=>{
            console.log(response);
            alert("User Added")
            //fetch data
            fetchData();
            //reset input fields
            setName("");
            setUserName("");
            setEmail("");
            setPhone("");
        })
    }
  

    return(
        <>
        <h1>User List</h1>
        <form onSubmit={onSubmitClickHandler}>
            <label>Name</label>
            <input name="name" value={name} onChange={onNameChange}/>

            <label>User Name</label>
            <input name="UserName" value={userName} onChange={onUserNameChange}/>

            <label>Email</label>
            <input name="email" value={email} onChange={onEmailChange}/>

            <label>phone</label>
            <input name="phone" value={phone} onChange={onPhoneChange}/>

            <button type="submit">Submit</button>
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
                    <th>street</th>
                    <th>city</th>
                   
                </tr>
            </thead>
            <tbody>
                {userList.map((user, index)=>{       //mapping for fetched userList
                    return(
                  <tr key={user.id}>
                    <td>{user.id}</td>
                    <td>{user.name}</td>
                    <td>{user.username}</td>
                    <td>{user.email}</td>
                    <td>{user.phone}</td>
                    <td>{user.address.street}</td>
                    <td>{user.address.city}</td>
                  
                  </tr>
                    )
                })}
            </tbody>
        </table>
        </>

    )
}