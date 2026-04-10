import axios from "axios";
import React, { useEffect, useState } from "react";

function BookListPage() {
  console.log("zzz");

  const [voList, setVoList] = useState([]);

  useEffect(() => {
    f01();
  }, []);

  async function f01() {
    const resp = await axios.get(`http://127.0.0.1:80/api/book`);
    setVoList(resp.data);
  }

  return (
    <>
      <h1>BookListPage</h1>
      <table>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
          </tr>
        </thead>
        <tbody>
          {voList.map((vo, idx) => {
            return (
              <tr key={vo.id}>
                <td>{vo.id}</td>
                <td>{vo.title}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
}

export default BookListPage;
