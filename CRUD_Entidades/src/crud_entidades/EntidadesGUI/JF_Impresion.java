
package crud_entidades.EntidadesGUI;
import crud_entidades.EntidadesBL.EntidadesBL;
import crud_entidades.EntidadesDAL.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;

public class JF_Impresion extends javax.swing.JFrame implements Printable {
    
    EntidadesBL O_Entidades = new EntidadesBL(); 
    
    public JF_Impresion (EntidadesBL Formulario) {
  
        String D = Formulario.getBasededatos(); 
        O_Entidades.setBasededatos(D);
       
        
        
        
        initComponents();
        
         Font fuente=new Font("Dialog", Font.BOLD, 12);
      
        jT_NombreTextF.setText(Formulario.getNombre());//nuevo
        jT_NombreTextF.setFont( fuente ); //nuevo
        
        jT_Categoria.setText( Formulario.getCategoria());
        jT_N_de_Expediente.setText( Formulario.getNumero_de_Expediente());
        jT_InscripcionDGPJ2.setText( Formulario.getInscripcionDGPJ2()); 
        jT_ITelefono.setText( Formulario.getTelefono());
        jT_Localidad.setText( Formulario.getLocacion());
        jT_N_Decreto.setText( Formulario.getN_Decreto_M());
        jT_Domicilio.setText( Formulario.getDomicilio());      
        jT_AyudaDesarrollo.setText( Formulario.getAyuda_desarrollo_social_al_()); 
        jT_OSocial.setText( Formulario.getObjeto_Social());
        jT_Seccionales.setText( Formulario.getSeccionales());
        jT_Email.setText( Formulario.getE_mail());
        jT_Suspendidas.setText( Formulario.getSuspedidas());
        jT_Contacto.setText( Formulario.getContacto());
        jT_Ult_Actualizacion.setText( Formulario.getUltima_actualizacion());
        jT_Actualizadas.setText( Formulario.getActualizada());
        jT_A_actualizacion.setText( Formulario.getAnio_de_actualizacion());
        jT_CierreEjercicio.setText( Formulario.getCierre_de_ejercicio_segun());
        jT_PWeb.setText( Formulario.getPagina_Web());
        jT_CuentaconBienes.setText( Formulario.getCuenta_con_bienes());
        jT_Desactualizadas.setText( Formulario.getDesactualizada());
        jT_CertRetirados.setText( Formulario.getCertificados_retirados());
        jT_Archivados.setText( Formulario.getArchivados());
        jT_CP.setText( Formulario.getCP());
        jT_Excension.setText( Formulario.getExencion());
        jT_FechaDeFundacion.setText( Formulario.getFecha_de_fundacion());
        jT_Bajas.setText( Formulario.getBajas());
        
        jT_ID.setText(String.valueOf(Formulario.getID())); ////ID
        jT_ID.setEditable(false); 
        
        jT_Registro_Municipal.setText(Formulario.getRegistro_Municipal());   
        jT_cod.setText(String.valueOf(Formulario.getCod()));
        JT_FechaInscripcionDGPJ.setText (Formulario.getFecha_Inscripcion_DGPJ()); 
                
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Direccion de Entidades_C.R.U.D V3.2  By ÑAky 2021");
  
    }
    
 
    
    
    // Impresion .----------------------
   
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {


if (pageIndex > 0) {
        return NO_SUCH_PAGE;
    }

    Graphics2D g2d = (Graphics2D) graphics;
    g2d .translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    g2d.scale(pageFormat.getImageableWidth() / this.getWidth(), pageFormat.getImageableHeight() / this.getHeight());
    
    this.printAll(g2d);
    
    
      return PAGE_EXISTS;
    
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jT_Seccionales = new javax.swing.JTextField();
        jT_ITelefono = new javax.swing.JTextField();
        jT_Categoria = new javax.swing.JTextField();
        jT_N_de_Expediente = new javax.swing.JTextField();
        jT_Ult_Actualizacion = new javax.swing.JTextField();
        jT_InscripcionDGPJ2 = new javax.swing.JTextField();
        jT_Domicilio = new javax.swing.JTextField();
        jT_OSocial = new javax.swing.JTextField();
        jT_AyudaDesarrollo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jT_NombreTextF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jT_CP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jT_Excension = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jT_Email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jT_FechaDeFundacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jT_Bajas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jT_Suspendidas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jT_CierreEjercicio = new javax.swing.JTextField();
        jT_Localidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jT_A_actualizacion = new javax.swing.JTextField();
        jT_PWeb = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jT_CuentaconBienes = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jT_Contacto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jT_Actualizadas = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jT_Archivados = new javax.swing.JTextField();
        jT_CertRetirados = new javax.swing.JTextField();
        jT_N_Decreto = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jT_Desactualizadas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        JB_Edicion_ = new javax.swing.JButton();
        jTedicion = new javax.swing.JToggleButton();
        jT_ID = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTButton5 = new javax.swing.JToggleButton();
        jTButton4 = new javax.swing.JToggleButton();
        jTButton7 = new javax.swing.JToggleButton();
        jLabel29 = new javax.swing.JLabel();
        jT_Registro_Municipal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jT_cod = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        JT_FechaInscripcionDGPJ = new javax.swing.JTextField();
        jCombo_OS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jT_InscripcionDGPJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_InscripcionDGPJ2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Telefono");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Categoria");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Localidad");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Ult actualizacion");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Inscripcion DPPJ");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Domicilio");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Objeto Social");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("Ayuda_desarrollo al 31/12/2015");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setText("Seccionales");

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel10.setText("Entidad; ");

        jButton1.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel11.setText("CP");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel12.setText("Exencion");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("E_Mail");

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setText("Fecha de Fundacion");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setText("Bajas");

        jT_Bajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_BajasActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel16.setText("Suspendidas");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel17.setText("N de expediente");

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setText("Pagina Web");

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel19.setText("Cuenta cn bienes");

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel20.setText("Cierre Ejercicio");

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setText("Año Actualizacion");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setText("contacto");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setText("Archivados");

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setText("Certif. Retirados");

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setText("Actualizadas");

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel27.setText("Decreto");

        jLabel28.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel28.setText(" Desactulizada");

        JB_Edicion_.setText("Editar");
        JB_Edicion_.setEnabled(false);
        JB_Edicion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Edicion_ActionPerformed(evt);
            }
        });

        jTedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTedicionActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setText("ID");

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel29.setText("Registro Municipal");

        jLabel30.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel30.setText("Cód");

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel31.setText("Fecha Inscripcion DGPJ");

        JT_FechaInscripcionDGPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_FechaInscripcionDGPJActionPerformed(evt);
            }
        });

        jCombo_OS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Actividades y terapias recreativas", "Ajedrez", "Aprendizaje y Educación", "Asistencia a la infancia y adolescencia", "Asistencia Ancianidad", "Asistencia en general", "Asistencia Estudiantil", "Asistencia Familiar", "Asistencia Infancia y Adolescencia", "ASISTENCIA SOCIAL", "Asistencia y Caridad", "Asistencia y Fomento de Instituciones", "Asistencia y Prevención", "Atención Adicciones", "Autoayuda", "Bibliotecas", "Capacidades diferentes", "Capacidades diferentes (hipoacúsicos)", "Capacidades diferentes (iniciación productiva)", "Capacidades diferentes (mental)", "Capacidades diferentes (motora)", "Capacidades Diferentes (visual)", "Caza Deportiva", "Centro de Estudios", "CENTRO DE FOMENTO", "CENTRO DE TERCERA EDAD", "Centros Culturales", "Comedores", "COMERCIANTES E INDUSTRIALES", "Comunicaciones", "Cooperación (Educación)", "Cooperación (Otros)", "Cooperación (Salud)", "Cooperación Sectorial", "Cooperación Sectorial(Salud)", "Cooperación(Educación)", "COOPERADORA", "COOPERATIVA SS. PUBLICOS", "Cooperativismo", "Copas de Leche", "Culto", "Cultural", "De promoción y fomento", "Deportes en general", "Derechos Humanos", "Desarrollo Comercial y Productivo", "Desarrollo Humano y Solidaridad Social (en general)", "Desarrollo Social", "Discapacidades en General", "Disciplinas Orientales", "Discpacidad mental", "EDUCACION", "Emergencias, Catástrofes y Prevención", "Equipamiento e Infraestructura", "Especialidades Médicas", "Fundacion", "Fútbol", "Medicina", "Medio Ambiente", "Mutualidad", "NIÑEZ", "Organizaciones Políticas", "Profesiones y Oficios", "PROFESIONES Y OTROS", "promocion y fomento", "RELIGIOSA", "SALUD", "Sectas y otros", "Usuarios y Consumidores", "Vida Animal", "VIOLENCIA DE GENERO", "Vuelo" }));
        jCombo_OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_OSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(307, 307, 307)
                        .addComponent(jLabel18)
                        .addGap(242, 242, 242)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jT_Desactualizadas)
                                .addComponent(jT_Actualizadas)
                                .addComponent(jT_CertRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jT_CuentaconBienes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jT_OSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCombo_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(jLabel12))
                                            .addComponent(jLabel11))
                                        .addGap(15, 15, 15)
                                        .addComponent(jT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addGap(128, 128, 128)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jT_A_actualizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(jT_CierreEjercicio, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel20)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jT_Contacto, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                                        .addComponent(jT_NombreTextF))
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_N_de_Expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_N_Decreto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jT_Ult_Actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel2)
                                                            .addGap(126, 126, 126)
                                                            .addComponent(jLabel6))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jT_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(32, 32, 32)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jT_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jT_Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGap(8, 8, 8))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(215, 215, 215)
                                                    .addComponent(jT_PWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(407, 407, 407)
                                                    .addComponent(jLabel3)
                                                    .addGap(89, 89, 89)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23)
                                                        .addComponent(jT_Archivados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jT_ITelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(25, 25, 25)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jT_InscripcionDGPJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jT_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jT_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jT_Excension, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel29)
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jT_Seccionales, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jT_Registro_Municipal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel26)
                                                    .addGap(75, 75, 75)
                                                    .addComponent(jLabel5)
                                                    .addGap(39, 39, 39)
                                                    .addComponent(jLabel30))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jT_FechaDeFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jT_Bajas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jT_Suspendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(77, 77, 77)
                                                    .addComponent(jLabel31))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(71, 71, 71)
                                                    .addComponent(JT_FechaInscripcionDGPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(JB_Edicion_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTedicion)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTButton5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTButton4)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jTButton7))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jT_AyudaDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(144, 144, 144)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jT_NombreTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jT_N_de_Expediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_N_Decreto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jT_ITelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jT_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jT_Archivados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_Desactualizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jT_Actualizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_CertRetirados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jT_CuentaconBienes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel20)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT_Ult_Actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_Registro_Municipal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Seccionales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_AyudaDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCombo_OS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jT_OSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT_PWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_CierreEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel21))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT_A_actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jT_Excension, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_FechaDeFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Bajas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Suspendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_FechaInscripcionDGPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel5)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Edicion_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_InscripcionDGPJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  

     public EntidadesBL recuperarDatosGUI2 (){
         
       
   O_Entidades.setID(Integer.parseInt(jT_ID.getText())); // ID!!
   
   
   //-----------
   
   O_Entidades.setN_Decreto_M(jT_N_Decreto.getText());
   O_Entidades.setAnio_de_actualizacion(jT_A_actualizacion.getText());
   O_Entidades.setUltima_actualizacion(jT_Ult_Actualizacion.getText());
   O_Entidades.setTelefono( jT_ITelefono.getText());
   O_Entidades.setRegistro_Municipal(jT_Registro_Municipal.getText());
   O_Entidades.setCod(jT_cod.getText());
   
   //----

   O_Entidades.setNombre(jT_NombreTextF.getText());
   O_Entidades.setCategoria (jT_Categoria.getText());  
   O_Entidades.setLocacion( jT_Localidad.getText());
   O_Entidades.setNumero_de_Expediente(jT_N_de_Expediente.getText());
   O_Entidades.setDomicilio(jT_Domicilio.getText());
   O_Entidades.setAyuda_desarrollo_social_al_(jT_AyudaDesarrollo.getText());
   O_Entidades.setObjeto_Social(jT_OSocial.getText());
   O_Entidades.setSeccionales(jT_Seccionales.getText());
   O_Entidades.setE_mail(jT_Email.getText());
   O_Entidades.setContacto(jT_Contacto.getText());
   O_Entidades.setActualizada(jT_Actualizadas.getText());
   O_Entidades.setCierre_de_ejercicio_segun(jT_CierreEjercicio.getText());
   O_Entidades.setPagina_Web(jT_PWeb.getText());
   O_Entidades.setCuenta_con_bienes(jT_CuentaconBienes.getText());
   O_Entidades.setDesactualizada(jT_Desactualizadas.getText());
   O_Entidades.setCertificados_retirados(jT_CertRetirados.getText());
   O_Entidades.setArchivados(jT_Archivados.getText());
   O_Entidades.setSuspedidas(jT_Suspendidas.getText());
   O_Entidades.setCP(jT_CP.getText());
   O_Entidades.setExencion(jT_Excension.getText());
   O_Entidades.setFecha_de_fundacion(jT_FechaDeFundacion.getText());
   O_Entidades.setBajas(jT_Bajas.getText());
   
   O_Entidades.setFecha_Inscripcion_DGPJ(JT_FechaInscripcionDGPJ.getText());
   O_Entidades.setInscripcionDGPJ2(jT_InscripcionDGPJ2.getText()); 
   
     
  
   
   return  O_Entidades;
           
 }
     
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 PrinterJob job = PrinterJob.getPrinterJob();
    job.setPrintable(this);
    boolean doPrint = job.printDialog(); // mostrar diálogo de impresión
    if (doPrint) {
        try {
            job.setJobName("Nombre a mostrar en la cola de impresión");
            job.print();
        } catch (PrinterException e) {
            // aquí maneja los errores al imprimir
        }
    }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jT_InscripcionDGPJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_InscripcionDGPJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_InscripcionDGPJ2ActionPerformed

    private void jT_BajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_BajasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_BajasActionPerformed

    private void JB_Edicion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Edicion_ActionPerformed
       
       
         conexion objConexion = new conexion(O_Entidades.getBasededatos());
      

        EntidadesBL O_Entidades = recuperarDatosGUI2();

           System.out.println("Agregada recien : " + O_Entidades.getInscripcionDGPJ2());
        
        String srtSentenciaInsert = String.format("UPDATE Entidades_BD SET Entidad = '%s', "
            + " Decreto = '%s', Localidad = '%s', Categoria_L15192 = '%s', Ultima_Actualizacion = '%s'," 
            + " Telefono = '%s', Numero_de_Expediente = '%s',"
            + " Objeto_Social = '%s', Seccionales  = '%s', e_mail = '%s', Contacto = '%s', Actualizadas = '%s',"
            + " Anio_de_Actualizacion = '%s',"
            + " Cierre_de_Ejercicio_Segun_Estatuto  = '%s', Pagina_Web  = '%s',"
            + " Cuenta_con_Bienes  = '%s', Desactualizadas  = '%s', Certificados_Retirados = '%s',  Archivado = '%s',"
            + " Domicilio = '%s',ayuda_desarrollo_social_al_31_12_2015 = '%s',"
            + " Suspendidas = '%s',CP = '%s', Exencion = '%s',"
            +  "Fecha_de_fundacion = '%s', Bajas = '%s', InscripcionDGPJ2 = '%s',Fecha_Inscripcion_DGPJ = '%s', N_Registro_Municipal = '%s'  WHERE id= %d",    
           
             

//N_Registro_Municipal

            O_Entidades.getNombre(),
            O_Entidades.getN_Decreto_M(), 
            O_Entidades.getLocacion(),
            O_Entidades.getCategoria(),
            O_Entidades.getUltima_actualizacion(),
            O_Entidades.getTelefono() ,
            O_Entidades.getNumero_de_Expediente(),
            O_Entidades.getObjeto_Social(),
            O_Entidades.getSeccionales(),  
            O_Entidades.getE_mail(),
            O_Entidades.getContacto()  ,
            O_Entidades.getActualizada(),
            O_Entidades.getAnio_de_actualizacion() ,
            O_Entidades.getCierre_de_ejercicio_segun() ,
            O_Entidades.getPagina_Web(),
            O_Entidades.getCuenta_con_bienes(),
            O_Entidades.getDesactualizada(),
            O_Entidades.getCertificados_retirados(),
            O_Entidades.getArchivados(), 
            O_Entidades.getDomicilio(), 
            O_Entidades.getAyuda_desarrollo_social_al_(),
            O_Entidades.getSuspedidas(),
            O_Entidades.getCP() , 
            O_Entidades.getExencion() ,
            O_Entidades.getFecha_de_fundacion(),
            O_Entidades.getBajas(),
            O_Entidades.getInscripcionDGPJ2(),
            O_Entidades.getFecha_Inscripcion_DGPJ(),
            O_Entidades.getRegistro_Municipal(),
            
            
            O_Entidades.getID()  ); //ID!!!! 
        
 
          
        objConexion.ejecutarSentenciaSQL(srtSentenciaInsert);


      EdicionTermianda();
        
   
       
    }//GEN-LAST:event_JB_Edicion_ActionPerformed

    private void jTedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTedicionActionPerformed
       
        
         if(jTButton4.isSelected()&& jTedicion.isSelected() && (jTButton7.isSelected()== false) && (jTButton5.isSelected()== false) ){
        
            JB_Edicion_.setEnabled(true); 
           
            JB_Edicion_.setBackground(Color.RED);
            }else {JB_Edicion_.setEnabled(false); 
             JB_Edicion_.setBackground(Color.GRAY);
            
        }

    }//GEN-LAST:event_jTedicionActionPerformed

    private void JT_FechaInscripcionDGPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_FechaInscripcionDGPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_FechaInscripcionDGPJActionPerformed

    private void jCombo_OSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_OSActionPerformed
           
            jT_OSocial.setText(jCombo_OS.getSelectedItem().toString());

    }//GEN-LAST:event_jCombo_OSActionPerformed
        //jT_A_actualizacion
   private void EdicionTermianda() {   
       
         jTedicion.setSelected(false); 
         jTButton4.setSelected(false); 
         jTButton5.setSelected(false); 
         jTButton7.setSelected(false); 
         
         JB_Edicion_.setEnabled(false); 
         JB_Edicion_.setBackground(Color.GRAY);
            
        
    
   }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JF_Impresion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Edicion_;
    private javax.swing.JTextField JT_FechaInscripcionDGPJ;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombo_OS;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jTButton4;
    private javax.swing.JToggleButton jTButton5;
    private javax.swing.JToggleButton jTButton7;
    private javax.swing.JTextField jT_A_actualizacion;
    private javax.swing.JTextField jT_Actualizadas;
    private javax.swing.JTextField jT_Archivados;
    private javax.swing.JTextField jT_AyudaDesarrollo;
    private javax.swing.JTextField jT_Bajas;
    private javax.swing.JTextField jT_CP;
    private javax.swing.JTextField jT_Categoria;
    private javax.swing.JTextField jT_CertRetirados;
    private javax.swing.JTextField jT_CierreEjercicio;
    private javax.swing.JTextField jT_Contacto;
    private javax.swing.JTextField jT_CuentaconBienes;
    private javax.swing.JTextField jT_Desactualizadas;
    private javax.swing.JTextField jT_Domicilio;
    private javax.swing.JTextField jT_Email;
    private javax.swing.JTextField jT_Excension;
    private javax.swing.JTextField jT_FechaDeFundacion;
    private javax.swing.JTextField jT_ID;
    private javax.swing.JTextField jT_ITelefono;
    private javax.swing.JTextField jT_InscripcionDGPJ2;
    private javax.swing.JTextField jT_Localidad;
    private javax.swing.JTextField jT_N_Decreto;
    private javax.swing.JTextField jT_N_de_Expediente;
    private javax.swing.JTextField jT_NombreTextF;
    private javax.swing.JTextField jT_OSocial;
    private javax.swing.JTextField jT_PWeb;
    private javax.swing.JTextField jT_Registro_Municipal;
    private javax.swing.JTextField jT_Seccionales;
    private javax.swing.JTextField jT_Suspendidas;
    private javax.swing.JTextField jT_Ult_Actualizacion;
    private javax.swing.JTextField jT_cod;
    private javax.swing.JToggleButton jTedicion;
    // End of variables declaration//GEN-END:variables



}
