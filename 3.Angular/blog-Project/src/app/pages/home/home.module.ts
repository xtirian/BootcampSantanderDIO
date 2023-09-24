import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from '../../shared/shared.module';

// PAGE COMPONENTS
import { CardsBannerComponent } from '../../components/cards-banner/cards-banner.component';
import { HeroBannerComponent } from '../../components/hero-banner/hero-banner.component';
import { HeaderComponent } from '../../components/header/header.component';
import { HomeComponent } from './home.component';

@NgModule({
  declarations: [
    HeaderComponent,
    HeroBannerComponent,
    CardsBannerComponent,
    HomeComponent,
  ],
  imports: [CommonModule, SharedModule],
  exports: [HomeComponent],
})
export class HomeModule {}
