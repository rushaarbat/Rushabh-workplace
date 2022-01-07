import axios from "axios";
import { useEffect, useState } from "react";

export default () => {
  const [userList, setUserList] = useState([]); //set state for userList
  const [name, setName] = useState(""); //set state for name
  const [email, setEmail] = useState(""); //set state for email
  const [phone, setPhone] = useState(""); //set state for phone
  const [isEditMode, setIsEditMode] = useState(false);
  const [id, setId] = useState(0);

  useEffect(() => {
    fetchData();
  }, []);
  const fetchData = () => {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      console.log(response);
      if (response && response.data) {
        //method to fetch data from server
        setUserList(response.data);
      }
    });
  };

  const onNameChange = (event) => {
    setName(event.target.value);
  };
  const onEmailChange = (event) => {
    setEmail(event.target.value);
  };
  const onPhoneChange = (event) => {
    setPhone(event.target.value);
  };
  const onSubmitClickHandler = (event) => {
    // submit activity
    event.preventDefault();
    console.log(name, email, phone);

    if (isEditMode) {
      axios
        .put("https://jsonplaceholder.typicode.com/users/" + id, {
          name,
          email,
          phone,
          postId: 1,
        })
        .then((response) => {
          console.log(response);
          if (response) {
            fetchData();
            alert("User Updated");
            onResetClickHandler();
          }
        });
    } else {
      axios
        .post("https://jsonplaceholder.typicode.com/users", {
          name,
          email,
          phone,
          id: 1,
        })
        .then((response) => {
          console.log(response);
          alert("User Added");
          //fetch data
          fetchData();
          //reset input fields
          setName("");
          setEmail("");
          setPhone("");
        });
    }
  };
  const onDeleteClickHandler = (id) => {
    axios
      .delete("https://jsonplaceholder.typicode.com/users/" + id)
      .then((response) => {
        if (response) {
          fetchData();
          alert("User Deleted");
        }
      });
  };
  const onEditClickHandler = (user) => {
    console.log(user);
    setIsEditMode(true);
    setName(user.name);
    setEmail(user.email);
    setPhone(user.phone);
    setId(user.id);
  };
  const onResetClickHandler = (event) => {
    if (event) {
      event.preventDefault();
    }
    setIsEditMode(false);
    setName("");
    setEmail("");
    setPhone("");
  };

  return (
    <>
      <h1>User List</h1>
      <form onSubmit={onSubmitClickHandler}>
        <label htmlFor="input1">Name</label>
        <input name="name" id="input1" value={name} onChange={onNameChange} />
        <label htmlFor="input2">Email</label>
        <input
          name="email"
          id="input2"
          value={email}
          onChange={onEmailChange}
        />
        <label htmlFor="input3">phone</label>
        <input
          name="phone"
          id="input3"
          value={phone}
          onChange={onPhoneChange}
        />
        <button type="submit">{isEditMode ? "Update" : "Submit"}</button>
        {isEditMode && <button onClick={onResetClickHandler}>Cancel</button>}
      </form>
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
            <th>Options</th>
            <th>Options</th>
          </tr>
        </thead>
        <tbody>
          {userList.map((user, index) => {
            //mapping for fetched userList
            return (
              <tr key={user.id}>
                <td>{user.id}</td>
                <td>{user.name}</td>
                <td>{user.username}</td>
                <td>{user.email}</td>
                <td>{user.phone}</td>userObject
                <td>{user.address.street}</td>
                <td>{user.address.city}</td>
                <td>{user.address.zipcode}</td>
                <td>{user.website}</td>
                <td>{user.company.name}</td>
                <td>
                  <button
                    onClick={() => {
                      onDeleteClickHandler(user.id);
                    }}
                  >
                    Delete
                  </button>
                </td>
                <td>
                  <button
                    onClick={() => {
                      onEditClickHandler(user);
                    }}
                  >
                    Edit
                  </button>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};
