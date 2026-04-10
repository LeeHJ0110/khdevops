import { Route, Routes } from 'react-router-dom';
import './App.css';
import DefaultLayout from './app/layouts/DefaultLayout';
import BookInsertPage from './assets/feature/book/pages/BookInsertPage';
import BookListPage from './assets/feature/book/pages/BookListPage';
import BookDetailPage from './assets/feature/book/pages/BookDetailPage';
import HomePage from './assets/feature/home/pages/HomePage';
import ErrorPage from './assets/feature/error/pages/ErrorPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route index element={<HomePage />} />
          <Route path="book/">
            <Route path="insert" element={<BookInsertPage />} />
            <Route path="list" element={<BookListPage />} />
            <Route path="detail/:id" element={<BookDetailPage />} />
          </Route>
          <Route path="board/">
            <Route path="insert" element={<h1>boardInsert</h1>} />
            <Route path="list" element={<h1>boardList</h1>} />
          </Route>
          <Route path="*" element={<ErrorPage />} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
