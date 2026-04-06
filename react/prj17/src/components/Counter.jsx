import React from 'react';
import CounterDisplay from './CounterDisplay';
import CounterBtn from './CounterBtn';
import { useState } from 'react';

function Counter() {
  console.log('Counter render');

  const [num, setNum] = useState(0);

  return (
    <>
      <h1>counter</h1>
      <CounterDisplay num={num} />
      <CounterBtn setNum={setNum} num={num} />
    </>
  );
}

export default Counter;
