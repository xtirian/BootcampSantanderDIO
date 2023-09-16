class TituloDinamico extends HTMLElement{
 constructor(){
  super(); //chamando o constructor do HTMLElements

  const shadow = this.attachShadow({mode: 'open'});

  //base do componente

  const componentRoot = document.createElement("h1");

  componentRoot.textContent = this.getAttribute('mensagem')

  console.log(componentRoot.textContent )
  
  

  //estilo do componente
  const style = document.createElement("style");
  style.textContent = `
  h1{
   color: red;
  }`;

  //enviar para a shadow
  shadow.appendChild(componentRoot);
  shadow.appendChild(style);

 }
}


customElements.define('titulo-dinamico', TituloDinamico)