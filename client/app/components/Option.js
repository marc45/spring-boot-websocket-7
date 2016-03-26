import React, { Component, PropTypes } from 'react';

export default class Option extends Component {
    render() {
        return (
            <div> { this.props.option } </div>
        )
    }
}

Option.propTypes = {
    option: PropTypes.string.isRequired
};
