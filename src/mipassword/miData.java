package mipassword;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class miData {

    private int llave;
    String encriptada;
  
    public miData(){
        llave = (5*3)-3;
        encriptada = ""; 
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public String getEncriptada() {
        return encriptada;
    }

    public void setEncriptada(String encriptada) {
        this.encriptada = encriptada;
    }
    
    public String EncriptarPass(){
        String cadena = "";
        
        char[] michar = getEncriptada().toCharArray();
        for(char a: michar){
            a+= getLlave();
            cadena += a;
        }
        
        return cadena;
    }
    
    public void Show1(){
        JOptionPane.showMessageDialog(null, "Encriptación exitosa: "+EncriptarPass());
    }
    
    public String Desencriptar(){
        String cadena = "";

        char[] michar = EncriptarPass().toCharArray();
        for (char a : michar) {
            a -= getLlave();
            cadena += a;
        }

        return cadena;
    }
    
    public void Show2(){
        JOptionPane.showMessageDialog(null, "Desencriptación exitosa: "+Desencriptar());
    }
}
