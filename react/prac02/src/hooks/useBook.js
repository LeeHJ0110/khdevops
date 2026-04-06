import { useDispatch } from 'react-redux';
import { apiSelectBookList, apiInsertBook } from '../api/bookApi';
import { sSelectBookVoList } from '../store/bookSlice';

function useBook() {
  const dispatch = useDispatch();

  async function hSelectBookVoList() {
    const { voList, msg } = await apiSelectBookList();
    dispatch(sSelectBookVoList(voList));
  }

  async function hInsertBookVo(vo) {
    const { result } = await apiInsertBook(vo);
    return result;
  }
  return {
    hSelectBookVoList,
    hInsertBookVo,
  };
}

export default useBook;
