import React from 'react';

function CounterDisplay({ num }) {
  console.log('CounterDisplay render');

  return (
    <>
      <h1>display</h1>
      <h1>{num}</h1>
    </>
  );
}

export default CounterDisplay;
