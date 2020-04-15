
package br.com.formiga.jokenpo_game.service;


import br.com.formiga.jokenpo_game.domain.Jogador;
import br.com.formiga.jokenpo_game.domain.enumeration.ItemJogadaEnum;
import java.util.Scanner;
import javax.swing.JOptionPane;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author formiga
 */
public class JogadaService {
    
    @Getter(value = AccessLevel.PUBLIC)
    @Setter(value = AccessLevel.PUBLIC)
    private Jogador player1;
    
    @Getter(value = AccessLevel.PUBLIC)
    @Setter(value = AccessLevel.PUBLIC)
    private Jogador player2;
    
    private final Scanner SCANNER;


    public JogadaService() {     
        this.SCANNER = new Scanner(System.in);
    }
    

    public String jogar() {
        
        this.criarJogadores();
        
        String jogadaPlayer1 = this.escolherJogada(this.player1);
        
        System.out.println(this.player1.getApelido()+ " escolheu: " + jogadaPlayer1);
        
        String jogadaPlayer2 = this.escolherJogada(this.player2);
        
        System.out.println(this.player2.getApelido() + " escolheu: " + jogadaPlayer2);
        
        String vencedor = this.compararJogadas(jogadaPlayer1, jogadaPlayer2);
        
        return vencedor;
    }
    
    private void criarJogadores() {
        
        this.player1 = Jogador.builder()
                .codigo(1)
                .nome("Player 1")
                .apelido(JOptionPane.showInputDialog("Jogador 1, informe seu apelido: "))
                .build();
        
        this.player2 = Jogador.builder()
                .codigo(2)
                .nome("Player 2")
                .apelido(JOptionPane.showInputDialog("Jogador 2, informe seu apelido: "))
                .build();
        
        System.out.println("------------------------------------------");
    }
    
    private String escolherJogada(Jogador jogador) {
        
        Integer jogada = 0;
        
        do {
            
            String jogadaString = JOptionPane.showInputDialog(jogador.getApelido() + " escolha sua jogada (1 - Pedra / 2 - Papel / 3 - Tesoura): ");

            try {
                jogada = Integer.valueOf(jogadaString);
            } catch (final NumberFormatException exception) {
                jogadaString = JOptionPane.showInputDialog(jogador.getApelido() + " escolha sua jogada (1 - Pedra / 2 - Papel / 3 - Tesoura): ");
                System.err.println(exception.getMessage());
            }
            
            
        } while ((!jogada.equals(1)) && (!jogada.equals(2)) && (!jogada.equals(3)));
        
        
        String item;
        
        switch (jogada) {
            
            case 1:
                item = ItemJogadaEnum.PEDRA.getITEM();
                
                break;
                
            case 2:
                item = ItemJogadaEnum.PAPEL.getITEM();
                
                break;
            
            default:
                item = ItemJogadaEnum.TESOURA.getITEM();
                
                break;       
        }
        
        System.out.println("------------------------------------------");
        
        return item;
    }
    
    public String compararJogadas(String jogadaPlayer1, String jogadaPlayer2) {
        
        String vencedor;
        
        if (jogadaPlayer1.equals(ItemJogadaEnum.PEDRA.getITEM())) {
            
            if (jogadaPlayer2.equals(ItemJogadaEnum.PEDRA.getITEM())) {
                vencedor = "EMPATE";
            } else if (jogadaPlayer2.equals(ItemJogadaEnum.PAPEL.getITEM())) {
                vencedor = this.player2.getApelido();
            } else {
                vencedor = this.player1.getApelido();
            }
        } else if (jogadaPlayer1.equals(ItemJogadaEnum.PAPEL.getITEM())) {
            
            if (jogadaPlayer2.equals(ItemJogadaEnum.PAPEL.getITEM())) {
                vencedor = "EMPATE";
            } else if (jogadaPlayer2.equals(ItemJogadaEnum.TESOURA.getITEM())) {
                vencedor = this.player2.getApelido();
            } else {
                vencedor = this.player1.getApelido();
            }
        } else {
            
            if (jogadaPlayer2.equals(ItemJogadaEnum.TESOURA.getITEM())) {
                vencedor = "EMPATE";
            } else if (jogadaPlayer2.equals(ItemJogadaEnum.PEDRA.getITEM())) {
                vencedor = this.player2.getApelido();
            } else {
                vencedor = this.player1.getApelido();
            }
        }
        
        return vencedor;
    }
    
}