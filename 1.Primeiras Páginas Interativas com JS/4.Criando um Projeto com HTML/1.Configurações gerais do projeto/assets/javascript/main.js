class cardPokemon {
 constructor(){
  this.id = 1;
  
 }

 getAPI() {
  let pokemonId = this.id
  let apiAdress= `https://pokeapi.co/api/v2/pokemon/${pokemonId}/`

  fetch(apiAdress).then(response => console.log(response))
 }
 getAPI()
}

var listaPokemon = new cardPokemon()