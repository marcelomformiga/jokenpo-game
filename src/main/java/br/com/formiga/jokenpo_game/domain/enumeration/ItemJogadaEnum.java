
package br.com.formiga.jokenpo_game.domain.enumeration;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;



/**
 *
 * @author formiga
 */
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public enum ItemJogadaEnum {
    
    PEDRA (1, "Pedra"),
    PAPEL (2, "Papel"),
    TESOURA (3, "Tesoura");
    
    
    @Getter(value = AccessLevel.PUBLIC)
    private final Integer CODIGO;
    
    @Getter(value = AccessLevel.PUBLIC)
    private final String ITEM;
    
}