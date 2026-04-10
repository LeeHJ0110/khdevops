import React, { useEffect, useState } from 'react';
import api from '../../../app/api/axios';
import useBook from '../hooks/useBook';
import { useNavigate, useParams } from 'react-router-dom';

function BookEditPage() {
  const { updateVo, fetchVoDetail, vo } = useBook();
  const { id } = useParams();
  const navigate = useNavigate();
  const initialState = {
    id,
    title: '',
    price: '',
  };
  const [editVo, setEditVo] = useState(initialState);

  function handleChange(evt) {
    setEditVo({ ...editVo, [evt.target.name]: [evt.target.value] });
  }

  function handleSubmit(evt) {
    evt.preventDefault();
    const resp = updateVo(editVo);
    if (resp.status == 200) {
      alert('수정 성공');
      navigate(`/book/list`);
    }
    alert('수정 실패');
  }

  useEffect(() => {
    const f = async () => {
      const vo = await fetchVoDetail();
      setEditVo({ ...editVo, title: vo.title, price: vo.price });
    };
    f();
  }, []);

  return (
    <>
      <h1>BookEditPage</h1>
      <hr />
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="title"
          placeholder="도서제목"
          onChange={handleChange}
          value={editVo.title}
        />
        <input
          type="number"
          name="price"
          onChange={handleChange}
          value={editVo.price}
        />
        <input type="submit" value={'수정하기'} />
      </form>
    </>
  );
}

export default BookEditPage;
