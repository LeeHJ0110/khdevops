import React from 'react';
import CardBtn from '../components/CardBtn';
import styled from 'styled-components';

const CardHolerStyle = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: center;
`;

function ToolPage({ f, bgColor }) {
  return (
    <>
      <h1>ToolPage</h1>
      <CardHolerStyle>
        <CardBtn price={2000} name={'스패너'} f={f} bgColor={bgColor} />
        <CardBtn price={3500} name={'망치'} f={f} bgColor={bgColor} />
        <CardBtn price={10000} name={'사다리'} f={f} bgColor={bgColor} />
        <CardBtn price={3000} name={'드라이버'} f={f} bgColor={bgColor} />
        <CardBtn price={5000} name={'톱'} f={f} bgColor={bgColor} />
      </CardHolerStyle>
    </>
  );
}

export default ToolPage;
