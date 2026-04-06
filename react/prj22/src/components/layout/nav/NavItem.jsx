import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const StyledLink = styled(Link)`
  text-decoration: none;
  font-weight: 700;
  font-size: 2em;
  border: 2px solid black;
  border-radius: 3px;
  color: white;
  background-color: gray;
`;

function NavItem({ url, children }) {
  return <StyledLink to={url}>{children}</StyledLink>;
}

export default NavItem;
