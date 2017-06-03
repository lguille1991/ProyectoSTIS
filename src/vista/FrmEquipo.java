package vista;

import controlador.Validaciones;
import conexion.Conexion;
import controlador.ControlEquipo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Equipo;

/**
 *
 * @author Luis Martinez
 */
public class FrmEquipo extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val=new Validaciones();
    /**
     * Creates new form FrmEquipo
     */
    public FrmEquipo() {
        initComponents();
        mostrar();
    }
    
    public void insertar(){
        Equipo eq = new Equipo();
        ControlEquipo ce = new ControlEquipo();
        try{
            eq.setNombreEquipo(this.jTxtNombre.getText());
            String msj=ce.agregarEquipo(eq);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar(){
        Equipo eq=new Equipo();
        ControlEquipo ce=new ControlEquipo();
        try{
            eq.setIdEquipo(Integer.parseInt(this.jTxtCodigo.getText()));
            eq.setNombreEquipo(this.jTxtNombre.getText());
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar equipo", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ce.modificarEquipo(eq);
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
        Equipo eq=new Equipo();
        ControlEquipo ce=new ControlEquipo();
        try{
            eq.setIdEquipo(Integer.parseInt(this.jTxtCodigo.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar equipo", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ce.eliminarEquipo(eq);
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
        String []columnas={"Código","Nombre"};
        Object[]obj=new Object[2];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Equipo eq = new Equipo();
        ControlEquipo ce = new ControlEquipo();
        List ls;
        try{
            ls=ce.mostrarEquipo();
            for(int i=0;i<ls.size();i++){
                eq=(Equipo)ls.get(i);
                obj[0]=eq.getIdEquipo();
                obj[1]=eq.getNombreEquipo();
                tabla.addRow(obj);
            }
            ls=ce.mostrarEquipo();
            this.jTablaEq.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void limpiar(){
        this.jTxtCodigo.setText("");
        this.jTxtNombre.setText("");
        this.jTxtBusqueda.setText("");
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtNombre.setEnabled(opcion);
        this.jTxtBusqueda.setEnabled(opcion2);
        return opcion;
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
        jTxtNombre = new javax.swing.JTextField();
        jTxtCodigo = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEq = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        jTxtBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Equipo");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jTxtNombre.setEnabled(false);
        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyTyped(evt);
            }
        });

        jTxtCodigo.setEnabled(false);
        jTxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtCodigoKeyTyped(evt);
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

        jTablaEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jTablaEq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaEqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaEq);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBusquedaActionPerformed(evt);
            }
        });
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        jLabel4.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtNombre)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtBusqueda)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardar)
                            .addComponent(BtnCancelar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoKeyTyped
        //Validación sólo números
        val.validarNumero(evt);
    }//GEN-LAST:event_jTxtCodigoKeyTyped

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
        //Validación letras, números y espacios
        val.validarTodo(evt);
    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtNombre.getText().equals("")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(editar==0 && nuevo==1){
                insertar(); 
            }else if(editar==1){
            modificar();
            }else if(nuevo==0 && this.jTxtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un equipo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        habilitarInput(false,false);
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
    private void jTablaEqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaEqMouseClicked
        int fila=this.jTablaEq.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaEq.getValueAt(fila, 0)));
        this.jTxtNombre.setText(String.valueOf(this.jTablaEq.getValueAt(fila, 1)));
    }//GEN-LAST:event_jTablaEqMouseClicked

    private void jTxtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyReleased
        
    }//GEN-LAST:event_jTxtNombreKeyReleased

    private void jTxtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyReleased
       
    }//GEN-LAST:event_jTxtBusquedaKeyReleased

    private void jTxtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBusquedaActionPerformed

    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
            this.jTxtBusqueda.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
            }   
            });
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        jTablaEq.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaEq;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
