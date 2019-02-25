interface ICustomer{
    fisrtName : String
    lastName : String
    salary : number
}
function printDetails(Customer : ICustomer[]){
    for(let c of Customer){
        console.log(c);
    }
}
printDetails([{fisrtName:"ajay",lastName:"pandey",salary:15000},{fisrtName:"gaurang",lastName:'Kadam',salary:15000},{fisrtName:"vinod",lastName:"valkunde",salary:15000}])