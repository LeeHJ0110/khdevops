import axios from "axios";
import React, { useState } from "react";
import api from "../../api/axios";

function BookInsertPage() {
  const [vo, setVo] = useState({
    title: "",
    price: 0,
  });

  function handleSubmit(evt) {
    evt.preventDefault();
    api.post("/book", vo);
    setVo({ title: "", price: 0 });
  }
  function handleChange(evt) {
    setVo({ ...vo, [evt.target.name]: evt.target.value });
  }

  return (
    <>
      <h1>BookInsertPage</h1>
      <hr />
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="title"
          placeholder="도서제목"
          onChange={handleChange}
          value={vo.title}
        />
        <br />
        <input
          type="number"
          name="price"
          onChange={handleChange}
          value={vo.price}
        />
        <br />
        <input type="submit" value={"등록하기"} />
      </form>
    </>
  );
}

export default BookInsertPage;
