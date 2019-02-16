angular.module('swabhav-spa-app', ['ngRoute'])
    .config(
        function ($routeProvider) {
            $routeProvider.when('/', {
                templateUrl: 'partial/home.html',
                controller: 'HomeController'
            }).when('/home', {
                templateUrl: 'partial/home.html',
                controller: 'HomeController'
            }).when('/about', {
                templateUrl: 'partial/about.html',
                controller: 'AboutController'
            }).when('/careers', {
                templateUrl: 'partial/careers.html',
                controller: 'CareersController'
            })
        }
    )