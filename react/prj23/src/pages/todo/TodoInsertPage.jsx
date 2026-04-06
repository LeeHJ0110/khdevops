import React, { useState } from 'react';
import useTodo from '../../hooks/useTodo';

function TodoInsertPage() {
  const [inputStr, setInputStr] = useState('');
  const { hookInsertTodoVo } = useTodo();

  async function handleSubmit(evt) {
    evt.preventDefault();
    const vo = {
      title: inputStr,
    };
    const result = await hookInsertTodoVo(vo);

    if (result == 1) {
      alert('등록 성공 ! ');
    } else {
      alert('등록 실패 ... ');
    }
    setInputStr('');
  }

  return (
    <>
      <h1>TodoInsertPage</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="title"
          placeholder="할일을 입력하세요"
          value={inputStr}
          onChange={(evt) => {
            setInputStr(evt.target.value);
          }}
        />
        <button>등록</button>
      </form>
    </>
  );
}

export default TodoInsertPage;
