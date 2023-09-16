function concaArray<T>(... itens: T[]): T[] {
 return new Array().concat(... itens);
}

const numArray = concaArray<number[]>([1,5,7], [2, 5 , 7])

console.log(numArray)