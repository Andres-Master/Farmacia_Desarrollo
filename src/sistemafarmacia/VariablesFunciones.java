
package sistemafarmacia;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VariablesFunciones {
    private static final String TITLE = "Variables y Funciones Generales";
    private final String title = "Sistema de Farmacia -- ";
    private final Color color = new Color(38, 145, 145);
    private final double IGV = 0.18; /*Impuesto a las ventas 18%*/
    
    private final String bd = "bdfarmacia";
    private final String userbd = "root";
    private final String passwordbd = "rootpassword"/*1234*/; 

    public String getBd() {
        return bd;
    }

    public String getUserbd() {
        return userbd;
    }

    public String getPasswordbd() {
        return passwordbd;
    }
    
       
    
    public String getTitle() {
        return title;
    }

    public Color getColor() {
        return color;
    }

    public double getIGV() {
        return IGV;
    }
    
    public Image getIconoVentana(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/admin.png"));
    }
    
    public ImageIcon getIconoBoton(JButton boton, int ancho, int alto, String url){
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/"+url+".png")); //imagen original
        ImageIcon retorna = new ImageIcon(icono.getImage().getScaledInstance(boton.getWidth()-ancho, boton.getHeight()-alto, Image.SCALE_DEFAULT)); //imagen redimencionada en funcion del tamaño del label        
        return retorna;
    }
    
    public void limpiarDefaulTableModel(DefaultTableModel dtm) {
        int t = dtm.getRowCount();
        if (t > 0) {
            for (int i = 0; i < t; i++) {
                dtm.removeRow(0);
            }
        }
    }
    
    public void mostrarMensajeError(String NAME_CLASS, String NAME_METHOD, String MSG) {
        JOptionPane.showMessageDialog(null, "Clase: " + NAME_CLASS + "\n"+ "Método: " + NAME_METHOD + "\n" + "Mensaje: ERROR " + MSG);
        //System.out.println("Clase: " + NAME_CLASS + "\n"+ "Método: " + NAME_METHOD + "\n" + "Mensaje: " + MSG);
    }
    
    public void mostrarMensajeSucces(String NAME_CLASS, String NAME_METHOD, String MSG) {
        JOptionPane.showMessageDialog(null, "Clase: " + NAME_CLASS + "\n"+ "Método: " + NAME_METHOD + "\n" + "Mensaje: " + MSG);
        //System.out.println("Clase: " + NAME_CLASS + "\n"+ "Método: " + NAME_METHOD + "\n" + "Mensaje: " + MSG);
    }
    
    public void mostrarMensajeLinea(String MSG) {
        JOptionPane.showMessageDialog(null, "Mensaje: " + MSG);
        
    }
    
    public void ocultarColumnasUltimas(int tamanio, JTable tb,int ultimos){
        int contador = 0;
        while(contador!=ultimos){
            contador++;
            tb.getColumnModel().getColumn(tamanio-contador).setMaxWidth(0);
            tb.getColumnModel().getColumn(tamanio-contador).setMinWidth(0);
            tb.getColumnModel().getColumn(tamanio-contador).setPreferredWidth(0);
        }       
    }
    
    public Date getDate() {
        return Calendar.getInstance().getTime();
    }
    
    public java.sql.Date getDateForMySQL(Date d){
        String r = new SimpleDateFormat("yyyy-MM-dd").format(d);        
        return java.sql.Date.valueOf(r);
    }
    public String getDateMysql(java.sql.Date d){        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        return sdf.format(d);
    }
    
    public java.util.Date getDateFromString(String d){        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
        try {
            return sdf.parse(d);
        } catch (ParseException e) {
            mostrarMensajeError(title + TITLE, "getDateFromString()", e.getMessage());
        }
        return null;
    }
    
    public double redondear(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
}
