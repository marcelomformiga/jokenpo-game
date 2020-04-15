# jokenpo-game

Projeto Java 8 criado com Maven, simulando um jogo simples do Jokenpo.

### Tecnologias
Foi utilizada apenas as bibliotecas do Lombok para facilitar na escrita do código e JUnit com Mockito, para testes unitários.

## Arquitetura

Foi montada uma arquitetura simples apenas para o propósito do jogo.
Há uma camada <b>domain</b> que contém os objetos de domínio para a execução do jogo e uma camada <b>service</b> que contém a classe de serviço com as regras do jogo.
O jogo é simples, dividido em 3 etapas:
1 - Criar os jogadores.
2 - Jogadores informando suas jogadas.
3 - Comparando as jogadas para se conhecer o vencedor.

### Executar

Para iniciar o jogo, basta apenas executar a classe <b>Application</b> que contém o método <b>main</b>.

## Como jogar

Dois jogadores disputam a partida, então o jogo inicia solicitando o apelido de cada jogador.
Após cada um informar seu apelido, é a vez do primeiro jogador escolher sua jogada e após sua escolha, será a vez do segundo jogador.
E, por fim, o jogo informa o vencedor, conforme a jogada escolhida de cada um dos jogadores.
Caso queira jogar de novo, deve se executar novamente a aplicação.
