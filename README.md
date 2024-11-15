# Lista 1 -- Teoria da Computação / Linguagens Formais e Autômatos -- 2024/2

**Introdução à Teoria da Computação & Fundamentos Matemáticos**

**Autor:** Matheus Jagi

## Problema 3
Este problema pede a construção de uma função que receba como entrada um número inteiro $value$ e informe se seu número é perfeito, ou seja, se a soma de todos os seu divisores (exceto ele mesmo), equivale a ele mesmo. 

## Solução
A solução adotada foi criar duas funções, uma para procurar todos os divisores de um número positivo e colocá-los em uma lista, a segunda foi para verificar se o somatório de todos os divisores (excluindo ele mesmo) é igual a ele mesmo.

## Executando...

### Usando o Scala Prompt

Para executar a solução diretamente no prompt do Scala, use o seguinte comando (supondo que a função esteja no arquivo `PefectNumber.scala`):

```scala
perfectNumber(6)
```

### Para executar usando o SBT
```bash
sbt run
``` 

O programa pedirá o valor a ser verificado:

```bash
Informe o numero positivo que deseja verificar sua perfeicao:
6 --> Digite o valor desejado
```

O programa terá como saida o resultado abaixo caso seu numero seja perfeito:
```bash
Seu numero e perfeito!
```

caso contrário
```bash
Seu numero NAO e perfeito.
```