import React, { useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import useBook from '../hooks/useBook';
import BookDetailText from '../detail/BookDetailText';
import BookDetailContent from '../detail/BookDetailContent';
import { deleteById } from '../api/bookApi';

function BookDetailPage() {
  const { id } = useParams();
  const { loading, error, fetchBookVoById } = useBook();
  const navigate = useNavigate();

  useEffect(() => {
    fetchBookVoById(id);
  }, [id]);

  if (error) return <h1>error</h1>;
  if (loading) return <h1>로딩중</h1>;

  return (
    <>
      <BookDetailText />
      <BookDetailContent />
      <button
        onClick={() => {
          navigate(`/book/edit/${id}`);
        }}
      >
        수정
      </button>
      <button
        onClick={async () => {
          await deleteById(id);
          alert('삭제 완료');
          navigate(`/book/list`);
        }}
      >
        삭제
      </button>
    </>
  );
}

export default BookDetailPage;
