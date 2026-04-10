import React, { useEffect } from 'react';
import styled from 'styled-components';
import useBook from '../hooks/useBook';
import { useNavigate } from 'react-router-dom';

const StyledDiv = styled.div`
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  & > table {
    width: 100%;
    height: 100%;
    border: 3px dashed navy;
    & tr:hover {
      background-color: gray;
    }
  }
`;

function BookListPage() {
  const { voList, fetchVoList } = useBook();
  const navigate = useNavigate();

  useEffect(() => {
    fetchVoList();
  }, []);

  return (
    <StyledDiv>
      <h1>BookListPage</h1>
      <table>
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
    </StyledDiv>
  );
}

export default BookListPage;
