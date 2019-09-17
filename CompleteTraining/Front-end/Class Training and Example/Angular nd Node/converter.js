//NODE - Javascript Runtime Environment
var converter = {};                 // Object String literal

converter.farToCel = function(faren){
        var cel = 5/9 * (faren - 32);
        console.log(cel);
}
module.exports = converter;