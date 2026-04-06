import React from 'react';
import ContextCounterBtn from './ContextCounterBtn';
import ContextCounterDisplay from './ContextCounterDisplay';

function ContextCounter() {
  return (
    <>
      <h1>counter</h1>
      <ContextCounterDisplay />
      <ContextCounterBtn />
    </>
  );
}

export default ContextCounter;
