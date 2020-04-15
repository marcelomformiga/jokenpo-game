
package br.com.formiga.jokenpo_game.application;


import br.com.formiga.jokenpo_game.service.JogadaService;
import javax.swing.JOptionPane;


/**
 *
 * @author formiga
 */
public class Application
{

    private static JogadaService jogadaService;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        System.out.println("Iniciando aplicação!");
        jogadaService = new JogadaService();
        
        final String vencedor = jogadaService.jogar();
        
        if ("EMPATE".equals(vencedor)) {
            JOptionPane.showMessageDialog(null, "Vocês empataram!");
        } else {
            JOptionPane.showMessageDialog(null, vencedor + " venceu o jogo!");
        }
    }

}