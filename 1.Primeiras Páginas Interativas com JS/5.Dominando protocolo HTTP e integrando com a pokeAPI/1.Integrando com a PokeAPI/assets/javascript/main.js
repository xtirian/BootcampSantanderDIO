var pageCardLimit;

if (window.innerWidth <= 586) {
  pageCardLimit = 10;
} else if (window.innerWidth > 586 && window.innerWidth <= 768) {
  pageCardLimit = 15;
} else if (window.innerWidth > 768) {
  pageCardLimit = 25;
}

function createCard(pokemon) {
  return `<li class="lista-pokemons-card" style="background-image: url(./assets/imagens/1.svg); ">
      <span class="lista-pokemons-id">#001</span>
      <h2 class="lista-pokemons-card-name">${pokemon.name}</h2>
      <p class="lista-pokemons-card-info">Grass</p>
      <p class="lista-pokemons-card-info">Poison</p>
     </li>`;
}

var url = `https://pokeapi.co/api/v2/pokemon/?limit=${String(pageCardLimit)}`;

const putCardOnScreen = (result) => {
  let Page = document.getElementById("pokedex-page");

  Page.innerHTML = result.map(createCard).join("");
};

function Fetch() {
  fetch(url)
    .then((response) => response.json())
    .then((data) => {
      return {
        pageInfo: data,
        results: data.results,
      };
    })
    .then((obj) => {
      let result = obj.results;
      let pageInfo = obj.pageInfo;

      putCardOnScreen(result);     
      
    })
    .catch((error) => console.error(error));
}

Fetch();
