angular.module('myApp', [
  'myApp.optionchain',
  'ngRoute'
  ])

.config(function($routeProvider) {
  $routeProvider
    .otherwise({
      redirectTo: '/optionchain'
    });
})