import { Component, Input ,OnInit, OnChanges } from '@angular/core';
import { PokemonData } from 'src/app/models/pokemonData';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit, OnChanges {

  pokemon:PokemonData = {
    name:'',
    id:0,
    sprites:{
      front_default:''
    },
    types:[]
  };

  @Input() searchName:string = '';


  constructor(
    /* Este é um conceito do design patterns que você ao fazer isto, já está injetando o seervice na memória, não precisando invoca-lo dentro do constructor com o service = new PokemonService */
    private service:PokemonService
   ){ }

  ngOnInit():void{

    this.getPokemon('pikachu')

  }

  ngOnChanges():void{
    this.getPokemon((this.searchName).toLowerCase())
  }

  getPokemon(searchName:string){
     //precisa colocar o subscribe
     this.service.getPokemon(searchName).subscribe({
      //essa função retorna caso dê tudo certo, tipo o then
      next: (res) => {

        this.pokemon = {
          name:res.name,
          id: res.id,
          sprites: {
            front_default: res.sprites.front_default
          },
          types:res.types
        }
      },
      // catch erro
      error: (err) => alert('not found')
    })

  }





}
