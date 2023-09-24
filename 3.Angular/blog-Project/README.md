# BlogProject

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 16.2.3.

## Design

The design was inpired [Food Blog Website](https://dribbble.com/shots/22582650-Food-Blog-Website-design) from [Farzan Faruk](https://dribbble.com/farzanfaruk). You can see the original design and follow him.

## Development

### Technologies
- HTML
- SCSS: 
- Typescript: 
- Angular (Framework): 

### Roadmanp - from sketch to deploy

1. I started taking the design image and put on Figma. With that I could draw the components and measure the sizes and spaces.
2. Initialize the project build the folder's archtecture.
3. Instalei o Material-Icons usando o seguinte código:
```bash
$ ng add @angular/material
```
``` typescript
//Inportando no home.module
import {MatIconModule} from '@angular/material/icon';

const MaterialComponents = [ MatIconModule ] // colocando em uma array por boa prática, assim eu posso importar todos os material objects de uma só vez

@NgModule({
  declarations: [/* ... */],
  imports: [/*...*/, MaterialComponents],
  exports: [/*... */],
})
export class HomeModule {}

// O Material deve ser importado no módulo que será usado

```
4. Comecei a montar a hero banner, mas não consegui do jeito que eu queria. A principio, queria que a tela motrasse um carrosel caso fosse celular e mostrasse a tela inteira caso fosse normal. Eu sei como fazer, mas não faço ideia de como pegar o innerWidth dentro do angular. Tenho ideias mas não tenho muito mais tempo hoje



