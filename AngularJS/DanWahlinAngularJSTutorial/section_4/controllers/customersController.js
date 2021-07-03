(function () {

    var CustomersController = function ($scope) {
        $scope.sortBy = 'name';
        $scope.reverse = 'false';

        $scope.doSort = function (propName) {
            $scope.sortBy = propName;
            $scope.reverse = !$scope.reverse;
        }

        $scope.customers = customers = [
            { 
                id: 1, 
                joined: '2000-12-02', 
                name: 'John', 
                city: 'Chandler', 
                orderTotal: 9.9956,
                orders: [
                    {
                        id: 1,
                        product: 'Shoes',
                        total: 9.9956
                    }
                ]
            }, 
            { 
                id: 2, 
                joined: '2022-12-02', 
                name: 'Alex', 
                city: 'Alex', 
                orderTotal: 4.444,
                orders: [
                    {
                        id: 2,
                        product: 'Boots',
                        total: 45.55
                    }
                ]
            }
        ]   
    };

    CustomersController.$inject = ['$scope'];

    angular.module('customersApp').controller('CustomersController', CustomersController);
}());