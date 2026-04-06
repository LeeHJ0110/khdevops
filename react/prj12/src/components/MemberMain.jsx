import React from 'react';
import { Routes, Route } from 'react-router-dom';
import MemberLogin from './MemberLogin';
import MemberJoin from './MemberJoin';

function MemberMain() {
  return (
    <>
      <h1>MemberMain</h1>
      <hr />
      <Routes>
        <Route path="login" element={<MemberLogin />} />
        <Route path="join" element={<MemberJoin />} />
      </Routes>
    </>
  );
}

export default MemberMain;
