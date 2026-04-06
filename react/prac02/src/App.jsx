import { Route, Routes } from 'react-router-dom';
import './App.css';
import DefaultLayout from './layout/DefaultLayout';
import HomePage from './pages/home/HomePage';
import BookInsertPage from './pages/book/BookInsertPage';
import BookListPage from './pages/book/BookListPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route index element={<HomePage />} />
          <Route path="book/insert" element={<BookInsertPage />} />
          <Route path="book/list" element={<BookListPage />} />
          <Route path="*" element={<Error />} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
