import './App.css';
import Hello from './components/Hello';
import Hi from './components/Hi';
import Universe from './components/Universe';
import World from './components/World';

function App() {
  return (
    <>
      <h1 className="bg-green" id="kh">
        app
      </h1>
      <Hello />
      <World />
      <Hi />
      <Universe />
    </>
  );
}

export default App;
