import React from 'react';

function CounterBtn({ setNum, num }) {
  console.log('CounterBtn render');

  return (
    <>
      <h1>btn</h1>
      <button
        onClick={() => {
          setNum((prev) => prev + 1);
        }}
      >
        plus
      </button>
    </>
  );
}

export default CounterBtn;
