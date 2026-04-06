import React, { useContext } from 'react';
import { BoardContext, MemberContext, TodoContext } from '../context/Khcontext';

function Universe() {
  const todoMemory = useContext(TodoContext);
  console.log('Universe:' + todoMemory);

  const memberMemory = useContext(MemberContext);
  console.log('Universe:', memberMemory);
  const boardMemory = useContext(BoardContext);
  console.log('Universe:', boardMemory);

  return (
    <>
      <h1>universe</h1>
    </>
  );
}

export default Universe;
