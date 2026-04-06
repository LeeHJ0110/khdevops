import React, { useContext } from 'react';
import { ProductContext } from '../context/ProductContext';

function World() {
  const { product } = useContext(ProductContext);
  console.log(board);

  return (
    <>
      <h1>world</h1>
    </>
  );
}

export default World;
