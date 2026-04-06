import React, { useEffect } from 'react';
import { useSelector } from 'react-redux';
import useTodo from '../../hooks/useTodo';

function TodoListPage() {
  const { todoVoList } = useSelector((state) => state.todo);

  const { fetchTodoVoList } = useTodo();

  useEffect(() => {
    fetchTodoVoList();
  }, []);

  return (
    <>
      <h1>list</h1>
      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>완료여부</th>
            <th>작성일시</th>
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

export default TodoListPage;
