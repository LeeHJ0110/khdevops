import './App.css';
import DefaultLayout from './layout/DefaultLayout';
import styled from 'styled-components';
import { Route, Routes } from 'react-router-dom';
import TodoInsertPage from './pages/todo/TodoInsertPage';
import TodoListPage from './pages/todo/TodoListPage';
import HomePage from './pages/home/HomePage';
import ErrorPage from './pages/error/ErrorPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route index element={<HomePage />} />
          <Route path="todo/insert" element={<TodoInsertPage />} />
          <Route path="todo/list" element={<TodoListPage />} />
          <Route path="*" element={<ErrorPage />} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
