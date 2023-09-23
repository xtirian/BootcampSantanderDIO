import {
  Component,
  OnInit,
  DoCheck,
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  OnDestroy
} from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.scss'],
})
export class CheckSampleComponent
  implements
    OnInit,
    DoCheck,
    AfterContentChecked,
    AfterContentInit,
    AfterViewChecked,
    AfterViewInit,
    OnDestroy {

      quantidade:number = 0;

      constructor(){}

      adicionar(){
        this.quantidade += 1;
      }

      decrementar(){
        this.quantidade -= 1;
      }
      /*
      Sempre quando acontece alguma verificação ele verifica

      checked -> content -> view
      */

  ngOnInit(): void {
    console.log('ngOnInit')
  }
  ngDoCheck(): void {
    console.log('ngDoCheck')
  }

  //quano o primeiro conteudo é iniciado
    ngAfterContentInit(): void {
    console.log('ngAfterContentInit')
  }

  //após alguma alteração, verifica o conteudo
  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked')
    this.quantidade = this.quantidade * 1.1

  }

  //depois da inicialização da viue
  ngAfterViewInit(): void {
    console.log('ngAfterViewInit')
  }

   // Após alguma alteração, verifica a view
  ngAfterViewChecked(): void {
    console.log('ngAfterViewChecked')
  }

  ngOnDestroy(): void {
    console.log('Good bye my friend')
  }
}
