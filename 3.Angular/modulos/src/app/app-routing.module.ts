import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TitleComponent } from './pages/index/title/title.component';
import { CardComponent } from './pages/portfolio/card/card.component';

const routes: Routes = [
  {
    path: '',
    component: TitleComponent,
    pathMatch:'full'
    //pathMatch verifica se vai entrar no site caso a pessoa tenha digitado o site completo ou apenas uma parte dele. É tipo ir pro site apenas se foi totalmente digitado corretamente. Por default, as url são prefix
  },
  //Ao colocar o :id eu estou dizendo que existe uma variável chamada id que será usada como parametro para acessar um arquivo
  {
    /* link/portfolio */
    path: 'portfolio',
    component: CardComponent,
    children:[
      {
        /* link/portfolio/1 */
        path: ':id',
        component: CardComponent
      },
      {
        /* link/portfolio/1/matheus */
        path: ':id/:token',
        component: CardComponent
      },
    ]
  },
  //ROTA CORINGA: para onde vai redirecionar quando não achar o endereço solicitado, tipo uma página de erro
  {
    path:'**',
    redirectTo: ''
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
