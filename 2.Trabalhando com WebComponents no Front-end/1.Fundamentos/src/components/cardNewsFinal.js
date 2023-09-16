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

   const authorLeft = document.createElement('span')
   authorLeft.setAttribute('class',"author")

   authorLeft.textContent = "By " + (this.getAttribute('autor') || "Anonymous");

   const authorImg = document.createElement('img')
   authorImg.src = this.getAttribute("url-img1") || "./assets/default.jpg"
   authorImg.alt = "imagem"
   
   authorLeft.appendChild(authorImg)  
   

   
   const linkLeft = document.createElement('a')
   linkLeft.setAttribute('class',"title")

   linkLeft.textContent = this.getAttribute("title")
   linkLeft.href = this.getAttribute("url")
   
   
   
   const contentLeft = document.createElement('p')
   contentLeft.setAttribute('class',"content")

   contentLeft.textContent = this.getAttribute("content")
   


   cardLeft.appendChild(authorLeft)
   cardLeft.appendChild(linkLeft)
   cardLeft.appendChild(contentLeft)

   const cardRight = document.createElement('div');
   cardRight.setAttribute('class', "card_right");
   
   const newsImg = document.createElement('img')
   newsImg.setAttribute('class', "cover");
   newsImg.src = this.getAttribute("url-img2")
   newsImg.alt="foto da noticia"

   

   cardRight.appendChild(newsImg)


   componentRoot.appendChild(cardLeft);
   componentRoot.appendChild(cardRight);


   return componentRoot

  }

  //estilo do componente
  style(){

   const style = document.createElement('style')

   style.textContent = `
   *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
   
    font-family: 'Segoe UI', sans-serif;
   }
   
   .card {
    width: 100%;
    max-width: 720px;
    box-shadow: 1px 1px 15px rgba(0, 0 ,0 , 0.5);
    display: flex;
    justify-content: space-between;
   
    padding: 20px;
   
   
   }
   
   .card_left {
    display: flex;
    flex-direction: column;
    justify-content: center;
   }
   
   .author {
    display: flex;
    flex-direction: row;
    align-items: center;
    gap: 5px;
    font-size: 12px;
    font-weight: 400;
   }
   
   .author img {
    width: 20px;
    height: 20px;
    border-radius: 20px;
    object-fit: cover;
   }
   
   
   .card_left > .title {
    margin-top: 10px;
    font-size: 25px;
    font-weight: 700;
    text-decoration: none;
    color: black;
    cursor: pointer;
   }
   
   .content {
    color: gray;
   }
   
   
   .card_right img {
    height: 150px;
    object-fit: cover;
   }
   
   `


   return style

  }
}

customElements.define("card-final", CardNewsFinal)