# Desafio Target



### 1) Observe o trecho de código abaixo:
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```


Ao final do processamento, qual será o valor da variável SOMA? _91_ 

#### 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
[Codigo (Java)](./desafio2.java)
```java

public class desafio2 {
    static boolean pertenceFibonacci(String valor) {
        int n = Integer.parseInt(valor);
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return (b == n);

    }

```

### 3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, _9_

b) 2, 4, 8, 16, 32, 64, _128_

c) 0, 1, 4, 9, 16, 25, 36, _49_

d) 4, 16, 36, 64, _100_

e) 1, 1, 2, 3, 5, 8, _13_

f) 2,10, 12, 16, 17, 18, 19, _20_

### 4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 
Ligar o primeiro interruptor, esperar alguns minutos, desligar e ligar o segundo interruptor. Ir a primeira sala:

1. se a luz estiver acessa:  a primeira sala é o segundo interruptor. Retornar aos interruptores, desligar o segundo e ligar novamente o primeiro.
2. se estiver desligada e quente: é o primeiro interruptor.
3. se estiver fria e desligada é o terceiro interruptor.
  
Com isso, iria para a segunda sala se a luz estiver acessa é o interruptor ligado (seja o primeiro , caso 1 ou o segundo no caso 2 e 3) contrario é o terceiro. O interruptor sobrado pertence a ultima sala.

### 5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

[Codigo (Python)](./desafio5.py)

~~~python
def invert(string):
 
  invert = []
  for i in range((len(string)-1),-1,-1):  
    invert.append(string[i]) 
  return "".join(invert)

~~~
