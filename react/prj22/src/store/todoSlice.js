import { createSlice } from '@reduxjs/toolkit';

const todoSlice = createSlice({
  name: 'todo',
  initialState: {
    todoVoList: [],
  },
  reducers: {
    addTodoVo: (state, action) => {
      state.todoVoList.push(action.payload);
    },
    getTodoVoList: (state, action) => {
      state.todoVoList = action.payload;
    },
    toggleTodoVoDoneByNo: (state, action) => {
      for (const vo of state.todoVoList) {
        if (vo.no == action.payload) {
          vo.isDone = !vo.isDone;
          break;
        }
      }
    },
  },
});

export const { addTodoVo, getTodoVoList, toggleTodoVoDoneByNo } =
  todoSlice.actions;
export default todoSlice.reducer;
