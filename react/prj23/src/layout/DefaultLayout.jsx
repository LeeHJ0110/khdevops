import React from 'react';
import styled from 'styled-components';
import Header from '../components/layout/header/Header';
import Nav from '../components/layout/nav/Nav';
import Footer from '../components/layout/footer/Footer';
import { Outlet } from 'react-router-dom';

const Wrapper = styled.div`
  width: 100vw;
  height: 100vh;
  display: grid;
  grid-template-rows: 1fr 1fr 7fr 1fr;
  grid-template-columns: 1fr;
  place-items: center center;

  & > main {
    height: 70vh;
    overflow: auto;
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
