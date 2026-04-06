import Header from '../components/header/Header';
import Nav from '../components/nav/Nav';
import Footer from '../components/footer/Footer';
import { Outlet } from 'react-router-dom';

function MainLayout() {
  return (
    <>
      <Header />
      <Nav />
      <main>
        <Outlet />
      </main>
      <Footer />
    </>
  );
}

export default MainLayout;
