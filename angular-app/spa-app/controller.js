angular.module('swabhav-spa-app')
    .controller('HomeController', function ($scope) {
        console.log("Homecontrol created")
        $scope.data = "Homecontrol created";
    })
    .controller('AboutController', function ($scope) {
        console.log("AboutController created")
        $scope.data = "AboutController created";
    })
    .controller('CareersController', function ($scope) {
        console.log("CareersController created")
        $scope.data = "CareersController created";
    })