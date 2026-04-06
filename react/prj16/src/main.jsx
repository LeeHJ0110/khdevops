import { StrictMode, useState } from 'react';
import { createRoot } from 'react-dom/client';
import './index.css';
import App from './App.jsx';
import { RootContext } from './context/RootContext.jsx';
import { ProductContext } from './context/ProductContext.jsx';

const obj = {
  todo: { todoVoList: [] },
  member: { loginMemberVO: [] },
  board: { boardVoList: [] },
};
const [product, setProduct] = useState();
createRoot(document.getElementById('root')).render(
  <ProductContext.Provider value={{ product, setProduct }}>
    <App />
  </ProductContext.Provider>
);
