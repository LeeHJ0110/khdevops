import { useState } from 'react';
import './App.css';
import DefaultLayout from './layout/DefaultLayout';

function App() {
  const [todoVoList, setTodoVoList] = useState([]);
  return (
    <>
      <DefaultLayout todoVoList={todoVoList} setTodoVoList={setTodoVoList} />
    </>
  );
}

export default App;
