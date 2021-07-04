function CustomersController() {
    this.sortBy = 'name';
    this.reverse = 'false';

    this.customers = customers=[{joined: '2000-12-02', name:'John', city:'Chandler', orderTotal: 9.9956}, {joined: '2020-12-02', name:'Alex', city:'Johnson', orderTotal: 3.56}, {joined: '2020-10-25', name:'Tina', city:'New York', orderTotal: 2.5643}];
    this.doSort = function(propName) {
        this.sortBy = propName;
        this.reverse = this.reverse;
    };
}