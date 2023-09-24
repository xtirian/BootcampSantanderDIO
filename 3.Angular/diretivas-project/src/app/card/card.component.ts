import { Component, Input, OnChanges } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnChanges {

  produtos:string[] = [];
  @Input() inputRecieve:string = "";

  @Input() userType:string = "";

  constructor(){
    this.produtos = [
      'mouse',
      'teclado',
      'cabo',
      'font'
    ]
  }

  ngOnChanges(): void {
    console.log(this.userType)
  }

  @Input() menuType:string = '';


  adicionar(){
    this.produtos.push(this.inputRecieve)
  }

  remover(index:number){
    this.produtos.splice(index, 1)
  }

}
