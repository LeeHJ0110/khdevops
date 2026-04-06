import React from 'react';
import { useRootContext } from '../context/RootContext';

function CounterBtn() {
  const { plus, minus, reset } = useRootContext();
  return (
    <>
      <h1>CounterBtn</h1>
      <button onClick={plus}>plus</button>
      <button onClick={minus}>minus</button>
      <button onClick={reset}>reset</button>
    </>
  );
}

export default CounterBtn;
