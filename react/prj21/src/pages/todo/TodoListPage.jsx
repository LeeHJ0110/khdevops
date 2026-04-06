import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import useTodo from '../../hooks/useTodo';

function TodoListPage() {
  const { todoVoList } = useSelector((state) => state.todo);

  const { fetchTodoVoList } = useTodo();

  // mount 시 1번만 호출
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
            <th>할일</th>
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
