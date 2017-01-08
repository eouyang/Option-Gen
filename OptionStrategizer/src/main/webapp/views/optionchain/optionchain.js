angular.module('myApp.optionchain',['ngRoute'])

.config(function($routeProvider) {
  $routeProvider.when('/optionchain', {
    templateUrl: 'views/optionchain/optionchain.html',
    controller: 'optionchainCtrl'
  });
})

.controller('optionchainCtrl', function($scope, $http) {

     $scope.showExpirations = false;
     $scope.showOptionChain = false;
     $scope.optionExpirations = [];

     $scope.optionChain = [
        {symbol: 'AAPL170106P00122000', strike: '122', expiry: '2017-01-06', optionType: 'put', description: 'AAPL Jan 6 2017 $122.00 Put'},
        {symbol: 'AAPL170106P00122000', strike: '122', expiry: '2017-01-06', optionType: 'put', description: 'AAPL Jan 6 2017 $122.00 Put'},
        {symbol: 'AAPL170106P00122000', strike: '122', expiry: '2017-01-06', optionType: 'put', description: 'AAPL Jan 6 2017 $122.00 Put'}
     ];

     $scope.getExpiry = function() {
        if ($scope.underlyingSymbol) {
            $http.get("option-strategizer/option/expirations?symbol=" + $scope.underlyingSymbol).then(function (resp) {
                console.log(resp.data);
                $scope.optionExpirations = resp.data.expirations;
                $scope.showExpirations = true;
            });
        }
     }

     $scope.getOptionChain = function() {
        if ($scope.optionExpirations.length === 0) {
            $scope.getExpiry();
        } else {
            if ($scope.getExpiry) {
                $http.get("option-strategizer/option/chain?symbol=" + $scope.underlyingSymbol + "&expiry=" + $scope.expiry).then(function (resp) {
                    console.log(resp.data);
                    $scope.optionChain = resp.data.option_pairs;
                    $scope.showOptionChain = true;
                });
            }
        }
     }

});