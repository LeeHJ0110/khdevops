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

const Form = styled.form`
  background: white;
  padding: 30px;
  max-width: 400px;
  border-radius: 12px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
`;

const Label = styled.p`
  margin: 15px 0 5px;
  font-weight: 600;
  font-size: 14px;
`;

const Input = styled.input`
  width: 100%;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 6px;
  font-size: 14px;
  outline: none;

  &:focus {
    border-color: #2c3e50;
  }
`;

const PriceWrapper = styled.div`
  display: flex;
  align-items: center;
  gap: 8px;
`;

const Unit = styled.span`
  font-size: 14px;
`;

const Button = styled.button`
  width: 100%;
  margin-top: 20px;
  padding: 12px;
  background-color: #2c3e50;
  color: white;
  border: none;
  border-radius: 8px;
  font-size: 15px;
  font-weight: 600;
  cursor: pointer;

  &:hover {
    background-color: #1a252f;
  }
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
      <Form onSubmit={handleSubmit}>
        <Label>책 이름</Label>
        <Input
          type="text"
          name="title"
          placeholder="홍길동전"
          value={inputTitle}
          onChange={(evt) => {
            setInputTitle(evt.target.value);
          }}
        />
        <Label>가격</Label>
        <Input
          type="number"
          name="title"
          placeholder="1000"
          value={inputPrice}
          onChange={(evt) => {
            setInputPrice(evt.target.value);
          }}
        />
        <br />
        <button>등록</button>
      </Form>
    </PageWrapper>
  );
}

export default BookInsertPage;
