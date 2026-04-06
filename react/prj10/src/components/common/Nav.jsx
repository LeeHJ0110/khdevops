import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';
import KhLink from './KhLink';

const StyledDiv = styled.div`
  display: flex;
  flex-direction: ${(props) => {
    return props.fd;
  }};
  justify-content: space-evenly;
  align-items: center;
`;

function Nav({ fd, baseUrl = '' }) {
  return (
    <StyledDiv fd={fd}>
      <KhLink url={baseUrl + '/member/login'} text={'MEMBER LOGIN'} />
      <KhLink url={baseUrl + '/member/join'} text={'MEMBER JOIN'} />
      <KhLink url={baseUrl + '/board/insert'} text={'BOARD INSERT'} />
      <KhLink url={baseUrl + '/board/list'} text={'BOARD LIST'} />
    </StyledDiv>
  );
}

export default Nav;
