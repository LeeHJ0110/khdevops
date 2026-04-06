import React, { useState } from 'react';
import { styled } from 'styled-components';
import axios from 'axios';
import { insertTodoVo } from '../../api/todoApi';

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  gap: 30px;
`;

function InsertPage({ todoVoList, setTodoVoList }) {
  const [inputStr, setInputStr] = useState('');

  async function insert() {
    const vo = {
      title: inputStr,
    };
    const resp = await insertTodoVo(vo);
    setInputStr('');

    if (resp.status != 200) {
      alert('등록실패');
    } else {
      alert('등록성공');
    }
  }

  return (
    <Wrapper>
      <h1>InsertPage</h1>
      <input
        type="text"
        name="title"
        placeholder="할일을 입력하세요"
        onChange={(evt) => {
          setInputStr(evt.target.value);
        }}
        value={inputStr}
      />
      <button onClick={insert}>등록하기</button>
    </Wrapper>
  );
}

export default InsertPage;
