import React from 'react';
import { useDispatch } from 'react-redux';
import {
  minus,
  minusByValue,
  plus,
  plusByValue,
  reset,
} from '../redux/countSlice';

function CountBtn() {
  const dispatch = useDispatch();
  return (
    <>
      <h1>CountBtn</h1>
      <hr />
      <button
        onClick={() => {
          dispatch(plus());
        }}
      >
        plus
      </button>
      <br />
      <button
        onClick={() => {
          dispatch(minus());
        }}
      >
        minus
      </button>
      <br />
      <button
        onClick={() => {
          dispatch(reset());
        }}
      >
        reset
      </button>
      <br />
      <button
        onClick={() => {
          dispatch(plusByValue(2));
        }}
      >
        plusByValue
      </button>
      <br />
      <button
        onClick={() => {
          dispatch(minusByValue(5));
        }}
      >
        minusByValue
      </button>
      <br />
    </>
  );
}

export default CountBtn;
