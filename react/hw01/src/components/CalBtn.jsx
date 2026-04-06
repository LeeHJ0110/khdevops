const CalBtn = (props) => {
  return (
    <>
      <button onClick={() => props.f(props.str)}>{props.str}</button>
    </>
  );
};

export default CalBtn;
