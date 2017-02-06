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
 * Programa Grabacion Lineas de Pedidos
 * @version Version : 1.0 31 de Enero de 2017
 * @author Jose Rafael Ibañez Zarzo
 * @see <a> http://teceinval.com </a>
 */
public class PedidosLineas extends javax.swing.JFrame {
/**
 * Programa Grabacion Lineas de Pedidos
 */
static public ResultSet r;                            // Datos Lineas Pedidos
/**
 * Datos Ulr. Linea Pedido
 */
static public ResultSet r1;                           // Datos Ult. Linea Pedido
/**
 * Datos Cabecera Pedidos
 */
static public ResultSet r2;                           // Datos Cabecera Pedidos    
/**
 * Datos de Clientes
 */
static public ResultSet r3;                           // Datos Clientes
/**
 * Datos de Articulos
 */
static public ResultSet r4;                           // Datos Articulos    
static public Connection conexion;

char esNuevo = ' ';

    public PedidosLineas() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
    // Conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url,user, pass);
    // Prepara la conexion de la tabla lineas de pedidos
        Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String qry = "select * from lineas_pedido order by NUM_PEDIDO, NUM_LINEA";
        r = s.executeQuery(qry);
    // Saca el primer registro de lineas Pedidos
        r.first();
        sacaRegistro();
        activarCampos(false, false, false, false, false, false, false, false, false, false, false);        
        muestraBotones(true, true, true, true, true, true, true, false, false, false);
    // Ocultar campos
        LabelBorrar.setVisible(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTITULO = new javax.swing.JLabel();
        LabelNUM_PEDIDO = new javax.swing.JLabel();
        LabelNUM_LINEA = new javax.swing.JLabel();
        LabelARTICULO = new javax.swing.JLabel();
        LabelCANTIDAD = new javax.swing.JLabel();
        LabelPRECIO = new javax.swing.JLabel();
        LabelDESCUENTO = new javax.swing.JLabel();
        LabelIMPORTE = new javax.swing.JLabel();
        num_pedido = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        nif = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        num_linea = new javax.swing.JTextField();
        articulo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        descuento = new javax.swing.JTextField();
        importe = new javax.swing.JTextField();
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
        BotonBuscaArticulos = new javax.swing.JButton();
        LabelBorrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION : EJERCICIO2 (BASES)");

        LabelTITULO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTITULO.setText("GRABACION DE DETALLE PEDIDOS");

        LabelNUM_PEDIDO.setText("NUMERO PEDIDO");

        LabelNUM_LINEA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNUM_LINEA.setText("-LINEA-");

        LabelARTICULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelARTICULO.setText("-----------------------ARTICULO----------------------");

        LabelCANTIDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCANTIDAD.setText("-CANTIDAD-");

        LabelPRECIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPRECIO.setText("-PRECIO-");

        LabelDESCUENTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDESCUENTO.setText("-DTO-");

        LabelIMPORTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIMPORTE.setText("--IMPORTE--");

        num_pedido.setEditable(false);
        num_pedido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        num_pedido.setFocusable(false);

        fecha.setEditable(false);
        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setFocusable(false);

        nif.setEditable(false);
        nif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nif.setFocusable(false);

        nombre.setEditable(false);
        nombre.setFocusable(false);

        num_linea.setEditable(false);
        num_linea.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        num_linea.setFocusable(false);

        articulo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        descripcion.setEditable(false);
        descripcion.setFocusable(false);

        cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        precio.setEditable(false);
        precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precio.setFocusable(false);

        descuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        importe.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        BotonBuscaArticulos.setForeground(new java.awt.Color(255, 0, 51));
        BotonBuscaArticulos.setText("?");
        BotonBuscaArticulos.setToolTipText("");
        BotonBuscaArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscaArticulosActionPerformed(evt);
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
                .addGap(85, 85, 85)
                .addComponent(LabelTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNUM_PEDIDO)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BotonPrimero)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonAnterior)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonSiguiente)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonUltimo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonModificar)
                                        .addGap(33, 33, 33)
                                        .addComponent(BotonSuprimir)
                                        .addGap(13, 13, 13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelNUM_LINEA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num_linea, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelARTICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonBuscaArticulos)
                                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelCANTIDAD, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(cantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPRECIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelDESCUENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LabelIMPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importe)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonSalir)
                .addGap(7, 7, 7)
                .addComponent(LabelTITULO)
                .addGap(18, 18, 18)
                .addComponent(LabelNUM_PEDIDO)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LabelNUM_LINEA)
                                        .addComponent(LabelARTICULO))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num_linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(LabelPRECIO)
                                .addComponent(precio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelCANTIDAD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelDESCUENTO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelIMPORTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBuscaArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
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
                    .addComponent(BotonSuprimir)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// #############################################################################
// ##### METODO BOTONES (Primero, Ultimo, Anterior, Siguiente)             #####
// #############################################################################
    private void BotonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrimeroActionPerformed
    try {
        r.first();
        sacaRegistro();
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonPrimeroActionPerformed
    private void BotonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUltimoActionPerformed
    try {
        r.last();
        sacaRegistro();
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonUltimoActionPerformed
    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
    try {
        if (r.previous()){
        sacaRegistro();
        }
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
    }        
    }//GEN-LAST:event_BotonAnteriorActionPerformed
    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
    try {
        if (r.next()){
        sacaRegistro();
        }
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
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
    try {
        muestraBotones(false, false, false, false, false, false, false, true, true, true);
        num_linea.setText(datosLineas(r.getInt("NUM_PEDIDO")));                 // Ultima Linea Pedido
        limpiarPantalla();
        activarCampos(false, false, false, false, true, true, false, true, false, true, true);
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Activar el foco
        // num_pedido.requestFocus();
        // num_linea.requestFocus();
        articulo.requestFocus();
    // Variable control boton Aceptar
        esNuevo = 'N';    
    }//GEN-LAST:event_BotonNuevoActionPerformed
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
    // MODIFICA REGISTRO
        muestraBotones(false, false, false, false, false, false, false, true, true, true);
        activarCampos(false, false, false, false, false, true, false, true, false, true, true);
        
    // Activar el foco
        // num_pedido.requestFocus();
        // num_linea.requestFocus();
        articulo.requestFocus();
                  
    // Variable control boton Modificar
            esNuevo = 'M';  
    }//GEN-LAST:event_BotonModificarActionPerformed
// #############################################################################
// ##### METODO BOTONES (Aceptar, Cancelar)                                #####
// #############################################################################
    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
    try {
        String vNum_pedido, vNum_linea, vArticulo, vCantidad, vDescuento, vImporte;
        vNum_pedido = num_pedido.getText();
        vNum_linea = num_linea.getText();
        vArticulo = articulo.getText();
        vCantidad = cantidad.getText();
        vDescuento = descuento.getText();
        vImporte = importe.getText();
        
    // conectar la base de datos
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, user, pass);
        Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
    // Generar la instruccion de borrar
        if (esNuevo == 'B'){
        String BorraRegistro = "DELETE FROM lineas_pedido "
                + "WHERE NUM_PEDIDO='" + vNum_pedido + "' AND NUM_LINEA='" + vNum_linea + "'";
        int controlBorra = s.executeUpdate(BorraRegistro);
        /* r.refreshRow(); */
        }
    // Generar la instruccion de actualizar        
        if (esNuevo == 'M'){
        String ActualizaRegistro = "update lineas_pedido set "
                + "ARTICULO='" + vArticulo + "', CANTIDAD='" + vCantidad + "'"
                + ", DESCUENTO='" + vDescuento + "', IMPORTE='" + vImporte + "'"
                + " WHERE NUM_PEDIDO='" + vNum_pedido +"' AND NUM_LINEA='" + vNum_linea + "'";
        int controlActualiza = s.executeUpdate(ActualizaRegistro);
        r.refreshRow();
        }
    // Generar la instruccion de Nuevo Registro
        if (esNuevo == 'N'){
        String NuevoRegistro = "insert into lineas_pedido values "
                + "('" + vNum_linea + "','" + vNum_pedido + "','" + vArticulo + "',"
                + "'" + vCantidad + "','" + vDescuento + "','" + vImporte + "')";
        int controlNuevo = s.executeUpdate(NuevoRegistro);
        /* r.refreshRow(); */
        }
    // Volver a refrescar la base de datos
        if (esNuevo != 'M'){
        String qry = "select * from lineas_pedido order by NUM_PEDIDO, NUM_LINEA";
            r = s.executeQuery(qry);
            r.first();
            sacaRegistro();
            }
    } catch (SQLException ex) {
        Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Volver activar los botones
        muestraBotones(true, true, true, true, true, true, true, false, false, false);
        activarCampos(false, false, false, false, false, false, false, false, false, false, false);
        LabelBorrar.setVisible(false); 
            
    // Variable control boton
            esNuevo = ' ';        
    }//GEN-LAST:event_BotonAceptarActionPerformed
    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    //CANCELAR CAMBIOS
        muestraBotones(true, true, true, true, true, true, true, false, false, false);
        try {
            r.first();
            sacaRegistro();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
        activarCampos(false, false, false, false, false, false, false, false, false, false, false);
        LabelBorrar.setVisible(false); 
            
    // Variable control boton
            esNuevo = ' '; 
    }//GEN-LAST:event_BotonCancelarActionPerformed
    private void BotonSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSuprimirActionPerformed
    // BORRA REGISTRO
        muestraBotones(false, false, false, false, false, false, false, true, true, false);
        activarCampos(false, false, false, false, false, false, false, false, false, false, false);
        LabelBorrar.setVisible(true); 
            
    // Variable control boton Suprimir
            esNuevo = 'B';
    }//GEN-LAST:event_BotonSuprimirActionPerformed
// #############################################################################
// ##### METODO LLAMADA A LA CONSULTA ARTICULOS                              #####
// #############################################################################
    private void BotonBuscaArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscaArticulosActionPerformed
     ArticulosConsulta artcon = null;
        artcon = new ArticulosConsulta();
        artcon.setVisible(true);
    }//GEN-LAST:event_BotonBuscaArticulosActionPerformed
/// #############################################################################
// ##### METODO PARA SACAR EL REGISTRO                                     #####
// #############################################################################
    public void sacaRegistro(){
        try {
        num_pedido.setText(r.getString("NUM_PEDIDO"));
            datosPedido(r.getInt("NUM_PEDIDO"));                                // Datos Cabecera Pedido
        fecha.setText(r2.getString("FECHA")); 
            datosCliente(r2.getString("CLIENTE"));                              // Datos Cliente
        nif.setText(r2.getString("CLIENTE"));
        nombre.setText(r3.getString("NOMBRE"));

        num_linea.setText(r.getString("NUM_LINEA"));
        articulo.setText(r.getString("ARTICULO"));
            datosArticulo(r.getString("ARTICULO"));                             // Datos Articulo   
        descripcion.setText(r4.getString("ARTICULO"));
        cantidad.setText(r.getString("CANTIDAD"));
        precio.setText(r4.getString("PRECIO_VENTA"));
        descuento.setText(r.getString("DESCUENTO"));
        importe.setText(r.getString("IMPORTE"));
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// #############################################################################
// ##### PARA RECUPERAR ULTIMA LINEA DEL PEDIDO                            #####
// #############################################################################
    public String datosLineas(int codigo){
    // String siguiente = "";
    int ultimo = 0;
    try {
        Statement s1 = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String qry1= "select * from lineas_pedido where NUM_PEDIDO=" + codigo;
        r1 = s1.executeQuery(qry1);
        r1.last();
        ultimo = Integer.parseInt(r1.getString("NUM_LINEA")) + 1;
    } catch (SQLException ex) {
            Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    // siguiente = ("" + ultimo);
    return ("" + ultimo);
    }    
// #############################################################################
// ##### PARA RECUPERAR DATOS DEL PEDIDO                                   #####
// #############################################################################
    public void datosPedido(int codigo){
    try {
        Statement s2 = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String qry2= "select * from pedidos where NUM_PEDIDO=" + codigo;
        r2 = s2.executeQuery(qry2);
        r2.first();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
// #############################################################################
// ##### METODO PARA RECUPERAR DATOS DEL CLIENTE                           #####
// #############################################################################
    public void datosCliente(String codigo){
    try {
        Statement s3 = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String qry3= "select * from clientes where NIF='" + codigo +"'";
        r3 = s3.executeQuery(qry3);
        r3.first();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
// #############################################################################
// ##### METODO PARA RECUPERAR DATOS DEL ARTICULO                          #####
// #############################################################################
    public void datosArticulo(String codigo){
    try {
        Statement s4 = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String qry4= "select * from articulos where COD_ARTICULO='" + codigo +"'";
        r4 = s4.executeQuery(qry4);
        r4.first();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
// #############################################################################
// ##### METODO MOSTRAR U OCULTAR BOTONES DE LA PANTALLA                   #####
// #############################################################################
    public void muestraBotones(boolean Pr, boolean An, boolean Si, boolean Ul, boolean Nu, boolean Mo, boolean Su, boolean Ac, boolean Ca, boolean Bu){
        this.BotonPrimero.setVisible(Pr);
        this.BotonAnterior.setVisible(An);
        this.BotonSiguiente.setVisible(Si);
        this.BotonUltimo.setVisible(Ul);
        this.BotonNuevo.setVisible(Nu);
        this.BotonModificar.setVisible(Mo);
        this.BotonSuprimir.setVisible(Su);

        this.BotonAceptar.setVisible(Ac);
        this.BotonCancelar.setVisible(Ca);
        this.BotonBuscaArticulos.setVisible(Bu);
    }
// #############################################################################
// ##### METODO ACTIVAR O DESACTIVAR CAMPOS EN PANTALLA                   #####
// #############################################################################
    public void activarCampos(boolean C1, boolean C2, boolean C3, boolean C4, boolean L1, boolean L2, boolean L3, boolean L4, boolean L5, boolean L6, boolean L7){
        num_pedido.setEditable(C1);
        fecha.setEditable(C2);
        nif.setEditable(C3);
        nombre.setEditable(C4);
        num_linea.setEditable(L1);
        articulo.setEditable(L2);
        descripcion.setEditable(L3);
        cantidad.setEditable(L4);
        precio.setEditable(L5);
        descuento.setEditable(L6);
        importe.setEditable(L7);
    }
// #############################################################################
// ##### METODO LIMPIAR LOS CAMPOS EN LA PANTALLA                          #####
// #############################################################################
    public void limpiarPantalla(){
        //num_pedido.setText("");
        //fecha.setText("");
        //nif.setText("");
        //nombre.setText("");
        //num_linea.setText("");
        articulo.setText(""); 
        descripcion.setText("");
        cantidad.setText("");
        precio.setText("");
        descuento.setText("");
        importe.setText("");
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
            java.util.logging.Logger.getLogger(PedidosLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PedidosLineas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PedidosLineas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonBuscaArticulos;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonPrimero;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonSuprimir;
    private javax.swing.JButton BotonUltimo;
    private javax.swing.JLabel LabelARTICULO;
    private javax.swing.JLabel LabelBorrar;
    private javax.swing.JLabel LabelCANTIDAD;
    private javax.swing.JLabel LabelDESCUENTO;
    private javax.swing.JLabel LabelIMPORTE;
    private javax.swing.JLabel LabelNUM_LINEA;
    private javax.swing.JLabel LabelNUM_PEDIDO;
    private javax.swing.JLabel LabelPRECIO;
    private javax.swing.JLabel LabelTITULO;
    private javax.swing.JTextField articulo;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField importe;
    private javax.swing.JTextField nif;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField num_linea;
    private javax.swing.JTextField num_pedido;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
