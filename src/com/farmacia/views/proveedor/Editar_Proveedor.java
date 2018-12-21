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
//import com.Farmacia.Objetos.Correo;
//import com.Farmacia.Objetos.Direccion;
//import com.Farmacia.Objetos.Obcx;
//import com.Farmacia.Objetos.Proveedor;
//import com.Farmacia.Objetos.Telefono;

//import com.Farmacia.Ventanas.Consulta_Proveedor;
import com.farmacia.join_entidades.ListarJoinProveedor;
import com.farmacia.dao.CRUD;
import com.farmacia.entities1.Correo;
import com.farmacia.entities1.Direccion;
import com.farmacia.entities1.Fecha;
import com.farmacia.entities1.Obcx;
import com.farmacia.entities1.Telefono;
import com.farmacia.filtros.filtrosProductos;
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

/**
 *
 * @author ANGEL JESUS
 */
public class Editar_Proveedor extends javax.swing.JDialog {

    int x, y;
    CRUD crud=new CRUD();
    filtrosProductos fil = new filtrosProductos();
    ArrayList<Obcx> listat = null;
    ArrayList<Obcx> listad = null;
    ArrayList<Obcx> listac = null;
    ArrayList<Telefono> telefonos = null;
    ArrayList<Correo> correos = null;
    ArrayList<Direccion> direcciones = null;
    static ArrayList<ListarJoinProveedor> proveedores = null;
    private static ListarJoinProveedor proveedor;
    Long tip1=null,tip3=null;
    String tip2=null;
    Obcx obcx = new Obcx();
//    Connection coneccion;
//    Conectar conectar = new Conectar();
//    Llamar llamar = new Llamar();
    private Date fecha_registro;

    public Editar_Proveedor(java.awt.Frame parent, boolean modal,ListarJoinProveedor proveedor1) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        //proveedores = proveedor1;
        ArrayList<Obcx> listat = null;
        ArrayList<Obcx> listad = null;
        ArrayList<Obcx> listac = null;
        //coneccion = conectar.Conexion("farmacia");
        telefonos = crud.listarTelefono(fil.comboProveedorTelefono());
        correos = crud.listarCorreo(fil.comboProveedorCorreo());
        //direcciones = llamar.listarDireccion("farmacia", "select * from direccion ");
        LlenarDatos(proveedor1, telefonos, correos, direcciones);
        //fe();
        Habilitar(true);
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
        btnagregarTelf = new javax.swing.JButton();
        btnagregarCorreo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dire = new javax.swing.JTextArea();
        Guardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Actualizar Proveedor");
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
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Fecha de Ingreso :");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Entidad/Razon Social :");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Contacto :");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Telefono :");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Correo :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Direccion :");

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setPreferredSize(new java.awt.Dimension(10, 25));
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });

        contacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactoFocusLost(evt);
            }
        });

        cbx1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        cbx2.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N

        btnagregarTelf.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnagregarTelf.setText("Agregar");
        btnagregarTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarTelfActionPerformed(evt);
            }
        });

        btnagregarCorreo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnagregarCorreo.setText("Agregar");
        btnagregarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarCorreoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Cedula/Ruc :");

        cedula.setEditable(false);
        cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        dire.setColumns(20);
        dire.setRows(5);
        dire.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(dire);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(78, 78, 78)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnagregarTelf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnagregarCorreo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnagregarTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Guardar.setForeground(new java.awt.Color(71, 151, 69));
        Guardar.setText("Actualizar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnInactivar.setBackground(new java.awt.Color(204, 0, 0));
        btnInactivar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnInactivar.setForeground(new java.awt.Color(255, 255, 255));
        btnInactivar.setText("Inactivar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnInactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar)
                    .addComponent(btnInactivar)
                    .addComponent(jButton4))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 319));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LlenarDatos(ListarJoinProveedor pro, ArrayList<Telefono> telf,
            ArrayList<Correo> cor, ArrayList<Direccion> dir) {
        fecha_registro = pro.getFecha_registro();
        fecha.setText(Fecha.getStringFecha(pro.getFecha_registro()));
        if (String.valueOf(pro.getCedula_ruc()).length() <= 9) {
            cedula.setText("0" + String.valueOf(pro.getCedula_ruc()));
        } else {
            cedula.setText(String.valueOf(pro.getCedula_ruc()));
        }
        System.out.println(pro.getDireccion());
        dire.setText(pro.getDireccion());
        nombre.setText(pro.getEntidad());
        contacto.setText(pro.getRepresentante());
        for (int i = 0; i < telefonos.size(); i++) {
            if (pro.getCedula_ruc().equals(telefonos.get(i).getCedula_ruc())) {
                switch (telefonos.get(i).getId_tipo_telefono()) {
                    case 1:
                        cbx1.addItem(telefonos.get(i).getTelefono() + " " + "INSTITUCIONAL");
                        break;
                    case 2:
                        cbx1.addItem(telefonos.get(i).getTelefono() + " " + "PERSONAL");
                        break;
                    case 3:
                        cbx1.addItem(telefonos.get(i).getTelefono() + " " + "OTRO");
                }
            }
        }
        for (int i = 0; i < correos.size(); i++) {
            if (pro.getCedula_ruc().equals(correos.get(i).getCedula_ruc())) {
                switch (correos.get(i).getId_tipo_correo()) {
                    case 1:
                        cbx2.addItem(correos.get(i).getCorreo() + " " + "INSTITUCIONAL");
                        break;
                    case 2:
                        cbx2.addItem(correos.get(i).getCorreo() + " " + "PERSONAL");
                        break;
                    case 3:
                        cbx2.addItem(correos.get(i).getCorreo() + " " + "OTRO");
                }
            }
        }

        cbx1.setSelectedItem(pro.getTelefono());
        cbx2.setSelectedItem(pro.getMail());
        tip1=pro.getId_proveedor_clase();
        tip2=pro.getEstado();
        tip3=pro.getId_proveedor();
    }

    private void btnagregarTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarTelfActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Telefono ic = new Ingresar_Telefono(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getTelefono() != null) {
            cbx1.addItem(ic.getTelefono() + " " + ic.getTexto());
            Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());
            lista.add(pol);
            listat = lista;
            crud.insertarTelefono(lista,cedula.getText());
            //System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());

        }
    }//GEN-LAST:event_btnagregarTelfActionPerformed
////    public void insertarTelefono(ArrayList<Obcx> lis) {
////        // System.out.println(lis.get(1));
////        for (int i = 0; i < lis.size(); i++) {
////            try {
////                coneccion = conectar.Conexion("farmacia");
////                coneccion.setAutoCommit(false);
////                CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
////                        + "{ call insertarTelefono(?,?,?) }");
////                prcProcedimientoAlmacenado.setString(1, cedula.getText());
////                prcProcedimientoAlmacenado.setString(2, lis.get(i).getTcd());
////                prcProcedimientoAlmacenado.setInt(3, lis.get(i).getTipos());
////                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
////                prcProcedimientoAlmacenado.executeUpdate();
////                //mensaje = prcProcedimientoAlmacenado.getString("mst");
////                coneccion.commit();
////
////            } catch (SQLException ex) {
////                try {
////                    coneccion.rollback();
////
////                } catch (SQLException ex1) {
////                    Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
////                }
////                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
////        try {
////            coneccion.close();
////        } catch (SQLException ex) {
////            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////        }
////    }
////
////    public void insertarCorreo(ArrayList<Obcx> lis) {
////        for (int i = 0; i < lis.size(); i++) {
////            try {
////                coneccion = conectar.Conexion("farmacia");
////                coneccion.setAutoCommit(false);
////                CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
////                        + "{ call insertarCorreo(?,?,?) }");
////                prcProcedimientoAlmacenado.setInt(1, Integer.valueOf(cedula.getText()));
////                prcProcedimientoAlmacenado.setString(2, lis.get(i).getTcd());
////                prcProcedimientoAlmacenado.setInt(3, lis.get(i).getTipos());
////                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
////                prcProcedimientoAlmacenado.executeUpdate();
////                //mensaje = prcProcedimientoAlmacenado.getString("mst");
////                coneccion.commit();
////
////            } catch (SQLException ex) {
////                try {
////                    coneccion.rollback();
////
////                } catch (SQLException ex1) {
////                    Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
////                }
////                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
////        try {
////            coneccion.close();
////        } catch (SQLException ex) {
////            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////        }
////    }
////
////    public void insertarDireccion(ArrayList<Obcx> lis) {
////        for (int i = 0; i < lis.size(); i++) {
////            try {
////                coneccion = conectar.Conexion("farmacia");
////                coneccion.setAutoCommit(false);
////                CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
////                        + "{ call insertarDireccion(?,?,?) }");
////                prcProcedimientoAlmacenado.setInt(1, Integer.valueOf(cedula.getText()));
////                prcProcedimientoAlmacenado.setString(2, lis.get(i).getTcd());
////                prcProcedimientoAlmacenado.setInt(3, lis.get(i).getTipos());
////                //prcProcedimientoAlmacenado.registerOutParameter("mst", Types.VARCHAR);
////                prcProcedimientoAlmacenado.executeUpdate();
////                //mensaje = prcProcedimientoAlmacenado.getString("mst");
////                coneccion.commit();
////
////            } catch (SQLException ex) {
////                try {
////                    coneccion.rollback();
////
////                } catch (SQLException ex1) {
////                    Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
////                }
////                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
////        try {
////            coneccion.close();
////        } catch (SQLException ex) {
////            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
////        }
////    }
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        int h = Confirmacion("Deseas Actualizar el proveedor con Cedula/Ruc : "
                + cedula.getText() + " y Nombre : " + nombre.getText());
        if (h == 0) {
           // ArrayList<ListarJoinProveedor> lista=;
            ListarJoinProveedor p = new ListarJoinProveedor();            
            p.setId_proveedor_clase(tip1);
            p.setCedula_ruc(cedula.getText());
            p.setEntidad(nombre.getText());
            p.setRepresentante(contacto.getText());
            p.setDireccion(dire.getText());
            System.out.println(fecha_registro);
            p.setFecha_registro(fecha_registro);
            p.setEstado(tip2);
            p.setTelefono(cbx1.getSelectedItem().toString());
            p.setMail(cbx2.getSelectedItem().toString());
            p.setId_proveedor(tip3);
            String valor = crud.insertarProveedor(p);
            JOptionPane.showMessageDialog(null, valor);
            Consulta_Proveedor mp = new Consulta_Proveedor(new javax.swing.JFrame(), true);
            setVisible(false);
            mp.setVisible(true);

        }
        
    }//GEN-LAST:event_GuardarActionPerformed
//    public String editarProveedor() {
//        String mensaje = null;
//
//        try {
//            coneccion = conectar.Conexion("farmacia");
//            coneccion.setAutoCommit(false);
//            CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
//                    + "{ call insertarProveedor(?,?,?,?) }");
//            prcProcedimientoAlmacenado.setInt(1, Integer.valueOf(cedula.getText()));
//            prcProcedimientoAlmacenado.setString(2, nombre.getText());
//            prcProcedimientoAlmacenado.setString(3, contacto.getText());
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
//                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return mensaje;
//
//    }
    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed

    }//GEN-LAST:event_fechaActionPerformed

    private void btnagregarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarCorreoActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Correo ic = new Ingresar_Correo(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getTelefono() != " ") {
            cbx2.addItem(ic.getTelefono() + " " + ic.getTexto());
            Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());
            lista.add(pol);
            listac = lista;
            crud.insertarCorreo(lista,cedula.getText());
            // System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
        }
    }//GEN-LAST:event_btnagregarCorreoActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        String x= cbx1.getSelectedItem().toString();
        System.out.println(x);
    }//GEN-LAST:event_cbx1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char car = evt.getKeyChar();
        if (cedula.getText().length() >= 10) {
            evt.consume();
            Habilitar(true);
        } else {
            Habilitar(false);
        }
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped
    public int Confirmacion(String msx) {
        int select = JOptionPane.showConfirmDialog(null, msx, "Confirmar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

        System.out.println(select);
        return select;
    }
    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        int h = Confirmacion("Deseas Eliminar el proveedor con Cedula/Ruc : "
                + cedula.getText() + " y Nombre : " + nombre.getText());
        if (h == 0) {
            String sol = crud.eliminarProveedor(Long.valueOf("1"),tip3);
            JOptionPane.showMessageDialog(null, sol);
            Consulta_Proveedor mp = new Consulta_Proveedor(new javax.swing.JFrame(), true);
            setVisible(false);
            mp.setVisible(true);

        }
    }//GEN-LAST:event_btnInactivarActionPerformed

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

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreFocusLost

    private void contactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactoFocusLost
        contacto.setText(contacto.getText().toUpperCase());
    }//GEN-LAST:event_contactoFocusLost

    private void direFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direFocusLost
        dire.setText(dire.getText().toUpperCase());
    }//GEN-LAST:event_direFocusLost
//    public String eliminarEditor(String por) {
//        String mensaje = null;
//     //   int por1 = Integer.valueOf(por);
//        try {
//            coneccion = conectar.Conexion("farmacia");
//            coneccion.setAutoCommit(false);
//            CallableStatement prcProcedimientoAlmacenado = coneccion.prepareCall(""
//                    + "{ call eliminarProveedor(?,?) }");
//            prcProcedimientoAlmacenado.setString(1, cedula.getText());
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
//                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return mensaje;
//
//    }

    public void Habilitar(boolean lok) {
        btnagregarTelf.setEnabled(lok);
        btnagregarCorreo.setEnabled(lok);
        dire.setEnabled(lok);
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
//                    + "{ call editarProveedor(?,?,?,?,?,?,?) }");
//            prcProcedimientoAlmacenado.setString(1, cedula.getText());
//            prcProcedimientoAlmacenado.setString(2, nombre.getText());
//            prcProcedimientoAlmacenado.setString(3, contacto.getText());
//            prcProcedimientoAlmacenado.setString(4, dire.getText());
//            prcProcedimientoAlmacenado.setString(5, cbx1.getSelectedItem().toString());
//            prcProcedimientoAlmacenado.setString(6, cbx2.getSelectedItem().toString());
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
//                Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex1);
//            }
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            coneccion.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Editar_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Editar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                Editar_Proveedor dialog = new Editar_Proveedor(new javax.swing.JFrame(), true, proveedor);
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
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnagregarCorreo;
    private javax.swing.JButton btnagregarTelf;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField contacto;
    private javax.swing.JTextArea dire;
    private javax.swing.JTextField fecha;
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
