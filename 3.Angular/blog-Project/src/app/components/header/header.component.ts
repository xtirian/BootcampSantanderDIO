import { Component } from '@angular/core';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {

  theme:string ='dark_mode' ;

  themeIconColor:string='silver'

  changeTheme(){
    if(this.theme === 'dark_mode'){
      this.theme = 'light_mode';
      this.themeIconColor = 'gold';
    } else{
      this.theme = 'dark_mode';
      this.themeIconColor = 'silver'
    }
  }

}
