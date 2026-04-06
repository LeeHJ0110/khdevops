import React from 'react';
import CardBtn from '../components/CardBtn';
import { styled } from 'styled-components';

const CardHolerStyle = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: center;
`;

function FoodPage({ f, bgColor }) {
  return (
    <>
      <h1>FoodPage</h1>
      <CardHolerStyle>
        <CardBtn price={2000} name={'스파게티'} f={f} bgColor={bgColor} />
        <CardBtn price={3500} name={'피자'} f={f} bgColor={bgColor} />
        <CardBtn price={10000} name={'치킨'} f={f} bgColor={bgColor} />
        <CardBtn price={3000} name={'라면'} f={f} bgColor={bgColor} />
        <CardBtn price={5000} name={'떡볶이'} f={f} bgColor={bgColor} />
      </CardHolerStyle>
    </>
  );
}

export default FoodPage;
