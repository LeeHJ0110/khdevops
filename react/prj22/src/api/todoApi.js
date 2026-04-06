import api from './axios';

async function selectTodoVoList() {
  const resp = await api.get('/todo');
  return {
    voList: resp.data.voList,
    msg: resp.data.msg,
  };
}
async function insertTodoVo(vo) {
  const resp = await api.post('/todo', vo);
  return {
    result: resp.data.result,
  };
}

export { selectTodoVoList, insertTodoVo };
