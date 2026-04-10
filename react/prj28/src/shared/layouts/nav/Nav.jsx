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
      <NavItem url="/book/insert" str="도서 등록" />
      <NavItem url="/book/list" str="도서 목록" />
      <NavItem url="/book/detail" str="도서 상세" />
      <NavItem url="/" str="홈" />
      <NavItem url="/zxczxczxczxczxczxc" str="에러" />
    </StyledNav>
  );
}

export default Nav;
