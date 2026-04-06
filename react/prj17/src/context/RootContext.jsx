import { useContext } from 'react';
import { useState } from 'react';
import { createContext } from 'react';

const RootContext = createContext();

function RootContextProvider({ children }) {
  const [num, setNum] = useState(0);

  function plus() {
    setNum((prev) => prev + 1);
  }
  function minus() {
    setNum((prev) => prev - 1);
  }
  function reset() {
    setNum(() => 0);
  }

  return (
    <RootContext.Provider value={{ num, plus, minus, reset }}>
      {children}
    </RootContext.Provider>
  );
}

function useRootContext() {
  return useContext(RootContext);
}

export { RootContextProvider, useRootContext };
