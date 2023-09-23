import { Component } from '@angular/core';

@Component({
  selector: 'app-entry-data',
  templateUrl: './entry-data.component.html',
  styleUrls: ['./entry-data.component.scss']
})
export class EntryDataComponent {
  placeholder: string = "email";
  placepass: string = "senha";
  color:string ="red";
  

}
