/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.clientes;


import com.farmacia.validaciones.Validacion;
import com.farmacia.dao.CRUD;
import com.farmacia.dao.Consultas;
import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.Obcx;
import com.farmacia.fecha.Fecha;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ingresar_Cliente extends javax.swing.JDialog {

    int x, y;
    public ArrayList<Obcx> listat = new ArrayList();
    public ArrayList<Obcx> listad = new ArrayList();
    public ArrayList<Obcx> listac = new ArrayList();
    public String[] verificar1 = new String[10];
    public String[] verificar2 = new String[10];
    CRUD cc = new CRUD();
    public ArrayList<Clientes> lista = null;
    Obcx obcx = new Obcx();
    Connection coneccion;
    //Conectar conectar = new Conectar();
    Consultas llamar = new Consultas();
    public String fecha;

    public Ingresar_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        Connection coneccion;
        //Conectar conectar = new Conectar();
        Consultas llamar = new Consultas();
        //fe();
//        coneccion = conectar.Conexion("Modulo_Cliente");
//        lista = llamar.listarClientes("Modulo_Cliente", "select * from Clientes where Estado = 'A' ");
         
        lista = llamar.listarClientes( "select * from clientes where Estado = 'A' ");
        
        
        fecha_reg.setText(Fecha.getStringFecha(Fecha.FechaSql()));
        Habilitar(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BotonTelefono = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonCorreo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        fecha_reg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        direccion = new javax.swing.JTextArea();
        apellido = new javax.swing.JTextField();
        cbx1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 4, 95), 2, true));

        cbx2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        cbx2.setPreferredSize(new java.awt.Dimension(126, 28));
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel2.setText("Fecha registro: ");

        BotonTelefono.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotonTelefono.setText("+");
        BotonTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTelefonoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        BotonCorreo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotonCorreo.setText("+");
        BotonCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCorreoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel4.setText("Apellido :");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel8.setText("Cedula:  ");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel5.setText("Telefono :");

        cedula.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setPreferredSize(new java.awt.Dimension(6, 28));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel6.setText("Correo :");

        BotonGuardar.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/guardar1.jpg"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel7.setText("Direccion :");

        BotonSalir.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/salir1.png"))); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        fecha_reg.setEditable(false);
        fecha_reg.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        fecha_reg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_reg.setPreferredSize(new java.awt.Dimension(6, 28));
        fecha_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_regActionPerformed(evt);
            }
        });
        fecha_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_regKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_regKeyPressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(175, 226, 226));
        jLabel9.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NUEVO CLIENTE");
        jLabel9.setOpaque(true);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        nombre.setMinimumSize(new java.awt.Dimension(6, 28));
        nombre.setPreferredSize(new java.awt.Dimension(6, 28));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        direccion.setColumns(20);
        direccion.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        direccion.setRows(5);
        direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(direccion);

        apellido.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        apellido.setPreferredSize(new java.awt.Dimension(6, 28));
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoFocusLost(evt);
            }
        });

        cbx1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        cbx1.setPreferredSize(new java.awt.Dimension(126, 28));
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fecha_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(BotonTelefono))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(BotonCorreo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(BotonGuardar)
                .addGap(87, 87, 87)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(fecha_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonSalir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTelefonoActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        boolean band = false;
        int pos = 0;
        Ingresar_Telefono ic = new Ingresar_Telefono(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getTelefono() != null) {
            for (int i = 0; i < verificar1.length; i++) {
                if (ic.getTelefono().equals(verificar1[i])) {
                    band = true;
                    JOptionPane.showMessageDialog(null, "EL numero ingresado ya existe");
                    break;
                }
            }
        }   
        if (ic.getTelefono()!= null && band!=true) {
            
       
            verificar1[pos] = ic.getTelefono();
            cbx1.addItem(ic.getTelefono() + " " + ic.getTexto());
            Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());

            lista.add(pol);
            listat.add(pol);
            pos++;
        }
        
        //System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
        //System.out.println(lista.get(1).getTcd() + " " + lista.get(1).getTipos());


    }//GEN-LAST:event_BotonTelefonoActionPerformed
// 
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        if (listat.size() >= 1 && listac.size() >= 1 && nombre.getText().length()>2
                && apellido.getText().length() >2 && direccion.getText().length() >2) {

             String pro = cc.insertarClientes(cedula.getText(),
          //  String pro = cc.insertarClientes("Modulo_Cliente", cedula.getText(),
                    nombre.getText(), apellido.getText(), direccion.getText(),
                    cbx1.getSelectedItem().toString(), cbx2.getSelectedItem().toString());
            if (pro != null) {

                cc.insertarTelefono(listat, cedula.getText());
                cc.insertarCorreo(listac, cedula.getText());

                JOptionPane.showMessageDialog(null, pro);
                Consulta_Clientes mp = new Consulta_Clientes(new javax.swing.JFrame(), true);
                setVisible(false);
                mp.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "El Cliente ingresado ya existe");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Debe completar todo el formulario");
        }


    }//GEN-LAST:event_BotonGuardarActionPerformed


    private void fecha_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_regActionPerformed

    }//GEN-LAST:event_fecha_regActionPerformed

    private void BotonCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCorreoActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Correo1 ic = new Ingresar_Correo1(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        boolean band = false;
        int pos1 = 0;
        if (ic.getCorreo() != null || ic.getCorreo() != "") {
            for (int i = 0; i < verificar2.length; i++) {
                if (ic.getCorreo().equals(verificar2[i])) {
                    band = true;
                    JOptionPane.showMessageDialog(null, "El correo ingresado ya existe");
                    break;
                }
            }
        }
        if (band == false) {
            verificar2[pos1] = ic.getCorreo();
            cbx2.addItem(ic.getCorreo());
            Obcx pol = new Obcx(ic.getCorreo());
            listac.add(pol);
            //listac = lista;
//            System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
            pos1++;
        }
    }//GEN-LAST:event_BotonCorreoActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        setVisible(false);
        Consulta_Clientes cc =new Consulta_Clientes(new javax.swing.JFrame(), true);
        cc.setVisible(true);
    }//GEN-LAST:event_BotonSalirActionPerformed


    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped

        char car = evt.getKeyChar();
        if (cedula.getText().length() >= 10) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx2ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
        y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseDragged

    private void cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyPressed

    }//GEN-LAST:event_cedulaKeyPressed

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreFocusLost

    private void apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusLost
        apellido.setText(apellido.getText().toUpperCase());
    }//GEN-LAST:event_apellidoFocusLost

    private void direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusLost
        direccion.setText(direccion.getText().toUpperCase());
    }//GEN-LAST:event_direccionFocusLost

    private void fecha_regKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_regKeyPressed

    }//GEN-LAST:event_fecha_regKeyPressed

    private void fecha_regKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_regKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_regKeyTyped

    private void cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyReleased
       if (Validacion.validarCedula(lista, cedula.getText())) {
            Habilitar(true);
        } else {
            Habilitar(false);
        }
        
    }//GEN-LAST:event_cedulaKeyReleased
    public void Habilitar(boolean lok) {
        BotonTelefono.setEnabled(lok);
        BotonCorreo.setEnabled(lok);
        direccion.setEnabled(lok);
        //cedula.setEnabled(lok);
        nombre.setEnabled(lok);
        apellido.setEnabled(lok);
        BotonGuardar.setEnabled(lok);
    }

//    public void fe() {
//        Calendario1 jh = new Calendario1(new javax.swing.JFrame(), true);
//        //jh.setVisible(true);
//        fecha_registro = jh.getFecha_nacimiento();
//        int com = Fecha.comparacionFecha(fecha_registro, (Date) Fecha.FechaSql());
//        if (com == 1 || com == 0) {
//            fecha.setText(Fecha.getStringFecha(fecha_registro));
//        } else {
//            JOptionPane.showMessageDialog(null, "Fecha Invalida!!");
//            fecha_registro = null;
//            fecha.setText("");
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ingresar_Cliente dialog = new Ingresar_Cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCorreo;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonTelefono;
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextArea direccion;
    private javax.swing.JTextField fecha_reg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
