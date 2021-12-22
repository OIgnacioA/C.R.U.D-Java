
package crud_entidades.EntidadesGUI;
import crud_entidades.EntidadesGUI.JF_Impresion;
import crud_entidades.EntidadesDAL.conexion;
import crud_entidades.EntidadesBL.EntidadesBL;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrM_Entidades2 extends javax.swing.JFrame {
   String Dattos = "";  
   EntidadesBL Formulario = new EntidadesBL();  
  
   String Path = ""; 
   String Dir = "";
   DefaultTableModel modelo; 
   String Busqueda = "SELECT * FROM Entidades_BD"; 
   Integer Cant = 0; 
   
    public FrM_Entidades2() {
        
         Dattos = "jdbc:sqlite:C:/"; // si no se coloca esta "alternativa" nisiquiera abre. Ya despues buscará la que se ponga por pantalla del formulario.
       
    
        initComponents();
        
        String[] titulos= {"ID", "Entidad","Decreto","Localidad", "Categoria_L15192", "Ultima_Actualizacion", "InscripcionDGPJ2", "Telefono"};
        
        modelo = new  DefaultTableModel(null, titulos);
        
        jT_Tabla.setModel(modelo); // NOTA 1 :se le asignan al titulo de la tabla los nombres que se agregaron en "titulos"
        
        mostrarDatos(Busqueda, Dattos);
        
        
         JB_Borrar.setEnabled(false);
         JB_Agregar.setEnabled(false);
         JB_Editar.setEnabled(false);
       
         JCombo_Categorias.setEnabled(false);
          jPanel3.setBackground(Color.GRAY);
         setLocationRelativeTo(null);
         
        
    
         setLocationRelativeTo(null);
         setResizable(false);
         txt_ID.setText("0");   
         txt_ID.setEditable(false);     
          setTitle("Direccion de Entidades_C.R.U.D V3.2  By ÑAky.Java 2021");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Categoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Decreto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JB_Agregar = new javax.swing.JButton();
        JB_Borrar = new javax.swing.JButton();
        JB_Editar = new javax.swing.JButton();
        JCombo_Categorias = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Locacion = new javax.swing.JTextField();
        txt_Ult_Actualizacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_InscripcionDGPJ2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        Edicion = new javax.swing.JToggleButton();
        Toogle_2 = new javax.swing.JToggleButton();
        jToogle_1 = new javax.swing.JToggleButton();
        Toogle_5 = new javax.swing.JToggleButton();
        Toogle_3 = new javax.swing.JToggleButton();
        JB_FImpresion = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        JB_Borrar_campos_ = new javax.swing.JButton();
        txt_RegistroMunicipal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JText_Busqueda = new javax.swing.JTextField();
        JText_Cantidad = new javax.swing.JTextField();
        JCombo_Filtro = new javax.swing.JComboBox<>();
        JB_Impresion2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JB_Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jB_Formulario3_ = new javax.swing.JButton();
        Seleccion_Ar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Nombre de Entidad");

        jLabel7.setText("  N Decreto M");

        jLabel9.setText("Categoria");

        txt_Nombre.setText("x");
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Decreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DecretoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(51, 255, 51));

        JB_Agregar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        JB_Agregar.setText("Agregar Nueva");
        JB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarActionPerformed(evt);
            }
        });

        JB_Borrar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        JB_Borrar.setText("Borrar Entidad");
        JB_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BorrarActionPerformed(evt);
            }
        });

        JB_Editar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        JB_Editar.setText("Editar");
        JB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EditarActionPerformed(evt);
            }
        });

        JCombo_Categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5", "Categoria 6", "Categoria 7" }));
        JCombo_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_CategoriasActionPerformed(evt);
            }
        });

        jLabel12.setText("Seleccionar Categoria (edicion)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(JB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JCombo_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(JB_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCombo_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        jLabel10.setText("    LocaLidad");

        txt_Locacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LocacionActionPerformed(evt);
            }
        });

        txt_Ult_Actualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ult_ActualizacionActionPerformed(evt);
            }
        });

        jLabel14.setText("Inscripcion_DPPJ");

        txt_InscripcionDGPJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_InscripcionDGPJ2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Telefono");

        Edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionActionPerformed(evt);
            }
        });

        jToogle_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToogle_1ActionPerformed(evt);
            }
        });

        JB_FImpresion.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        JB_FImpresion.setText("Formulario Impresion");
        JB_FImpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_FImpresionActionPerformed(evt);
            }
        });

        jLabel13.setText("Ultima_Actualizacion");

        JB_Borrar_campos_.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        JB_Borrar_campos_.setText("Limpiar Campos");
        JB_Borrar_campos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Borrar_campos_ActionPerformed(evt);
            }
        });

        jLabel18.setText("Registro Municipal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Ult_Actualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txt_ID))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Decreto, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txt_InscripcionDGPJ2))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Locacion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_RegistroMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(JB_Borrar_campos_)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jToogle_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Toogle_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Toogle_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Toogle_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(JB_FImpresion))))))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_FImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Toogle_2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToogle_1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Toogle_3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Toogle_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Decreto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Locacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_InscripcionDGPJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Ult_Actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_RegistroMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_Borrar_campos_))
        );

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese Palabra");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Filtro");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Total");

        JText_Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_BusquedaActionPerformed(evt);
            }
        });

        JCombo_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Entidad ", "Objeto_social", "Localidad", "Domicilio", "N_Registro_Municipal", "Categoria_L15192", " " }));
        JCombo_Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_FiltroActionPerformed(evt);
            }
        });

        JB_Impresion2.setEnabled(false);
        JB_Impresion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Impresion2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("Buscador Por Palabras:");

        JB_Buscar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        JB_Buscar.setText("Buscar/ Refrescar");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        jB_Formulario3_.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jB_Formulario3_.setText("Formulario de Usuario");
        jB_Formulario3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Formulario3_ActionPerformed(evt);
            }
        });

        Seleccion_Ar.setText("Seleccion de DB");
        Seleccion_Ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion_ArActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(JB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jB_Formulario3_)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Impresion2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JCombo_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JText_Busqueda))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(205, 205, 205)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Seleccion_Ar))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(Seleccion_Ar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCombo_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(JText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(JText_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Impresion2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Formulario3_)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16)))
                .addContainerGap())
        );

        jT_Tabla.setBackground(new java.awt.Color(204, 204, 204));
        jT_Tabla.setBorder(new javax.swing.border.MatteBorder(null));
        jT_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jT_Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Tabla);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setText("Edicion:");

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setText("Tabla de Datos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void Limpiar(){
         
        //txt_ID.setText("");
       // txt_Nombre.setText("");
       
       
        txt_Categoria.setText(""); 
        txt_Decreto.setText("");
        txt_Locacion.setText("");
        txt_Categoria.setText("");
        txt_Telefono.setText("");
        txt_Ult_Actualizacion.setText("");
        txt_InscripcionDGPJ2.setText("");
       
        txt_ID.setText("0");
        txt_RegistroMunicipal.setText("0");
    
         Edicion.setSelected(false);
         jToogle_1.setSelected(false);
         Toogle_2.setSelected(false);
         Toogle_3.setSelected(false);
         Toogle_5.setSelected(false); 
         
         JB_Borrar.setEnabled(false); 
         JB_Borrar.setBackground(Color.GRAY);
         JB_Agregar.setEnabled(false);
         JB_Editar.setEnabled(false);
       
         JCombo_Categorias.setEnabled(false);
         jPanel3.setBackground(Color.GRAY);
    
 
    }
    
    
    
    
    
     // Nota 2 : esto lleva los datos desde la tabla en pantalla a los cuadros de texto. 
    
    private void jT_TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_TablaMouseClicked
        
       Limpiar();
       
         if(evt.getClickCount()== 1){
        
             JTable receptor = (JTable)evt.getSource();  
        
             txt_ID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
             txt_Nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
             txt_Decreto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
             txt_Locacion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
             txt_Categoria.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
             txt_Ult_Actualizacion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
             txt_InscripcionDGPJ2.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),6).toString());
             txt_Telefono.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),7).toString());

             
        }

         
         /*------Desde el Try:  Tomar datos del ID (en este caso) (y resto de datata de la BD para
                el formulario de impresion)de la Base de datos)--------*/
         
         

         
      try {
          
            Dattos = "jdbc:sqlite:" + Path; //JT_BaseDeDatos.getText();
          
            conexion objConexion1 = new conexion(Dattos);
        
             //String DataSQL = txt_Nombre.getText(); 
             
             
             int DataSQL = Integer.parseInt(txt_ID.getText()); 
             
            
       
             ResultSet Resultado2 = objConexion1.consultarRegistros("SELECT * FROM Entidades_BD where Id = " + "'" +  DataSQL + "'");  /*  LIKE "+"'" + "%"+ DataSQL + "%" + "'"); */
        
     
               //txt_ID.setText(Resultado2.getString("id")); // aqui fue la magia de traer un dato solo desde la base de datos gracias al resulset :)

               Formulario.setID(Resultado2.getInt("Id"));
               
               Formulario.setDomicilio(Resultado2.getString("Domicilio"));  
               Formulario.setActualizada(Resultado2.getString("Actualizadas"));    
               Formulario.setAnio_de_actualizacion(Resultado2.getString("Anio_de_Actualizacion"));
               Formulario.setArchivados(Resultado2.getString("Archivado"));
               Formulario.setAyuda_desarrollo_social_al_(Resultado2.getString("ayuda_desarrollo_social_al_31_12_2015"));
               Formulario.setBajas(Resultado2.getString("Bajas"));
               Formulario.setCP(Resultado2.getString("CP"));
               Formulario.setCertificados_retirados(Resultado2.getString("Certificados_Retirados"));
               Formulario.setCierre_de_ejercicio_segun(Resultado2.getString("Cierre_de_Ejercicio_Segun_Estatuto"));
               Formulario.setContacto(Resultado2.getString("Contacto"));
               Formulario.setCuenta_con_bienes(Resultado2.getString("Cuenta_con_Bienes"));
               Formulario.setDesactualizada(Resultado2.getString("Desactualizadas"));
               Formulario.setE_mail(Resultado2.getString("e_mail"));
               Formulario.setExencion(Resultado2.getString("Exencion"));
               Formulario.setFecha_de_fundacion(Resultado2.getString("Fecha_de_fundacion"));
               Formulario.setObjeto_Social(Resultado2.getString("Objeto_Social"));
               Formulario.setPagina_Web(Resultado2.getString("Pagina_Web"));
               Formulario.setSeccionales(Resultado2.getString("Seccionales"));
               Formulario.setSuspedidas(Resultado2.getString("Suspendidas"));
               Formulario.setNumero_de_Expediente(Resultado2.getString("Numero_de_Expediente"));
               Formulario.setRegistro_Municipal(Resultado2.getString("N_Registro_Municipal"));
               Formulario.setCod(Resultado2.getString("COD"));
               Formulario.setFecha_Inscripcion_DGPJ(Resultado2.getString("Fecha_Inscripcion_DGPJ"));
               
              //--Textfields de Formulario Principal: 
              
               Formulario.setNombre(Resultado2.getString("Entidad"));
               Formulario.setN_Decreto_M (Resultado2.getString("Decreto"));
               Formulario.setCategoria (Resultado2.getString("Categoria_L15192")); 
               Formulario.setLocacion(Resultado2.getString("Localidad"));
               Formulario.setUltima_actualizacion(Resultado2.getString("Ultima_Actualizacion"));
               Formulario.setInscripcionDGPJ2(Resultado2.getString("InscripcionDGPJ2"));
               Formulario.setTelefono(Resultado2.getString("Telefono"));
             
               
               txt_RegistroMunicipal.setText(String.valueOf(Formulario.getRegistro_Municipal()));
             
         
             objConexion1.Respuesta.close();
             
         } catch (Exception e) {
           
             System.out.println("lachaconde mi drema" + e ); 
        
        }
         
    
         //consultarRegistros
         //------Tomar datos del ID (en este caso) de la Base de Datos---------
        
         
         
         
    }//GEN-LAST:event_jT_TablaMouseClicked

    
    
    private void txt_LocacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LocacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LocacionActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void JCombo_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_CategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCombo_CategoriasActionPerformed

    private void JB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EditarActionPerformed

    
        
       Dattos = "jdbc:sqlite:" + Path; //JT_BaseDeDatos.getText();
        
        conexion objConexion = new conexion(Dattos);
       
        EntidadesBL O_Entidades = recuperarDatosGUI();

       
        String srtSentenciaInsert = String.format("UPDATE Entidades_BD SET Entidad = '%s', Decreto = '%s', "
            + "  Localidad = '%s', Categoria_L15192 = '%s', Ultima_Actualizacion = '%s', InscripcionDGPJ2= '%s', Telefono = '%s', N_Registro_Municipal = '%s'  WHERE id= %d", O_Entidades.getNombre(), O_Entidades.getN_Decreto_M(), O_Entidades.getLocacion(), O_Entidades.getCategoria(), O_Entidades.getUltima_actualizacion(), O_Entidades.getInscripcionDGPJ2(), O_Entidades.getTelefono(), O_Entidades.getRegistro_Municipal(), O_Entidades.getID());

        objConexion.ejecutarSentenciaSQL(srtSentenciaInsert);

        
        this.mostrarDatos(Busqueda, Dattos);
        
        
       Limpiar();
       
        
       
       
    }//GEN-LAST:event_JB_EditarActionPerformed

     // Nota 3 : Borrar entidad

    private void JB_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BorrarActionPerformed

        Dattos = "jdbc:sqlite:" + Path;   // JT_BaseDeDatos.getText();
        
        
        conexion objConexion = new conexion(Dattos);

        EntidadesBL O_Entidades = recuperarDatosGUI();

        String srtSentenciaInsert = String.format("DELETE FROM Entidades_BD where id= %d", O_Entidades.getID());

        objConexion.ejecutarSentenciaSQL(srtSentenciaInsert);
        
        this.mostrarDatos(Busqueda, Dattos);
        
         Limpiar();
         
         txt_Nombre.setText("x");
        
    }//GEN-LAST:event_JB_BorrarActionPerformed

    
    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
        
        Dattos = "jdbc:sqlite:" + Path; //JT_BaseDeDatos.getText();
        
        int AIDI = 0;  
        
        conexion objConexion = new conexion(Dattos);
        
        EntidadesBL O_Entidades = recuperarDatosGUI(); //objeto formado a raiz de los datos ingresados en la tabla(arriba)

       //Buscamos los datos del objeto, tomados en el paso inmediato anterior, y los insertamos en la base de datos.
       
     
      // GENERADOR DE NUEVO ID: 
      
      
      try {
            
                 ResultSet Resultado2 = objConexion.consultarRegistros("SELECT MAX(id) FROM Entidades_BD;"); 

                AIDI = (Integer.parseInt(Resultado2.getString("MAX(id)")) + 1) ; //generador de numero autoincrementable para la columna id de la tabla.
                
                 objConexion.Respuesta.close();
        
        
                 } catch (Exception e) {
            
                System.out.println("incorrecto en Agregar*" + e ); 
              }
      
      
      
      
      //Validacion: - NO SE INGRESAN REPETIDOS -
      
      
       boolean Prueba = false;
       
       String Text = txt_Nombre.getText();
       String X = "x"; 
       System.out.println ("holass-"+ txt_Nombre.getText()+"-");
      
     
      if ( Text.equals(X)){
      
           
           
            String texto = "Cuidado: No se completó Nombre de Entidad";
            
            Emergente VentanaE = new Emergente(texto); 
            
            VentanaE.setVisible(true);
          
            Limpiar();
        
        } else {
        
            try {

              ResultSet Resultado2 = objConexion.consultarRegistros("SELECT * FROM Entidades_BD  WHERE Entidad = " + "'" + Text + "'");  

               if (Resultado2.getString("Entidad") != null){

                  Prueba = true;

                }

          } catch (Exception e) {

                 System.out.println("incorrecto en Agregar*" + e ); 
               }


         if (Prueba == false ){ 

                Dattos = "jdbc:sqlite:" + Path;  //JT_BaseDeDatos.getText();
                conexion objConexion2 = new conexion(Dattos);

                String srtSentenciaInsert = String.format("insert into Entidades_BD (id, Entidad, Localidad,Decreto, Categoria_L15192, Ultima_Actualizacion, InscripcionDGPJ2, Telefono,N_Registro_Municipal)"
                  + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", AIDI, O_Entidades.getNombre(), O_Entidades.getLocacion(), O_Entidades.getN_Decreto_M(), O_Entidades.getCategoria(), O_Entidades.getUltima_actualizacion(), O_Entidades.getInscripcionDGPJ2(),O_Entidades.getTelefono(), O_Entidades.getRegistro_Municipal());

                objConexion2.ejecutarSentenciaSQL(srtSentenciaInsert);

                System.out.println ("what te fuuuck");


                mostrarDatos(Busqueda, Dattos);

                Limpiar();

            } else {

                String texto = "La Entidad Ya Existe!";

                Emergente VentanaE = new Emergente(texto); 

                VentanaE.setVisible(true);   }

                Limpiar();
            }

               txt_Nombre.setText("x");
          
    }//GEN-LAST:event_JB_AgregarActionPerformed


    private void txt_DecretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DecretoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DecretoActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_Ult_ActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ult_ActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ult_ActualizacionActionPerformed

    private void txt_InscripcionDGPJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_InscripcionDGPJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_InscripcionDGPJ2ActionPerformed

    private void EdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionActionPerformed
       
        if(Edicion.isSelected()&& jToogle_1.isSelected() && (Toogle_2.isSelected()== false) && (Toogle_3.isSelected()== false)&& (Toogle_5.isSelected()== false) ){
     
            JB_Borrar.setEnabled(true); 
            JB_Borrar.setBackground(Color.RED);
            JB_Agregar.setEnabled(true);
            JB_Editar.setEnabled(true);
          
            JCombo_Categorias.setEnabled(true);
            jPanel3.setBackground(Color.GREEN);
            }else {JB_Borrar.setEnabled(false); 
            JB_Agregar.setEnabled(false);
            JB_Editar.setEnabled(false);
      
            JCombo_Categorias.setEnabled(false);
            JB_Borrar.setBackground(Color.GRAY);
            jPanel3.setBackground(Color.GRAY);
            
        }
        
    }//GEN-LAST:event_EdicionActionPerformed

  
    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        
         Dattos = "jdbc:sqlite:" + Path; //JT_BaseDeDatos.getText();
         
       //---  
        String Data2 =  JText_Busqueda.getText(); 
        String Data1 = JCombo_Filtro.getSelectedItem().toString();
       //--
     
     switch (Data1){
     
         case "Todos":
    
           Busqueda = "SELECT * FROM Entidades_BD  WHERE Entidad LIKE "+"'" + "%"+ Data2 + "%" + "'" 
           + "OR Decreto LIKE "+"'" + "%"+ Data2 + "%" + "'"
           + "OR Localidad LIKE "+"'" + "%"+ Data2 + "%" + "'"
           + "OR Categoria_L15192 LIKE "+"'" + "%"+ Data2 + "%" + "'"
           + "OR Ultima_Actualizacion LIKE "+"'" + "%"+ Data2 + "%" + "'"
           + "OR InscripcionDGPJ2 LIKE "+"'" + "%"+ Data2 + "%" + "'"
           + "OR Telefono LIKE "+"'" + "%"+ Data2 + "%" + "'";
                    
            mostrarDatos(Busqueda,Dattos);
                 
                  break;
         default:
            
            Busqueda = "SELECT * FROM Entidades_BD  WHERE " + Data1 + " Like " + "'"+"%"+ Data2 +"%" +"'";
                             
            mostrarDatos(Busqueda, Dattos);
                 
                  break;
                    

    }//GEN-LAST:event_JB_BuscarActionPerformed

    } 
     
    
    
    private void JB_Impresion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Impresion2ActionPerformed
        
        
        
        MessageFormat header  = new MessageFormat ("Item Report");
        
        
        try {
            
            jT_Tabla.print(JTable.PrintMode.NORMAL, header, null );
            
            
            
        } catch (Exception e) {
        
        
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
        
      
        
    }//GEN-LAST:event_JB_Impresion2ActionPerformed

    private void JB_FImpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_FImpresionActionPerformed
        
          
    //---toma desde TextFields ;
            
    Formulario.setBasededatos("jdbc:sqlite:" + Path );//JT_BaseDeDatos.getText());  

   
    JText_Busqueda.requestFocus(); //poner el foco en este Jtext.
   
   
   
    JF_Impresion ImpresionPDF = new JF_Impresion(Formulario); 
      
    ImpresionPDF.setVisible(true); 
    
        
  
    }//GEN-LAST:event_JB_FImpresionActionPerformed

    
    private void jToogle_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToogle_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToogle_1ActionPerformed

    private void JB_Borrar_campos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Borrar_campos_ActionPerformed
        txt_Categoria.setText(""); 
        txt_Decreto.setText("");
        txt_Locacion.setText("");
        txt_Categoria.setText("");
        txt_Telefono.setText("");
        txt_Ult_Actualizacion.setText("");
        txt_InscripcionDGPJ2.setText("");
         txt_Nombre.setText("x");
        txt_ID.setText("0"); 
        txt_RegistroMunicipal.setText("");
        
    }//GEN-LAST:event_JB_Borrar_campos_ActionPerformed

    private void JText_BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_BusquedaActionPerformed
      
         JB_BuscarActionPerformed(evt);

    }//GEN-LAST:event_JText_BusquedaActionPerformed

    private void JCombo_FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCombo_FiltroActionPerformed

    private void jB_Formulario3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Formulario3_ActionPerformed
    
       String DB= Path; //JT_BaseDeDatos.getText();
        
        Tablas Formulario3Setting = new Tablas(); 
        
        Formulario3Setting.setDataBase(DB);
        
       Formulario3Setting.setVisible(true);
       
    }//GEN-LAST:event_jB_Formulario3_ActionPerformed

    private void Seleccion_ArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion_ArActionPerformed
        
       Dir = javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory().toString();
       
        File archivoSeleccionado;
        
        JFileChooser seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.setCurrentDirectory(new File(Dir + "\\"));
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile();
        Path = archivoSeleccionado.getAbsoluteFile().toString();
        
        JB_BuscarActionPerformed(evt);
        
    }//GEN-LAST:event_Seleccion_ArActionPerformed

    
      
    //prueba
    // Mostrar los datos en la tabla 
    
    public void mostrarDatos(String datosBusqueda, String datta){   
         
   
         conexion objConexion = new conexion(datta);
        
         try {
            ResultSet Resultado = objConexion.consultarRegistros(datosBusqueda); 
            
            modelo.setRowCount(0);
            
            
            while (Resultado.next()){//relleno de la tabla: con el next* 
           
                 Object [] oEntidadx={Resultado.getString("Id"),Resultado.getString("Entidad"),  Resultado.getString("Decreto"), Resultado.getString("Localidad"),Resultado.getString("Categoria_L15192"), Resultado.getString("Ultima_Actualizacion"), Resultado.getString( "InscripcionDGPJ2"),Resultado.getString("Telefono")};
            
                 Cant++;
                 
                 
            modelo.addRow(oEntidadx);
            }
            
            JText_Cantidad.setText(String.valueOf(Cant));

            
            Cant = 0 ;
            
            objConexion.Respuesta.close();
            
        } catch (Exception e) {
            
             System.out.println("hay un error en la tabla" + e);
             
        }
        
    
    }
    
   
    public EntidadesBL recuperarDatosGUI(){
         
     int IDx;
     
        while(modelo.getRowCount()>0){ //limpia informacion en tabla una vez borrado un dato.
            modelo.removeRow(0);
        }
        
        
        // tomando datos de la parte de la tabla de ingreso, y enviarlos al OBJETO. 
         EntidadesBL O_Entidades = new EntidadesBL();    
   
        
            
            if (txt_ID.getText()== ""){
            
                 IDx = 0;
                 
            }else {
            
                 IDx = Integer.parseInt(txt_ID.getText());
            }
           
            
            O_Entidades.setID(IDx);
            

            O_Entidades.setNombre(txt_Nombre.getText());
            O_Entidades.setN_Decreto_M ( txt_Decreto.getText());
            O_Entidades.setCategoria (JCombo_Categorias.getSelectedItem().toString()); //O_Entidades.setCategoria (txt_Categoria.getText()); 
            O_Entidades.setLocacion(txt_Locacion.getText());
            O_Entidades.setUltima_actualizacion(txt_Ult_Actualizacion.getText());
            O_Entidades.setInscripcionDGPJ2(txt_InscripcionDGPJ2.getText());
            O_Entidades.setTelefono(txt_Telefono.getText());
            O_Entidades.setRegistro_Municipal(txt_RegistroMunicipal.getText());
            
                

   return  O_Entidades;
           
   }
   

    
    
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
            java.util.logging.Logger.getLogger(FrM_Entidades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrM_Entidades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrM_Entidades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrM_Entidades2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrM_Entidades2().setVisible(true);
                
                    
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Edicion;
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Borrar;
    private javax.swing.JButton JB_Borrar_campos_;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Editar;
    private javax.swing.JButton JB_FImpresion;
    private javax.swing.JButton JB_Impresion2;
    private javax.swing.JComboBox<String> JCombo_Categorias;
    private javax.swing.JComboBox<String> JCombo_Filtro;
    private javax.swing.JTextField JText_Busqueda;
    private javax.swing.JTextField JText_Cantidad;
    private javax.swing.JButton Seleccion_Ar;
    private javax.swing.JToggleButton Toogle_2;
    private javax.swing.JToggleButton Toogle_3;
    private javax.swing.JToggleButton Toogle_5;
    private javax.swing.JButton jB_Formulario3_;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Tabla;
    private javax.swing.JToggleButton jToogle_1;
    private javax.swing.JTextField txt_Categoria;
    private javax.swing.JTextField txt_Decreto;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_InscripcionDGPJ2;
    private javax.swing.JTextField txt_Locacion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_RegistroMunicipal;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Ult_Actualizacion;
    // End of variables declaration//GEN-END:variables

  
}
