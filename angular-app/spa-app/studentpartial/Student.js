var app = angular.module('SwabhavTechlabs', ['ngRoute']);
app.config(
    function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partial/form.html',
            controller: 'StudentFormController'
        }).when('/form', {
            templateUrl: 'partial/form.html',
            controller: 'StudentFormController'
        }).when('/display', {
            templateUrl: 'partial/display.html',
            controller: 'StudentDisplayController'
        }).when('/edit/:UID', {
            templateUrl: 'partial/Edit.html',
            controller: 'StudentEditController'
        }).when('/login', {
            templateUrl: 'partial/login.html',
            controller: 'StudentLoginController'
        })
    }
)
app.factory('StudentService', ['$http', '$q', '$window', function ($http, $q, $window) {
    var serviceobj = {};

    serviceobj.getStudentById = function (stdid) {
        return $q(function (resolve, reject) {
            $http({
                method: "GET",
                url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + stdid
            }).then(function (response) {
                if (response.status == 200) {
                    resolve(response.data);
                } else {
                    reject("Data Can't Be Fetched");
                }
            }).catch(function (err) {
                reject("Data Can't Be Fetched")

            })
        })
    }
    serviceobj.getStatusofUser = (user, pass) => {
        if (user == "abc@gmail.com" && pass == "abc@123") {
            $window.location.href = "#/display";
            return true
        }
        else if (user == "admin@gmail.com" && pass == "admin") {
            $window.location.href = "#/display";
            return true
        }
        else {
            alert("username or password invalid")
            $window.location.href = "#/login";
        }
    }

    serviceobj.getEmployeeList = function () {
        return $q(function (resolve, reject) {
            $http({
                method: "GET",
                url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"
            }).then(function (response) {
                if (response.status == 200) {
                    resolve(response.data);
                } else {
                    reject("Data Can't Be Fetched");
                }
            }).catch(function (err) {
                reject("Data Can't Be Fetched")

            })
        })
    }

    serviceobj.addNewStudent = function (Studentobj) {
        if (validator(Studentobj)) {
            $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', Studentobj).then(function (response) {
                $window.location.href = "#/display";
            }, function (reject) {
                alert("Problem Occured");
            });
        } else {
            alert("Please Fill Every Details");
        }

    }

    var validator = function (Studentobj) {
        if (Studentobj.rollNo == undefined || Studentobj.name == undefined || Studentobj.age == undefined
            || Studentobj.email == undefined || Studentobj.date == undefined || Studentobj.isMale == undefined) {
            return false;
        } return true;
    }

    return serviceobj;
}])

app.controller('StudentFormController', ['$scope', '$filter', 'StudentService', function ($scope, $filter, StudentService) {
    $scope.StudentDetailList;
    $scope.hidden = true;


    //$scope.showStudentDetails = function () {

    StudentService.getEmployeeList().then(function (response) {
        $scope.StudentDetailList = response;
        console.log($scope.StudentDetailList);

        $scope.hidden = false;
    }).catch(function (reject) {

        alert(reject);
    })
    //}
    $scope.addStudentDetails = function () {
        let Studentdate = $filter('date')($scope.inputDate, 'dd-MMM-yy');
        let studentobj = {
            rollNo: $scope.inputRollNo,
            name: $scope.inputName,
            age: $scope.inputAge,
            email: $scope.inputEmail,
            date: Studentdate,
            isMale: $scope.GenderOption
        }
        console.log(studentobj);
        StudentService.addNewStudent(studentobj);
    }
}])

app.controller('StudentDisplayController', ['$scope', '$filter', 'StudentService', function ($scope, $filter, StudentService) {
    $scope.StudentDetailList;
    $scope.hidden = true;

    StudentService.getEmployeeList().then(function (response) {
        $scope.StudentDetailList = response;
        console.log($scope.StudentDetailList);

        $scope.hidden = false;
    }).catch(function (reject) {

        alert(reject);
    })

}])
app.controller('StudentLoginController', ['$rootScope','$scope', '$filter', 'StudentService', function ($rootScope,$scope, $filter, StudentService) {

    $scope.logininput = () => {
        $scope.loginemail = $scope.LoginEmail;
        $scope.loginpass = $scope.LoginPassword;
        $rootScope.status = StudentService.getStatusofUser($scope.loginemail, $scope.loginpass);
        if ($rootScope.status) {
            console.log($rootScope.status)
            console.log($scope.loginemail);
            console.log($scope.loginpass);
            console.log("Logged in")
        }


    }
}])
app.controller('StudentEditController', ['$scope', '$filter', '$routeParams', 'StudentService', function ($scope, $filter, $routeParams, StudentService) {
    $scope.Studentobj;
    $scope.uiddata = $routeParams.UID;
    let Studentdate = $filter('date')($scope.inputDate, 'dd-MMM-yy');

    StudentService.getStudentById($scope.uiddata).then(function (response) {
        $scope.Studentobj = response;
       
        $scope.inputRollNo = $scope.Studentobj[0].rollNo;
        $scope.inputName = $scope.Studentobj[0].name;
        $scope.inputAge = $scope.Studentobj[0].age;
        $scope.inputEmail = $scope.Studentobj[0].email;
        Studentdate = $scope.Studentobj[0].date;
        if ($scope.Studentobj[0].isMale) {
            $scope.GenderOption = $scope.Studentobj[0].isMale;
        }
        if ($scope.Studentobj[0].isMale) {
            $scope.GenderOption.checked = $scope.Studentobj[0].isMale
            $('input:radio[name=sex]')[0].checked = $scope.Studentobj[0].isMale;
        }
        else {
            $scope.GenderOption = $scope.Studentobj[0].isMale
        }


    }).catch(function (reject) {

        alert(reject);
    })

}])