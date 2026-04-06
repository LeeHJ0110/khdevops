import { useDispatch } from 'react-redux';
import { apiSelectTodoList } from '../api/todoApi';
import { sliceInsertTodoVo, sliceSelectTodoVoList } from '../store/todoSlice';

function useTodo() {
  const dispatch = useDispatch();
  async function hookSelectTodoVoList() {
    const { voList, msg } = await apiSelectTodoList();
    dispatch(sliceSelectTodoVoList());
  }
  async function hookInsertTodoVo(vo) {
    const { result } = await apiInsertTodoVo(vo);
    return result;
  }

  return {
    hookInsertTodoVo,
    hookSelectTodoVoList,
  };
}

export default useTodo;
