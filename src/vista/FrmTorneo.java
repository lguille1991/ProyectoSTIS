/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlTorneo;
import controlador.Validaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Torneo;

/**
 *
 * @author TOSHIBA
 */
public class FrmTorneo extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val = new Validaciones();
    /**
     * Creates new form frmTorneo
     */
    public FrmTorneo() {
        initComponents();
        mostrar();
        llenarComboUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BtnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jTxtCodigoTorneo = new javax.swing.JTextField();
        jTxtNombreTorneo = new javax.swing.JTextField();
        jTxtFechaInicio = new javax.swing.JFormattedTextField();
        jTxtFechaFinal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaTorneo = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        jTxtIdUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBuscar = new javax.swing.JComboBox<>();
        jTxtBusqueda = new javax.swing.JTextField();
        jComboUsuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });

        jLabel4.setText("Fecha Inicio:");

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarMouseClicked(evt);
            }
        });

        jLabel5.setText("Fecha Final:");

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

        jTxtCodigoTorneo.setEnabled(false);

        jTxtNombreTorneo.setEnabled(false);
        jTxtNombreTorneo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreTorneoKeyTyped(evt);
            }
        });

        try {
            jTxtFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtFechaInicio.setEnabled(false);

        try {
            jTxtFechaFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtFechaFinal.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Torneo");

        jLabel2.setText("Código Torneo:");

        jLabel3.setText("Nombre Torneo:");

        jTablaTorneo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código de torneo", "Nombre de torneo", "Fecha de inicio", "Fecha final", "Número de equipos", "Número de jornadas"
            }
        ));
        jTablaTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaTorneoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaTorneo);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jLabel6.setText("Busqueda:");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código", "Nombre", "Fecha inicio", "Fecha final", "Usuario" }));
        jComboBuscar.setEnabled(false);

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        jComboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno" }));
        jComboUsuario.setEnabled(false);
        jComboUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboUsuarioItemStateChanged(evt);
            }
        });

        jLabel7.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtBusqueda)
                                    .addComponent(jTxtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTxtFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTxtNombreTorneo)
                                    .addComponent(jTxtCodigoTorneo)
                                    .addComponent(jComboBuscar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTxtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTxtCodigoTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscar))
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar)
                    .addComponent(jLabel4)
                    .addComponent(BtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertar(){//Todos los atributos menos la llave primaria
        Torneo tor = new Torneo();
        ControlTorneo ct = new ControlTorneo();
        try{
            tor.setNombreTorneo(this.jTxtNombreTorneo.getText());
            tor.setFechaInicio(this.jTxtFechaInicio.getText());
            tor.setFechaFinal(this.jTxtFechaFinal.getText());
            tor.setIdUsuario(Integer.parseInt(this.jTxtIdUsuario.getText()));
            String msj=ct.agregarTorneo(tor);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar(){//Todos los atributos de la tabla
        Torneo tor = new Torneo();
        ControlTorneo ct = new ControlTorneo();
        try{
            tor.setIdTorneo(Integer.parseInt(this.jTxtCodigoTorneo.getText()));
            tor.setNombreTorneo(this.jTxtNombreTorneo.getText());
            tor.setFechaInicio(this.jTxtFechaInicio.getText());
            tor.setFechaFinal(this.jTxtFechaFinal.getText());
            tor.setIdUsuario(Integer.parseInt(this.jTxtIdUsuario.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar torneo", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ct.modificarTorneo(tor);
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
        Torneo tor = new Torneo();
        ControlTorneo ct = new ControlTorneo();
        try{
            tor.setIdTorneo(Integer.parseInt(this.jTxtCodigoTorneo.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar torneo", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ct.eliminarTorneo(tor);
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
        this.jTxtIdUsuario.setVisible(false);
        String []columnas={"Código torneo","Nombre","Fecha inicio","Fecha final","Nombre usuario"};
        Object[]obj=new Object[5];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Torneo tor = new Torneo();
        ControlTorneo ct = new ControlTorneo();
        List ls;
        try{
            ls=ct.mostrarTorneo();
            for(int i=0;i<ls.size();i++){
                tor=(Torneo)ls.get(i);
                obj[0]=tor.getIdTorneo();
                obj[1]=tor.getNombreTorneo();
                obj[2]=tor.getFechaInicio();
                obj[3]=tor.getFechaFinal();
                obj[4]=tor.getNombreUsuario();
                tabla.addRow(obj);
            }
            ls=ct.mostrarTorneo();
            this.jTablaTorneo.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void llenarComboUsuario(){
        ControlTorneo ct = new ControlTorneo();
        List lista;
        Object item;
          try{
            lista  = ct.llenarComboBoxUsuario();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboUsuario.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
    }
    
    public void llenarTxtIdUsuario(){
        ControlTorneo ct = new ControlTorneo();
        String nombreUsuario = "";
        nombreUsuario = this.jComboUsuario.getSelectedItem().toString();
        int idUsuario;
        idUsuario = ct.llenarIdUsuario(nombreUsuario);
        this.jTxtIdUsuario.setText(String.valueOf(idUsuario));
    }
    
    public void limpiar(){
        this.jTxtCodigoTorneo.setText("");
        this.jTxtNombreTorneo.setText("");
        this.jTxtFechaInicio.setText("");
        this.jTxtFechaFinal.setText("");
        this.jComboUsuario.setSelectedIndex(0);
        this.jComboBuscar.setSelectedIndex(0);
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtNombreTorneo.setEnabled(opcion);
        this.jTxtFechaInicio.setEnabled(opcion);
        this.jTxtFechaFinal.setEnabled(opcion);
        this.jComboUsuario.setEnabled(opcion);
        this.jTxtBusqueda.setEnabled(opcion2);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
    }
    
    private void jTxtNombreTorneoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreTorneoKeyTyped
        // Validación sólo texto y espacio jTxtNombre
        val.validarTodo(evt);
    }//GEN-LAST:event_jTxtNombreTorneoKeyTyped

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtNombreTorneo.getText().equals("") && this.jComboUsuario.getSelectedItem().toString().equals("Seleccione uno")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
            habilitarInput(true,false);
        }else{
            if(editar==0 && nuevo==1){
                insertar();
                habilitarInput(false,false);
            }else if(editar==1){
            modificar();
            habilitarInput(false,false);
            }else if(nuevo==0 && this.jTxtNombreTorneo.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un gol", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        if(this.jTxtNombreTorneo.getText().equals("")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;        
        }
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(this.jTxtNombreTorneo.getText().equals("")){//No permite eliminar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            eliminar();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

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

    private void jTablaTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaTorneoMouseClicked
        int fila=this.jTablaTorneo.getSelectedRow();
        this.jTxtCodigoTorneo.setText(String.valueOf(this.jTablaTorneo.getValueAt(fila, 0)));
        this.jTxtNombreTorneo.setText(String.valueOf(this.jTablaTorneo.getValueAt(fila, 1)));
        this.jTxtFechaInicio.setText(String.valueOf(this.jTablaTorneo.getValueAt(fila, 2)));
        this.jTxtFechaFinal.setText(String.valueOf(this.jTablaTorneo.getValueAt(fila, 3)));
        this.jComboUsuario.setSelectedItem(String.valueOf(this.jTablaTorneo.getValueAt(fila, 4)));
    }//GEN-LAST:event_jTablaTorneoMouseClicked

    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
        if(jComboBuscar.getSelectedItem().equals("Seleccione uno")){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un criterio de busqueda", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }else{
            this.jTxtBusqueda.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    if (jComboBuscar.getSelectedItem().equals("Código")){               
                     tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 0));
                    }else if (jComboBuscar.getSelectedItem().equals("Nombre")){               
                     tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
                    }else if (jComboBuscar.getSelectedItem().equals("Fecha inicio")){               
                     tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 2));
                    }else if (jComboBuscar.getSelectedItem().equals("Fecha final")){               
                     tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 3));
                    }else if (jComboBuscar.getSelectedItem().equals("Usuario")){               
                     tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 4));
                    }
                }
            });
        }
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        this.jTablaTorneo.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped

    private void jComboUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboUsuarioItemStateChanged
        llenarTxtIdUsuario();
    }//GEN-LAST:event_jComboUsuarioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaTorneo;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtCodigoTorneo;
    private javax.swing.JFormattedTextField jTxtFechaFinal;
    private javax.swing.JFormattedTextField jTxtFechaInicio;
    private javax.swing.JTextField jTxtIdUsuario;
    private javax.swing.JTextField jTxtNombreTorneo;
    // End of variables declaration//GEN-END:variables
}
