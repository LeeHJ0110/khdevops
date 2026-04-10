import { useState } from 'react';
import api from '../../../../app/axios';
import { useNavigate } from 'react-router-dom';

function useBook() {
  const [voList, setVoList] = useState([]);
  const [vo, setVo] = useState({});

  async function fetchBookVoList() {
    const resp = await api.get('/book');
    setVoList(resp.data);
  }

  async function insertBook(vo) {
    return await api.post('/book', vo);
  }

  async function fetchBookById(id) {
    const resp = await api.get(`book/${id}`);
    setVo(resp.data);
  }

  async function deleteBookById(id) {
    return await api.delete(`/book/${id}`);
  }

  return {
    vo,
    voList,
    fetchBookVoList,
    insertBook,
    fetchBookById,
    deleteBookById,
  };
}

export default useBook;
