package ejerciciosuniminuto;
import javax.swing.JOptionPane;

public class cuadrosDialogo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mensaje de dialogo");
        JOptionPane.showMessageDialog(null, "Mensaje de información",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
 
        JOptionPane.showMessageDialog(null, "Mensaje de advertencia",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
 
        JOptionPane.showMessageDialog(null, "Mensaje de Error",
                "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
 
        int res = JOptionPane.showConfirmDialog(null, "¿Esta es una pregunta?");
        if (JOptionPane.OK_OPTION == res){
            JOptionPane.showMessageDialog(null,"Selecciona opción Afirmativa");
        } else{
            JOptionPane.showMessageDialog(null,"No selecciona una opción afirmativa");
        }
    }
}
