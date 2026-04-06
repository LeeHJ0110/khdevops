import React from 'react';

function BoardListPage() {
  const voList = [
    { title: '제목01', writer: '홍길동' },
    { title: '제목02', writer: '이길동' },
    { title: '제목03', writer: '삼길동' },
    { title: '제목04', writer: '박길동' },
    { title: '제목05', writer: '김길동' },
  ];

  return (
    <>
      <h1>hello</h1>
      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>제목</th>
            <th>작성자</th>
          </tr>
        </thead>
        <tbody>
          {voList.map((elem) => (
            <tr>
              <td>{elem.title}</td>
              <td>{elem.writer}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}

export default BoardListPage;
