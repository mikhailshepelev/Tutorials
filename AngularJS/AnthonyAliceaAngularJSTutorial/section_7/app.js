var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function ($routeProvider) {

    $routeProvider

        .when('/', {
            templateUrl: 'pages/main.html',
            controller: 'mainController'
        })

        .when('/second', {
            templateUrl: 'pages/second.html',
            controller: 'secondController'
        })

        .when('/second/:num', {
            templateUrl: 'pages/second.html',
            controller: 'secondController'
        })

});

myApp.controller('mainController', ['$scope', '$log', function ($scope, $log) {

    $scope.person = {
        name: 'John Doe',
        address: '555 Main St.',
        city: 'New York',
        state: 'NY',
        zip: '11111'
    };

    $scope.people = [
        {
            name: 'John Doe',
            address: '555 Main St.',
            city: 'New York',
            state: 'NY',
            zip: '11111'
        },
        {
            name: 'Jane Doe',
            address: '333 Second St.',
            city: 'Buffalo',
            state: 'NY',
            zip: '22222'
        },
        {
            name: 'George Doe',
            address: '111 Third St.',
            city: 'Miami',
            state: 'FL',
            zip: '33333'
        }
    ];

    $scope.formattedAddress = function (person) {

        return person.address + ', ' + person.city + ', ' + person.state + ' ' + person.zip;

    };

}]);

myApp.controller('secondController', ['$scope', '$log', '$routeParams', function ($scope, $log, $routeParams) {



}]);

myApp.directive("searchResult", function () {
    return {
        restrict: 'AECM', // tells angular what form of using directive should be allowed (attribute - A, element - E, class - C, M - comment)
        // template: '<a href="#" class="list-group-item"><h4 class="list-group-item-heading">Doe, John</h4><p class="list-group-item-text">555 Main St., New York, NY 11111</p></a>',
        templateUrl: 'directives/searchresult.html',
        replace: true, // force template above to replace
        scope: { // isolates scope (forbid to use scope vars of parent controller)
            personName: "@", // @ - means text, 1-way binding! allows to access of parent scope variables from template, name comes from html
            personAddress: "@",
            personObject: "=", // = means two-way binding, whatever happens with this object will update parent controller object
            formattedAddressFunction: "&", // & - means that it is function
        },
        transclude: true, // allows to put something inside of directive
        compile: function (elem, attrs) { // compile may change directive on the fly, before we use it

            console.log('Compiling...');
            //elem.removeAttr('class');
            console.log(elem);

            return {
                
                pre: function(scope, elements, attrs) {
                    console.log('Pre-linking...');
                    console.log(elements);
                },
                post: function(scope, elements, attrs) {
                    console.log('Post-linking...');
                   
                   console.log(scope);
                   
                //    if (scope.personObject.name == 'Jane Doe') {
                //         elements.removeAttr('class');
                //    }
                   
                   console.log(elements);
                }

            }

        },
        link: function(scope, elements, attrs) {
                   
            console.log('Linking...');
 
            console.log(scope);
 
            if (scope.personObject.name == 'Jane Doe') {
                 elements.removeAttr('class');
            }
 
            console.log(elements);
                    
         }     

    }
});