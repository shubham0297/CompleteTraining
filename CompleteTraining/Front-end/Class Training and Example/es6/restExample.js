function sumNumber(...numbers){                                         // Like var args in JAVA
    let total=0;
    console.log(numbers.length)                     // to check if it is actually being converted to array
    numbers.forEach((number)=>total +=number)
    return total
}

let x = sumNumber(1,2,3);
console.log(x)

let y  = sumNumber(1,2,3,4,5,6);
console.log(y)