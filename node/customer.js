class Customer {
    constructor(firstName, secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    get fullName() {
        return this.firstName + " " + this.secondName;
    }
}
// let c1 = new Customer("gaurang", "kadam");
// console.log(c1.fullName)
// console.log(c1);
// console.log(c1.__proto__ == Customer.prototype);
module.exports=Customer;

