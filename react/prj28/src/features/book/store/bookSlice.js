import { createSlice } from '@reduxjs/toolkit';

const slice = createSlice({
  name: 'book',
  initialState: {
    vo: {},
    voList: [],
    loading: false,
    error: null,
  },
  reducers: {
    setVoList: (state, action) => {
      state.voList = action.payload;
    },
    setVo: (state, action) => {
      state.vo = action.payload;
    },
    setLoading: (state, action) => {
      state.loading = action.payload;
    },
    setError: (state, action) => {
      state.error = action.payload;
    },
    reset: () => initialState,
  },
});

export const { reset, setError, setLoading, setVo, setVoList } = slice.actions;
export default slice.reducer;
