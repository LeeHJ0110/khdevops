import api from './axios';

function insertTodoVo(str) {
  return api.post('/todo', { title: str });
}

function selectTodoVoList() {
  return api.get(`/todo`);
}

export { insertTodoVo, selectTodoVoList };
