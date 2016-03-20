var React = require('react');

var Question = React.createClass({
    render() {
        return (<h1> { this.props.questionText } </h1>)
    }
});

module.exports = Question;