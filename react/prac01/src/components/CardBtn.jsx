import React from 'react';
import DisplayPrice from './DisplayPrice';
import styled from 'styled-components';

const CardStyle = styled.div`
  background-color: ${({ bgColor }) => {
    return bgColor;
  }};
  border: 1px solid black;
  border-radius: 10px;
  overflow: hidden;
`;

function CardBtn({ price, name, f, bgColor }) {
  return (
    <CardStyle bgColor={bgColor}>
      <h2>{name}</h2>
      <DisplayPrice num={price} />
      <button onClick={() => f(price, name)}>장바구니 추가</button>
    </CardStyle>
  );
}

export default CardBtn;
