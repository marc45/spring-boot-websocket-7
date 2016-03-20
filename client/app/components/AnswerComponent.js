var React = require('react');

var Answer = React.createClass({
    handleClick() {
        console.log("Clicked on answer");
    },

    render() {
        return (<div onClick={this.handleClick} > <h4> {this.props.optionText} </h4> </div>)
    }
});

module.exports = Answer;