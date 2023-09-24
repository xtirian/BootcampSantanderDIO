import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-comp-atributos',
  templateUrl: './comp-atributos.component.html',
  styleUrls: ['./comp-atributos.component.scss']
})
export class CompAtributosComponent {
  @Input() textStyle:string = "";

  @Input() corFundo:string = "red";
  @Input() corFonte:string = "red";

  listaProdutos:string[] = [];

  item:string ="";

  adicionar(){
    this.listaProdutos.push(this.item);

    this.item = '';

  }

  isEnable: boolean = trgit ue

}
