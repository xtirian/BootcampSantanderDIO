class CardNewsFinal extends HTMLElement {
 constructor(){
  super();

  const shadow = this.attachShadow({mode:'open'})

  //enviar para a shadow

  shadow.appendChild(this.build());
  shadow.appendChild(this.style());
 }

  //build construção de todos os elementos ao mesmo tempo
  build(){

   const componentRoot = document.createElement('div');
   componentRoot.setAttribute('class', "card");

   const cardLeft = document.createElement('div');
   cardLeft.setAttribute('class', "card_left");
   
   const cardRight = document.createElement('div');
   cardRight.setAttribute('class', "card_right");


   componentRoot.appendChild(cardLeft);
   componentRoot.appendChild(cardRight);


   return componentRoot

  }

  //estilo do componente
  style(){

  }
}

customElements.define("card-final", CardNewsFinal)