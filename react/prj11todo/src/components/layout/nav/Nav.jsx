import React from 'react';
import NavItem from './NavItem';
import styled from 'styled-components';

const StyledDiv = styled.div`
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 1fr;
  place-items: center center;
`;

function Nav() {
  return (
    <StyledDiv>
      <NavItem url="/insert" text="TODO 등록" />
      <NavItem url="/list" text="TODO 목록" />
    </StyledDiv>
  );
}

export default Nav;
