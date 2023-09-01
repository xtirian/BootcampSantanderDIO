var pageCardLimit;

if (window.innerWidth <= 586) {
  pageCardLimit = 10;
} else if (window.innerWidth > 586 && window.innerWidth <= 768) {
  pageCardLimit = 15;
} else if (window.innerWidth > 768) {
  pageCardLimit = 25;
}



function createCard(pokemon) {
  let name = pokemon.name.split("");
  let id = String(pokemon.id).split("");
  let img = pokemon.sprites.other.dream_world.front_default;
  let type1 = pokemon.types[0].type.name.split("");
  let type2 = [" "];  

  //Set Uppercase in the first letter of the name
  // let firstLetter = name[0].toUpperCase();
  // name.shift();
  // name.unshift(firstLetter);
  // name = name.join("");
  

  //add the 0 before the ID
  while (id.length <= 2) {
    id.unshift("0");
  }

  id = id.join("");

  //set the type 2

  if (pokemon.types[1] != undefined) {
    type2 = pokemon.types[1].type.name.split("");
  }

  
  

  //set UpperCase to the first letter os each type

  let datas = [name, type1, type2];

  datas.forEach((info) => {
    let firstLetter = info[0].toUpperCase();
    info.shift();
    info.unshift(firstLetter);
  });

  //define if there is second type in the HTML
  let setType2 = ""; 

  console.log(type2[0])
  if(type2[0] != [" "]){    
    setType2 = `<p class="lista-pokemons-card-info">${datas[2].join("")}</p>`
  } 



  return `<li class="lista-pokemons-card type type-${datas[1].join("")}" style="background-image: url(${img}); ">
      <span class="lista-pokemons-id">#${id}</span>
      <h2 class="lista-pokemons-card-name">${datas[0].join("")}</h2>
      <p class="lista-pokemons-card-info">${datas[1].join("")}</p>
      ${setType2}
      
     </li>`;
}

var url = `https://pokeapi.co/api/v2/pokemon/?limit=${String(pageCardLimit)}`;

const putCardOnScreen = (result) => {
  let Page = document.getElementById("pokedex-page");

  Page.innerHTML = result.map(createCard).join("");
};

async function getPokemonDetail(pokemon) {
  let response = await fetch(pokemon.url);
  return await response.json();

  // return await fetch(pokemon.url).then((response) => response.json());
}

async function Fetch() {
  let response = await fetch(url);
  let data = await response.json();

  let firstResults = await data.results;

  let newResults = [];

  for (let x = 0; x < firstResults.length; x++) {
    await getPokemonDetail(firstResults[x]).then((pokeObj) =>
      newResults.push(pokeObj)
    );
  }

  console.log(newResults[0]);

  // let newResults = await firstResults.map(getPokemonDetail);

  return newResults;
}

Fetch().then((pokeDetails) => {
  let Page = document.getElementById("pokedex-page");

  Page.innerHTML = pokeDetails.map(createCard).join("");
});
