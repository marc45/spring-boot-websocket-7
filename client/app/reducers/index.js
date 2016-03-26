import { combineReducers } from 'redux';
import MCQReducer from './mcq-reducer';

const rootReducer = combineReducers({
    practiseSession: MCQReducer
});

export default rootReducer;