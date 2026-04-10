import React, { useEffect, useState } from 'react';
import { findAll } from '../api/bookApi';
import { useDispatch, useSelector } from 'react-redux';
import useBook from '../hooks/useBook';
import BookListText from '../list/BookListText';
import BookListTable from '../list/BookListTable';

function BookListPage() {
  const { loading, error, fetchBookVoList } = useBook();

  useEffect(() => {
    fetchBookVoList();
  }, []);

  if (error) return <h1>error</h1>;
  if (loading) return <h1>로딩중</h1>;

  return (
    <>
      <BookListText />
      <BookListTable />
    </>
  );
}

export default BookListPage;
