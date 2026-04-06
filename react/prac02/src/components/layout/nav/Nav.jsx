import React from 'react';
import NavItem from './NavItem';
import styled from 'styled-components';

const StyledNav = styled.nav`
  width: 100%;
  height: 10vh;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  border-top: 1px solid black;
  border-bottom: 1px solid black;
`;

function Nav() {
  return (
    <StyledNav>
      <NavItem url={'/book/insert'}>도서 등록</NavItem>
      <NavItem url={'/book/list'}>도서 목록</NavItem>
    </StyledNav>
  );
}

export default Nav;
