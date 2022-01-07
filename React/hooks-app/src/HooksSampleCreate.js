import { useEffect, useState } from "react";
import axios from "axios";

export default ()=>{
    const [postList, setPostList]= useState([]);
    const [title, setTitle] = useState("");
    const [body, setBody] = useState("");


    useEffect(()=>{
      fetchData();
       
    },[]);

    const fetchData =()=>{
        axios.get("https://jsonplaceholder.typicode.com/posts").then((response)=>{
            console.log(response.data);
            if(response && response.data){
                setPostList(response.data);
            }
        })
    };
    const onTitleChange =(event)=>{
        setTitle(event.target.value);
    }
    const onBodyChange =(event)=>{
        setBody(event.target.value);
    }
    const onFormSubmit=(event)=>{
        event.preventDefault();
        console.log(title, body);

        axios.post("https://jsonplaceholder.typicode.com/posts",{title,body, userId:1,}).then((response)=>{
            console.log(response);
            alert("Post Added");
            //fetch data again
            fetchData();
            //reset form
            setTitle("");
            setBody("");
        })
    }

    return(
        <>
        <h1>Data From Post</h1>
        <h2>Post Form</h2>
        <form onSubmit={onFormSubmit}>
            <label>Title</label>
            <input name="title" value={title} onChange={onTitleChange}></input>
            <label>Body</label>
            <input name="body" value={body} onChange={onBodyChange}></input>
            <button type="submit">Submit</button>
        </form>
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
