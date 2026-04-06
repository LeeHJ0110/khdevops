import { useDispatch } from 'react-redux';
import { insertTodoVo, selectTodoVoList } from '../api/todoApi';
import { getTodoVoList } from '../store/todoSlice';

function useTodo() {
  const dispatch = useDispatch();
  async function fetchTodoVoList() {
    //api 호출
    const { voList, msg } = await selectTodoVoList();
    //context 데이터 셋팅
    dispatch(getTodoVoList(voList));
  }

  async function enrollTodoVo(vo) {
    const { result } = await insertTodoVo(vo);
    return result;
  }

  function toggleTodoVoByNo() {}

  return {
    fetchTodoVoList,
    enrollTodoVo,
    toggleTodoVoByNo,
  };
}

export default useTodo;
