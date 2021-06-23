var myApp = angular.module('myApp', []);

myApp.controller('mainController', ['$scope', '$timeout', '$filter', '$http', function($scope, $timeout, $filter, $http) {
    
    $scope.name = 'Tony';
    
    $timeout(function() {
        
        $scope.name = 'Everybody';
        
    }, 3000);

    $scope.handle = '';
    
    $scope.lowercasehandle = function() {
        return $filter('lowercase')($scope.handle);
    };

    $scope.$watch('handle', function(newValue, oldValue) {
        
        console.info('Changed!');
        console.log('Old:' + oldValue);
        console.log('New:' + newValue);
        
    });
    
    $timeout(function() {
       
        $scope.handle = 'newtwitterhandle';
        console.log('Scope changed!');
        
    }, 3000);

    $scope.characters = 5;
    
    $scope.rules = [
      
        { rulename: "Must be 5 characters" },
        { rulename: "Must not be used elsewhere" },
        { rulename: "Must be cool" }
        
    ];
    
    console.log($scope.rules);

    // plain JS method of fetch data, too much things
    var rulesrequest = new XMLHttpRequest();
    rulesrequest.onreadystatechange = function () {
        $scope.$apply(function () {
            if (rulesrequest.readyState == 4 && rulesrequest.status == 200) {
                $scope.rules = JSON.parse(rulesrequest.responseText);
            }
        });
    }
    rulesrequest.open("GET", "http://localhost:54765/api", true);
    rulesrequest.send();

    // built-in angular method to fetch data via $http
    $http.get('/api')
        .success(function (result) {

            $scope.rules = result;

        })
        .error(function (data, status) {

            console.log(data);

        });

    $scope.newRule = '';
    $scope.addRule = function () {
        $http.post('/api', { newRule: $scope.newRule })
            .success(function (result) {

                console.log(result);
                $scope.rules = result;
                $scope.newRule = '';

            })
            .error(function (data, status) {

                console.log(data);

            });
    };
}]);

var tb = document.getElementById("input");
tb.addEventListener("keypress",
    function(event){
	console.log("Pressed!");
    });