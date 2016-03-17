var path = require('path');
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  context: __dirname,
  entry: "./app/index.js",
  output: {
    path: "dist",
    filename: "bundle.js",
    hash: true
  },
  module: {
    loaders: [
      {
        test: /\.jsx?$/,
        exclude: /(node_modules|bower_components)/,
        loader: 'babel',
        query: {
            presets: ['react', 'es2015']
        }
      }
    ]
  },
  plugins: [new HtmlWebpackPlugin({
        template: 'my-index.html'
    })
  ],
  devServer: {
    hot: true,
    port: 3000
  }
};
