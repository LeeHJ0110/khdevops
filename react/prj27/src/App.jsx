import { Route, Routes } from 'react-router-dom';
import './App.css';
import DefaultLayout from './app/layouts/DefaultLayout';
import BookInsertPage from './features/book/pages/BookInsertPage';
import BookListPage from './features/book/pages/BookListPage';
import BookDetailPage from './features/book/pages/BookDetailPage';
import BookEditPage from './features/book/pages/BookEditPage';

function App() {
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route path="book">
            <Route path="insert" element={<BookInsertPage />} />
            <Route path="list" element={<BookListPage />} />
            <Route path="detail/:id" element={<BookDetailPage />} />
            <Route path="edit/:id" element={<BookEditPage />} />
          </Route>
          <Route path="home" element={<h1>Home</h1>} />
          <Route path="*" element={<h1>Error</h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
