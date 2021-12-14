import { useEffect, useState } from "react";
import axios from "axios";

export default ()=>{
    const [postList, setPostList]= useState([]);

    useEffect(()=>{

        axios.get("https://jsonplaceholder.typicode.com/posts").then((response)=>{
            console.log(response.data);
            if(response && response.data){
                setPostList(response.data);
            }
        })
    },[]);

    return(
        <>
        <h1>Data From Post</h1>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Body</th>
                </tr>
            </thead>
            <tbody>
               {postList.map((post, index)=>{
                   return(
                    <tr key={post.id}>
                    <td>{post.id}</td>
                    <td>{post.title}</td>
                    <td>{post.body}</td>
                    </tr>
                   )
               })}
            </tbody>
        </table>
        </>
    )
}
