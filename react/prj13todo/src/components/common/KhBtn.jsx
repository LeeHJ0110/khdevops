import React from 'react';
import { styled } from 'styled-components';

const StyledButton = styled.button`
  padding: 10px 16px;
  font-size: 14px;
  font-weight: 500;
  border: none;
  border-radius: 8px;
  background-color: #4f46e5;
  color: #ffffff;
  cursor: pointer;
  transition: all 0.2s ease;

  &:hover {
    background-color: #4338ca;
  }

  &:active {
    transform: scale(0.97);
  }

  &:disabled {
    background-color: #a5b4fc;
    cursor: not-allowed;
  }
`;

function KhBtn({ children }) {
  return (
    <>
      <StyledButton>{children}</StyledButton>
    </>
  );
}

export default KhBtn;
