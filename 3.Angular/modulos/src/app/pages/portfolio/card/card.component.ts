import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent {

  /*  1- Para usar as rotas com parametros, eu tenho que criar uma injeção de dependencias com o constructor usando o método abaixo */

  /* 2- Vamos fazer outra injeção de dependencias para que a gente consiga passar páginas por componentes*/
  constructor(private activeRoute: ActivatedRoute, private navegador: Router){
    /* 1- http://localhost:4200/portfolio/{1} */
    this.activeRoute.params.subscribe(
      res => (console.log(res))
    )

    /* 1- oURTA COISA QUE PODEMOS  trabalhar é o query Params*/

    /* 1- http://localhost:4200/portfolio/1?{name=pikachu&token=123} */

    this.activeRoute.firstChild?.params.subscribe(
      res => (console.log(res))
    )
      //Quando estiver pegando os params de um componente filho, preciso colocar o firstChild? antes de chamar os params ou queryparams

  }

  ngOnInit():void{
    /* Este callback força ao navegador a navegar para um component especifico */


    /*setInterval(()=>{
      this.navegador.navigate(['/'])
    }, 5000)*/
  }

}
