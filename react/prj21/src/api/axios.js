import axios from 'axios';

const api = axios.create({
  baseURL: 'http://192.168.20.213:80/api',
  timeout: 5000,
});

api.interceptors.request.use((config) => {
  console.log('config : ', config);
  config.headers.height = 180;
  config.headers.weight = 43;
  return config;
});
api.interceptors.response.use(
  (resp) => {
    console.log('resp:', resp);
    return resp;
  },
  (err) => {
    console.log('err', err);
    return Promise.reject(err); //거절 상태 유지
  }
);

export default api;
