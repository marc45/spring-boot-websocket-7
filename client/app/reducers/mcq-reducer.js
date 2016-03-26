import sampleQuestions from '../data/sample-set';

export default function(state = null, action) {
    if (state === null) {
        return {
            questionList: sampleQuestions,
            currentQuestion: 0,
            answered: {}
        };
    }

    if(action.type === 'OPTION_SELECTED') {
        var currentQuestionId = state.questionList[state.currentQuestion].id;
        var answerEntry = {};
        answerEntry[currentQuestionId] = action.payLoad;
        var answered = Object.assign(answerEntry, state.answered);
        console.log(answered);

        return {
            questionList: sampleQuestions,
            currentQuestion: state.currentQuestion,
            answered: answered
        }
    }

    if(action.type === 'NEXT_SELECTED') {
        return {
            questionList: sampleQuestions,
            currentQuestion: state.currentQuestion + 1,
            answered: state.answered
        }
    }

    return state;
}