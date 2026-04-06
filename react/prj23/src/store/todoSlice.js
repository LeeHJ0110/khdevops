import { createSlice } from '@reduxjs/toolkit';

const todoSlice = createSlice({
  name: 'todo',
  initialState: { todoVoList: [] },
  reducers: {
    sliceInsertTodoVo: (state, actions) => {
      state.todoVoList.push(actions.payload);
    },
    sliceSelectTodoVoList: (state, actions) => {
      state.todoVoList = actions.payload;
    },
  },
});

export const { sliceInsertTodoVo, sliceSelectTodoVoList } = todoSlice.actions;
export default todoSlice.reducer;
