import React, { useEffect } from 'react';
import { useSelector } from 'react-redux';
import useBook from '../../hooks/useBook';
import styled from 'styled-components';

const PageWrapper = styled.div`
  padding: 40px;
  background-color: #f5f6f8;
  min-height: 100vh;
`;

const Title = styled.h1`
  font-size: 28px;
  margin-bottom: 10px;
`;

const Divider = styled.hr`
  margin-bottom: 20px;
  border: none;
  border-top: 2px solid #ddd;
`;

const Table = styled.table`
  width: 100%;
  border-collapse: collapse;
  background-color: white;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.08);
`;

const Thead = styled.thead`
  background-color: #2c3e50;
  color: white;
`;

const Th = styled.th`
  padding: 12px;
  text-align: left;
  font-weight: 600;
`;

const Tbody = styled.tbody``;

const Tr = styled.tr`
  border-bottom: 1px solid #eee;

  &:hover {
    background-color: #f9fafb;
  }
`;

const Td = styled.td`
  padding: 12px;
  font-size: 14px;
`;

function BookListPage() {
  const { sBookVoList } = useSelector((state) => state.book);

  const { hSelectBookVoList } = useBook();

  useEffect(() => {
    hSelectBookVoList();
  }, []);

  return (
    <PageWrapper>
      <Title>BookListPage</Title>
      <Divider />
      <Table>
        <Thead>
          <Tr>
            <Th>번호</Th>
            <Th>제목</Th>
            <Th>가격</Th>
            <Th>등록일시</Th>
          </Tr>
        </Thead>
        <Tbody>
          {sBookVoList.map((vo) => {
            console.log(vo);

            return (
              <Tr key={vo.no}>
                <Td>{vo.no}</Td>
                <Td>{vo.title}</Td>
                <Td>{vo.price}</Td>
                <Td>{vo.createdDate}</Td>
              </Tr>
            );
          })}
        </Tbody>
      </Table>
    </PageWrapper>
  );
}

export default BookListPage;
