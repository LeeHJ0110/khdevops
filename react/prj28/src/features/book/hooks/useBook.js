import { useDispatch, useSelector } from 'react-redux';
import { findAll, findById } from '../api/bookApi';
import { setError, setLoading, setVoList, setVo } from '../store/bookSlice';

export default function useBook() {
  const { error, loading, voList, vo } = useSelector((state) => state.book);
  const dispatch = useDispatch();

  async function fetchBookVoList() {
    try {
      dispatch(setLoading(true));

      const resp = await findAll();
      dispatch(setVoList(resp.data));
    } catch (e) {
      dispatch(setError(e));
    } finally {
      dispatch(setLoading(false));
    }
  }

  async function fetchBookVoById(id) {
    try {
      dispatch(setLoading(true));

      const resp = await findById(id);

      dispatch(setVo(resp.data));
    } catch (e) {
      dispatch(setError(e));
    } finally {
      dispatch(setLoading(false));
    }
  }

  return { voList, fetchBookVoList, loading, error, vo, fetchBookVoById };
}
