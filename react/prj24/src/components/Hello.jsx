import React, { useEffect, useRef, useState } from 'react';

function Hello() {
  console.log('helllo render');

  const [state, setState] = useState(0);
  const x = useRef(0);
  const y = useRef(null);

  useEffect(() => {
    y.current.focus();
  });

  return (
    <>
      <h1>Hello</h1>
      <h2>state : {state}</h2>
      <button
        onClick={() => {
          setState(state + 1);
        }}
      >
        STATE PLUS
      </button>
      <hr />

      <h2>x : {x.current}</h2>
      <button
        onClick={() => {
          x.current++;
          console.log('x.current : ', x.current);
        }}
      >
        X PLUS
      </button>
      <hr />
      <input type="text" ref={y} />
    </>
  );
}

export default Hello;
