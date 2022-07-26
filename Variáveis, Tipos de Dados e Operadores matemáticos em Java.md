# Variáveis, Tipos de Dados e Operadores matemáticos em Java

### Variáveis

- Conceito: Um espaço na memória do computador, onde se pode guardar valores;
- 4 tipos: 
  - Instância: objeto;
  - Classe: classe;
  - Local: dentro dos métodos;
  - Parâmetro: Na assinatura do método.
- Padrão de definição:  <?visibilidade?><?modificador?>tipo nome<?=valorInicial?> (Com ponto de interrogação é opcional preencher)
  - V: "public", "protected" e "private";
  - M: "static" e "final(valor não muda)";
  - T: tipo de dado;
  - N: nome que é fornecido a variável;
  - VI: um valor inicial, caso deseje.
- Convenções e regras:
  - Não deve começar com nº;
  - Evitar $ e _ ;
  - São case-sensitive (Difere maiúscula e minúscula);
  - Sem espaços;
  - Não pode usar palavras reservadas do JAVA;
  - Sempre começar com letra minúscula;
  - Nomes expressivos;
  - Notação camelo (Primeira letra de cada palavra em letra maiúscula, com exceção da primeira);
  - Quando constante(final) maiúscula e separada por _ ;

### Tipos de Dados

* Conceito: São valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente;

* Tipificação:
  * Estática(forte - o tipo precisa ser definido no momento da criação) vs Dinâmica(fraco);
  * Primitivo vs Composto;
  
* Tipos:

  * textual:
    * char - somente 1 caractere - usar com aspas simples;
    * String - frases inteiras - aspas duplas.

  * numeral:
    * byte;
    * short: ;
    * int (números inteiros);
    * long;
    * float (números fracionados) - adicionar (f) ao final do número;
    * double  (números fracionados)  - adicionar (d) ao final do número.

  * lógico:
    * boolean: true or false.

  * objeto.

  ### Operadores aritméticos:

* Tipos:

  * Pós-fixados: ex++ (soma 1) e ex-- (diminui 1);
  * prefixado: ++ex (primeiro soma) e --ex (primeiro subtrai);
  * aritimético: +, -, *, / e % ;
  * atribuição: =, +=, -=, *=, /=, e %=;


### Casting (conversões):

- conceito: é a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.
- tipos:
  - Upcast (implícito) - para um dado maior;
  - Dowbcast (explícito) - para um dado menor;

