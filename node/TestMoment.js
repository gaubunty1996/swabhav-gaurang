let Date=require('moment')
let date=new Date();
console.log(typeof Date)
console.log(date);
console.log(date.subtract(10, 'days').calendar())