import React from 'react';
import { useContext } from 'react';
import { useRootContext } from '../context/RootContext';

function ContextCounterDisplay() {
  const { num } = useRootContext();
  return (
    <>
      <h1>ContextCounterDisplay</h1>
      <h2>num: {num}</h2>
    </>
  );
}

export default ContextCounterDisplay;
