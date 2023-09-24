import { Component } from '@angular/core';

@Component({
  selector: 'app-cards-banner',
  templateUrl: './cards-banner.component.html',
  styleUrls: ['./cards-banner.component.scss'],
})
export class CardsBannerComponent {
  mockDados:{imgSrc:string, title:string, category:string, content:string, coments:number,page:number}[] = [
    {
      imgSrc: '../../../assets/Images/Appetizers_French_Fries.png',
      title: 'Crispy potato wedges with extra crunch.',
      category: 'Basket of wedges',
      content:
        'Potatos, butter, olive oil ground paprika, lemon zest, salt and pepper for seasoning',
      coments: 36,
      page:35
    },
    {
      imgSrc: '../../../assets/Images/delivery-burger-cortes-asador.png',
      title: 'Homemade chicken Burger with corn',
      category: 'Chicken Burgers',
      content:
        'Chicken Mince, panko crumbs, chicken stock powder and egs for coating ther rissoles.',
      coments: 23,
      page:18
    },
    {
      imgSrc: '../../../assets/Images/excel-red-cream-soda-bottle.webp',
      title: 'Sugar Free dring satisfy your thirsty',
      category: 'Sugar Free',
      content:
        'One of the more tastier drinks to prepare by boil and infusion are a green tea',
      coments: 36,
      page:25
    },
  ];
}
