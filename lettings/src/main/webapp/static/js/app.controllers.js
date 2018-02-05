var lettingsApp = angular.module('lettingsApp.controllers', []);

lettingsApp.controller('ClientController', function($scope,$http, $location,
		$routeParams, clientRestService) {

//CLIENT CONTROLLER
	$scope.getClients = function() {
		clientRestService.getClients()
		.then(function(response) {
			$scope.clients = response.data;
		});	
	};
	
	$scope.getCostsPerClient = function(id){
		clientRestService.getMonthlyPerClient()
		.then(function(response){
			$scope.clients = response.data;
		});
		
	};
});


//TENANCY CONTROLLER -- NEEDS REWORK FOR ACCESSING THROUGH SERVICE
lettingsApp.controller('TenancyController', function($scope,$http, $location) {
	
	$scope.getTenancies = function() {
		$http.get('api/tenancies')
				.then(function(response) {
					$scope.tenancies = response.data;
					$scope.successMessage = 'Everything OK';
				},function errorCallback(response) {
					$scope.errorMessage = 'Oops, something went wrong.';
				});
	};
	
});