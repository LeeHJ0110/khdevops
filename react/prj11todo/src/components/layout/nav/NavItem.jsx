import { Link } from 'react-router-dom';
import styled from 'styled-components';

const StyledDiv = styled.div`
  background-color: red;
  color: blue;
`;

function NavItem({ url, text }) {
  return (
    <>
      <Link to={url}>{text}</Link>
    </>
  );
}

export default NavItem;
