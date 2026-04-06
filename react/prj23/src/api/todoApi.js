import api from './axios';

async function apiSelectTodoList() {
  const resp = await api.get('/todo');
  const { voList, msg } = resp.data;
  return { voList, msg };
}

async function apiInsertTodoVo(vo) {
  const resp = await api.post('/todo', vo);
  const { result } = resp.data;
  return { result };
}

export { apiInsertTodoVo, apiSelectTodoList };
