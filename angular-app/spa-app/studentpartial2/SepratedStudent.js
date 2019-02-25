var app = angular.module('SwabhavTechlabs', ['ngRoute']);
app.constant('website', {
    url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"
});
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
app.factory('StudentService', ['$rootScope','$http', '$q', '$window','website', function ($rootScope,$http, $q, $window,website) {
    var serviceobj = {};
    var userDetails={};
    
    userDetails=JSON.parse($window.sessionStorage.getItem("obj"));
    console.log(userDetails)
    if(userDetails!=null){
        $rootScope.name=userDetails.email;
        console.log($rootScope.name)
       
    }
    else{
        console.log("in else")
    }

    serviceobj.getStudentById = function (stdid) {
        return $q(function (resolve, reject) {
            $http({
                method: "GET",
                url: website.url + stdid
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
            return true;
        }
        else if (user == "admin@gmail.com" && pass == "admin") {
            $rootScope.name=user;
            $window.location.href = "#/display";
            return true;
        }
        else {
            alert("username or password invalid")
            $window.location.href = "#/login";
        }
    }
    serviceobj.Delete = (id) => {
        return $q(function (resolve, reject) {
            let con = confirm("confirm delete ?")
            if (con) {
                $http({
                    method: "DELETE",
                    url: website.url + id
                }).then(function (response) {

                    if (response.status == 200) {
                        resolve("record deleted")
                        $window.location.reload();
                    }
                    else {
                        reject("Some problem occured")
                    }
                }).catch(function (err) {
                    reject("Some problem occured")

                })
            }
            else {

            }
        })
    }

    serviceobj.getStudentList = function () {
        return $q(function (resolve, reject) {
            $http({
                method: "GET",
                url: website.url
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
            $http.post(website.url, Studentobj).then(function (response) {
                $window.location.href = "#/display";
            }, function (reject) {
                alert("Problem Occured");
            });
        } else {
            alert("Please Fill Every Details");
        }

    }
    serviceobj.updateStudentById = (updatedobj, id) => {
        console.log("service called")
        console.log(updatedobj)
        console.log(id)
        $http.put(website.url + id, updatedobj).then(function (response) {
            $window.location.href = "#/display";
        }, function (reject) {
            alert("Problem occured")
        })
    }


    var validator = function (Studentobj) {
        if (Studentobj.rollNo == undefined || Studentobj.name == undefined || Studentobj.age == undefined
            || Studentobj.email == undefined || Studentobj.date == undefined || Studentobj.isMale == undefined) {
            return false;
        } return true;
    }

    return serviceobj;
}])


app.directive("header",function(){
    return {
        templateUrl:"Directives/header.html"
    }
        
    
})
app.directive("footer",function(){
    return {
        templateUrl:"Directives/footer.html"
    }
        
    
})
app.controller('StudentFormController', ['website','$scope', '$filter', 'StudentService', function (website,$scope, $filter, StudentService) {
    $scope.StudentDetailList;
    $scope.hidden = true;

    StudentService.getStudentList().then(function (response) {
        $scope.StudentDetailList = response;
        console.log($scope.StudentDetailList);

        $scope.hidden = false;
    }).catch(function (reject) {

        alert(reject);
    })

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
