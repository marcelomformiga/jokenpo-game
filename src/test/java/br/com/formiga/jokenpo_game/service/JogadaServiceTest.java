
package br.com.formiga.jokenpo_game.service;


import br.com.formiga.jokenpo_game.domain.Jogador;
import br.com.formiga.jokenpo_game.domain.enumeration.ItemJogadaEnum;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;


/**
 *
 * @author formiga
 */
@RunWith(MockitoJUnitRunner.class)
public class JogadaServiceTest
{
    
    @InjectMocks
    private JogadaService serviceMock;
    
    private Jogador player1;
    private Jogador player2;
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("!!!! Início dos testes !!!!");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("!!!! Fim dos testes !!!!");
    }
    
    @Before
    public void setUp() {
        
        this.player1 = Jogador.builder()
                .codigo(1)
                .nome("Player 1")
                .apelido("P1")
                .build();
        
        this.player2 = Jogador.builder()
                .codigo(2)
                .nome("Player 2")
                .apelido("P2")
                .build();
        
        this.serviceMock.setPlayer1(this.player1);
        this.serviceMock.setPlayer2(this.player2);
    }

    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player1VenceComPedra() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PEDRA.getITEM(), ItemJogadaEnum.TESOURA.getITEM());
            
        assertEquals("Player 1 deve ser o vencedor!", resultado, this.player1.getApelido());
        assertTrue("P1".equals(resultado));
    }

    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player1VenceComPapel() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PAPEL.getITEM(), ItemJogadaEnum.PEDRA.getITEM());
        
        
        assertEquals("Player 1 deve ser o vencedor!", resultado, this.player1.getApelido());
        assertTrue("P1".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player1VenceComTesoura() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.TESOURA.getITEM(), ItemJogadaEnum.PAPEL.getITEM());
        
        
        assertEquals("Player 1 deve ser o vencedor!", resultado, this.player1.getApelido());
        assertTrue("P1".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player2VenceComPedra() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.TESOURA.getITEM(), ItemJogadaEnum.PEDRA.getITEM());
        
        
        assertEquals("Player 2 deve ser o vencedor!", resultado, this.player2.getApelido());
        assertTrue("P2".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player2VenceComPapel() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PEDRA.getITEM(), ItemJogadaEnum.PAPEL.getITEM());
        
        
        assertEquals("Player 2 deve ser o vencedor!", resultado, this.player2.getApelido());
        assertTrue("P2".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_Player2VenceComTesoura() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PAPEL.getITEM(), ItemJogadaEnum.TESOURA.getITEM());
        
        
        assertEquals("Player 2 deve ser o vencedor!", resultado, this.player2.getApelido());
        assertTrue("P2".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_EmpateComPedra() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PEDRA.getITEM(), ItemJogadaEnum.PEDRA.getITEM());
        
        
        assertEquals("Empate deve ser o resultado!", resultado, "EMPATE");
        assertTrue("EMPATE".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_EmpateComPapel() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.PAPEL.getITEM(), ItemJogadaEnum.PAPEL.getITEM());
        
        
        assertEquals("Empate deve ser o resultado!", resultado, "EMPATE");
        assertTrue("EMPATE".equals(resultado));
    }
    
    /**
     * Test of jogar method, of class JogadaService.
     */
    @Test
    public void testCompararJogada_EmpateComTesoura() {
        
        System.out.println("CompararJogada");
        
        String resultado = this.serviceMock.compararJogadas(ItemJogadaEnum.TESOURA.getITEM(), ItemJogadaEnum.TESOURA.getITEM());
        
        
        assertEquals("Empate deve ser o resultado!", resultado, "EMPATE");
        assertTrue("EMPATE".equals(resultado));
    }
    
}
