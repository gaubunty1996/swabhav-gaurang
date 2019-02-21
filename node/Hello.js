console.log("Indide node")
console.log(this)
//console.log(global);

console.log(this==global);

let foo="Hello in foo";
console.log(foo);
console.log(global.foo);

setTimeout(()=>{
    console.log("after 3 secs "+foo)
},3000)