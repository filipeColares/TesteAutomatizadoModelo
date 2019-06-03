#language: pt

Funcionalidade: Realizar o login no sistema.

Contexto: Acessar o sistema pela url desejada
	Dado que eu acesse o sistema

Cenario: Acessar o sistema com um usuario valido 
	Quando Insiro usuario e senha valido
		|usuario	|senha	|
		|xxxxxxxxxxx	|xxxxxxxxx |
	
	Entao O sistema deve abrir na tela de resumo do estudo
	 
Cenario: Acessar o sistema com um usuario invalido
	Quando Insiro usuario e senha invalido
		|usuario	|senha	|
		|xxxxxx	|xxxxxxxxxx	|
	
	Entao O sistema deve exibir uma mensagem na tela informando que nao foi possivel o login
	
	
	
	