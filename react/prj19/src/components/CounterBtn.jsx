import React from 'react';
import { useDispatch } from 'react-redux';
import {
  minus,
  minusByValue,
  plus,
  plusByValue,
  reset,
} from '../redux/counterSlice';

function CounterBtn() {
  const dispatch = useDispatch();
  return (
    <>
      <h1>CounterBtn</h1>
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
          dispatch(plusByValue(3));
        }}
      >
        plusByValue
      </button>
      <br />
      <button
        onClick={() => {
          dispatch(minusByValue(4));
        }}
      >
        minusByValue
      </button>
      <br />
    </>
  );
}

export default CounterBtn;
