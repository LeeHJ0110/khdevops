import { createContext } from 'react';

export const MemberContext = createContext();
export const BoardContext = createContext();
export const TodoContext = createContext();

export function GlobalContext({ children }) {
  return (
    <>
      <TodoContext.Provider value={'할일'}>
        <MemberContext.Provider value={'할일'}>
          <BoardContext.Provider value={'할일'}></BoardContext.Provider>
        </MemberContext.Provider>
      </TodoContext.Provider>
    </>
  );
}
