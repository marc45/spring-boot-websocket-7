import React, { Component, PropTypes } from 'react';
import MCQ from '../components/MCQ';
import Option from '../components/Option';

export default class MCQContainer extends Component {
    render() {
        const mcq = {
            question: "How are you?",
            options: ["Fine and Dandy", "Not well", "How dare you?", "Great!"]
        };
        return (
            <MCQ question = {mcq.question}>
                {mcq.options.map(option =>
                    <Option option = {option} />
                )}
            </MCQ>
        )
    }
}