(function () {

    var CustomersController = function ($scope, customersService, appSettings) {
        $scope.sortBy = 'name';
        $scope.reverse = 'false';
        $scope.customers = [];
        $scope.appSettings = appSettings;

        function init() {
            $scope.customers = customersService.getCustomers();
        }

/*         function init() {
            customersHttpFactory.getCustomers()
                .success(function (customers) {
                    $scope.customers = customers;
                })
                .error(function (data, status, headers, config) {
                    $log.log(data.error + ' ' + status);
                });
        } factory.getCustomers = function () {
            return $http.get('/customers');
        }

        factory.getCustomer = function (customerId) {
            return $http.get('/customers' + customerId);
        } */

        init();

        $scope.doSort = function (propName) {
            $scope.sortBy = propName;
            $scope.reverse = !$scope.reverse;
        }
    };

    CustomersController.$inject = ['$scope', 'customersService', 'appSettings'];

    angular.module('customersApp').controller('CustomersController', CustomersController);
}());