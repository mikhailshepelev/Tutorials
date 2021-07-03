(function () {

    var OrdersController = function ($scope, $routeParams) {
        var customerId = $routeParams.customerId;
        $scope.orders = null;

        function init() {
            for(var i=0, len=$scope.customers.length; i<len; i++) {
                if ($scope.customers[i].id === parseInt(customerId)) {
                    $scope.orders = $scope.customers[i].orders;
                    break;
                }
            }
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

        init();
    };

    OrdersController.$inject = ['$scope', '$routeParams'];

    angular.module('customersApp').controller('OrdersController', OrdersController);
}());