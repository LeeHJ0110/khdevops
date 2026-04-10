import { Link, Route, Routes } from "react-router-dom";
import "./App.css";
import BookDetailPage from "./pages/book/BookDetailPage";
import BookInsertPage from "./pages/book/BookInsertPage";
import BookListPage from "./pages/book/BookListPage";
import HomePage from "./pages/home/HomePage";
import ErrorPage from "./pages/home/common/ErrorPage";

function App() {
  return (
    <>
      <h1>Book</h1>
      <nav>
        <Link to={"/home"}>홈페이지</Link>
        <Link to={"/book/insert"}>도서 등록</Link>
        <Link to={"/book/list"}>도서 목록</Link>
        <Link to={"/book/detail"}>도서 상세</Link>
      </nav>
      <Routes>
        <Route path="/home" element={<HomePage />} />
        <Route path="/book/insert" element={<BookInsertPage />} />
        <Route path="/book/list" element={<BookListPage />} />
        <Route path="/book/detail" element={<BookDetailPage />} />
        <Route path="/*" element={<ErrorPage />} />
      </Routes>
    </>
  );
}

export default App;
