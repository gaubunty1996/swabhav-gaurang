

angular.module('state', ['ui.router'])
    .config(
        function ($stateProvider,$urlRouterProvider) {
            $stateProvider.state('home', {
                url:'/home',
                templateUrl: 'partial/home.html',
                controller: 'HomeController'
            }).state('about', {
                url:'/about',
                templateUrl: 'partial/about.html',
                controller: 'AboutController'
            }).state('careers', {
                url:'/careers',
                templateUrl: 'partial/careers.html',
                controller: 'CareersController'
            })
            $urlRouterProvider.otherwise('/home');
            console.log("config created")
        }
    )