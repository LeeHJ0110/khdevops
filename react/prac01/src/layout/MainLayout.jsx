import React from 'react';
import Header from '../components/common/Header';
import Nav from '../components/common/Nav';
import { Outlet } from 'react-router-dom';
import Footer from '../components/common/Footer';
import styled from 'styled-components';

const MainDevStyle = styled.div`
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 1fr 7fr 1fr;
`;

function MainLayout() {
  return (
    <MainDevStyle>
      <Header />
      <Nav />
      <main>
        <Outlet />
      </main>
      <Footer />
    </MainDevStyle>
  );
}

export default MainLayout;
