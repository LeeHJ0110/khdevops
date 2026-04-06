import { Route, Routes } from 'react-router-dom';
import './App.css';
import DefaultLayout from './layout/DefaultLayout';
import InsertPage from './page/todo/InsertPage';
import ListPage from './page/todo/ListPage';
import { useState } from 'react';

function App() {
  const [todoVoList, setTodoVoList] = useState([]);
  return (
    <>
      <Routes>
        <Route path="/*" element={<DefaultLayout />}>
          <Route index element={<h1>환영합니다</h1>} />
          <Route
            path="insert"
            element={
              <InsertPage
                todoVoList={todoVoList}
                setTodoVoList={setTodoVoList}
              />
            }
          />
          <Route path="list" element={<ListPage todoVoList={todoVoList} />} />
          <Route path="*" element={<h1>잘못된 요청</h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
