import React, { useState } from 'react';
import AwsomeButton from '../../components/layout/common/AwsomeButton';
import AwesomeInputText from '../../components/layout/common/AwsomeInputText';
import useTodo from '../../hooks/useTodo';

function TodoInsertPage() {
  const [inputStr, setInputStr] = useState('');
  const { enrollTodo } = useTodo();

  function handleSubmit(evt) {
    evt.preventDefault();
    enrollTodo(inputStr);
    setInputStr('');
  }

  function handleChange(evt) {
    setInputStr(evt.target.value);
  }

  return (
    <>
      <hr />
      <form onSubmit={handleSubmit}>
        <AwesomeInputText
          value={inputStr}
          onChange={handleChange}
          name="title"
          placeholder="할일을 입력 하세요"
        />
        <AwsomeButton>등록하기</AwsomeButton>
      </form>
    </>
  );
}

export default TodoInsertPage;
