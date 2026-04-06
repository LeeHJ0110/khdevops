import React from 'react';
import NavItem from './NavItem';
import styled from 'styled-components';

const StyledNav = styled.nav`
  width: 100%;
  height: 10vh;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
`;

function Nav() {
  return (
    <StyledNav>
      <NavItem url={'/todo/insert'}>TODO등록</NavItem>
      <NavItem url={'/todo/list'}>TODO목록</NavItem>
    </StyledNav>
  );
}

export default Nav;
