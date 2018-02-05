var lettingsApp = angular.module('lettingsApp.routes', ['ngRoute']);

lettingsApp.config(['$routeProvider', function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl : 'static/html/home.html'
        })
        .when('/clients', {
            templateUrl : 'static/html/clients.html',
                controller : 'ClientController'
        })
        .when('/tenancies', {
            templateUrl : 'static/html/tenancies.html',
                controller : 'TenancyController'
        })
        .otherwise({
            redirectTo: '/'
        });
}]);

lettingsApp.config(['$locationProvider', function($locationProvider) {
	  $locationProvider.hashPrefix("");
	}]);