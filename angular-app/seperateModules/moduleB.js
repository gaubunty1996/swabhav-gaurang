angular.module('moduleB', []).
            controller('ControllerB', function ($scope, $rootScope) {
                console.log("inside controller B")
                $scope.ControllerB = {
                    message: "ControllerB says hello"
                }
                console.log($rootScope)
                
            });
