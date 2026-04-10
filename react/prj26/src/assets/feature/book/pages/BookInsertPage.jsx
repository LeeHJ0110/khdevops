import React, { useState } from 'react';
import styled from 'styled-components';
import useBook from '../hooks/useBook';
import { useNavigate } from 'react-router-dom';

const Wrapper = styled.div`
  width: 100%;
  height: 100%;
  background-color: black;
  color: white;
  & > form {
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;
    align-items: center;
    color: white;
  }
`;

function BookInsertPage() {
  const initialState = {
    title: '',
    price: 0,
  };
  const [vo, setVo] = useState(initialState);
  const [isLoading, setLoading] = useState(false);
  const navigate = useNavigate();

  const { insertBook } = useBook();

  async function handleSubmit(evt) {
    evt.preventDefault();

    if (isLoading) {
      return;
    }

    setLoading(true);

    try {
      const resp = await insertBook(vo);
      if (resp.status == 200) {
        alert('등록 성공 !');
        navigate('/book/list');
      }
    } catch (err) {
      console.log(err);
      alert('ERROR !!!');
    } finally {
      setLoading(false);
    }
  }

  function handleChange(evt) {
    setVo({ ...vo, [evt.target.name]: evt.target.value });
  }

  return (
    <Wrapper>
      <h1>BookInsertPage</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="title"
          onChange={handleChange}
          value={vo.title}
        />
        <input
          type="number"
          name="price"
          onChange={handleChange}
          value={vo.price}
        />
        <input type="submit" value={'등록'} disabled={isLoading} />
      </form>
    </Wrapper>
  );
}

export default BookInsertPage;
