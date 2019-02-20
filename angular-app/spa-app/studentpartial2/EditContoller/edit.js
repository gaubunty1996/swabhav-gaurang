var app= angular.module('SwabhavTechlabs');
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
