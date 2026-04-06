import axios from 'axios';

const api = axios.create({
  baseURL: 'http://127.0.0.1:80/api',
  timeout: 5000,
});

// api.interceptors.request.use();
// api.interceptors.response.use();

export default api;
