import React from 'react';
import { useRootContext } from '../context/RootContext';

function CounterDisplay() {
  const { num } = useRootContext();
  return (
    <>
      <h1>CounterDisplay</h1>
      <h2>num : {num}</h2>
    </>
  );
}

export default CounterDisplay;
