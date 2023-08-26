// var jogador1 = 0;
// var jogador2 = 1;
// var placar;

// jogador1 != -1 && jogador2 != -1 ? console.log('jogadores válidos') : console.log('jogadores inválidos')


// if (jogador1 > 0) {
//   console.log("jogador 1 marcou ponto");

// } else if (jogador2 > 0) {
//   console.log("jogador 2 marcou ponto");

// } else {
//   console.log("Ninguém marcou ponto");

// }

// placar=jogador1>jogador2

// console.log(placar)

// switch (placar) {
//  case (placar=jogador1>jogador2):
//   console.log('jogador 1 venceu');
//   break;

//  case (placar=jogador2>jogador1):
//   console.log('jogador 2 venceu');
//   break;

//  default:
//   console.log('ninguém venceu')
//   break;
// } 





let array = ['valor1', 'valor2', 'valor3', 'valor4', 'valor5', 'valor6', 'valor7',];

let object = {propriedade1: 'valor', propriedade2: 'valor2', propriedade3: 'valor3'};


// for(let indice = 0; indice < array.length; indice++){
//  console.log(indice)
// }

// for ( let indice in array){

//  console.log(indice)

// }


// for ( indice in object){

//  console.log(indice)

// }


for (item of array) {
 console.log(item)

}

for ( item of object){
 console.log(item)

}