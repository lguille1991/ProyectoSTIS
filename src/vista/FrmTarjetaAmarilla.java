
package vista;

import controlador.ControlTarjetaAmarilla;
import controlador.Validaciones;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.TarjetaAmarilla;
import javax.swing.RowFilter;


/**
 *
 * @author TOSHIBA
 */
public class FrmTarjetaAmarilla extends javax.swing.JInternalFrame {
    private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val = new Validaciones();
    /**
     * Creates new form frmTarjetaAmarilla
     */
    public FrmTarjetaAmarilla() {
        initComponents();
        mostrar();
        llenarComboEquipo();
        llenarTxtIdEquipo();
        llenarTxtIdJugador();
        habilitarInput(false,false);  
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboJugador = new javax.swing.JComboBox<>();
        jBtnBuscar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtCodigoTarjeta = new javax.swing.JTextField();
        jTxtMinuto = new javax.swing.JTextField();
        jComboEquipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarjetaAmarilla = new javax.swing.JTable();
        jTxtIdEquipo = new javax.swing.JTextField();
        jTxtIdJugador = new javax.swing.JTextField();
        jBtnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBuscar = new javax.swing.JComboBox<>();
        jTextBusqueda = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jComboJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione uno" }));
        jComboJugador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboJugadorItemStateChanged(evt);
            }
        });

        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnBuscarMouseClicked(evt);
            }
        });
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        jBtnEditar.setText("Editar");
        jBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEditarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tarjeta Amarilla");

        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGuardarMouseClicked(evt);
            }
        });

        jLabel2.setText("Código tarjeta:");

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEliminarMouseClicked(evt);
            }
        });

        jLabel3.setText("Minuto:");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCancelarMouseClicked(evt);
            }
        });

        jLabel4.setText("Equipo:");

        jLabel5.setText("Jugador:");

        jTxtCodigoTarjeta.setEnabled(false);
        jTxtCodigoTarjeta.setName(""); // NOI18N
        jTxtCodigoTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtCodigoTarjetaKeyTyped(evt);
            }
        });

        jTxtMinuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtMinutoKeyTyped(evt);
            }
        });

        jComboEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione uno" }));
        jComboEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboEquipoItemStateChanged(evt);
            }
        });

        jTableTarjetaAmarilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código tarjeta", "Minuto", "Equipo", "Jugador"
            }
        ));
        jTableTarjetaAmarilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarjetaAmarillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTarjetaAmarilla);

        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        jBtnNuevo.setText("Nuevo");
        jBtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnNuevoMouseClicked(evt);
            }
        });

        jLabel6.setText("Busqueda:");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código", "Minuto", "Jugador", "Equipo" }));

        jTextBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBusquedaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jTxtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addContainerGap(257, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jTxtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboEquipo, 0, 149, Short.MAX_VALUE)
                                .addComponent(jComboJugador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtMinuto)
                                .addComponent(jTxtCodigoTarjeta)
                                .addComponent(jComboBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jBtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtCodigoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnNuevo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnEditar)
                        .addGap(0, 0, 0)
                        .addComponent(jBtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEliminar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertar(){
        TarjetaAmarilla ta = new TarjetaAmarilla();
        ControlTarjetaAmarilla cta = new ControlTarjetaAmarilla();
        try{
              
              ta.setIdJugador(Integer.parseInt(this.jTxtIdJugador.getText()));
              ta.setMinuto(Integer.parseInt(this.jTxtMinuto.getText()));
              String msj=cta.agregarTarjetaA(ta);
              JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar(){
        TarjetaAmarilla ta = new TarjetaAmarilla();
        ControlTarjetaAmarilla cta = new ControlTarjetaAmarilla();
        try{
            ta.setIdTarjetaAmarilla(Integer.parseInt(this.jTxtCodigoTarjeta.getText()));
            ta.setIdJugador(Integer.parseInt(this.jTxtIdJugador.getText()));
            ta.setMinuto(Integer.parseInt(this.jTxtMinuto.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar gol", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cta.modificarTarjetaA(ta);
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
        TarjetaAmarilla ta = new TarjetaAmarilla();
        ControlTarjetaAmarilla cta = new ControlTarjetaAmarilla();
        try{
            ta.setIdTarjetaAmarilla(Integer.parseInt(this.jTxtCodigoTarjeta.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar gol", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=cta.eliminarTarjetaA(ta);
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
    
         public DefaultTableModel mostrar()
         {
        this.jTxtIdEquipo.setVisible(false);
        this.jTxtIdJugador.setVisible(false);
        String []columnas={"Código Tarjeta","Minuto","Jugador","Equipo"};
        Object[]obj=new Object[4];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        TarjetaAmarilla ta = new TarjetaAmarilla();
        ControlTarjetaAmarilla cta = new ControlTarjetaAmarilla();
        List ls;
        
        try{
            ls=cta.mostrarTarjetaA();
            for(int i=0;i<ls.size();i++){
                ta=(TarjetaAmarilla)ls.get(i);
                obj[0]=ta.getIdTarjetaAmarilla();
                obj[1]=ta.getMinuto();
                obj[2]=ta.getNombreJugador();
                obj[3]=ta.getNombreEquipo();
                tabla.addRow(obj);
            }
            ls=cta.mostrarTarjetaA();
            this.jTableTarjetaAmarilla.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
        }
     
    public void llenarComboEquipo(){
        ControlTarjetaAmarilla ta = new ControlTarjetaAmarilla();
        List lista;
        Object item;
          try{
            lista  = ta.llenarComboBoxEquipo();
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboEquipo.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }              
    }
    public void llenarComboJugador(){
        ControlTarjetaAmarilla ta = new ControlTarjetaAmarilla();
        List lista;
        Object item;
        int idEquipo = (Integer.parseInt(this.jTxtIdEquipo.getText()));
          try{
            lista  = ta.llenarComboBoxJugador(idEquipo);
            for (int i=0;i<lista.size();i++) {
                item= lista.get(i);
                jComboJugador.addItem(item.toString());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        } 
      }
    
     public void llenarTxtIdEquipo(){
        ControlTarjetaAmarilla ta = new ControlTarjetaAmarilla();
        String nombreEquipo = "";
        nombreEquipo = this.jComboEquipo.getSelectedItem().toString();
        int idEquipo;
        idEquipo = ta.llenarIdEquipo(nombreEquipo);
        this.jTxtIdEquipo.setText(String.valueOf(idEquipo));
    }

     
    public void llenarTxtIdJugador(){
        ControlTarjetaAmarilla ta = new ControlTarjetaAmarilla();
        String nombreJugador = "";
        nombreJugador = this.jComboJugador.getSelectedItem().toString();
        int idJugador;
        idJugador = ta.llenarIdJugador(nombreJugador);
        this.jTxtIdJugador.setText(String.valueOf(idJugador));
    }
    
        public void limpiar(){
        this.jTxtCodigoTarjeta.setText("");
        this.jTxtMinuto.setText("");
        this.jComboEquipo.setSelectedIndex(0);
        this.jComboJugador.setSelectedIndex(0);
    }
        public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtMinuto.setEnabled(opcion);
        this.jComboEquipo.setEnabled(opcion);
        this.jComboJugador.setEnabled(opcion);
        this.jTextBusqueda.setEnabled(opcion2);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
    }
    private void jTxtCodigoTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoTarjetaKeyTyped
            val.validarNumero(evt);
    }//GEN-LAST:event_jTxtCodigoTarjetaKeyTyped

    private void jTxtMinutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMinutoKeyTyped
         val.validarNumero(evt);
      
    }//GEN-LAST:event_jTxtMinutoKeyTyped
   
    private void jComboEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboEquipoItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.jComboEquipo.getSelectedIndex()>0)
            {
                   llenarComboJugador();
                 llenarTxtIdJugador();
            }
        
        }
        llenarTxtIdEquipo();
    }//GEN-LAST:event_jComboEquipoItemStateChanged

    private void jComboJugadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboJugadorItemStateChanged
       llenarTxtIdJugador();
    }//GEN-LAST:event_jComboJugadorItemStateChanged

    private void jBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGuardarMouseClicked
        if(nuevo==1 && this.jTxtMinuto.getText().equals("") && this.jComboJugador.getSelectedItem().toString().equals("Seleccione uno")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
            habilitarInput(true,false);
        }else{
            if(editar==0 && nuevo==1){
                insertar();
                habilitarInput(false,false);
            }else if(editar==1){
            modificar();
            habilitarInput(false,false);
            }else if(nuevo==0 && this.jTxtMinuto.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un gol", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtnGuardarMouseClicked

    private void jBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEditarMouseClicked
          if(this.jTxtMinuto.getText().equals("")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;        
        }
    }//GEN-LAST:event_jBtnEditarMouseClicked

    private void jTableTarjetaAmarillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarjetaAmarillaMouseClicked
        int fila=this.jTableTarjetaAmarilla.getSelectedRow();
        this.jTxtCodigoTarjeta.setText(String.valueOf(this.jTableTarjetaAmarilla.getValueAt(fila, 0)));
        this.jTxtMinuto.setText(String.valueOf(this.jTableTarjetaAmarilla.getValueAt(fila, 1)));
        this.jComboEquipo.setSelectedItem(String.valueOf(this.jTableTarjetaAmarilla.getValueAt(fila, 3).toString()));
        this.jComboJugador.setSelectedItem(String.valueOf(this.jTableTarjetaAmarilla.getValueAt(fila, 2).toString()));
        
    }//GEN-LAST:event_jTableTarjetaAmarillaMouseClicked

    private void jBtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarMouseClicked
        if(this.jTxtMinuto.getText().equals("")){//No permite eliminar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            eliminar();
        }
    }//GEN-LAST:event_jBtnEliminarMouseClicked

    private void jBtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCancelarMouseClicked
         habilitarInput(false,true);
        limpiar();
        nuevo=0;
    }//GEN-LAST:event_jBtnCancelarMouseClicked

    private void jBtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNuevoMouseClicked
        habilitarInput(true,false);
        limpiar();
        nuevo=1;
    }//GEN-LAST:event_jBtnNuevoMouseClicked

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jTextBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBusquedaKeyTyped
         if(jComboBuscar.getSelectedItem().equals("Seleccione uno")){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un criterio de busqueda", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }else{
            this.jTextBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (jComboBuscar.getSelectedItem().equals("Código")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTextBusqueda.getText(), 0));
                }else if (jComboBuscar.getSelectedItem().equals("Minuto")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTextBusqueda.getText(), 1));
                }else if (jComboBuscar.getSelectedItem().equals("Jugador")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTextBusqueda.getText(), 2));
                }else if (jComboBuscar.getSelectedItem().equals("Equipo")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTextBusqueda.getText(), 3));
                }
            }
        });
        } 
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        this.jTableTarjetaAmarilla.setRowSorter(tbs);
    }//GEN-LAST:event_jTextBusquedaKeyTyped

    private void jBtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnBuscarMouseClicked
         habilitarInput(false,true);
    }//GEN-LAST:event_jBtnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboEquipo;
    private javax.swing.JComboBox<String> jComboJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTarjetaAmarilla;
    private javax.swing.JTextField jTextBusqueda;
    private javax.swing.JTextField jTxtCodigoTarjeta;
    private javax.swing.JTextField jTxtIdEquipo;
    private javax.swing.JTextField jTxtIdJugador;
    private javax.swing.JTextField jTxtMinuto;
    // End of variables declaration//GEN-END:variables
}
