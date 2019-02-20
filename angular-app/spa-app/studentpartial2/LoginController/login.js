var app= angular.module('SwabhavTechlabs');
app.controller('StudentLoginController', ['website','$rootScope', '$scope', '$window', 'StudentService', function (website,$rootScope, $scope, $window, StudentService) {
    $scope.loginemail;
    $scope.loginpass;

    var userStatus = {
        email: $scope.loginemail,
        password: $scope.loginpass,
        isLoggedIn: false
    }

    $scope.logininput = () => {
        $scope.loginemail = $scope.LoginEmail;
        $scope.loginpass = $scope.LoginPassword;

        userStatus.email = $scope.loginemail;
        userStatus.password = $scope.loginpass;
        userStatus.isLoggedIn = true;
        console.log(userStatus);

        $rootScope.status = StudentService.getStatusofUser($scope.loginemail, $scope.loginpass);
        $window.sessionStorage.setItem("obj", JSON.stringify(userStatus));
        if ($rootScope.status) {
            console.log($rootScope.status)
            console.log($scope.loginemail);
            console.log($scope.loginpass);
            console.log("Logged in")
        }


    }
}])