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

  //add the 0 before the ID
  while (id.length <= 2) {
    id.unshift("0");
  }
  id = id.join("");

  //set the type 2

  if (pokemon.types[1] != undefined) {
    type2 = pokemon.types[1].type.name.split("");
  }

  //define if there is second type in the HTML
  let setType2 = "";
  if (type2[0] != [" "]) {
    setType2 = `<p class="lista-pokemons-card-info">${type2.join("")}</p>`;
  }

  return `<li class="lista-pokemons-card type type-${type1.join(
    ""
  )}" style="background-image: url(${img}); ">
      <span class="lista-pokemons-id">#${id}</span>
      <h2 class="lista-pokemons-card-name">${name.join("")}</h2>
      <p class="lista-pokemons-card-info">${type1.join("")}</p>
      ${setType2}      
     </li>`;
}

var url = `https://pokeapi.co/api/v2/pokemon/?limit=${String(pageCardLimit)}`;
var nextPageURL;
var previousPageURL;

/**
 * Function that creates an promise and returns it for using Promise all
 * that fetches data concurrently
 * @param {*} pokemon An Object with the pokemon name and url
 * @returns {Promise} Promise that will fetch an pokemon
 */
function getPokemonDetailPromise(pokemon) {
  return new Promise((resolve, reject) => {
    fetch(pokemon.url)
      .then((response) => {
        if (!response.ok) {
          reject(new Error(`Failed to fetch data for ${pokemon.name}`));
          return;
        }
        return response.json();
      })
      .then((data) => {
        resolve(data);
      })
      .catch((error) => {
        reject(error);
      });
  });
}

async function Fetch(url) {
  let response = await fetch(url);
  let data = await response.json();

  nextPageURL = data.next;
  previousPageURL = data.previous;

  let newResults = [];
  let arrayOfPromises = [];

  for (let x = 0; x < data.results.length; x++) {
    arrayOfPromises.push(getPokemonDetailPromise(data.results?.[x]));
  }

  newResults = Promise.all(arrayOfPromises);

  return newResults;
}

//verify th previous page if it is undefined and change his color

function startLoading() {
  let loadingDiv = document.getElementById("loading");

  loadingDiv.classList.remove("disappear");
}

function finishLoading() {
  let loadingDiv = document.getElementById("loading");

  loadingDiv.classList.add("disappear");
}

function verifyButton() {
  let previousPageButton = document.getElementById("Previous-Page");

  if (previousPageURL === null) {
    previousPageButton.style.display = "none";
  } else {
    previousPageButton.style.display = "inline-block";
  }
}

//fetch start page and the initial pokemons
Fetch(url).then((pokeDetails) => {
  verifyButton();

  startLoading();

  let Page = document.getElementById("pokedex-page");

  Page.innerHTML = pokeDetails.map(createCard).join("");

  finishLoading();
});

// get to the next page button
function getNextPage(nextPageURL) {
  startLoading();

  Fetch(nextPageURL).then((nextPageDetail) => {
    verifyButton();
    let Page = document.getElementById("pokedex-page");

    Page.innerHTML = nextPageDetail.map(createCard).join("");

    finishLoading();
  });
}

function getPreviousPage(previousPageURL) {
  startLoading();

  Fetch(previousPageURL).then((previousPageDetail) => {
    verifyButton();
    let Page = document.getElementById("pokedex-page");

    Page.innerHTML = previousPageDetail.map(createCard).join("");

    finishLoading();
  });
}
