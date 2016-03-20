var React = require('react');
var SockJS = require("sockjs-client");
var QAndA = require("./QuestionAndAnswerComponent");

var App = React.createClass({
    componentWillMount: function() {
        this.socket = new SockJS("http://localhost:8080/sample");
        this.socket.onopen = this.connect;
        this.socket.onclose = this.close;
        this.socket.onmessage = this.message;
    },

    connect: function() {
        console.log("Open");
        this.socket.send("test");
        this.socket.close();
    },

    close: function() {
        console.log("Close");
    },

    message: function(e) {
        console.log("Message", e.data);
    },

    render: function() {
        return (<QAndA />);
    }
});

module.exports = App;