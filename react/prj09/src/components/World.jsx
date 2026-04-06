import React from 'react';
import styled from 'styled-components';

const Styledh1 = styled.h1`
  background-color: ${(props) => {
    console.log(props);
    console.log(props.children);

    return props.str === 'dark' ? 'black' : 'white';
  }};
`;

function World() {
  return (
    <>
      <Styledh1 str="dark">world</Styledh1>
    </>
  );
}

export default World;
