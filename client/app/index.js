//var React = require('react');
//var ReactDOM = require('react-dom');
//
//ReactDOM.render(
//  <h1>Hello, world!</h1>,
//  document.getElementById('example')
//);

var SockJS = require("sockjs-client");

var socket = new SockJS("/sample");

socket.onopen = function() {
    console.log('open');
    socket.send('test');
    socket.close();
};

socket.onmessage = function(e) {
    console.log('message', e.data);
};

socket.onclose = function() {
    console.log('close');
};