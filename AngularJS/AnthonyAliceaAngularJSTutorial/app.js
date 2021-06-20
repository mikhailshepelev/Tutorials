var myApp = angular.module('myApp', ['ngMessages', 'ngResource']);

// this is model below
myApp.controller('mainController', function($scope, $log, $filter, $resource) {

    // 1. Scope service

    $scope.name = 'Jane Doe';
    $scope.occupation = 'Coder';
    
    $scope.getname = function() {
        return 'John Doe';
    }
    
    console.log($scope);

    // 2. Functions and Strings

    var searchPeople = function(firstName, lastName, height, age, occupation) {
        return 'Jane Doe';
    }
    
    // it is possible to convert function to string
    var searchPeopleString = searchPeople.toString();
    console.log(searchPeople);

    // how angular does DI
    console.log(angular.injector().annotate(searchPeople));

    // using different services (built-in and ones should be explicitly added)
    console.log($log);

    $log.log('Hello');
	$log.info('This is an info');
	$log.warn('This is a warning');
	$log.debug('This is a debug message');
	$log.error('this is an error');

	$scope.name = "john";
	$scope.formattedName = $filter('uppercase')($scope.name);
	$log.info($scope.name);
	$log.info($scope.formattedName);
	console.log($resource);
});

var minification = angular.module('minification', ['ngMessages', 'ngResource']);

//To do minification without errors (after renaming vars) 
//we can pass array as second argument and define keywords there

minification.controller('minification', ['$scope', '$log', function($scope, $log) {
    
    console.log($scope);
    
}]);