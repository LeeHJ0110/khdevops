import React from 'react';
import { useNavigate } from 'react-router-dom';

function Nav() {
  const navi = useNavigate();
  return (
    <nav>
      <button
        onClick={() => {
          navi('/ToolPage');
        }}
      >
        공구점
      </button>
      <button
        onClick={() => {
          navi('/FoodPage');
        }}
      >
        음식점
      </button>
      <button
        onClick={() => {
          navi('/CardList');
        }}
      >
        리스트
      </button>
    </nav>
  );
}

export default Nav;
