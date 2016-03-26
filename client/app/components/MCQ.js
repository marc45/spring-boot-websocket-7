import React, { Component, PropTypes } from 'react';

export default class MCQ extends Component {
    render() {
        return (
         <div>
            <h3> { this.props.question } </h3>
            <div className="list-group"> { this.props.children } </div>
         </div>
        )
    }
}

MCQ.propTypes = {
    children: PropTypes.node.isRequired,
    question: PropTypes.string.isRequired
};