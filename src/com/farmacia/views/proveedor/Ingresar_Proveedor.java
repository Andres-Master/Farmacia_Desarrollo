/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.proveedor;

//import com.Farmacia.DAO.Conectar;
//import com.Farmacia.CRUD.Llamar;
//import com.Farmacia.Objetos.Fecha;
//import com.Farmacia.Ventanas.Calendario1;
//import com.Farmacia.Objetos.Obcx;
//import com.Farmacia.Objetos.Telefono;
import com.farmacia.join_entidades.ListarJoinProveedor;
import com.farmacia.dao.CRUD;
import com.farmacia.entities1.Fecha;
import com.farmacia.entities1.Obcx;
import static java.awt.Frame.ICONIFIED;
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

public class Ingresar_Proveedor extends javax.swing.JDialog {

    int x, y;
    public ArrayList<Obcx> listat = new ArrayList();
    //blic ArrayList<Obcx> listad = new ArrayList();
    public ArrayList<Obcx> listac = new ArrayList();
    public String[] verificar1 = new String[10];
    public String[] verificar2 = new String[10];

    Obcx obcx = new Obcx();
    Connection coneccion;
    //Conectar conectar = new Conectar();
    CRUD crud = new CRUD();
    private Date fecha_registro;

    public Ingresar_Proveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        Connection coneccion;
        //Conectar conectar = new Conectar();
       // Llamar llamar = new Llamar();
        fe();

        Habilitar(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        contacto = new javax.swing.JTextField();
        cbx1 = new javax.swing.JComboBox<>();
        cbx2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dir = new javax.swing.JTextArea();
        Guardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingreso Proveedor");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Fecha de Ingreso :");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Nombre/Razon Social :");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Contacto :");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Telefono :");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Correo :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Direccion :");

        fecha.setEditable(false);
        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setPreferredSize(new java.awt.Dimension(6, 28));
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

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

        contacto.setPreferredSize(new java.awt.Dimension(6, 28));
        contacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactoFocusLost(evt);
            }
        });

        cbx1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        cbx1.setPreferredSize(new java.awt.Dimension(126, 28));
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        cbx2.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...." }));
        cbx2.setPreferredSize(new java.awt.Dimension(126, 28));
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Cedula/Ruc :");

        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setPreferredSize(new java.awt.Dimension(6, 28));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
        });

        dir.setColumns(20);
        dir.setRows(5);
        dir.setPreferredSize(new java.awt.Dimension(164, 28));
        dir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dirFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(dir);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(78, 78, 78)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Guardar.setForeground(new java.awt.Color(87, 152, 80));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(198, 28, 28));
        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar)
                    .addComponent(jButton4))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 677, 294));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        boolean band = false;
        int pos = 0;
        Ingresar_Telefono ic = new Ingresar_Telefono(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getTelefono() != null) {
            for (int i = 0; i < verificar1.length; i++) {
                if (ic.getTelefono().equals(verificar1[i])) {
                    band = true;
                    JOptionPane.showMessageDialog(null, "Ese numero ya existe");
                    break;
                }
            }
        }
            if (band == false) {
                verificar1[pos] = ic.getTelefono();
                cbx1.addItem(ic.getTelefono() + " " + ic.getTexto());
                Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());

                lista.add(pol);
                listat.add(pol);
                pos++;
            }
            //System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
            //System.out.println(lista.get(1).getTcd() + " " + lista.get(1).getTipos());
        

    }//GEN-LAST:event_jButton1ActionPerformed
    

//    public void insertarCorreo(ArrayList<Obcx> lis) {
//        for (int i = 0; i < lis.size(); i++) {
//            try {
//                coneccion = conectar.Conexion("farmacia");
//                coneccion.setAutoCommit(false);
//                CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
//                        + "{ call insertarCorreo(?,?,?) }");
//                prcProcedimientoAlmacenado.setString(1, cedula.getText());
//                prcProcedimientoAlmacenado.setString(2, lis.get(i).getTcd());
//                prcProcedimientoAlmacenado.setLong(3, lis.get(i).getTipos());
//                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
//                prcProcedimientoAlmacenado.executeUpdate();
//                //mensaje = prcProcedimientoAlmacenado.getString("mst");
//                coneccion.commit();
//
//            } catch (SQLException ex) {
//                try {
//                    coneccion.rollback();
//
//                } catch (SQLException ex1) {
//                    Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//                }
//                Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void insertarDireccion(ArrayList<Obcx> lis) {
//        for (int i = 0; i < lis.size(); i++) {
//            try {
//                coneccion = conectar.Conexion("farmacia");
//                coneccion.setAutoCommit(false);
//                CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
//                        + "{ call insertarDireccion(?,?,?) }");
//                prcProcedimientoAlmacenado.setString(1, cedula.getText());
//                prcProcedimientoAlmacenado.setString(2, lis.get(i).getTcd());
//                prcProcedimientoAlmacenado.setLong(3, lis.get(i).getTipos());
//                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
//                prcProcedimientoAlmacenado.executeUpdate();
//                //mensaje = prcProcedimientoAlmacenado.getString("mst");
//                coneccion.commit();
//
//            } catch (SQLException ex) {
//                try {
//                    coneccion.rollback();
//
//                } catch (SQLException ex1) {
//                    Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//                }
//                Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (listat.size() >=1 && listac.size() >= 1) {
            ListarJoinProveedor p =new ListarJoinProveedor();
            p.setId_proveedor_clase(Long.valueOf("1"));
            p.setCedula_ruc(cedula.getText());
            p.setEntidad(nombre.getText());
            p.setRepresentante(contacto.getText());
            p.setDireccion(dir.getText());
            p.setFecha_registro(fecha_registro);
            p.setTelefono(cbx1.getSelectedItem().toString());
            p.setMail(cbx2.getSelectedItem().toString());
            
            String pro = crud.insertarNuevoProveedor(p);
            if (pro != null) {

                crud.insertarTelefono(listat,cedula.getText());
                crud.insertarCorreo(listac,cedula.getText());
                //insertarDireccion(listad);
                JOptionPane.showMessageDialog(null, pro);
                Consulta_Proveedor mp = new Consulta_Proveedor(new javax.swing.JFrame(),true);
                setVisible(false);
                mp.setVisible(true);
                

            } else {
                JOptionPane.showMessageDialog(null, "Proveedor ya existe");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Debe completar todo el formulario");
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed

    }//GEN-LAST:event_fechaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Correo ic = new Ingresar_Correo(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        boolean band = false;
        int pos1 = 0;
        if (ic.getTelefono() != null) {
            for (int i = 0; i < verificar2.length; i++) {
                if (ic.getTelefono().equals(verificar2[i])) {
                    band = true;
                    JOptionPane.showMessageDialog(null, "Ese numero ya existe");
                    break;
                }
            }
        }
        if (band == false) {
            verificar2[pos1] = ic.getTelefono();
            cbx2.addItem(ic.getTelefono() + " " + ic.getTexto());
            Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());
            listac.add(pol);
            //listac = lista;
//            System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
            pos1++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Consulta_Proveedor cp = new Consulta_Proveedor(new javax.swing.JFrame(), true);
        setVisible(false);
        cp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        /* char car = evt.getKeyChar();
        if (cedula.getText().length() >= 10) {
            evt.consume();
            Habilitar(true);
        } else {
            Habilitar(false);
        }
        if (car < '0' || car > '9') {
            evt.consume();
        }*/
        char car = evt.getKeyChar();
        //System.out.println(car);
        if (cedula.getText().length() == 9 || cedula.getText().length() == 12) {
            // evt.consume();
            Habilitar(true);
            //System.out.println(cedula.getText().length());
        } else {
            Habilitar(false);
            // System.out.println("hhhh:  "+cedula.getText().length());
        }
        if (cedula.getText().length() > 12) {
            evt.consume();
            Habilitar(true);
        }
        if (car < '0' || car > '9') {
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

    private void contactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactoFocusLost
        contacto.setText(contacto.getText().toUpperCase());
    }//GEN-LAST:event_contactoFocusLost

    private void dirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dirFocusLost
        dir.setText(dir.getText().toUpperCase());
    }//GEN-LAST:event_dirFocusLost
    public void Habilitar(boolean lok) {
        jButton1.setEnabled(lok);
        jButton2.setEnabled(lok);
        dir.setEnabled(lok);
        //cedula.setEnabled(lok);
        nombre.setEnabled(lok);
        contacto.setEnabled(lok);
        Guardar.setEnabled(lok);
    }

    public void fe() {
        Calendario1 jh = new Calendario1(new javax.swing.JFrame(), true);
        //jh.setVisible(true);
        fecha_registro = jh.getFecha_nacimiento();
        int com = Fecha.comparacionFecha(fecha_registro, (Date) Fecha.FechaSql());
        if (com == 1 || com == 0) {
            fecha.setText(Fecha.getStringFecha(fecha_registro));
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Invalida!!");
            fecha_registro = null;
            fecha.setText("");
        }
    }

//    public String insertarProveedor() {
//        String mensaje = null;
//
//        try {
//            coneccion = conectar.Conexion("farmacia");
//            coneccion.setAutoCommit(false);
//            CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
//                    + "{ call insertarProveedor(?,?,?,?,?,?,?,?) }");
//            prcProcedimientoAlmacenado.setString(1, cedula.getText());
//            prcProcedimientoAlmacenado.setString(2, nombre.getText());
//            prcProcedimientoAlmacenado.setString(3, contacto.getText());
//            prcProcedimientoAlmacenado.setString(4, dir.getText());
//            prcProcedimientoAlmacenado.setDate(5, fecha_registro);
//            prcProcedimientoAlmacenado.setString(6, cbx1.getSelectedItem().toString());
//            prcProcedimientoAlmacenado.setString(7, cbx2.getSelectedItem().toString());
//            prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
//            prcProcedimientoAlmacenado.executeUpdate();
//            mensaje = prcProcedimientoAlmacenado.getString("mst");
//            coneccion.commit();
//
//        } catch (SQLException ex) {
//            try {
//                coneccion.rollback();
//
//            } catch (SQLException ex1) {
//                Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//            Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Ingresar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return mensaje;
//
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
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ingresar_Proveedor dialog = new Ingresar_Proveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField contacto;
    private javax.swing.JTextArea dir;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
