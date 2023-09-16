class Character {
  protected name?: string;
  readonly strength: number;
  skill: number;

  constructor(name: string, strength: number, skill: number) {
    this.name = name;
    this.strength = strength;
    this.skill = skill;
  }

  attack(): void {
    console.log(`Attack with ${this.strength}`);
  }
}

const Char1 = new Character("Ryuu", 10, 98);

Char1.attack();

// DATA MODIFIERS
/* 
public: qualqer parte do código pode acessar esta propriedade.
private: esta propriedade só pode ser acessada dentro desta classe.
protected: outras classes que herdem esta classe conseguem acessar estra propriedade.

*/

//readonly determina um método que pode apenas ser lido e não pode ser alterado


//HERANÇA
/*

*/

// a Sorcerer é uma Subclass e a Character é uma SuperClass
class Sorcerer extends Character {
  magicPower: number;

  constructor(
    name: string,
    strength: number,
    skill: number,
    magicPower: number
  ) {
    // Já que a classe pai tem um construtor, devemos chamar o contrutor novamente aqui usando o método Super()
    super(name, strength, skill);

    this.magicPower = magicPower;
  }
}



const Char2 = new Sorcerer("Sypha", 5, 12, 15);


//generics

