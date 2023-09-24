import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
import { CardsComponent } from './cards/cards.component';
import { HeroBannerComponent } from './hero-banner/hero-banner.component';



@NgModule({
  declarations: [
    HeaderComponent,
    CardsComponent,
    HeroBannerComponent
  ],
  imports: [
    CommonModule
  ]
})
export class SharedModule { }
