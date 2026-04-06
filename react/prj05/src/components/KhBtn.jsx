import React from 'react';

const KhBtn = (props) => {
  return (
    <>
      <button onClick={props.f}>{props.str}</button>
    </>
  );
};

export default KhBtn;
