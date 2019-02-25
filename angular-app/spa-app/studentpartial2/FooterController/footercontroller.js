var app= angular.module('SwabhavTechlabs');
app.controller('footerController', ['$rootScope', function($rootScope) {
    $rootScope.footer = {
      company: 'Swabhav Techlabs',
      year: '2019'
    };
}])