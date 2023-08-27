class cardPokemon {
 constructor(){
  this.id = 1;
  
 }

 getAPI() {
  let pokemonId = this.id
  let apiAdress = `https://pokeapi.co/api/v2/pokemon/1/`

  fetch(apiAdress).then(response => response.json()).then((data) => {
   console.log(data)
  })
 }
 getAPI()
}

var listaPokemon = new cardPokemon()