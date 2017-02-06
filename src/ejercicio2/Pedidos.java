/** 
 * Titulo : EJERCICIO2 *
 */
package ejercicio2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 * Programa Grabacion Cabecera de Pedidos
 * @version Version : 1.0 31 de Enero de 2017
 * @author Jose Rafael Ibañez Zarzo
 * @see <a> http://teceinval.com </a>
 */
public class Pedidos extends javax.swing.JFrame {
/**
 * Programa Grabacion Cabecera de Pedidos
 */
static public ResultSet r;                      // Contenido Tablas Pedidos
static public Connection conexion;
char esNuevo = ' ';

    public Pedidos() throws SQLException {
        initComponents();
    // Conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url,user, pass);
    // Prepara la conexion de la tabla pedidos
        Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select pedidos.*, clientes.NOMBRE from pedidos LEFT JOIN clientes on CLIENTE = NIF";
        r = s.executeQuery(query);
    // Saca el primer registro de fabricantes
        r.first();
        sacaRegistro();
        activarCampos(false, false, false, false);        
        muestraBotones(true, true, true, true, true, true, true, false, false, false, true);
    // Ocultar campos
        LabelBorrar.setVisible(false);
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTITULO = new javax.swing.JLabel();
        LabelNUM_PEDIDO = new javax.swing.JLabel();
        LabelFECHA = new javax.swing.JLabel();
        LabelCLIENTE = new javax.swing.JLabel();
        num_pedido = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        nombrecliente = new javax.swing.JTextField();
        BotonPrimero = new javax.swing.JButton();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonUltimo = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonSuprimir = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonLineasPedido = new javax.swing.JButton();
        BotonBuscaClientes = new javax.swing.JButton();
        LabelBorrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION : EJERCICIO2 (BASES)");

        LabelTITULO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTITULO.setText("GRABACION DE PEDIDOS");

        LabelNUM_PEDIDO.setText("NUMERO PEDIDO");

        LabelFECHA.setText("FECHA");

        LabelCLIENTE.setText("CLIENTE");

        num_pedido.setEditable(false);

        BotonPrimero.setText("Primero");
        BotonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrimeroActionPerformed(evt);
            }
        });

        BotonAnterior.setText("Anterior");
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });

        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        BotonUltimo.setText("Ultimo");
        BotonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUltimoActionPerformed(evt);
            }
        });

        BotonNuevo.setForeground(new java.awt.Color(0, 153, 204));
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonModificar.setForeground(new java.awt.Color(255, 153, 51));
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonSuprimir.setForeground(new java.awt.Color(255, 0, 51));
        BotonSuprimir.setText("Suprimir");
        BotonSuprimir.setToolTipText("");
        BotonSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSuprimirActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(0, 204, 102));
        BotonAceptar.setText("√");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        BotonCancelar.setText("X");
        BotonCancelar.setMaximumSize(new java.awt.Dimension(49, 37));
        BotonCancelar.setMinimumSize(new java.awt.Dimension(49, 37));
        BotonCancelar.setPreferredSize(new java.awt.Dimension(49, 37));
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonLineasPedido.setText("Lineas Pedido");
        BotonLineasPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLineasPedidoActionPerformed(evt);
            }
        });

        BotonBuscaClientes.setForeground(new java.awt.Color(255, 0, 51));
        BotonBuscaClientes.setText("?");
        BotonBuscaClientes.setToolTipText("");
        BotonBuscaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscaClientesActionPerformed(evt);
            }
        });

        LabelBorrar.setForeground(new java.awt.Color(204, 0, 51));
        LabelBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBorrar.setText("Borrar Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonPrimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonUltimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSuprimir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonBuscaClientes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cliente))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LabelFECHA, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(LabelNUM_PEDIDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(num_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonLineasPedido)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(LabelTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonSalir)
                .addGap(7, 7, 7)
                .addComponent(LabelTITULO)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNUM_PEDIDO)
                    .addComponent(num_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFECHA)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCLIENTE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBuscaClientes)
                    .addComponent(BotonLineasPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(LabelBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPrimero)
                    .addComponent(BotonAnterior)
                    .addComponent(BotonSiguiente)
                    .addComponent(BotonUltimo)
                    .addComponent(BotonAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonModificar)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSuprimir))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// #############################################################################
// ##### METODO BOTONES (Primero, Ultimo, Anterior, Siguiente)             #####
// #############################################################################
    private void BotonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrimeroActionPerformed
    try {
        r.first();
        sacaRegistro();
    } catch (SQLException ex) {
        Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonPrimeroActionPerformed
    private void BotonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUltimoActionPerformed
    try {
        r.last();
        sacaRegistro();
    } catch (SQLException ex) {
        Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonUltimoActionPerformed
    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
    try {
        if (r.previous()){
        sacaRegistro();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }        
    }//GEN-LAST:event_BotonAnteriorActionPerformed
    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
    try {
        if (r.next()){
        sacaRegistro();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonSiguienteActionPerformed
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
    // Finaliza la ventana del mantenimiento
        this.dispose();                             
    /* Tambien sirve para finalizar la ventana
        this.setVisible(false);
    */
    }//GEN-LAST:event_BotonSalirActionPerformed
// #############################################################################
// ##### METODO BOTONES (Nuevo, Modificar, Borrar)                         #####
// #############################################################################
    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
    // NUEVO REGISTRO
        muestraBotones(false, false, false, false, false, false, false, true, true, true, false);
        limpiarPantalla();
        activarCampos(true, true, true, false);
        // Activar el foco
        num_pedido.requestFocus();
        // Variable control boton Aceptar
        esNuevo = 'N';    
    }//GEN-LAST:event_BotonNuevoActionPerformed
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
    // MODIFICA REGISTRO
        muestraBotones(false, false, false, false, false, false, false, true, true, true, false);
        activarCampos(false, true, true, false);
        
        // Activar el foco
            fecha.requestFocus();
                  
        // Variable control boton Modificar
            esNuevo = 'M';  
    }//GEN-LAST:event_BotonModificarActionPerformed
// #############################################################################
// ##### METODO BOTONES (Aceptar, Cancelar)                                #####
// #############################################################################
    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
    // ACEPTAR LOS DATOS DE LA PANTALLA (ALTA, MODIFICA, BAJA)
    try {
        String vNum_pedido, vFecha, vCliente;
        vNum_pedido = num_pedido.getText();
        vFecha = fecha.getText();
        vCliente = cliente.getText();
        // conectar la base de datos
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, user, pass);
        Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
        // Generar la instruccion de borrar
        if (esNuevo == 'B'){
        String BorraRegistro = "DELETE FROM pedidos WHERE NUM_PEDIDO='" + vNum_pedido + "'";
        int controlBorra = s.executeUpdate(BorraRegistro);
        /* r.refreshRow(); */
        }
        // Generar la instruccion de actualizar        
        if (esNuevo == 'M'){
        String ActualizaRegistro = "update pedidos set FECHA='" + vFecha + "', CLIENTE='" + vCliente + "' WHERE NUM_PEDIDO='" + vNum_pedido +"'";
        int controlActualiza = s.executeUpdate(ActualizaRegistro);
        r.refreshRow();
        }
        // Generar la instruccion de Nuevo Registro
        if (esNuevo == 'N'){
        String NuevoRegistro = "insert into pedidos values ('" + vNum_pedido + "','" + vFecha + "','" + vCliente + "')";
        int controlNuevo = s.executeUpdate(NuevoRegistro);
        /* r.refreshRow(); */
        }
        // Volver a refrescar la base de datos
        if (esNuevo != 'M'){
        String query = "select pedidos.*, clientes.NIF from pedidos LEFT JOIN clientes on CLIENTE = NIF";
            r = s.executeQuery(query);
            r.first();
            sacaRegistro();
            }
    } catch (SQLException ex) {
        Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }
        // Volver activar los botones
        muestraBotones(true, true, true, true, true, true, true, false, false, false, true);
        activarCampos(false, false, false, false);
        LabelBorrar.setVisible(false); 
            
        // Variable control boton
            esNuevo = ' ';        
    }//GEN-LAST:event_BotonAceptarActionPerformed
    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    //CANCELAR LOS CAMBIOS DE LA PANTALLA (ALTA, MODIFICA, BAJA)
        muestraBotones(true, true, true, true, true, true, true, false, false, false, true);
        try {
            r.first();
            sacaRegistro();
        } catch (SQLException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        activarCampos(false, false, false, false);
        LabelBorrar.setVisible(false); 
            
        // Variable control boton
            esNuevo = ' '; 
    }//GEN-LAST:event_BotonCancelarActionPerformed
    private void BotonSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSuprimirActionPerformed
    // BORRA REGISTRO
        muestraBotones(false, false, false, false, false, false, false, true, true, false, false);
        activarCampos(false, false, false, false);
        LabelBorrar.setVisible(true); 
            
        // Variable control boton Suprimir
            esNuevo = 'B';
    }//GEN-LAST:event_BotonSuprimirActionPerformed
// #############################################################################
// ##### METODO LLAMADA AL PROGRAMA DE LINEAS DE PEDIDOS                   #####
// #############################################################################
    private void BotonLineasPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLineasPedidoActionPerformed
     PedidosLineas lin = null;
        try {
            lin = new PedidosLineas();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         lin.setVisible(true);
    }//GEN-LAST:event_BotonLineasPedidoActionPerformed
// #############################################################################
// ##### METODO LLAMADA A LA CONSULTA CLIENTE                              #####
// #############################################################################
    private void BotonBuscaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscaClientesActionPerformed
        ClientesConsulta clicon = null;
        clicon = new ClientesConsulta();
        clicon.setVisible(true);
    }//GEN-LAST:event_BotonBuscaClientesActionPerformed
// #############################################################################
// ##### METODO PARA SACAR EL REGISTRO                                     #####
// #############################################################################
    public void sacaRegistro(){
        try {
        num_pedido.setText(r.getString("NUM_PEDIDO"));
        fecha.setText(r.getString("FECHA"));
        cliente.setText(r.getString("CLIENTE"));
        nombrecliente.setText(r.getString("NOMBRE"));
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// #############################################################################
// ##### METODO MOSTRAR U OCULTAR BOTONES DE LA PANTALLA                   #####
// #############################################################################
    public void muestraBotones(boolean Pr, boolean An, boolean Si, boolean Ul, boolean Nu, boolean Mo, boolean Su, boolean Ac, boolean Ca, boolean Bu, boolean Li){
        this.BotonPrimero.setVisible(Pr);
        this.BotonAnterior.setVisible(An);
        this.BotonSiguiente.setVisible(Si);
        this.BotonUltimo.setVisible(Ul);
        this.BotonNuevo.setVisible(Nu);
        this.BotonModificar.setVisible(Mo);
        this.BotonSuprimir.setVisible(Su);
        this.BotonLineasPedido.setVisible(Li);

        this.BotonAceptar.setVisible(Ac);
        this.BotonCancelar.setVisible(Ca);
        this.BotonBuscaClientes.setVisible(Bu);
    }
// #############################################################################
// ##### METODO ACTIVAR O DESACTIVAR CAMPOS EN PANTALLA                   #####
// #############################################################################
    public void activarCampos(boolean C1, boolean C2, boolean C3, boolean C4){
        num_pedido.setEditable(C1);
        fecha.setEditable(C2);
        cliente.setEditable(C3);
        nombrecliente.setEditable(C4);
    }
// #############################################################################
// ##### METODO LIMPIAR LOS CAMPOS EN LA PANTALLA                          #####
// #############################################################################
    public void limpiarPantalla(){
        num_pedido.setText(""); 
        fecha.setText(""); 
        cliente.setText("");
        nombrecliente.setText("");
    }
// #############################################################################
// ##### METODO MAIN                                                       #####
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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pedidos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonBuscaClientes;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonLineasPedido;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonPrimero;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonSuprimir;
    private javax.swing.JButton BotonUltimo;
    private javax.swing.JLabel LabelBorrar;
    private javax.swing.JLabel LabelCLIENTE;
    private javax.swing.JLabel LabelFECHA;
    private javax.swing.JLabel LabelNUM_PEDIDO;
    private javax.swing.JLabel LabelTITULO;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField nombrecliente;
    private javax.swing.JTextField num_pedido;
    // End of variables declaration//GEN-END:variables
}
