import React, { useEffect, useState } from 'react';
import api from '../../../../app/axios';
import { useNavigate, useParams } from 'react-router-dom';
import useBook from '../hooks/useBook';

function BookDetailPage() {
  const { vo, fetchBookById, deleteBookById } = useBook();
  const navigate = useNavigate();

  const { id } = useParams();

  useEffect(() => {
    fetchBookById(id);
  }, []);

  return (
    <>
      <h1>BookDetailPage</h1>
      <div>
        <h3>id: {vo.id}</h3>
        <h3>title: {vo.title}</h3>
        <h3>price: {vo.price}</h3>
        <h3>createdAt: {vo.createdAt}</h3>
        <h3>modifiedAt: {vo.modifiedAt}</h3>
        <h3>delYn: {vo.delYn}</h3>
        <hr />
        <button
          onClick={async () => {
            const resp = await deleteBookById(id);
            if (resp.status == 200) {
              alert('삭제 성공');
              navigate(`/book/list`);
            }
          }}
        >
          도서 삭제
        </button>
      </div>
    </>
  );
}

export default BookDetailPage;
