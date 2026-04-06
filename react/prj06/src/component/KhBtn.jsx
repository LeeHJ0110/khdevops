import React from 'react';

function KhBtn({ str, f }) {
  return (
    <>
      <button onClick={f}>{str}</button>
    </>
  );
}

export default KhBtn;
