import React from 'react';
import styled from 'styled-components';

const StyledButton = styled.button`
  padding: 10px 16px;
  border: none;
  border-radius: 6px;
  background-color: #007bff;
  color: white;
`;

function AwsomeButton({ children, onClick }) {
  return <StyledButton onClick={onClick}>{children}</StyledButton>;
}

export default AwsomeButton;
