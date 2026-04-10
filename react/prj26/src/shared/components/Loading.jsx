import React from 'react';
import styled, { keyframes } from 'styled-components';

// 회전 애니메이션
const spin = keyframes`
  to {
    transform: rotate(360deg);
  }
`;

// 스피너 스타일
const StyledDiv = styled.div`
  width: 40px;
  height: 40px;
  border: 4px solid #ddd;
  border-top: 4px solid #333;
  border-radius: 50%;
  animation: ${spin} 0.8s linear infinite;
`;

function Spinner() {
  return <StyledDiv />;
}

export default Spinner;
