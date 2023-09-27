import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { environment } from 'src/environments/environment.development';

//precisei criar um modelo com os dados que eu quero puxar
import { PokemonData } from '../models/pokemonData';

@Injectable({
  providedIn: 'root',
})
export class PokemonService {
  private baseUrl: string = '';
  private pokeData: PokemonData | any;

  constructor(private api: HttpClient) {
    this.baseUrl = environment.pokeApi;
  }

  //o observable serve para trabalhar com paradigmas funcionais diferente do angular que trabalha com o paradigma da programação orientada a objetos;

  getPokemon(pokemonName: string): Observable<PokemonData> {
    this.pokeData = this.api.get<PokemonData>(`${this.baseUrl}${pokemonName}`);

    return this.pokeData;
  }
}

/* Sabendo que este arquivo é injetável, para injetar precisamo ir no arquivo que ele será injetado*/
