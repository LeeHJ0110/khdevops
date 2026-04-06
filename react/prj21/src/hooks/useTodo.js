import { useDispatch } from 'react-redux';
import { insertTodoVo, selectTodoVoList } from '../api/todoApi';
import { setTodoVoList } from '../store/todoSlice';
function useTodo() {
  const dispatch = useDispatch();

  async function fetchTodoVoList() {
    const resp = await selectTodoVoList();
    dispatch(setTodoVoList(resp.data.voList));
  }

  async function enrollTodo(inputStr) {
    const resp = await insertTodoVo(inputStr);
    if (resp.status == 200) {
      alert('할일 등록 성공 !');
    }
  }

  return {
    fetchTodoVoList,
    enrollTodo,
  };
}

export default useTodo;
