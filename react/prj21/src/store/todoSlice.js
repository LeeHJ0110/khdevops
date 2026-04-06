import { createSlice } from '@reduxjs/toolkit';

const todoSlice = createSlice({
  name: 'todo',
  initialState: {
    todoVoList: [],
  },
  reducers: {
    insert: (state, action) => {
      state.todoVoList.push(action.payload);
    },
    setTodoVoList: (state, action) => {
      state.todoVoList = action.payload;
    },
  },
});

export const { insert, setTodoVoList } = todoSlice.actions;
export default todoSlice.reducer;
