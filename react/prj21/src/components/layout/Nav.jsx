import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const Wrapper = styled.nav`
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 1fr;
  place-items: center center;
`;

const StyledLink = styled(Link)`
  font-size: 2em;
  text-decoration: none;
  color: white;
  font-weight: 700;
  border: 3px solid black;
  border-radius: 5px;
  background-color: gray;
`;

function Nav() {
  return (
    <Wrapper>
      <StyledLink to={'/todo/insert'}>TODO 등록</StyledLink>
      <StyledLink to={'/todo/list'}>TODO 목록</StyledLink>
    </Wrapper>
  );
}

export default Nav;
