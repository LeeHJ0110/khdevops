import { createSlice } from '@reduxjs/toolkit';

const countSlice = createSlice({
  name: 'count',
  initialState: { num: 0 },
  reducers: {
    plus: (state) => {
      state.num++;
    },
    minus: (state) => {
      state.num--;
    },
    reset: (state) => {
      state.num = 0;
    },
    plusByValue: (state, action) => {
      state.num += action.payload;
    },
    minusByValue: (state, action) => {
      state.num -= action.payload;
    },
  },
});

export const { plus, minus, reset, plusByValue, minusByValue } =
  countSlice.actions;
export default countSlice.reducer;
