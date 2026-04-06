import NavItem from './NavItem';
import styled from 'styled-components';

const Wrapper = styled.div`
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  width: 100%;
  height: 100%;
`;

function Nav() {
  return (
    <Wrapper>
      <NavItem str={'TODO등록'} url={'insert'} />
      <NavItem str={'TODO목록'} url={'list'} />
    </Wrapper>
  );
}

export default Nav;
