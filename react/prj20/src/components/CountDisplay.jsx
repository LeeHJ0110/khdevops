import React from 'react';
import { useSelector } from 'react-redux';

function CountDisplay() {
  const { num } = useSelector((state) => state.counter);

  return (
    <>
      <h1>CountDisplay</h1>
      <h2>num:{num}</h2>
    </>
  );
}

export default CountDisplay;
