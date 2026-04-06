import { useState } from 'react';
import './App.css';
import PersonPage from './pages/PersonPage';
import CounterPage from './pages/CounterPage';
import { Link, Route, Routes, useNavigate } from 'react-router-dom';

function App() {
  const navi = useNavigate();
  return (
    <>
      <h1>REACT PAGE</h1>
      <Link to={'/counter'}>카운터</Link>
      <br />
      <Link to={'/person'}>사람</Link>
      <br />
      <Link to={'/ㅇ'}>404</Link>
      <hr />
      <button
        onClick={() => {
          navi('/counter');
        }}
      >
        카운터
      </button>
      <button
        onClick={() => {
          navi('/person');
        }}
      >
        사람
      </button>
      <button
        onClick={() => {
          navi('/ㅇ');
        }}
      >
        404
      </button>
      <br />
      <Routes>
        <Route path="/counter/:x" element={<CounterPage />} />
        <Route path="/person/:n/:a" element={<PersonPage />} />
        <Route path="/*" element={<h1>404 NOT FOUND</h1>} />
      </Routes>
    </>
  );
}

export default App;
