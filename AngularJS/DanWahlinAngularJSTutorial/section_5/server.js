var express = require('express'),
    app = express();

app.configure(function () {
    app.use(express.static(__dirname, '/'));
});

app.get('/customers/:id', function(req, res) {
    var customerId = parseInt(req.params.id);
    var data = {};
    for (var i=0, len=customers.length; i<len; i++) {
        if (customers[i].id === customerId) {
            data = customers[i];
            break;
        }
    }
    res.json(data);
});

app.get('/customers', function (req, res) {
    res.json(customers);
});

app.listen(8080);

console.log('Express listening on port 8080');

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