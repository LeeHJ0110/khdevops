import { useState } from 'react';
import api from '../../../app/api/axios';

function useBook() {
  const [voList, setVoList] = useState([]);
  const [vo, setVo] = useState({});

  async function fetchVoList() {
    const resp = await api.get(`/book`);
    setVoList(resp.data);
  }

  async function fetchVoDetail(id) {
    const resp = await api.get(`/book/${id}`);
    setVo(resp.data);
    return resp.data;
  }

  async function deleteVo(id) {
    return await api.delete(`/book/${id}`);
  }

  async function updateVo(editVo) {
    return await api.put(`/book/${editVo.id}`, editVo);
  }

  return { vo, voList, fetchVoList, fetchVoDetail, deleteVo, updateVo };
}

export default useBook;
