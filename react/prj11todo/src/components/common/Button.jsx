import React from 'react';
import { styled } from 'styled-components';

const StyledButton = styled.button`
  padding: 10px 16px;
  border: none;
  border-radius: 6px;

  background-color: #4f46e5;
  color: white;

  font-size: 14px;
  font-weight: 600;

  cursor: pointer;

  &:hover {
    background-color: #4338ca;
  }

  &:active {
    background-color: #3730a3;
  }
`;

function Button({ children }) {
  return <StyledButton>{children}</StyledButton>;
}

export default Button;
