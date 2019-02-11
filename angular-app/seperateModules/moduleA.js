angular.module('moduleA', ['moduleB','moduleC']).
            controller('ControllerA', function ($scope, $rootScope) {
                console.log("inside controller A")
                $scope.ControllerA = {
                    message: "ControllerA says hello"
                }
                console.log($rootScope)
                $rootScope.company = 'Swbahav techlabs';
            });