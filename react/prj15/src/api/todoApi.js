import api from './axois';

export const selectTodoVoList = () => api.get('/todo');
export const insertTodoVo = (vo) => api.post('/todo', vo);
