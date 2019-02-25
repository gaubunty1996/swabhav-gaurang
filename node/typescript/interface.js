function printDetails(Customer) {
    for (var _i = 0, Customer_1 = Customer; _i < Customer_1.length; _i++) {
        var c = Customer_1[_i];
        console.log(c);
    }
}
printDetails([{ fisrtName: "ajay", lastName: "pandey", salary: 15000 }, { fisrtName: "gaurang", lastName: 'Kadam', salary: 15000 }, { fisrtName: "vinod", lastName: "valkunde", salary: 15000 }]);
