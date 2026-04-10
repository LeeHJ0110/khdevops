import React from 'react';
import styled from 'styled-components';
import Header from '../../shared/layouts/Header';
import Nav from '../../shared/layouts/Nav';
import Footer from '../../shared/layouts/Footer';
import { Outlet } from 'react-router-dom';

const Wrapper = styled.div`
  display: grid;
  width: 100vw;
  height: 100vh;
  grid-template-rows: 1fr 1fr 7fr 1fr;
  grid-template-columns: 1fr;
  & > main {
    width: 100%;
    height: 100%;
  }
`;
function DefaultLayout() {
  return (
    <Wrapper>
      <Header />
      <Nav />
      <main>
        <Outlet />
      </main>
      <Footer />
    </Wrapper>
  );
}

export default DefaultLayout;
