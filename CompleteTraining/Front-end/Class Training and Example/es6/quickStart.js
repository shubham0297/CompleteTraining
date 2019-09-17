var sum = function(a,b){                    // Anonymous function
    return a+b;
}

var add = (a,b)=>a+b;                 // since upper function was anonymous., so y write function and y use {} for single line .

function multiply(a,b){
    return a*b;
}


console.log(multiply(4,5))  ;           // will work
console.log(sum(4,5));                  // ffunction doest have a name, but sum is its reference...so it works
console.log(add(4,5));                  
