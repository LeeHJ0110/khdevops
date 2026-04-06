import React from 'react';
import styled from 'styled-components';
import Header from '../components/layout/header/Header';
import Nav from '../components/layout/nav/Nav';
import { Outlet } from 'react-router-dom';

const StyledDiv = styled.div`
  width: 100vw;
  height: 100vh;
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 1fr 8fr;
  place-items: center center;
`;

function DefaultLayout() {
  return (
    <StyledDiv>
      <Header />
      <Nav />
      <main>
        <Outlet />
      </main>
    </StyledDiv>
  );
}

export default DefaultLayout;
