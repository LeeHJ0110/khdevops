import React from 'react';
import NavItem from './NavItem';
import styled from 'styled-components';

const StyledNav = styled.nav`
  display: flex;
  justify-content: space-evenly;
  align-items: center;
`;

function Nav() {
  return (
    <StyledNav>
      <NavItem url="/book/insert" str="도서등록" />
      <NavItem url="/book/list" str="도서목록" />
      <NavItem url="/book/detail" str="도서상세" />
      <NavItem url="/home" str="홈" />
      <NavItem url="/asdadas" str="에러" />
    </StyledNav>
  );
}

export default Nav;
