function calculadora() {
  const entrada = Number(
    prompt(
      "Digite uma operação: \n 1- Soma(+) \n 2 - subtração (-) \n 3 - multiplicação (*) \n 4 - divisão real (/) \n 5- divisao inteira (%) \n 6 - potencia (**)"
    )
  );

  if (!entrada || entrada >= 7 || entrada <= 0) {
    alert("Erro - operação inválida");
    calculadora();
  } else {
    let n1 = Number(prompt("Insira o primeiro valor:"));
    let n2 = Number(prompt("Insira o segundo valor:"));
    let resultado;

    function soma() {
      resultado = n1 + n2;
      alert(`${n1} + ${n2} é igual a ${resultado}`);
      novaOperacao();
    }
    function subtracao() {
      resultado = n1 - n2;
      alert(`${n1} - ${n2} é igual a ${resultado}`);
      novaOperacao();
    }
    function multiplicacao() {
      resultado = n1 * n2;
      alert(`${n1} x ${n2} é igual a ${resultado}`);
      novaOperacao();
    }
    function divisaoReal() {
      resultado = n1 / n2;
      alert(`${n1} divido por ${n2} é igual a ${resultado}`);
      novaOperacao();
    }
    function divisaoInteira() {
      resultado = n1 % n2;
      alert(`o resto da divisao entr ${n1} e ${n2} é igual a ${resultado}`);
      novaOperacao();
    }
    function potencia() {
      resultado = n1 ** n2;
      alert(`${n1} elevado a ${n2} é igual a ${resultado}`);
      novaOperacao();
    }

    switch (entrada) {
      case 1 || "+":
        soma();
        break;

      case 2 || "-":
        subtracao();
        break;

      case 3 || "*":
        multiplicacao();
        break;

      case 4 || "/":
        divisaoReal();
        break;

      case 5 || "%":
        divisaoInteira();
        break;

      case 6 || "**":
        potencia();
        break;

      default:
        alert("Digite uma opção válida");
        calculadora();
        break;
    }

    function novaOperacao() {
      let opcoes = Number(
        prompt("Deseja fazer outra operação \n 1 - sim \n 2 - não")
      );

      switch (opcoes) {
        case 1 || "Sim":
          calculadora();

        case 2 || "Não":
          alert("Até mais.");
          break

        default:
          alert("Digite uma opção válida");
          novaOperacao();
          break;
      }
    }
  }
}

calculadora();
