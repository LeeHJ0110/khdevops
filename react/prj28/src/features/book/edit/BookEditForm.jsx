import React, { useState } from 'react';
import useBook from '../hooks/useBook';
import { useNavigate } from 'react-router-dom';
import { updateTitleAndPriceById } from '../api/bookApi';

function BookEditForm() {
  const { vo } = useBook();
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    id: vo.id,
    title: vo.title,
    price: vo.price,
  });

  async function handleSubmit(evt) {
    evt.preventDefault();
    await updateTitleAndPriceById(formData);
    alert('수정성공');
    navigate(`/book/detail/${vo.id}`);
  }

  function handleChange(evt) {
    setFormData({ ...formData, [evt.target.name]: evt.target.value });
  }

  return (
    <>
      <form onSubmit={handleSubmit}>
        <h3>도서번호 : {vo.id}</h3>
        <input
          type="text"
          name="title"
          value={formData.title}
          onChange={handleChange}
        />
        <input
          type="number"
          name="price"
          value={formData.price}
          onChange={handleChange}
        />
        <input type="submit" value={'수정'} />
      </form>
    </>
  );
}

export default BookEditForm;
