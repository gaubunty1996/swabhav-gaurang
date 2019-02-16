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
        })
    }
)
app.factory('StudentService', ['$http', '$q', function ($http, $q) {
    var serviceobj = {};

    serviceobj.getStudentById = function (stdid) {
        return $q(function (resolve, reject) {
            $http({
                method: "GET",
                url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+stdid
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
            $window.location.href="#/display";
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
app.controller('StudentEditController', ['$scope', '$filter', '$routeParams','StudentService', function ($scope, $filter, $routeParams,StudentService) {
    $scope.Studentobj;
    $scope.uiddata=$routeParams.UID;
    let Studentdate = $filter('date')($scope.inputDate, 'dd-MMM-yy');
 
        StudentService.getStudentById($scope.uiddata).then(function (response) {
            $scope.Studentobj = response;
            console.log($scope.Studentobj[0]);
            console.log($scope.Studentobj[0].id);
            console.log($scope.Studentobj[0].name);
            console.log($scope.Studentobj[0].rollNo);
            console.log($scope.Studentobj[0].email); 
            console.log($scope.Studentobj[0].age);
            console.log($scope.Studentobj[0].date);
            console.log($scope.Studentobj[0].isMale) 

             
            
            $scope.inputRollNo=$scope.Studentobj[0].rollNo;
            $scope.inputName=$scope.Studentobj[0].name;
            $scope.inputAge=$scope.Studentobj[0].age;
            $scope.inputEmail=$scope.Studentobj[0].email;
            Studentdate=$scope.Studentobj[0].date;
            if($scope.Studentobj[0].isMale){
                $scope.GenderOption=$scope.Studentobj[0].isMale;
            }
            
            
        }).catch(function (reject) {

            alert(reject);
        })
        
}])