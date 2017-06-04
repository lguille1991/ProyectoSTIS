package vista;

import controlador.Validaciones;
import conexion.Conexion;
import controlador.ControlArbitro;
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
import modelo.Arbitro;

/**
 *
 * @author Luis Martinez
 */
public class FrmArbitro extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val = new Validaciones();
    /**
     * Creates new form FrmArbitro
     */
    public FrmArbitro() {
        initComponents();
        mostrar();
        llenarCombo();
        llenarTxtNacion();
        //jTxtIdNacion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jComboTipo = new javax.swing.JComboBox<>();
        jTxtFechaNac = new javax.swing.JFormattedTextField();
        jComboNacionalidad = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaArb = new javax.swing.JTable();
        jTxtIdNacion = new javax.swing.JTextField();
        BtnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxtBusqueda = new javax.swing.JTextField();
        jComboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Arbitro");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Fecha nacimiento:");

        jLabel6.setText("Nacionalidad:");

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

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Central", "Línea 1", "Línea 2", "Auxiliar" }));
        jComboTipo.setEnabled(false);

        try {
            jTxtFechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtFechaNac.setEnabled(false);

        jComboNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno" }));
        jComboNacionalidad.setEnabled(false);
        jComboNacionalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboNacionalidadItemStateChanged(evt);
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

        jTablaArb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nacionalidad", "Nombre", "Fecha nacimiento", "Tipo"
            }
        ));
        jTablaArb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaArbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaArb);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jLabel7.setText("Buscar:");

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código", "Nombre", "Tipo", "Fecha Nacimiento", "Nacionalidad" }));
        jComboBuscar.setEnabled(false);

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtCodigo)
                                            .addComponent(jTxtNombre)
                                            .addComponent(jComboTipo, 0, 185, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtFechaNac)
                                            .addComponent(jComboNacionalidad, 0, 186, Short.MAX_VALUE)
                                            .addComponent(jTxtIdNacion))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(BtnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtBusqueda)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtIdNacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoKeyTyped
        //Validación solo números
        val.validarNumero(evt);
    }//GEN-LAST:event_jTxtCodigoKeyTyped

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
        //Validación solo letras y espacios
        val.validarLetra(evt);
    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void jComboNacionalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboNacionalidadItemStateChanged
        llenarTxtNacion();
    }//GEN-LAST:event_jComboNacionalidadItemStateChanged

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtNombre.getText().equals("") && this.jTxtFechaNac.getText().equals("") && this.jComboNacionalidad.getSelectedItem().toString().equals("Seleccione uno")){//No permite guardar si el campo está vacío
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
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un arbitro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        if(this.jTxtNombre.getText().equals("") || this.jTxtFechaNac.getText().equals("")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;        
        }
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(this.jTxtNombre.getText().equals("") || this.jTxtFechaNac.getText().equals("")){//No permite eliminar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            eliminar();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoMouseClicked
        habilitarInput(true,false);
        limpiar();
        nuevo=1;
    }//GEN-LAST:event_BtnNuevoMouseClicked

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked
        habilitarInput(false,true);
        limpiar();
    }//GEN-LAST:event_BtnCancelarMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        habilitarInput(false,true);
    }//GEN-LAST:event_BtnBuscarMouseClicked
    
    //Asigna valores a los campos provenientes de los registros
    private void jTablaArbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaArbMouseClicked
        int fila=this.jTablaArb.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaArb.getValueAt(fila, 0)));
        //this.jTxtIdNacion.setText(String.valueOf(this.jTablaArb.getValueAt(fila, 1)));
        this.jComboNacionalidad.setSelectedItem(String.valueOf(this.jTablaArb.getValueAt(fila, 1).toString()));
        this.jTxtNombre.setText(String.valueOf(this.jTablaArb.getValueAt(fila, 2)));
        this.jTxtFechaNac.setText(String.valueOf(this.jTablaArb.getValueAt(fila, 3)));
        this.jComboTipo.setSelectedItem(String.valueOf(this.jTablaArb.getValueAt(fila, 4).toString()));
    }//GEN-LAST:event_jTablaArbMouseClicked
    
    //Busqueda dinámica
    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
        this.jTxtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (jComboBuscar.getSelectedItem().equals("Código")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 0));
                } else if (jComboBuscar.getSelectedItem().equals("Nombre")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 2));
                } else if (jComboBuscar.getSelectedItem().equals("Tipo")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 4));
                } else if (jComboBuscar.getSelectedItem().equals("Fecha Nacimiento")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 3));
                } else if (jComboBuscar.getSelectedItem().equals("Nacionalidad")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
                }
            }
        });
        
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        this.jTablaArb.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped
  
    public void llenarCombo(){
         ControlArbitro ca = new ControlArbitro();
         List lista;
         Object item;
          try{
            lista  = ca.llenarComboBox();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboNacionalidad.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
  }
  
    public void llenarTxtNacion(){
        ControlArbitro ca = new ControlArbitro();
        String nombreNacion = "";
        nombreNacion = this.jComboNacionalidad.getSelectedItem().toString();
        int idNacion;
        idNacion = ca.llenarId(nombreNacion);
        this.jTxtIdNacion.setText(String.valueOf(idNacion));
    }
  
  public void insertar(){
        Arbitro ar = new Arbitro();
        ControlArbitro ca = new ControlArbitro();
        try{
            ar.setNombreArbitro(this.jTxtNombre.getText());
            ar.setIdNacionalidad(Integer.parseInt(this.jTxtIdNacion.getText()));
            ar.setFechaNac(this.jTxtFechaNac.getText());
            ar.setTipo(this.jComboTipo.getSelectedItem().toString());
            String msj=ca.agregarArbitro(ar);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
    public void modificar(){
        Arbitro ar=new Arbitro();
        ControlArbitro ca=new ControlArbitro();
        try{
            ar.setIdArbitro(Integer.parseInt(this.jTxtCodigo.getText()));
            ar.setIdNacionalidad(Integer.parseInt(this.jTxtIdNacion.getText()));
            ar.setNombreArbitro(this.jTxtNombre.getText());
            ar.setFechaNac(this.jTxtFechaNac.getText());
            ar.setTipo(this.jComboTipo.getSelectedItem().toString());
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar arbitro", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ca.modificarArbitro(ar);
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
        Arbitro ar=new Arbitro();
        ControlArbitro ca=new ControlArbitro();
        try{
            ar.setIdArbitro(Integer.parseInt(this.jTxtCodigo.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar arbitro", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ca.eliminarArbitro(ar);
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
        this.jTxtIdNacion.setVisible(false);
        String []columnas={"Código arbitro","Nacionalidad","Nombre","Fecha nacimiento","Tipo"};
        Object[]obj=new Object[5];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Arbitro ar = new Arbitro();
        ControlArbitro ca = new ControlArbitro();
        List ls;
        try{
            ls=ca.mostrarArbitro();
            for(int i=0;i<ls.size();i++){
                ar=(Arbitro)ls.get(i);
                obj[0]=ar.getIdArbitro();
                obj[1]=ar.getNombreNacionalidad();
                obj[2]=ar.getNombreArbitro();
                obj[3]=ar.getTipo();
                obj[4]=ar.getFechaNac();
                tabla.addRow(obj);
            }
            ls=ca.mostrarArbitro();
            this.jTablaArb.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void limpiar(){
        this.jTxtCodigo.setText("");
        this.jTxtIdNacion.setText("");
        this.jTxtNombre.setText("");
        this.jTxtFechaNac.setText("");
        this.jTxtBusqueda.setText("");
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtNombre.setEnabled(opcion);
        this.jComboTipo.setEnabled(opcion);
        this.jTxtFechaNac.setEnabled(opcion);
        this.jComboNacionalidad.setEnabled(opcion);
        this.jTxtBusqueda.setEnabled(opcion2);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboNacionalidad;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaArb;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JFormattedTextField jTxtFechaNac;
    private javax.swing.JTextField jTxtIdNacion;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
