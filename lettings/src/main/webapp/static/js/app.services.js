var lettingsApp = angular.module('lettingsApp.services', []);

lettingsApp.service('clientRestService', function($http) {
	
	this.getClient = function(id) {
		return $http.get('api/clients/' + id);
	};
	
	this.getClients = function() {
		return $http.get('api/clients');
	};
	
	this.getMonthlyPerClient = function() {
		return $http.get('api/clients/getMonthlyPerClient');
	};
});


