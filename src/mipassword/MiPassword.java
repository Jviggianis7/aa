
package mipassword;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class MiPassword {
    
     public static void main(String[] args) {
         
         miData pass = new miData();
         int opc = 0;
         
         do{
             opc = Integer.parseInt(JOptionPane.showInputDialog(null,    "1%=================50% \n"
                                                                      + "    -------Bievenido------\n"
                                                                     + "50%=================100% \n"
                                                                      + "1. Encriptar contraseña \n"
                                                                      + "2. Desencriptar contraseña \n"
                                                                      + "3. Salir"));
             switch(opc){
                 case 1:
                     pass.setEncriptada(JOptionPane.showInputDialog(null, "Ingrese la contraseña: "));
                     pass.Desencriptar();
                     pass.Show1();
                 break;
                 
                 case 2:
                     pass.Desencriptar();
                     pass.Show2();
                 break;
      
                 case 3:
                 System.exit(0);
                 break;
                 
                 default:
                    JOptionPane.showMessageDialog(null,"Opción invalida!");
             }
         }while(opc != 3);
    }
     
}