import React from 'react';
import { Link } from 'react-router-dom';

function NavItem({ url, str }) {
  return (
    <>
      <Link to={url}>{str}</Link>
    </>
  );
}

export default NavItem;
