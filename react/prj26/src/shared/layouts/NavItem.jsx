import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const StyledLink = styled(Link)`
  text-decoration: none;
  color: black;
  font-size: 2em;
  border: 3px dashed black;
  padding: 5px 50px;
  &:hover {
    background-color: lightgray;
  }
`;

function NavItem({ url, str }) {
  return (
    <>
      <StyledLink to={url}>{str}</StyledLink>
    </>
  );
}

export default NavItem;
