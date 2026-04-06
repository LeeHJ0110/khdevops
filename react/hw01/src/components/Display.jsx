import { useState } from 'react';
import DisplayCalcul from './DisplayCalcul';
import CalBtn from './CalBtn';

const Display = () => {
  const [str, setStr] = useState(' ');

  function putstr(input) {
    setStr((str) => {
      if (input == '=') {
        return eval(str);
      } else if (input == 'c') {
        return '';
      }
      return '' + str + input;
    });
  }

  return (
    <>
      <h1>계산기</h1>
      <DisplayCalcul num={str} />
      <CalBtn str={1} f={putstr} />
      <CalBtn str={2} f={putstr} />
      <CalBtn str={3} f={putstr} />
      <CalBtn str={'-'} f={putstr} />
      <br />
      <CalBtn str={4} f={putstr} />
      <CalBtn str={5} f={putstr} />
      <CalBtn str={6} f={putstr} />
      <CalBtn str={'+'} f={putstr} />
      <br />
      <CalBtn str={7} f={putstr} />
      <CalBtn str={8} f={putstr} />
      <CalBtn str={9} f={putstr} />
      <CalBtn str={'*'} f={putstr} />
      <br />
      <CalBtn str={0} f={putstr} />
      <CalBtn str={'/'} f={putstr} />
      <CalBtn str={'c'} f={putstr} />
      <CalBtn str={'='} f={putstr} />
    </>
  );
};

export default Display;
