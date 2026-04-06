import { Route, Routes } from 'react-router-dom';
import './App.css';
import MainLayout from './layout/MainLayout';
import MemberJoinPage from './pages/MemberJoinPage';
import MemberLoginPage from './pages/MemberLoginPage';
import BoardInsertPage from './pages/BoardInsertPage';
import BoardListPage from './pages/BoardListPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainLayout />}>
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
