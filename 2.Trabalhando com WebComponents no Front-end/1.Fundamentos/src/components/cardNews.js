//Aqui nós vamos criar um Molde e neste card nós estamos dizendo que o card irá "herdar" os comportamentos de um elemento HTML. Isto quer dizer que o card irá se comportar como se fosse um elemento HTML

class CardNews extends HTMLElement {
    //Sempre que iniciamos uma classe, é uma boa prática evocar o construtor. Ele é a primeira coisa que será carregada neste elemento.
    constructor(){
        //Dentro do construtor, a primeira coisa que chamamos é o super() -serve para evocar o método construtor de quem nós estamos herdando
        //Ou seja, dos elementos HTML        
        super()

        //Vamos criar nossa shadow DOM agora.
        // usamos o THIS para fazer uma autoreferência. O this faz com que a classe evoque a si mesma ou alguma parte de si mesma.
        const shadow = this.attachShadow({mode: "open"}) //O modo da sombra pode ser open ou closed, que influencia se funcionalidades exernas à classe podem alterar esta classe ou se ela não pode ser alterada pelo mundo exterior.

        //Aqui eu irei colocar dentro da nossa Shadow DOM um elemento h1 escrito algo
        shadow.innerHTML = "<h1>Orquestra</h1>"

    }

}

//Aqui eu estou criando um elemento customizado e estou definindo ele como card-news. neste mesmo ponto eu digo que este card-news está relacionado à classe / constructor CardNews
customElements.define('card-news', CardNews)