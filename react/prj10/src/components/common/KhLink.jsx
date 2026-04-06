import React from 'react';
import { Link } from 'react-router-dom';

function KhLink({ url, text }) {
  return (
    <>
      <Link to={url}>{text}</Link>
    </>
  );
}

export default KhLink;
