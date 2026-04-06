import React from 'react';
import styled from 'styled-components';

const StyledInput = styled.input`
  padding: 10px 12px;
  border-radius: 6px;
  border: 1px solid #ccc;
  outline: none;
  font-size: 14px;

  &:focus {
    border-color: #007bff;
  }
`;

function AwesomeInputText(props) {
  return <StyledInput type="text" {...props} />;
}

export default AwesomeInputText;
