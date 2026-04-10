import React from 'react';
import NavItem from './NavItem';
import styled from 'styled-components';

const StyledNav = styled.nav`
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-rows: 1fr;
  grid-template-columns: repeat(3, 1fr);
  place-items: center center;
`;
function Nav() {
  return (
    <StyledNav>
      <NavItem str={'Insert'} url={'/book/insert'} />
      <NavItem str={'List'} url={'/book/list'} />
      <NavItem str={'Detail'} url={'/book/detail'} />
    </StyledNav>
  );
}

export default Nav;
