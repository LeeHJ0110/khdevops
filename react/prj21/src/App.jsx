import { Route, Routes } from 'react-router-dom';
import './App.css';
import DefaultLayout from './layout/DefaultLayout';
import TodoInsertPage from './pages/todo/TodoInsertPage';
import TodoListPage from './pages/todo/TodoListPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route index element={<h1>홈페이지</h1>} />

          <Route path="todo">
            <Route path="insert" element={<TodoInsertPage />} />
            <Route path="list" element={<TodoListPage />} />
          </Route>

          <Route path="*" element={<h1>잘못된 경로</h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
