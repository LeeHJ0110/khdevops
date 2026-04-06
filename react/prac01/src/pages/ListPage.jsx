import React from 'react';

function ListPage({ cardList }) {
  return (
    <>
      <h1>장바구니</h1>

      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>name</th>
            <th>price</th>
          </tr>
        </thead>
        <tbody>
          {cardList.map((vo) => {
            return (
              <tr>
                <td>{vo.name}</td>
                <td>{vo.price}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
}

export default ListPage;
