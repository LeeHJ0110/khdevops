import React from 'react';

function ListPage({ todoVoList }) {
  return (
    <>
      <h1>todo목록</h1>

      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>title</th>
            <th>done</th>
          </tr>
        </thead>
        <tbody>
          {todoVoList.map((vo) => {
            return (
              <tr>
                <td>{vo.title}</td>
                <td>{vo.done}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
}

export default ListPage;
