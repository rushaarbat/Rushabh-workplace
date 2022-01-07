import { useEffect, useState } from "react"
import { getAdminList } from "../Services/Admin.service";


export default()=>{
    const [adminList, setAdminList] = useState([]);

    useEffect(()=>{
        getAdminList().then((response)=>{
            console.log(response.data);
            if(response && response.data){
                setAdminList(response.data);
            }
        })
    },[])

    return(
        <>
        <h1 className="text-centre">Admin List</h1>
        <table className="table table-dark table-striped">
            <thead>
                <tr>
                    <th>Admin ID</th>
                    <th>Admin Password</th>
                </tr>
            </thead>
            <tbody>
               {adminList.map((admin)=>{
                   return(
                <tr key={admin.adminID}>
                    <td>{admin.adminID}</td>
                    <td>{admin.adminPassword}</td>
                </tr>
                   )
               })}
            </tbody>
        </table>
        
        </>
    )
}