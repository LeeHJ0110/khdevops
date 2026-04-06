import axios from 'axios';

const api = axios.create({
  baseURL: `http://127.0.0.1/api`,
  timeout: 5000,
});

async function select() {
  const resp = await api.get(`/todo`, {
    headers: { abc: 100 },
  });
  const { voList } = resp.data;
  voList.forEach((vo) => {
    console.log(vo.title);
  });
}

select();

async function insert() {
  const resp = await api.post(`/todo`, {
    title: 'axiossssssssssssssssss',
  });
  console.log(resp.data);
}
// insert();
