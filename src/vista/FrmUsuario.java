/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlEmpleado;
import controlador.ControlUsuario;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Usuario;

/**
 *
 * @author TOSHIBA
 */
public class FrmUsuario extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    /**
     * Creates new form frmUsuario
     */
    public FrmUsuario() {
        initComponents();
        mostrar();
        llenarComboEmpleado();
        llenarComboRol();
        llenarTxtIdEmpleado();
        llenarTxtIdRol();
    }
    
    public void insertar(){
        Usuario us = new Usuario();
        ControlUsuario cu = new ControlUsuario();
        try{
            us.setIdEmpleado(Integer.parseInt(this.jTxtIdEmpleado.getText()));
            us.setNombreUsuario(this.jTxtUsuario.getText());
            us.setContrasena(this.jTxtContrasena.getText());
            us.setIdRol(Integer.parseInt(this.jTxtIdRol.getText()));
            String msj=cu.agregarUsuario(us);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar(){
        Usuario us = new Usuario();
        ControlUsuario cu = new ControlUsuario();
        try{
            us.setIdUsuario(Integer.parseInt(this.jTxtIdUsuario.getText()));
            us.setIdEmpleado(Integer.parseInt(this.jTxtIdEmpleado.getText()));
            us.setNombreUsuario(this.jTxtUsuario.getText());
            us.setContrasena(this.jTxtContrasena.getText());
            us.setIdRol(Integer.parseInt(this.jTxtIdRol.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar usuario", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cu.modificarUsuario(us);
                JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                limpiar();
            }else{
                limpiar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    public void eliminar(){
        Usuario us = new Usuario();
        ControlUsuario cu = new ControlUsuario();
        try{
            us.setIdUsuario(Integer.parseInt(this.jTxtIdUsuario.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar usuario", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cu.eliminarUsuario(us);
                JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                limpiar();
            }else{
                limpiar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public DefaultTableModel mostrar(){
        this.jTxtIdRol.setVisible(false);
        this.jTxtIdEmpleado.setVisible(false);
        String []columnas={"Código Usuario","Nombre Empleado","Nombre Usuario","Contraseña","Rol Usuario"};
        Object[]obj=new Object[5];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Usuario us = new Usuario();
        ControlUsuario cu = new ControlUsuario();
        List ls;
        try{
            ls=cu.mostrarUsuario();
            for(int i=0;i<ls.size();i++){
                us=(Usuario)ls.get(i);
                obj[0]=us.getIdUsuario();
                obj[1]=us.getNombreEmpleado();
                obj[2]=us.getNombreUsuario();
                obj[3]=us.getContrasena();
                obj[4]=us.getNombreRol();
                tabla.addRow(obj);
            }
            ls=cu.mostrarUsuario();
            this.jTablasuario.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void llenarComboEmpleado(){
        ControlUsuario cu = new ControlUsuario();
        List lista;
        Object item;
          try{
            lista  = cu.llenarComboBoxEmpleado();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboEmpleado.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
    }
    
    public void llenarTxtIdEmpleado(){
        ControlUsuario cu = new ControlUsuario();
        String nombreEmpleado = "";
        nombreEmpleado = this.jComboEmpleado.getSelectedItem().toString();
        int idEquipo;
        idEquipo = cu.llenarIdEmpleado(nombreEmpleado);
        this.jTxtIdEmpleado.setText(String.valueOf(idEquipo));
    }
    
    public void llenarComboRol(){
        ControlUsuario cu = new ControlUsuario();
        List lista;
        Object item;
          try{
            lista  = cu.llenarComboBoxRol();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboRolUsuario.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
    }
    
    public void llenarTxtIdRol(){
        ControlUsuario cu = new ControlUsuario();
        String nombreRol = "";
        nombreRol = this.jComboRolUsuario.getSelectedItem().toString();
        int idRol;
        idRol = cu.llenarIdRol(nombreRol);
        this.jTxtIdRol.setText(String.valueOf(idRol));
    }
    
    public void limpiar(){
        this.jTxtIdUsuario.setText("");
        this.jTxtUsuario.setText("");
        this.jTxtContrasena.setText("");
        this.jComboEmpleado.setSelectedIndex(0);
        this.jComboRolUsuario.setSelectedIndex(0);
        this.jComboBuscar.setSelectedIndex(0);
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtUsuario.setEnabled(opcion);
        this.jTxtContrasena.setEnabled(opcion);
        this.jComboEmpleado.setEnabled(opcion);
        this.jComboRolUsuario.setEnabled(opcion);
        this.jTxtBusqueda.setEnabled(opcion2);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtContrasena = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboRolUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablasuario = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtBusqueda = new javax.swing.JTextField();
        jComboEmpleado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTxtIdRol = new javax.swing.JTextField();
        jTxtIdEmpleado = new javax.swing.JTextField();
        jComboBuscar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTxtIdUsuario = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jTxtContrasena.setEnabled(false);

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarMouseClicked(evt);
            }
        });

        jLabel4.setText("Rol de Usuario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuario");

        jComboRolUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno" }));
        jComboRolUsuario.setEnabled(false);
        jComboRolUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboRolUsuarioItemStateChanged(evt);
            }
        });

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jTxtUsuario.setEnabled(false);

        jTablasuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Usuario", "Nombre Empleado", "Nombre Usuario", "Contraseña", "Nombre Rol Usuario"
            }
        ));
        jTablasuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablasuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablasuario);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jLabel5.setText("Buscar:");

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        jComboEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno" }));
        jComboEmpleado.setEnabled(false);
        jComboEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboEmpleadoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Empleado");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código Usuario", "Nombre Usuario", "Nombre Rol Usuario", "Nombre Empleado" }));
        jComboBuscar.setEnabled(false);

        jLabel7.setText("Codigo Usuario:");

        jTxtIdUsuario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtUsuario)
                            .addComponent(jComboEmpleado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtIdUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboRolUsuario, 0, 243, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTxtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnBuscar)
                                    .addComponent(BtnNuevo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnEditar)
                                    .addComponent(BtnCancelar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEliminar)
                                    .addComponent(BtnGuardar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
        if(jComboBuscar.getSelectedItem().equals("Seleccione uno")){
                JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un criterio de busqueda", "Advertencia", JOptionPane.WARNING_MESSAGE);
                evt.consume();
            }else{
                this.jTxtBusqueda.addKeyListener(new KeyAdapter(){
                @Override
                public void keyReleased(KeyEvent e) {
                    if (jComboBuscar.getSelectedItem().equals("Código Usuario")){               
                        tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 0));
                    } else if (jComboBuscar.getSelectedItem().equals("Nombre Usuario")){               
                        tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 2));
                    } else if (jComboBuscar.getSelectedItem().equals("Nombre Rol Usuario")){               
                        tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 4));
                    } else if (jComboBuscar.getSelectedItem().equals("Nombre Empleado")){               
                        tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
                    }
                }   
                });
            }
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        jTablasuario.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtUsuario.getText().equals("") && this.jTxtContrasena.getText().equals("") && this.jComboRolUsuario.getSelectedItem().toString().equals("Seleccione uno") && this.jComboEmpleado.getSelectedItem().toString().equals("Seleccione uno")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
            habilitarInput(true,false);
        }else{
            if(editar==0 && nuevo==1){
                insertar();
                habilitarInput(false,false);
            }else if(editar==1){
            modificar();
            habilitarInput(false,false);
            }else if(nuevo==0 && this.jTxtUsuario.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        if(this.jTxtUsuario.getText().equals("") && this.jTxtContrasena.getText().equals("")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;        
        }
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        habilitarInput(false,true);
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void BtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoMouseClicked
        habilitarInput(true,false);
        limpiar();
        nuevo=1;
    }//GEN-LAST:event_BtnNuevoMouseClicked

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked
        habilitarInput(false,true);
        limpiar();
        nuevo=0;
    }//GEN-LAST:event_BtnCancelarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(this.jTxtUsuario.getText().equals("") && this.jTxtContrasena.getText().equals("")){//No permite eliminar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            eliminar();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void jTablasuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablasuarioMouseClicked
        int fila=this.jTablasuario.getSelectedRow();
        this.jTxtIdUsuario.setText(String.valueOf(this.jTablasuario.getValueAt(fila, 0)));
        this.jComboEmpleado.setSelectedItem(String.valueOf(this.jTablasuario.getValueAt(fila, 1).toString()));
        this.jTxtUsuario.setText(String.valueOf(this.jTablasuario.getValueAt(fila, 2)));
        this.jTxtContrasena.setText(String.valueOf(this.jTablasuario.getValueAt(fila, 3)));
        this.jComboRolUsuario.setSelectedItem(String.valueOf(this.jTablasuario.getValueAt(fila, 4).toString()));
    }//GEN-LAST:event_jTablasuarioMouseClicked

    private void jComboEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboEmpleadoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.jComboEmpleado.getSelectedIndex()>0){
                   //llenarComboRol();
                   llenarTxtIdRol();
            }
        }
        llenarTxtIdEmpleado();
    }//GEN-LAST:event_jComboEmpleadoItemStateChanged

    private void jComboRolUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboRolUsuarioItemStateChanged
        llenarTxtIdRol();
    }//GEN-LAST:event_jComboRolUsuarioItemStateChanged
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboEmpleado;
    private javax.swing.JComboBox<String> jComboRolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablasuario;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtContrasena;
    private javax.swing.JTextField jTxtIdEmpleado;
    private javax.swing.JTextField jTxtIdRol;
    private javax.swing.JTextField jTxtIdUsuario;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
