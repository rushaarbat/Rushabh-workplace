import axios from "axios";

const BASE_URL = "http://localhost:8081";

export const getAdminList = () => {
  return axios.get(BASE_URL + "/admin/getAll");
};
