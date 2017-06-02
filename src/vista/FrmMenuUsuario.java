package vista;



/**
 *
 * @author Luis Martinez
 */
public class FrmMenuUsuario extends javax.swing.JFrame {

     
    /**
     * Creates new form FrmMenu
     */
    public FrmMenuUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuTorneo = new javax.swing.JMenu();
        jTorneo = new javax.swing.JMenuItem();
        jEquipo = new javax.swing.JMenuItem();
        jJugadores = new javax.swing.JMenuItem();
        jArbitro = new javax.swing.JMenuItem();
        jEstadio = new javax.swing.JMenuItem();
        jPartido = new javax.swing.JMenuItem();
        jMenuGol = new javax.swing.JMenu();
        jGol = new javax.swing.JMenuItem();
        jTipoGol = new javax.swing.JMenuItem();
        jAmonestacion = new javax.swing.JMenu();
        jAmarilla = new javax.swing.JMenuItem();
        jRoja = new javax.swing.JMenuItem();
        jClasificacion = new javax.swing.JMenuItem();
        jHorario = new javax.swing.JMenuItem();
        jJornada = new javax.swing.JMenuItem();
        jNacionalidad = new javax.swing.JMenuItem();
        jResultado = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login.png"))); // NOI18N
        jMenu1.setText("Acceder");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        jMenuTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/torneo.png"))); // NOI18N
        jMenuTorneo.setMnemonic('f');
        jMenuTorneo.setText("Torneo");

        jTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/torneo.png"))); // NOI18N
        jTorneo.setText("Gestionar torneo");
        jTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTorneoActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jTorneo);

        jEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/equipos.png"))); // NOI18N
        jEquipo.setMnemonic('a');
        jEquipo.setText("Gestionar equipos");
        jEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEquipoActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jEquipo);

        jJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jugadores.png"))); // NOI18N
        jJugadores.setText("Gestionar jugadores");
        jJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJugadoresActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jJugadores);

        jArbitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbitros.png"))); // NOI18N
        jArbitro.setMnemonic('o');
        jArbitro.setText("Gestionar arbitros");
        jArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArbitroActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jArbitro);

        jEstadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estadio.png"))); // NOI18N
        jEstadio.setMnemonic('x');
        jEstadio.setText("Gestionar estadios");
        jEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadioActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jEstadio);

        jPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/partido.png"))); // NOI18N
        jPartido.setText("Gestionar partidos");
        jPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPartidoActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jPartido);

        jMenuGol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/goles.png"))); // NOI18N
        jMenuGol.setText("Gestionar goles");

        jGol.setText("Goles");
        jGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGolActionPerformed(evt);
            }
        });
        jMenuGol.add(jGol);

        jTipoGol.setText("Tipos de gol");
        jTipoGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoGolActionPerformed(evt);
            }
        });
        jMenuGol.add(jTipoGol);

        jMenuTorneo.add(jMenuGol);

        jAmonestacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amonestaciones.png"))); // NOI18N
        jAmonestacion.setText("Gestionar amonestaciones");

        jAmarilla.setText("Tarjeta amarilla");
        jAmarilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmarillaActionPerformed(evt);
            }
        });
        jAmonestacion.add(jAmarilla);

        jRoja.setText("Tarjeta roja");
        jRoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRojaActionPerformed(evt);
            }
        });
        jAmonestacion.add(jRoja);

        jMenuTorneo.add(jAmonestacion);

        jClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clasificacion.png"))); // NOI18N
        jClasificacion.setMnemonic('s');
        jClasificacion.setText("Gestionar clasificación");
        jClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClasificacionActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jClasificacion);

        jHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/horarios.png"))); // NOI18N
        jHorario.setText("Gestionar horarios");
        jHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHorarioActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jHorario);

        jJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jornadas.png"))); // NOI18N
        jJornada.setText("Gestionar jornadas");
        jJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJornadaActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jJornada);

        jNacionalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nacionalidades.png"))); // NOI18N
        jNacionalidad.setText("Gestionar nacionalidades");
        jNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNacionalidadActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jNacionalidad);

        jResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/resultados.png"))); // NOI18N
        jResultado.setText("Gestionar resultados");
        jResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResultadoActionPerformed(evt);
            }
        });
        jMenuTorneo.add(jResultado);

        jSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jSalir.setText("Salir");
        jMenuTorneo.add(jSalir);

        menuBar.add(jMenuTorneo);

        jMenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        jMenuAyuda.setMnemonic('h');
        jMenuAyuda.setText("Ayuda");

        jAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jAyuda.setMnemonic('c');
        jAyuda.setText("Ayuda");
        jMenuAyuda.add(jAyuda);

        menuBar.add(jMenuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadioActionPerformed
        //Invoca a FrmEstadio
        FrmEstadio estadio = new FrmEstadio();
        estadio.setVisible(true);
        this.desktopPane.add(estadio);
    }//GEN-LAST:event_jEstadioActionPerformed

    private void jJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJornadaActionPerformed
        //Invoca a FrmJornada
        FrmJornada jornada = new FrmJornada();
        jornada.setVisible(true);
        this.desktopPane.add(jornada);
    }//GEN-LAST:event_jJornadaActionPerformed

    private void jArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArbitroActionPerformed
        //Invoca a FrmArbitro
        FrmArbitro arbitro = new FrmArbitro();
        arbitro.setVisible(true);
        this.desktopPane.add(arbitro);
    }//GEN-LAST:event_jArbitroActionPerformed

    private void jClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClasificacionActionPerformed
        //Invoca a FrmClasificacion
        FrmClasificacion clasificacion = new FrmClasificacion();
        clasificacion.setVisible(true);
        this.desktopPane.add(clasificacion);
    }//GEN-LAST:event_jClasificacionActionPerformed

    private void jEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEquipoActionPerformed
        //Invoca a FrmEquipo
        FrmEquipo equipo = new FrmEquipo();
        equipo.setVisible(true);
        this.desktopPane.add(equipo);
    }//GEN-LAST:event_jEquipoActionPerformed

    private void jGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGolActionPerformed
        //Invoca a FrmGol
        FrmGol gol = new FrmGol();
        gol.setVisible(true);
        this.desktopPane.add(gol);
    }//GEN-LAST:event_jGolActionPerformed

    private void jHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHorarioActionPerformed
        //Invoca a FrmHorario
        FrmHorario horario = new FrmHorario();
        horario.setVisible(true);
        this.desktopPane.add(horario);
    }//GEN-LAST:event_jHorarioActionPerformed

    private void jJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJugadoresActionPerformed
        //Invoca a FrmJugador
        FrmJugador jugador = new FrmJugador();
        jugador.setVisible(true);
        this.desktopPane.add(jugador);
    }//GEN-LAST:event_jJugadoresActionPerformed

    private void jNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNacionalidadActionPerformed
        //Invoca a FrmNacionalidad
        FrmNacionalidad nac = new FrmNacionalidad();
        nac.setVisible(true);
        this.desktopPane.add(nac);
    }//GEN-LAST:event_jNacionalidadActionPerformed

    private void jTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTorneoActionPerformed
        //Invoca a FrmTorneo
        FrmTorneo torneo = new FrmTorneo();
        torneo.setVisible(true);
        this.desktopPane.add(torneo);
    }//GEN-LAST:event_jTorneoActionPerformed

    private void jPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPartidoActionPerformed
        //Invoca a FrmPartido
        FrmPartido partido = new FrmPartido();
        partido.setVisible(true);
        this.desktopPane.add(partido);
    }//GEN-LAST:event_jPartidoActionPerformed

    private void jTipoGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoGolActionPerformed
        //Invoca a FrmTipoGol
        FrmTipoGol tipoGol = new FrmTipoGol();
        tipoGol.setVisible(true);
        this.desktopPane.add(tipoGol);
    }//GEN-LAST:event_jTipoGolActionPerformed

    private void jAmarillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmarillaActionPerformed
        //Invoca a FrmTarjetaAmarilla
        FrmTarjetaAmarilla amarilla = new FrmTarjetaAmarilla();
        amarilla.setVisible(true);
        this.desktopPane.add(amarilla);
    }//GEN-LAST:event_jAmarillaActionPerformed

    private void jRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRojaActionPerformed
        //Invoca a FrmTarjetaRoja
        FrmTarjetaRoja roja = new FrmTarjetaRoja();
        roja.setVisible(true);
        this.desktopPane.add(roja);
    }//GEN-LAST:event_jRojaActionPerformed

    private void jResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResultadoActionPerformed
        //Invoca a FrmResultado
        FrmResultado resultado = new FrmResultado();
        resultado.setVisible(true);
        this.desktopPane.add(resultado);
    }//GEN-LAST:event_jResultadoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        FrmAcceder login = new FrmAcceder();
        login.setVisible(true);
        this.desktopPane.add(login);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jAmarilla;
    private javax.swing.JMenu jAmonestacion;
    private javax.swing.JMenuItem jArbitro;
    private javax.swing.JMenuItem jAyuda;
    private javax.swing.JMenuItem jClasificacion;
    private javax.swing.JMenuItem jEquipo;
    private javax.swing.JMenuItem jEstadio;
    private javax.swing.JMenuItem jGol;
    private javax.swing.JMenuItem jHorario;
    private javax.swing.JMenuItem jJornada;
    private javax.swing.JMenuItem jJugadores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenu jMenuGol;
    private javax.swing.JMenu jMenuTorneo;
    private javax.swing.JMenuItem jNacionalidad;
    private javax.swing.JMenuItem jPartido;
    private javax.swing.JMenuItem jResultado;
    private javax.swing.JMenuItem jRoja;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JMenuItem jTipoGol;
    private javax.swing.JMenuItem jTorneo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
