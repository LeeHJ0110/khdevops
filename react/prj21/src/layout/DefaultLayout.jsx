import React from 'react';
import { styled } from 'styled-components';
import Header from '../components/layout/Header';
import Nav from '../components/layout/Nav';
import Footer from '../components/layout/Footer';
import { Outlet } from 'react-router-dom';

const Wrapper = styled.div`
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 1fr 7fr 1fr;
`;

const StyledMain = styled.main`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  overflow: auto;
`;

function DefaultLayout() {
  return (
    <Wrapper>
      <Header />
      <Nav />
      <StyledMain>
        <Outlet />
      </StyledMain>
      <Footer />
    </Wrapper>
  );
}

export default DefaultLayout;
