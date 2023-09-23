// DECORATORS

//quando decora uma função para que dispare uma outra função ou ação quando acontece alguma coisa

function exibirNome (target: any){
 console.log(target);
}


function apiVerion( version: string){
 //factor = uma função que retorna outra função
 return (target : any) => {
  Object.assign(target.prototype, {__version: version})
 }

}

function minLength( length: number){
 return (
  target: any,
  key: string,
 ) => {
  let _value = target[key];

  const getter = () => _value;

  const setter = (value: string) => { 
   if(value.length < length){
    throw new Error(`Tamanho menor do que ${length}`)
   } else {
    _value = value
   }
  };

  Object.defineProperty(target, key, {
   get: getter,
   set: setter,
  })
 }
}


class API{
 //@minLength(3)
 name: string

 constructor(name: string){
  this.name = name;
 }
}

const api = new API("produtos");

