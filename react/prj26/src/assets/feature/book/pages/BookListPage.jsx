import React, { useEffect, useRef, useState } from 'react';
import styled from 'styled-components';
import api from '../../../../app/axios';
import useBook from '../hooks/useBook';
import Spinner from '../../../../shared/components/Loading';
import { useNavigate } from 'react-router-dom';

const Wrapper = styled.div`
  width: 100%;
  height: 100%;
  background-color: lightblue;
  display: flex;
  flex-direction: column;
  & tr:hover {
    background-color: gray;
    color: white;
    cursor: pointer;
  }
`;

function BookListPage() {
  const { voList, fetchBookVoList } = useBook();
  const navigate = useNavigate();

  useEffect(() => {
    fetchBookVoList();
  }, []);

  return (
    <Wrapper>
      <h1>BookListPage</h1>
      {voList.length === 0 ? (
        <Spinner />
      ) : (
        <table border={1}>
          <thead>
            <tr>
              <th>번호</th>
              <th>제목</th>
            </tr>
          </thead>
          <tbody>
            {voList.map((vo) => {
              return (
                <tr
                  key={vo.id}
                  onClick={() => {
                    navigate(`/book/detail/${vo.id}`);
                  }}
                >
                  <td>{vo.id}</td>
                  <td>{vo.title}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      )}
    </Wrapper>
  );
}

export default BookListPage;
