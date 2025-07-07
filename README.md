# Bootcamp Santander 2025 -  Back-End com Java

## 1 - Fundamentos da Linguagem de Programação Java 
### Exercícios 

1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
   - fórmula: área=lado X lado

3. Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
   - fórmula: área=base X altura

4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

## 2 - Estruturas de Controle em Java
### Exercícios 

1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados


## 3 - Java e a Arte da Abstração com Classes e Encapsulamento
### Exercícios
### Todos os exercícios devem ter um menu interativo para chamar as funções e ter uma opção de sair para finalizar a execução

1. Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:
    - Consultar saldo
    - consultar cheque especial
    - Depositar dinheiro;
    - Sacar dinheiro;
    - Pagar um boleto.
    - Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar
   - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
   - O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
   - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
   - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
   - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

--------

2. Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
   - Ligar o carro;
   - Desligar o carro;
   - Acelerar;
   - Diminuir velocidade;
   - Virar para esquerda/direita
   - Verificar velocidade;
   - Trocar a marcha

Siga as seguintes regras na implementação
  - Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
  - O carro desligado não pode realizar nenhuma função;
  - Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
  - Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
  - O carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
  - A velocidade do carro deve respeitar os seguintes limites para cada velocidade
     - se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
     - se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
     - se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
     - se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
     - se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
     - se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
     - se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
   - O carro poderá ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
   - O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;

-------------

3. Escreva um código onde temos o controle de banho de um petshop, a máquina de banho dos pets deve ter as seguintes operações:
   - Dar banho no pet;
   - Abastecer com água;
   - Abastecer com shampoo;
   - Verificar nível de água;
   - Verificar nível de shampoo;
   - Verificar se tem pet no banho;
   - Colocar pet na máquina;
   - Retirar pet da máquina;
   - Limpar máquina.

Siga as seguintes regras para implementação

   - A máquina de banho deve permitir somente 1 pet por vez;
   - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
   - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
   - Se o pet for retirado da máquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
   - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
   - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;