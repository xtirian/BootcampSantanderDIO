import { Component, OnInit, OnChanges, Input } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent implements OnInit, OnChanges{

  name : string = "Produto"
  @Input() value:string = '';

  /*
  ngOnInit(): void {
    console.log('olá, eu sou o nascimento do title component')
    this.name = `olá ${this.name}`
  }
  */

  constructor(){
    console.log("Constructor")
  }

  ngOnInit(): void {
    this.name = `Veja se o ${this.name} está disponível`
  }

  ngOnChanges(): void {
    console.log(`OnChanges ${this.name}`)

  }


}
