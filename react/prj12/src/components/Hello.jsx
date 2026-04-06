import React from 'react';
import { useState } from 'react';
import { styled } from 'styled-components';
import World from './World';

const StyledDiv = styled.div`
  background-color: red;
`;

function Hello(props) {
  console.log('hello render');

  const [num, setNum] = useState(0);
  return (
    <StyledDiv>
      <h1>{props.children}</h1>
      <h1>Hello : {num}</h1>
      <button
        onClick={() => {
          setNum(num + 1);
        }}
      >
        plus
      </button>
      <World />
    </StyledDiv>
  );
}

export default Hello;
