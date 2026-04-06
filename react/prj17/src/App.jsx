import { useState } from 'react';
import reactLogo from './assets/react.svg';
import viteLogo from './assets/vite.svg';
import heroImg from './assets/hero.png';
import './App.css';
import Counter from './components/Counter';
import CounterBtn from './components/CounterBtn';
import ContextCounter from './components/ContextCounter';

function App() {
  console.log('App render');

  return (
    <>
      <ContextCounter />
    </>
  );
}

export default App;
