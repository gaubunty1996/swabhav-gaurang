var app= angular.module('SwabhavTechlabs');
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