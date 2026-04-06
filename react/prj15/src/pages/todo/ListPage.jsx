import axios from 'axios';
import React, { useEffect } from 'react';
import { selectTodoVoList } from '../../api/todoApi';

function ListPage({ todoVoList, setTodoVoList }) {
  useEffect(() => {
    async function f01() {
      const resp = await selectTodoVoList();
      setTodoVoList(resp.data.voList);
    }
    f01();
  }, []);

  return (
    <>
      <h1>ListPage</h1>
      <hr />
      <table>
        <thead>
          <tr>
            <th>NO</th>
            <th>TITLE</th>
            <th>IS_DONE</th>
            <th>CREATED_AT</th>
          </tr>
        </thead>
        <tbody>
          {todoVoList.map((vo) => {
            return (
              <tr key={vo.no}>
                <td>{vo.no}</td>
                <td>{vo.title}</td>
                <td>{vo.isDone}</td>
                <td>{vo.createdAt}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
}

export default ListPage;
