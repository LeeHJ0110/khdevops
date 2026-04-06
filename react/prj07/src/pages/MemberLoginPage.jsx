import React, { useState } from 'react';

function MemberLoginPage() {
  const [userVo, setUserVo] = useState({
    id: 'GUEST',
    pw: '0000',
  });

  const [x, setX] = useState('');
  const [y, setY] = useState('');

  function handleLogin() {
    setUserVo({ ...userVo, id: x, pw: y });
  }

  function handlChangeId(evt) {
    setX(evt.target.value);
  }
  function handlChangePw(evt) {
    setY(evt.target.value);
  }

  return (
    <>
      <h1>MEMBER LOGIN</h1>
      <span>로그인한 유저 아이디:{userVo.id}</span>
      <br />
      <span>로그인한 유저 비밀번호:{userVo.pw}</span>
      <hr />
      <input
        type="text"
        name="userId"
        placeholder="아이디를 입력하세요"
        onChange={handlChangeId}
      />
      <br />
      <input
        type="password"
        name="userPw"
        placeholder="비밀번호를 입력하세요"
        onChange={handlChangePw}
      />
      <button onClick={handleLogin}>로그인</button>
    </>
  );
}

export default MemberLoginPage;
