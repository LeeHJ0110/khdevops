import React from 'react';

function TodoListPage() {
  const todoVoList = [
    { no: 1, title: '할일1', complete: false },
    { no: 2, title: '할일2', complete: false },
    { no: 3, title: '할일3', complete: false },
    { no: 4, title: '할일4', complete: false },
    { no: 5, title: '할일5', complete: false },
  ];

  return (
    <>
      <h1>TODOList</h1>
      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>달성여부</th>
          </tr>
        </thead>
        <tbody>
          {todoVoList.map((x) => (
            <tr key={x.no}>
              <td>{x.no}</td>
              <td>{x.title}</td>
              <td>{x.complete + ''}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}

export default TodoListPage;
