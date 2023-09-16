"use strict";
function concaArray(...itens) {
    return new Array().concat(...itens);
}
const numArray = concaArray([1, 5, 7], [2, 5, 7]);
console.log(numArray);
