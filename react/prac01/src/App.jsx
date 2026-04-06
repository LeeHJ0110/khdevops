import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import ToolPage from './pages/ToolPage';
import FoodPage from './pages/FoodPage';
import ListPage from './pages/ListPage';
import { useState } from 'react';
import MainLayout from './layout/MainLayout';

function App() {
  const [cardList, setCardList] = useState([]);
  function plusPrice(price, name) {
    const vo = { price: price, name: name };
    setCardList([...cardList, vo]);
    console.log(cardList);
  }
  return (
    <>
      <Routes>
        <Route path="/*" element={<MainLayout />}>
          <Route
            path="ToolPage"
            element={<ToolPage f={plusPrice} bgColor={'gray'} />}
          />
          <Route
            path="FoodPage"
            element={<FoodPage f={plusPrice} bgColor={'lime'} />}
          />
          <Route path="CardList" element={<ListPage cardList={cardList} />} />
          <Route path="/*" element={<h1>404</h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
