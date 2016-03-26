import React, { Component, PropTypes } from 'react';
import MCQ from '../components/MCQ';
import Option from '../components/Option';
import { connect } from 'react-redux';
import { selectOption, nextQuestion } from '../actions';
import { bindActionCreators } from 'redux';

export class MCQContainer extends Component {

    optionState(index) {
        if( (index === this.props.question.rightOption) && this.props.isAnswered) {
            return "CORRECT";
        } else if( index === this.props.isAnswered) {
            return "INCORRECT";
        } else {
            return "NORMAL";
        }
    }

    render() {
        const mcq = this.props.question;

        return (
            <div>
            <MCQ question = {mcq.question}>
                {mcq.options.map((option, index) =>
                    <Option
                        key = {index}
                        option = {option}
                        callBack = { () => this.props.selectOption(index) }
                        disabled = { (this.props.isAnswered != undefined) }
                        state = { this.optionState(index) }
                    />
                )}
            </MCQ>
            <button
                disabled = { !this.props.isAnswered }
                onClick = { this.props.nextQuestion }
            > Next </button>
            </div>
        )
    }
}

function mapStateToProps(state) {
    var question = state.practiseSession.questionList[state.practiseSession.currentQuestion];
    var isAnswered = state.practiseSession.answered[question.id];

    return { question, isAnswered };
}

function mapDispatchToProps(dispatch) {
    return bindActionCreators({
        selectOption: selectOption,
        nextQuestion: nextQuestion
    }, dispatch);
}

export default connect(mapStateToProps, mapDispatchToProps)(MCQContainer);