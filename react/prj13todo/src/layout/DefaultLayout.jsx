import React from 'react';
import Header from '../components/layout/header/Header';
import Nav from '../components/layout/nav/Nav';
import styled from 'styled-components';
import { Route, Routes } from 'react-router-dom';
import InsertPage from '../pages/InsertPage';
import ListPage from '../pages/ListPage';

const Wrapper = styled.div`
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 1fr 8fr;
  & > main {
    display: flex;
    justify-content: center;
    align-items: center;
  }
`;

function DefaultLayout({ todoVoList, setTodoVoList }) {
  return (
    <Wrapper>
      <Header />
      <Nav />
      <main>
        <Routes>
          <Route
            path="insert"
            element={
              <InsertPage
                todoVoList={todoVoList}
                setTodoVoList={setTodoVoList}
              />
            }
          />
          <Route
            path="list"
            element={
              <ListPage todoVoList={todoVoList} setTodoVoList={setTodoVoList} />
            }
          />
        </Routes>
      </main>
    </Wrapper>
  );
}

export default DefaultLayout;
