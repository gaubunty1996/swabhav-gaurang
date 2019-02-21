angular.module('state')
.controller('empController',['$window','$scope','empService','$filter',function($window,$scope,empService,$filter){
    
    $scope.EmployeeArray ;
    $scope.empIDList;
    $scope.departmentList;
    $scope.designationList;

    var promise = empService.getEmployees();
    promise.then(function(response){
        $scope.EmployeeArray = response;
        $scope.departmentList = empService.getdepartmentList($scope.EmployeeArray);
        $scope.designationList = empService.getdesignationList($scope.EmployeeArray);
        $scope.empIDList = empService.getIdList($scope.EmployeeArray);

    }).catch(function(reject){
        alert(reject);
    })

    $scope.showData = function(){
        
        $window.location.href="#/display"
    };

    $scope.PassEvent = function(event){
        empService.delete(event.target.value,$scope.EmployeeArray);
    };
    
    empService.getdepartmentList();

    $scope.Add = function(event){
        var tempId = new Date().getUTCDate()* new Date().getUTCMilliseconds() ;
        var UniqueId = $filter('limitTo')(tempId,4);
        var joiningDate = $filter('date')( $scope.empJoiningDate,'dd-MMM-yy');
         let obj = {
            empId : UniqueId ,
            empName : $scope.empName,
            empRole : $scope.empRole,
            empManagerID : $scope.empManagerID,
            empJoiningDate : joiningDate,
            empSalary : $scope.empSalary,
            empCommision : $scope.empCommision,
            empDepartName : $scope.empDepartName
        }
        empService.addEmployee(obj,$scope.EmployeeArray);

    }
    

}])