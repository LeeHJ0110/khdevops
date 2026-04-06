import React from 'react';

function DisplayData(props) {
  return (
    <>
      <h3>
        {props.s} : {props.v}
      </h3>
    </>
  );
}

export default DisplayData;
