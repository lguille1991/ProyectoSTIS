package controlador;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Kevin López
 */
public class Validaciones {
    
    Character s;
    
    //Valida solo Letras y Espacio en blanco
    public void validarLetra(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isLetter(s) && s!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
    
    //Valida solo numeros enteros
    public void validarNumero(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isDigit(s)){
            evt.consume();
        }
    }
    
    //Validar numeros decimales
    public void validarNumeroDecimal(KeyEvent evt, JTextField txt){
        s = evt.getKeyChar();
        
        if(!Character.isDigit(s) && evt.getKeyChar()!='.')
        {
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txt.getText().contains("."))
        {
           evt.consume();
        }
    }
    
    public void validarTodo(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isLetter(s) && s!=KeyEvent.VK_SPACE && evt.getKeyChar()!='.' && !Character.isDigit(s)){
            evt.consume();
        }
    }
}
