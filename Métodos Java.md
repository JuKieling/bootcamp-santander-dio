## Métodos Java

### Criação:

- Conceito: É uma poção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisiçaõ a ele. São resposáveis por definir e realizar um determinado comportamento.
-  Deve sempre ser criado dentro de uma classe;
- Padrão de definição:
	- <?visibilidade?> : "public", "protected" ou "private";
	- <?tipo?>: concreto ou abstrato;
	- <?modificador?>: "static" ou "final"
	- retorno: tipo de dado ou "void";
	- nome: nome que é fornecido ao étodo;
	- (<?parâmetros?>): parâmetros que pode receber;
	- <?exceções?>: exceções que pode lançar;
	- corpo: código que possui ou vazio.
- Vamos ultilizar: public static R N(P) {...}
- Utilização:
	- chamar apartir de uma classe ou objeto;
	- Passa-se uma mensagem atravé de uma classe ou objeto;
	- Chamando pela classe: nome_da_classe.nome_do_metodo();
	- Chamando pelo objeto: nome_do_objeto.nome_do_metodo();
- Particularidades:
	- Assinatura: é a forma de identificar unicamente o método. Ass = nome + parâmetros;
	- método: public double calcularTotalVenda (double precoItem1, doule percoItem2, double precoItem3) {..}
	- assinatura: calcularTotalVenda (double precoItem1, doule percoItem2, double precoItem3)
	- Costrutor e destrutos: métodos especiais usados em orientações a objetos;
	- Mensagem: é o at de solicitar ao métoso que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe;
	- Passagem de parâmetros:
		- Por valor (cópia); Usando uma váriável dentro do método sem alteralá no restande do código. 
		- Por referência (endereço);
	- Boas práticas:
		- Nomes descritivos, mas curtos;
		- Notação camelo;
		- Deve possuir entre 80 e 120linhas;
		- Evite listas de parâmetros longas;
		- Visibilidades adequeadas.
- Static é a forma como chamamos;

### Sobrecarga:

- conceito: é capacidade de definir métodos para diferentes conceitos, mas preservando seu nome;
- alterar a assinatura (nome + parâmetros) de um método;
- A mudança é no tipo de parâmetros;

### Retornos:

- é uma instrução de interrupção;
- simbologia: return;
- Quando é executado (Uma das três):
  - Completar todas as instruções internas;
  - chega a uma declaração explicita de retorno;
  - Lançar uma exceção;
- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
- O tipo de dado do return deve ser compatível com o método (mesmo tipo);
- Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução;

