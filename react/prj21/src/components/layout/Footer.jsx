import React from 'react';
import styled from 'styled-components';

const Wrapper = styled.footer`
  width: 100%;
  height: 100%;
  display: grid;
`;

function Footer() {
  return (
    <Wrapper>
      <h1>Footer</h1>
    </Wrapper>
  );
}

export default Footer;
