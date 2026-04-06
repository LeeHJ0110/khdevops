import styles from './Hello.module.css';

function Hello() {
  return (
    <>
      <h1 className={styles['bg-green']}>hello</h1>
    </>
  );
}

export default Hello;
