import React from 'react';
import styled from 'styled-components';

const Wrapper = styled.header`
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-rows: 1fr;
  grid-template-columns: 1fr 3fr 1fr;
  place-items: center center;
`;

function Header() {
  return (
    <Wrapper>
      <h1>로고</h1>
      <h1>TODO앱</h1>
      <h1>유지</h1>
    </Wrapper>
  );
}

export default Header;
