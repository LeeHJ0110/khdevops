import { useState } from 'react';
import './App.css';
import MemberLoginPage from './pages/member/MemberJoinPage';
import BoardListPage from './pages/board/BoardListPage';
import BoardInsertPage from './pages/board/BoardInsertPage';
import MemberJoinPage from './pages/member/MemberJoinPage';
import { Route, Routes } from 'react-router-dom';
import MainLayout from './layout/MainLayout';
import AdminLayout from './layout/AdminLayout';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<MainLayout />}>
          <Route path="member">
            <Route path="join" element={<MemberJoinPage />} />
            <Route path="login" element={<MemberLoginPage />} />
          </Route>
          <Route path="board">
            <Route path="insert" element={<BoardInsertPage />} />
            <Route path="list" element={<BoardListPage />} />
          </Route>
        </Route>
        <Route path="/admin/*" element={<AdminLayout />}>
          <Route path="member">
            <Route path="join" element={<MemberJoinPage />} />
            <Route path="login" element={<MemberLoginPage />} />
          </Route>
          <Route path="board">
            <Route path="insert" element={<BoardInsertPage />} />
            <Route path="list" element={<BoardListPage />} />
          </Route>
        </Route>
      </Routes>
    </>
  );
}

export default App;
