var React = require('react');
var Question = require('./QuestionComponent')
var Option = require('./AnswerComponent')

var QAndA = React.createClass({
    render() {
        return (
            <div>
                <Question questionText = "Vitamin that is not present in egg?"/>
                <Option optionText = "Vitamin C"/>
                <Option optionText = "Vitamin B12"/>
                <Option optionText = "Vitamin A"/>
                <Option optionText = "Vitamin E"/>
             </div>
            )
    }
});

module.exports = QAndA;