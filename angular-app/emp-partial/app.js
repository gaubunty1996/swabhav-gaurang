
angular.module('state', ['ui.router'])
    .config(
        function ($stateProvider,$urlRouterProvider) {
            $stateProvider.state('form', {
                url:'/form',
                templateUrl: 'partial/form.html',
                controller: 'empController'
            }).state('display', {
                url:'/display',
                templateUrl: 'partial/display.html',
                controller: 'empController'
            })
            $urlRouterProvider.otherwise('/form');
            console.log("config created")
        }
    )
    .factory('empService',['$q','$http',function($q,$http){
        var serviceObj = {};
        let empobjArray =[];

        serviceObj.getEmployees = function(){
            return $q(function(resolve,reject){
                let empobjArray =[];
                $http({
                method : "GET",
                url: "http://localhost/angular-app/data.txt"
            }).then(function (response) {
                if(response.status == 200){
                let strArray = response.data.split("\n");
                for (let i = 0; i < strArray.length; i++) {
                    strArray[i] = strArray[i].replace(/\s+/g, "");
                    strArray[i] = strArray[i].replace(/'/g,"");
                }
                strArray = strArray.filter(function (value, index, self) {
                    return self.indexOf(value) === index;
                });
                for(let i = 0;i<strArray.length;i++){
                    let row = strArray[i].split(",");
                    let obj = {
                        empId : row[0],
                        empName : row[1],
                        empRole : row[2],
                        empManagerID : row[3],
                        empJoiningDate : row[4],
                        empSalary : row[5],
                        empCommision : row[6],
                        empDepartName : row[7]
                    }
                    empobjArray.push(obj);
                }
                resolve(empobjArray);
                }else{
                    reject("Data Can't be Fetched");
                }
            });
            })
        }

        serviceObj.delete = function(value,array){
            console.log(array);
            var ans = confirm("Do You Want To Delete Data");
            if(ans){
                for(let i in array){

                    if (array[i].empId == value){
                        console.log(array[i]);
                        array.splice(i,1);
                        console.log(array.length);
                    }
                }
            }
        }

        serviceObj.getdepartmentList = function(array){
            let departmentList = [];
            for(let i in array){
                departmentList.push(array[i].empDepartName);
            }
            departmentList = departmentList.filter(function (value, index, self) {
                    return self.indexOf(value) === index;
            });
            console.log(departmentList);
            return departmentList;
        }

        serviceObj.getdesignationList = function(array){
           let  designationList = [];
           for(let i in array){
               designationList.push(array[i].empRole);
           }
           designationList = designationList.filter(function(value,index,self){
               return self.indexOf(value) === index;
           });
           console.log(designationList);
           return designationList;
        }

        serviceObj.getIdList = function(array){
            let Idlist = [];
            for(let i in array){
                Idlist.push(array[i].empId);
            }
            return Idlist;
        }

        serviceObj.addEmployee = function(obj,array){
            array.push(obj);
        }

        return serviceObj;
    }])
