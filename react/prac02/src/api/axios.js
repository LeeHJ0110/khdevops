import axios from 'axios';

// 기본 url 셋팅
const api = axios.create({
  baseURL: 'http://192.168.20.209:80/api',
  timeout: 5000,
});

export default api;
