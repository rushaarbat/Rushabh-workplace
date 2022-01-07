import axios from "axios"
import { useEffect, useState } from "react"

export default ()=>{
    const [userList, setUserList] =useState([]);

    useEffect(()=>{
        axios.get("https://jsonplaceholder.typicode.com/users").then((response)=>{
            console.log(response);
            if(response && response.data){
                setUserList(response.data)
            }

        })
    },[])

    return(
        <>
        <h1>User List</h1>
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
                    <th>zipcode</th>
                    <th>website</th>
                    <th>Company name</th>
                </tr>
            </thead>
            <tbody>
                {userList.map((user, index)=>{
                    return(
                  <tr key={user.id}>
                    <td>{user.id}</td>
                    <td>{user.name}</td>
                    <td>{user.username}</td>
                    <td>{user.email}</td>
                    <td>{user.phone}</td>
                    <td>{user.address.street}</td>
                    <td>{user.address.city}</td>
                    <td>{user.address.zipcode}</td>
                    <td>{user.website}</td>
                    <td>{user.company.name}</td>
                  </tr>
                    )
                })}
            </tbody>
        </table>
        </>

    )
}