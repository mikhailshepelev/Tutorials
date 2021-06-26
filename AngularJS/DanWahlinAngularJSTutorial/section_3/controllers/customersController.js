// Option 1

/* app.controller('CustomersController', function ($scope) {
    $scope.sortBy = 'name';
    $scope.reverse = 'false';

    $scope.customers = customers=[{joined: '2000-12-02', name:'John', city:'Chandler', orderTotal: 9.9956}, {joined: '2020-12-02', name:'Alex', city:'Johnson', orderTotal: 3.56}, {joined: '2020-10-25', name:'Tina', city:'New York', orderTotal: 2.5643}];
    $scope.doSort = function(propName) {
        $scope.sortBy = propName;
        $scope.reverse = !$scope.reverse;
    }
}); 

// Option 2

(function () {
    angular.module('customersApp', [])
        .controller('CustomersController', function ($scope) {
            $scope.sortBy = 'name';
            $scope.reverse = 'false';

            $scope.customers = customers = [{ joined: '2000-12-02', name: 'John', city: 'Chandler', orderTotal: 9.9956 }, { joined: '2020-12-02', name: 'Alex', city: 'Johnson', orderTotal: 3.56 }, { joined: '2020-10-25', name: 'Tina', city: 'New York', orderTotal: 2.5643 }];
            $scope.doSort = function (propName) {
                $scope.sortBy = propName;
                $scope.reverse = !$scope.reverse;
            }
        });
}); */

// Option 3

(function () {

    var CustomersController = function ($scope, foo, bar) {
        $scope.sortBy = 'name';
        $scope.reverse = 'false';

        $scope.customers = customers = [{ joined: '2000-12-02', name: 'John', city: 'Chandler', orderTotal: 9.9956 }, { joined: '2020-12-02', name: 'Alex', city: 'Johnson', orderTotal: 3.56 }, { joined: '2020-10-25', name: 'Tina', city: 'New York', orderTotal: 2.5643 }];
        $scope.doSort = function (propName) {
            $scope.sortBy = propName;
            $scope.reverse = !$scope.reverse;
        }
    };

    CustomersController.$inject = ['$scope', 'foo', 'bar'];

    angular.module('customersApp').controller('CustomersController', [ '$scope', 'foo', 'bar', CustomersController]);
});