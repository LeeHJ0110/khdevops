import React from 'react';
import styled from 'styled-components';

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  gap: 18px;
`;

function ListPage({ todoVoList, setTodoVoList }) {
  function toggleDone(idx) {
    const temp = [...todoVoList];
    temp[idx].done = !temp[idx].done;
    setTodoVoList(temp);
  }

  return (
    <Wrapper>
      <h1>ListPage</h1>
      <hr />
      <table border={1}>
        <thead>
          <tr>
            <th>TITLE</th>
            <th>DONE</th>
          </tr>
        </thead>
        <tbody>
          {todoVoList.map((elem, idx) => {
            return (
              <tr key={idx}>
                <td>{elem.done ? <s>{elem.title}</s> : elem.title}</td>
                <td>
                  {
                    <input
                      type="checkbox"
                      checked={elem.done}
                      onClick={() => {
                        toggleDone(idx);
                      }}
                    />
                  }
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </Wrapper>
  );
}

export default ListPage;
