angular.module('moduleC', []).
controller('ControllerC', function ($scope, $rootScope) {
    console.log("inside controller C")
    $scope.ControllerC = {
        message: "ControllerC says hello"
    }
    console.log($rootScope)
   
});