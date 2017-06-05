package vista;

import controlador.Validaciones;
import conexion.Conexion;
import controlador.ControlJugador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Jugador;

/**
 *
 * @author TOSHIBA
 */
public class FrmJugador extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val = new Validaciones();
    /**
     * Creates new form frmPortero
     */
    public FrmJugador() {
        initComponents();
        mostrar();
        llenarComboEquipo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtCodigo = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtDorsal = new javax.swing.JTextField();
        jComboPosicion = new javax.swing.JComboBox<>();
        jComboEquipo = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxtFechaNacimiento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaJugador = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBuscar = new javax.swing.JComboBox<>();
        jTxtBusqueda = new javax.swing.JTextField();
        jTxtIdEquipo = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jTxtCodigo.setEnabled(false);
        jTxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtCodigoKeyTyped(evt);
            }
        });

        jTxtNombre.setEnabled(false);
        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyTyped(evt);
            }
        });

        jTxtDorsal.setEnabled(false);
        jTxtDorsal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtDorsalKeyTyped(evt);
            }
        });

        jComboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Portero", "Defensa", "Mediocampista", "Delantero", " " }));
        jComboPosicion.setEnabled(false);

        jComboEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno" }));
        jComboEquipo.setEnabled(false);
        jComboEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboEquipoItemStateChanged(evt);
            }
        });

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarMouseClicked(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Jugador");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Dorsal:");

        jLabel6.setText("Posición");

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });

        jLabel7.setText("Equipo:");

        try {
            jTxtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtFechaNacimiento.setEnabled(false);

        jTablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fecha de Nacimiento", "Dorsal", "Posicion", "Tipo", "Equipo"
            }
        ));
        jTablaJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaJugadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaJugador);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jLabel8.setText("Busqueda:");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código", "Equipo", "Posición", "Jugador", "Fecha nacimiento", "Dorsal" }));
        jComboBuscar.setEnabled(false);

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboPosicion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTxtDorsal, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTxtFechaNacimiento))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(79, 79, 79)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BtnGuardar)
                            .addComponent(jTxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addGap(97, 97, 97)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTxtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertar(){
        Jugador jug = new Jugador();
        ControlJugador cj = new ControlJugador();
        try{
            jug.setIdEquipo(Integer.parseInt(this.jTxtIdEquipo.getText()));
            jug.setPosicion(this.jComboPosicion.getSelectedItem().toString());
            jug.setNombreJugador(this.jTxtNombre.getText());
            jug.setFechaNac(this.jTxtFechaNacimiento.getText());
            jug.setNumeroDorsal(Integer.parseInt(this.jTxtDorsal.getText()));
            String msj=cj.agregarJugador(jug);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar(){
        Jugador jug = new Jugador();
        ControlJugador cj = new ControlJugador();
        try{
            jug.setIdJugador(Integer.parseInt(this.jTxtCodigo.getText()));
            jug.setIdEquipo(Integer.parseInt(this.jTxtIdEquipo.getText()));
            jug.setPosicion(this.jComboPosicion.getSelectedItem().toString());
            jug.setNombreJugador(this.jTxtNombre.getText());
            jug.setFechaNac(this.jTxtFechaNacimiento.getText());
            jug.setNumeroDorsal(Integer.parseInt(this.jTxtDorsal.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar jugador", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cj.modificarJugador(jug);
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
        Jugador jug = new Jugador();
        ControlJugador cj = new ControlJugador();
        try{
            jug.setIdJugador(Integer.parseInt(this.jTxtCodigo.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar jugador", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cj.eliminarJugador(jug);
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
        this.jTxtIdEquipo.setVisible(false);
        String []columnas={"Código jugador","Equipo","Posición","Jugador","Fecha nacimiento","Dorsal"};
        Object[]obj=new Object[6];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Jugador jug = new Jugador();
        ControlJugador cj = new ControlJugador();
        List ls;
        try{
            ls=cj.mostrarJugador();
            for(int i=0;i<ls.size();i++){
                jug=(Jugador)ls.get(i);
                obj[0]=jug.getIdJugador();
                obj[1]=jug.getNombreEquipo();
                obj[2]=jug.getPosicion();
                obj[3]=jug.getNombreJugador();
                obj[4]=jug.getFechaNac();
                obj[5]=jug.getNumeroDorsal();
                tabla.addRow(obj);
            }
            ls=cj.mostrarJugador();
            this.jTablaJugador.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void llenarComboEquipo(){
        ControlJugador cj = new ControlJugador();
        List lista;
        Object item;
          try{
            lista  = cj.llenarComboEquipo();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboEquipo.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
    }
    
    public void llenarTxtIdEquipo(){
        ControlJugador cj = new ControlJugador();
        String nombreEquipo = "";
        nombreEquipo = this.jComboEquipo.getSelectedItem().toString();
        int idEquipo;
        idEquipo = cj.llenarIdEquipo(nombreEquipo);
        this.jTxtIdEquipo.setText(String.valueOf(idEquipo));
    }
    
    public void limpiar(){
        this.jTxtCodigo.setText("");
        this.jTxtNombre.setText("");
        this.jTxtDorsal.setText("");
        this.jTxtFechaNacimiento.setText("");
        this.jComboEquipo.setSelectedIndex(0);
        this.jComboPosicion.setSelectedIndex(0);
        this.jComboBuscar.setSelectedIndex(0);
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtNombre.setEnabled(opcion);
        this.jTxtFechaNacimiento.setEnabled(opcion);
        this.jTxtDorsal.setEnabled(opcion);
        this.jComboEquipo.setEnabled(opcion);
        this.jComboPosicion.setEnabled(opcion);
        this.jTxtBusqueda.setEnabled(opcion2);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
    }
    
    private void jTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoKeyTyped
        //Validación números JTxtCodigo
        val.validarNumero(evt);
    }//GEN-LAST:event_jTxtCodigoKeyTyped

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
        //Validación solo letras y espacios
        val.validarLetra(evt);
    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void jTxtDorsalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDorsalKeyTyped
        //Validación números JTxtDorsal
        val.validarNumero(evt);
    }//GEN-LAST:event_jTxtDorsalKeyTyped

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jComboEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboEquipoItemStateChanged
        llenarTxtIdEquipo();
    }//GEN-LAST:event_jComboEquipoItemStateChanged

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtNombre.getText().equals("") && this.jComboEquipo.getSelectedItem().toString().equals("Seleccione uno")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
            habilitarInput(true,false);
        }else{
            if(editar==0 && nuevo==1){
                insertar();
                habilitarInput(false,false);
            }else if(editar==1){
            modificar();
            habilitarInput(false,false);
            }else if(nuevo==0 && this.jTxtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un jugador", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        if(this.jTxtNombre.getText().equals("")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;        
        }
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(this.jTxtNombre.getText().equals("")){//No permite eliminar sin haber seleccionado un registro
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

    private void jTablaJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaJugadorMouseClicked
        int fila=this.jTablaJugador.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaJugador.getValueAt(fila, 0)));
        this.jComboEquipo.setSelectedItem(String.valueOf(this.jTablaJugador.getValueAt(fila, 1)));
        this.jComboPosicion.setSelectedItem(String.valueOf(this.jTablaJugador.getValueAt(fila, 2)));
        this.jTxtNombre.setText(String.valueOf(this.jTablaJugador.getValueAt(fila, 3)));
        this.jTxtFechaNacimiento.setText(String.valueOf(this.jTablaJugador.getValueAt(fila, 4)));
        this.jTxtDorsal.setText(String.valueOf(this.jTablaJugador.getValueAt(fila, 5)));
    }//GEN-LAST:event_jTablaJugadorMouseClicked

    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
        if(jComboBuscar.getSelectedItem().equals("Seleccione uno")){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un criterio de busqueda", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }else{
            this.jTxtBusqueda.addKeyListener(new KeyAdapter() {
                @Override
            public void keyReleased(KeyEvent e) {
                if(jComboBuscar.getSelectedItem().equals("Código")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 0));
                }else if (jComboBuscar.getSelectedItem().equals("Equipo")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
                }else if (jComboBuscar.getSelectedItem().equals("Posición")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 2));
                }else if (jComboBuscar.getSelectedItem().equals("Jugador")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 3));
                }else if (jComboBuscar.getSelectedItem().equals("Fecha nacimiento")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 4));
                }else if (jComboBuscar.getSelectedItem().equals("Dorsal")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 5));
                }
            }
            });
        }
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        this.jTablaJugador.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboEquipo;
    private javax.swing.JComboBox<String> jComboPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaJugador;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtDorsal;
    private javax.swing.JFormattedTextField jTxtFechaNacimiento;
    private javax.swing.JTextField jTxtIdEquipo;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
