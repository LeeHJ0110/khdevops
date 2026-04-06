import React from 'react';
import styled from 'styled-components';
import Nav from '../components/common/Nav';
import Header from '../components/common/Header';
import Footer from '../components/common/Footer';
import { Outlet, Route, Routes } from 'react-router-dom';
import MemberJoinPage from '../pages/member/MemberJoinPage';
import MemberLoginPage from '../pages/member/MemberLoginPage';
import BoardInsertPage from '../pages/board/BoardInsertPage';
import BoardListPage from '../pages/board/BoardListPage';

const StyledDiv = styled.div`
  width: 100wh;
  height: 100vh;
  display: grid;
  grid-template-rows: 1fr;
  grid-template-columns: 2fr 8fr;
  background-color: gray;

  & > div:nth-child(2) {
    display: grid;
    grid-template-columns: 1fr;
    grid-template-rows: 1fr 8fr 1fr;
  }
`;

function AdminLayout() {
  return (
    <StyledDiv>
      <Nav fd={'column'} baseUrl={'/admin'} />
      <div>
        <Header />
        <main>
          <Outlet />
        </main>
        <Footer />
      </div>
    </StyledDiv>
  );
}

export default AdminLayout;
