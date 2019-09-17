function printNames(firstName,lastName){
    return (firstName+lastName).toUpperCase();
}

let name=["Shubham","Kandwal"];
let result = printNames(name);
console.log(result);            // last name becomes undefined as firstName= ["Shubham","Kandwal"]      // OUTPUT : SHUBHAM,KANDWALUNDEFINED

let result1 = printNames(...name);
console.log(result1);

