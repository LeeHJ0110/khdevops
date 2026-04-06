import React from 'react';
import { useState } from 'react';
import KhBtn from '../component/KhBtn';
import DisplayData from '../component/DisplayData';
import { useParams } from 'react-router-dom';

function PersonPage() {
  const { n, a } = useParams();
  const [personVo, setPersonVo] = useState({
    name: n,
    age: a,
    height: 180,
    weight: 90,
  });
  function plusAge() {
    setPersonVo({ ...personVo, age: parseInt(personVo.age) + 1 });
  }
  function minusAge() {
    setPersonVo({ ...personVo, age: personVo.age - 1 });
  }
  function plusHeight() {
    setPersonVo({ ...personVo, height: personVo.height + 1 });
  }
  function minusHeight() {
    setPersonVo({ ...personVo, height: personVo.height - 1 });
  }
  function plusWeight() {
    setPersonVo({ ...personVo, weight: personVo.weight + 1 });
  }
  function minusWeight() {
    setPersonVo({ ...personVo, weight: personVo.weight - 1 });
  }

  return (
    <>
      <h1>PERSON</h1>
      <hr />
      <DisplayData s={'이름'} v={personVo.name} />
      <DisplayData s={'나이'} v={personVo.age} />
      <DisplayData s={'키'} v={personVo.height} />
      <DisplayData s={'몸무게'} v={personVo.weight} />
      <hr />
      <KhBtn f={plusAge} str={'나이 증가'} />
      <KhBtn f={minusAge} str={'나이 감소'} />
      <br />
      <KhBtn f={plusHeight} str={'키 증가'} />
      <KhBtn f={minusHeight} str={'키 감소'} />
      <br />
      <KhBtn f={plusWeight} str={'무게 증가'} />
      <KhBtn f={minusWeight} str={'무게 감소'} />
    </>
  );
}

export default PersonPage;
