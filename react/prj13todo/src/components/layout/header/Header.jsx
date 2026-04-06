import React from 'react';
import styled from 'styled-components';

const Wrapper = styled.div`
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
`;

function Header() {
  return (
    <Wrapper>
      <h1>Header</h1>
    </Wrapper>
  );
}

export default Header;
