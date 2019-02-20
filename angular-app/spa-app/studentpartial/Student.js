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

    serviceobj.updateDetails = function (Studentobj, id) {


    }

    var validator = function (Studentobj) {
        if (Studentobj.rollNo == undefined || Studentobj.name == undefined || Studentobj.age == undefined
            || Studentobj.email == undefined || Studentobj.date == undefined || Studentobj.isMale == undefined) {
            return false;
        } return true;
    }

    return serviceobj;
}])

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

app.controller('StudentDisplayController', ['website','$window', '$scope', '$filter', '$rootScope', 'StudentService', function (website,$window, $scope, $filter, $rootScope, StudentService) {
    $scope.StudentDetailList;
    $scope.islogin=false;
    $scope.Studentobj;
    $scope.hidden = true;
    $scope.retrivedobj = JSON.parse($window.sessionStorage.getItem("obj"));
    console.log($scope.retrivedobj)

    $scope.logout=()=>{
        $window.sessionStorage.clear();
        $window.location.reload();
    }

    if ($scope.retrivedobj != null) {
        if ($scope.retrivedobj.isLoggedIn) {
            console.log($scope.retrivedobj)
           //$scope.retrivedobj.isLoggedIn=false;
           sessionStorage.setItem('obj',JSON.stringify($scope.retrivedobj));

           $scope.islogin=true;

        }
        else {
            alert("you do not have the permission to delete")
            console.log($scope.retrivedobj)
            $window.location.href = "#/login";

        }
    }
    else {
        // alert("user not logged in");
         $window.location.href = "#/display";


    }

    $scope.editdata = (id) => {
        console.log(website.url);
        console.log("edit clicked");
        if ($scope.retrivedobj != null) {
            if ($scope.retrivedobj.isLoggedIn) {

               $window.location.href="#/edit/"+id;
            }
            else {
                alert("you do not have the permission to delete")
                console.log($scope.retrivedobj)
                $window.location.href = "#/login";

            }
        }
        else {
            alert("user not logged in");
            $window.location.href = "#/login";


        }
        
    }

    $scope.deletedata = (id) => {
        if ($scope.retrivedobj != null) {
            if ($scope.retrivedobj.isLoggedIn) {

                StudentService.Delete(id).then(function (response) {
                    alert(response);
                });
            }
            else {
                alert("you do not have the permission to delete")
                console.log($scope.retrivedobj)
                $window.location.href = "#/login";

            }
        }
        else {
            alert("user not logged in");
            $window.location.href = "#/login";


        }
    }

    StudentService.getStudentList().then(function (response) {
        $scope.StudentDetailList = response;
        console.log($scope.StudentDetailList);

        $scope.hidden = false;
    }).catch(function (reject) {

        alert(reject);
    })

}])
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
app.controller('StudentEditController', ['website','$scope', '$window', '$filter', '$routeParams', 'StudentService', function (website,$scope, $window, $filter, $routeParams, StudentService) {
    $scope.Studentobj;
    $scope.uiddata = $routeParams.UID;
    $scope.retrivedobj = JSON.parse($window.sessionStorage.getItem("obj"));
    console.log($scope.retrivedobj)

    $scope.updateDetailsOfStudent = () => {
        alert("updated")
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
        StudentService.updateStudentById(studentobj, $scope.uiddata)
    }


    StudentService.getStudentById($scope.uiddata).then(function (response) {
        console.log("edit clicked")
        if ($scope.retrivedobj != null) {
            if ($scope.retrivedobj.isLoggedIn) {
                $scope.Studentobj = response;
                let stdDate = new Date($scope.Studentobj[0].date);
                console.log(stdDate)
                let Stddate = $filter('date')(stdDate, 'dd-MM-yy');
                $scope.inputRollNo = $scope.Studentobj[0].rollNo;
                $scope.inputName = $scope.Studentobj[0].name;
                $scope.inputAge = $scope.Studentobj[0].age;
                $scope.inputEmail = $scope.Studentobj[0].email;
                $scope.inputDate = stdDate;

                if ($scope.Studentobj[0].isMale) {
                    $('input:radio[name=sex]')[0].checked = true;
                    $('input:radio[name=sex]')[1].checked = false;
                }
                if ($scope.Studentobj[0].isMale == false) {
                    $('input:radio[name=sex]')[1].checked = true;
                    $('input:radio[name=sex]')[0].checked = false;
                }
                console.log(Stddate);
            }
            else {
                alert("you do not have the permission to edit")
                console.log($scope.retrivedobj);
                $window.location.href = "#/login";

            }
        }
        else {
            alert("user not logged in");
            $window.location.href = "#/login";

        }

    }).catch(function (reject) {

        alert(reject);
    })

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