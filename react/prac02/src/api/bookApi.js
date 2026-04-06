import api from './axios';

async function apiSelectBookList() {
  const resp = await api.get('/book');
  const { voList, msg } = resp.data;
  return { voList, msg };
}

async function apiInsertBook(vo) {
  const resp = await api.post('/book', vo);
  const { result } = resp.data;
  return { result };
}

export { apiSelectBookList, apiInsertBook };
