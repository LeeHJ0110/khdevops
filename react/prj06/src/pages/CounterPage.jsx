import { useParams } from 'react-router-dom';
import DisplayNum from '../component/DisplayNum';
import KhBtn from '../component/KhBtn';
import { useState } from 'react';

function CounterPage() {
  const { x } = useParams();

  const [num, setNum] = useState(x);
  function plusOne() {
    setNum(num + 1);
  }
  function minusOne() {
    setNum(num - 1);
  }

  return (
    <>
      <h1>카운터</h1>
      <DisplayNum num={num} />
      <KhBtn str={'PLUS'} f={plusOne} />
      <KhBtn str={'MINUS'} f={minusOne} />
    </>
  );
}

export default CounterPage;
