import React, { Component, PropTypes } from 'react';

export default class Option extends Component {
    render() {
        var className = "list-group-item";

        if(this.props.state === "CORRECT") {
            className += " list-group-item-success"
        } else if(this.props.state === "INCORRECT") {
            className += " list-group-item-danger"
        }

         return (
            <button
                onClick = { this.props.callBack }
                type = "button"
                className = { className }
                disabled = { this.props.disabled }

            >
                { this.props.option }
            </button>
        )
    }
}

Option.propTypes = {
    option: PropTypes.string.isRequired,
    callBack: PropTypes.func.isRequired,
    disabled: PropTypes.bool.isRequired,
    state: PropTypes.string.isRequired
};
