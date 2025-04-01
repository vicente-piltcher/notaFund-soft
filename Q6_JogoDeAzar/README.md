# Objetivo

Sua empresa está implementando um jogo de azar. Você é o responsável pela implementação das classes de manipulação dos dados utilizados pelos jogadores. Sabe-se que este jogo utiliza dados de diferentes números de faces e todos os dados têm valor 1 para o menor valor de uma face. Um dado é um objeto que possui métodos void lançar(), que simula o lançamento do dados, e int getValor(), que retorna o valor obtido no último lançamento do dado.

Uma nova versão do jogo deve ser desenvolvida com a capacidade de dificultar o jogo para os jogadores que estão tendo “muita sorte”, baseado no histórico das jogadas anteriores. Aplique o padrão Decorator na implementação de um novo tipo de dado que possua a funcionalidade adicional de obtenção da série dos valores obtidos, ou seja, possua um meio de retornar o histórico de todas as jogadas.

O exemplo de uso deve ser alterado de maneira a explorar o uso do padrão.