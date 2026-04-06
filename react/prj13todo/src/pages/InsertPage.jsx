import React, { useState } from 'react';
import KhBtn from '/src/components/common/KhBtn';
import styled from 'styled-components';

const Wrapper = styled.div`
  width: 100%;

  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  box-sizing: border-box;
  & > form {
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;
    align-items: space-evenly;
    & > input {
      font-size: 1.5em;
      width: 300px;
      height: 36px;
    }
  }
`;

function InsertPage({ todoVoList, setTodoVoList }) {
  const [inputStr, setInputStr] = useState('');

  function handleSubmit(evt) {
    evt.preventDefault();
    const vo = { title: inputStr, done: false };
    setTodoVoList([...todoVoList, vo]);
    setInputStr('');
  }

  function handleChange(evt) {
    setInputStr(evt.target.value);
  }

  return (
    <Wrapper>
      <h1>InsertPage</h1>
      <hr />
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="할일을 입력하세요"
          name="title"
          onChange={handleChange}
          value={inputStr}
        />
        <br />
        <KhBtn>등록하기</KhBtn>
      </form>
    </Wrapper>
  );
}

export default InsertPage;
