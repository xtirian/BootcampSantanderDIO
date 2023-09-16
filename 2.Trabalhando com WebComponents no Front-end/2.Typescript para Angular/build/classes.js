"use strict";
class Character {
    constructor(name, strength, skill) {
        this.name = name;
        this.strength = strength;
        this.skill = skill;
    }
    attack() {
        console.log(`Attack with ${this.strength}`);
    }
}
const Char1 = new Character("Ryuu", 10, 98);
Char1.attack();
class Sorcerer extends Character {
    constructor(name, strength, skill, magicPower) {
        super(name, strength, skill);
        this.magicPower = magicPower;
    }
}
const Char2 = new Sorcerer("Sypha", 5, 12, 15);
