/** 
 * Titulo : EJERCICIO2 *
 */
package ejercicio2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ventana de la aplicacion (botones para cada programa)
 *
 * Clientes - Fabricantes - Articulos - Pedidos - LineasPedidos
 * @version Version : 1.0 31 de Enero de 2017
 * @author Jose Rafael Ibañez Zarzo
 * @see <a> http://teceinval.com </a>
 */

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        // Pone color de fondo a la ventana
        getContentPane().setBackground(new java.awt.Color(0,139,139));
        initComponents();
        /* Pone un nombre a la ventana (Ver tambien propiedad title)
         * this.setTitle("APLICACION : EJERCICIO2 (BASES)");
        */
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMenu = new javax.swing.JLabel();
        BotonClientes = new javax.swing.JButton();
        BotonFabricantes = new javax.swing.JButton();
        BotonArticulos = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        LabelCopyright = new javax.swing.JLabel();
        BotonPedidos = new javax.swing.JButton();
        BotonLineasPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION : EJERCICIO2 (BASES)");
        setAutoRequestFocus(false);
        setForeground(new java.awt.Color(255, 0, 51));

        LabelMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelMenu.setText("  M E N U    P R I N C I P A L");

        BotonClientes.setText("Clientes");
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });

        BotonFabricantes.setText("Fabricantes");
        BotonFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFabricantesActionPerformed(evt);
            }
        });

        BotonArticulos.setText("Articulos");
        BotonArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArticulosActionPerformed(evt);
            }
        });

        BotonSalir.setText("Fin Programa");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        LabelCopyright.setText("(c) Rafa Ibañez 2016");

        BotonPedidos.setText("Pedidos Cabecera");
        BotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidosActionPerformed(evt);
            }
        });

        BotonLineasPedidos.setText("Lineas Pedidos");
        BotonLineasPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLineasPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelCopyright)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(BotonFabricantes)
                                .addGap(33, 33, 33)
                                .addComponent(BotonArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(BotonPedidos)
                        .addGap(18, 18, 18)
                        .addComponent(BotonLineasPedidos)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(LabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonClientes)
                    .addComponent(BotonFabricantes)
                    .addComponent(BotonArticulos))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLineasPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(BotonSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCopyright)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("null")
// #############################################################################
// ##### METODO LLAMADA MANTENIMIENTO CLIENTES                             #####
// #############################################################################
    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
     Clientes cli = null;
        try {
            cli = new Clientes();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
            cli.setVisible(true);
           
    }//GEN-LAST:event_BotonClientesActionPerformed
    @SuppressWarnings("null")
// #############################################################################
// ##### METODO LLAMADA MANTENIMIENTO FABRICANTES                          #####
// #############################################################################
    private void BotonFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFabricantesActionPerformed
     Fabricantes pro = null;
        try {
            pro = new Fabricantes();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         pro.setVisible(true);
    }//GEN-LAST:event_BotonFabricantesActionPerformed
    @SuppressWarnings("null")
// #############################################################################
// ##### METODO LLAMADA MANTENIMIENTO ARTICULOS                            #####
// #############################################################################
    private void BotonArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArticulosActionPerformed
     Articulos art = null;
        try {
            art = new Articulos();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         art.setVisible(true);
    }//GEN-LAST:event_BotonArticulosActionPerformed
// #############################################################################
// ##### METODO FINALIZAR LA APLICACION                                    #####
// #############################################################################
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed
    @SuppressWarnings("null")
// #############################################################################
// ##### METODO LLAMADA PROGRAMA CABECERA DE PEDIDOS                       #####
// #############################################################################
    private void BotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidosActionPerformed
     Pedidos ped = null;
        try {
            ped = new Pedidos();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         ped.setVisible(true);
    }//GEN-LAST:event_BotonPedidosActionPerformed
    @SuppressWarnings("null")
// #############################################################################
// ##### METODO LLAMADA PROGRAMA LINEAS DE PEDIDOS                         #####
// #############################################################################
    private void BotonLineasPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLineasPedidosActionPerformed
     PedidosLineas lin = null;
        try {
            lin = new PedidosLineas();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         lin.setVisible(true);
    }//GEN-LAST:event_BotonLineasPedidosActionPerformed
// #############################################################################
// ##### METODO MENU MAIN                                                  #####
// #############################################################################
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonArticulos;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonFabricantes;
    private javax.swing.JButton BotonLineasPedidos;
    private javax.swing.JButton BotonPedidos;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel LabelCopyright;
    private javax.swing.JLabel LabelMenu;
    // End of variables declaration//GEN-END:variables
}
