
var converter = function(funcRef,ab){
    var a = ab;
    var result = funcRef(a);
    return result;
}

console.log(converter(()=>45)) ;         // same as converter(function{ return 45;})

var tempConverter = (faren)=>5/9*faren - 12;
var usdToInr = (usd)=>usd*65;

console.log(converter(usdToInr,10));