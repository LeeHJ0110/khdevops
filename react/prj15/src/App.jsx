import { Route, Routes } from 'react-router-dom';
import './App.css';
import InsertPage from './pages/todo/InsertPage';
import ListPage from './pages/todo/ListPage';
import { useState } from 'react';

function App() {
  const [todoVoList, setTodoVoList] = useState([]);

  return (
    <>
      <Routes>
        <Route
          path="/insert"
          element={
            <InsertPage todoVoList={todoVoList} setTodoVoList={setTodoVoList} />
          }
        />
        <Route
          path="/list"
          element={
            <ListPage todoVoList={todoVoList} setTodoVoList={setTodoVoList} />
          }
        />
      </Routes>
    </>
  );
}

export default App;
