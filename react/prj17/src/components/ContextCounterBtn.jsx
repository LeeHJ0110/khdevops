import React from 'react';
import { useRootContext } from '../context/RootContext';

function ContextCounterBtn() {
  const { plus, minus, reset } = useRootContext();
  return (
    <>
      <h1>btn</h1>
      <button onClick={plus}>plus</button>
      <button onClick={reset}>reset</button>
      <button onClick={minus}>minus</button>
    </>
  );
}

export default ContextCounterBtn;
