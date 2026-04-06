import React, { useState } from 'react';

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
    <>
      <h1>todo insert</h1>
      <hr />
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="title"
          onChange={handleChange}
          value={inputStr}
        />
        <button>등록하기</button>
      </form>
    </>
  );
}

export default InsertPage;
