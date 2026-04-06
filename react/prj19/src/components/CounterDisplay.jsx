import React from 'react';
import { useSelector } from 'react-redux';

function CounterDisplay() {
  const { num } = useSelector((state) => state.counter);

  return (
    <>
      <h1>CounterDisplay</h1>
      <h2>num: {num}</h2>
    </>
  );
}

export default CounterDisplay;
