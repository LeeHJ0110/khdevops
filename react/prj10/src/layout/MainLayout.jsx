import React from 'react';
import Header from '../components/common/Header';
import Nav from '../components/common/Nav';
import Footer from '../components/common/Footer';
import { Outlet, Route, Routes } from 'react-router-dom';
import MemberJoinPage from '../pages/member/MemberJoinPage';
import BoardInsertPage from '../pages/board/BoardInsertPage';
import BoardListPage from '../pages/board/BoardListPage';
import MemberLoginPage from '../pages/member/MemberLoginPage';
import { styled } from 'styled-components';

const StyledDiv = styled.div`
  width: 100vw;
  height: 100vh;
  background-color: lightgray;
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 2fr 1fr 6fr 1fr;
`;

function MainLayout() {
  return (
    <StyledDiv>
      <Header />
      <Nav fd={'row'} />
      <main>
        <Outlet />
      </main>
      <Footer />
    </StyledDiv>
  );
}

export default MainLayout;
