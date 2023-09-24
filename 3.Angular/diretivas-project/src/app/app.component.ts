import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'diretivas-project';

  isAliveCard:boolean = true;

  disposeCard():void{
    this.isAliveCard = false
  }


}
