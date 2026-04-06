import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const StyledLink = styled(Link)`
  font-size: 1.5em;
  margin: 0 auto;
  width: 100%;
  text-align: center;
  text-decoration: none;
  border-radius: 3px;
  color: black;
`;

function NavItem({ url, children }) {
  return <StyledLink to={url}>{children}</StyledLink>;
}

export default NavItem;
