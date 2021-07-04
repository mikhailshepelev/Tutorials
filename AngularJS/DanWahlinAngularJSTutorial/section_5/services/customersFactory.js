(function() {
    var customersFactory = function() {
        var customers = [
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
        ];

        var factory = {};
        factory.getCustomers = function() {
            return customers;
        };
        factory.getCustomer = function(customerId) {
            for(var i=0, len=customers.length; i<len; i++) {
                if (customers[i].id === parseInt(customerId)) {
                    return customers[i];
                }
            }
            return {};
        };

        /* 
        factory.getCustomers = function() {
            return $http.get('/customers');
        };
        
        factory.getCustomer = function(customerId) {
            return $http.get('customers/' + customerId);
        };
        */

        return factory;
    };

    angular.module('customersApp').factory('customersFactory', customersFactory);
}());