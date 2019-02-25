var app = angular.module('test', []);

app.controller('CustomersController', ['$scope', function ($scope) {
   
    $scope.customer = {
        name: 'David',
        street: '1234 Anywhere St.'
    };
   
}]);