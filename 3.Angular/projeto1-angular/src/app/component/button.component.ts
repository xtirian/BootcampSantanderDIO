import {Component, Input} from '@angular/core';

@Component({
selector: 'my-button',
templateUrl: `./button.component.html`,
})

export class ButtonComponent{
 @Input() label: string = '';

 getAlert(){
  alert(this.label)
 }

}
