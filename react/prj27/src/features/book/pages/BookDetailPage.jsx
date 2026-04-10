import React, { useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import useBook from '../hooks/useBook';

function BookDetailPage() {
  const { vo, fetchVoDetail, deleteVo } = useBook();
  const { id } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    fetchVoDetail(id);
  }, []);

  return (
    <>
      <h1>BookDetailPage</h1>
      <hr />
      <div>
        <h3>id: {vo.id}</h3>
        <h3>title: {vo.title}</h3>
        <h3>price: {vo.price}</h3>
        <h3>createdAt: {vo.createdAt}</h3>
        <h3>modifiedAt: {vo.modifiedAt}</h3>
        <h3>delYn: {vo.delYn}</h3>
      </div>
      <hr />
      <button
        onClick={() => {
          navigate(`/book/edit/${vo.id}`);
        }}
      >
        수정
      </button>
      <button
        onClick={async () => {
          const resp = await deleteVo(vo.id);
          if (resp.status == 204) {
            alert('삭제 성공');
          } else {
            alert('삭제 실패');
          }
        }}
      >
        삭제
      </button>
    </>
  );
}

export default BookDetailPage;
