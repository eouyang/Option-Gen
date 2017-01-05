angular.module('myApp.optionchain',['ngRoute'])

.config(function($routeProvider) {
  $routeProvider.when('/optionchain', {
    templateUrl: 'views/optionchain/optionchain.html',
    controller: 'optionchainCtrl'
  });
})

.controller('optionchainCtrl', function($scope) {

     $scope.optionChain = [{symbol: 'AAPL170106P00122000', strike: '122', expiry: '2017-01-06', optionType: 'put', description: 'AAPL Jan 6 2017 $122.00 Put'}];

});