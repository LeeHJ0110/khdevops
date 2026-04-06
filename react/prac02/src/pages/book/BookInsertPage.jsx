import React, { useState } from 'react';
import useBook from '../../hooks/useBook';
import styled from 'styled-components';

const PageWrapper = styled.div`
  padding: 40px;
  background-color: #f5f6f8;
  min-height: 100vh;
`;

const Title = styled.h1`
  font-size: 28px;
  margin-bottom: 10px;
`;

const Divider = styled.hr`
  margin-bottom: 20px;
  border: none;
  border-top: 2px solid #ddd;
`;

function BookInsertPage() {
  const [inputTitle, setInputTitle] = useState('');
  const [inputPrice, setInputPrice] = useState(0);
  const { hInsertBookVo } = useBook();

  async function handleSubmit(evt) {
    evt.preventDefault();
    const vo = {
      title: inputTitle,
      price: inputPrice,
    };

    const result = await hInsertBookVo(vo);

    if (result == 1) {
      alert('등록 성공 ! ');
    } else {
      alert('등록 실패 ... ');
    }
    setInputTitle('');
    setInputPrice('');
  }

  return (
    <PageWrapper>
      <Title>BookInsertPage</Title>
      <Divider />
      <form onSubmit={handleSubmit}>
        <p>책 이름</p>
        <input
          type="text"
          name="title"
          placeholder="홍길동전"
          value={inputTitle}
          onChange={(evt) => {
            setInputTitle(evt.target.value);
          }}
        />
        <p>가격</p>
        <input
          type="number"
          name="title"
          placeholder="1000"
          value={inputPrice}
          onChange={(evt) => {
            setInputPrice(evt.target.value);
          }}
        />
        <label>원</label>
        <br />
        <button>등록</button>
      </form>
    </PageWrapper>
  );
}

export default BookInsertPage;
