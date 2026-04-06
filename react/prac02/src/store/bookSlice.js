import { createSlice } from '@reduxjs/toolkit';

//해당 테이블을 관리하는 함수들의 묶음
const bookSlice = createSlice({
  name: 'book',
  initialState: {
    sBookVoList: [],
  },
  reducers: {
    sInsertBookVo: (state, action) => {
      state.sBookVoList.push(action.payload); //데이터 받아서 배열에 넣기
    },
    sSelectBookVoList: (state, action) => {
      state.sBookVoList = action.payload;
    },
  },
});

export const { sInsertBookVo, sSelectBookVoList } = bookSlice.actions;
export default bookSlice.reducer;
