
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class TennisJFrame extends javax.swing.JFrame {

    Connection con;
    
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;

    PreparedStatement pst;
    PreparedStatement pst2;
    PreparedStatement pst3;


    String jdbcURL = "jdbc:mysql://localhost:3306/copie_tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris"; //?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris
    String username = "root";
    String password = "root";
    
    int x, y;

    
    public TennisJFrame() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, username, password);
            pst = con.prepareStatement("SELECT * FROM joueur");
            rs = pst.executeQuery();
            
            if (rs.next()) {
                txtid.setText(rs.getString(1));
                txtnom.setText(rs.getString(2));
                txtprenom.setText(rs.getString(3));
                txtsexe.setText(rs.getString(4));     
            }
            
           
            pst2 = con.prepareStatement("SELECT * FROM tournoi");
            rs2 = pst2.executeQuery();
            
            if (rs2.next()) {
                txtidtournoi.setText(rs2.getString(1));
                txtnomtournoi.setText(rs2.getString(2));
                txtcodetournoi.setText(rs2.getString(3));  
            }
            
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtsexe = new javax.swing.JTextField();
        buttonAjouterJoueur = new javax.swing.JButton();
        buttonEditerJoueur = new javax.swing.JButton();
        buttonSupprimerJoueur = new javax.swing.JButton();
        buttonSearchJoueur = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonDisplay1Joueur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Joueur = new javax.swing.JTable();
        buttonSearch2Joueur = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnomtournoi = new javax.swing.JTextField();
        txtcodetournoi = new javax.swing.JTextField();
        buttonAjouterTournoi = new javax.swing.JButton();
        buttonEditerTournoi = new javax.swing.JButton();
        buttonSupprimerTournoi = new javax.swing.JButton();
        buttonSearchTournoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        buttonDisplayTournoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2Tournoi = new javax.swing.JTable();
        buttonClearTournoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtidtournoi = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buttonDisplayMatch1 = new javax.swing.JButton();
        buttonDisplayMatch2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3Match = new javax.swing.JTable();
        buttonSearchMatch = new javax.swing.JButton();
        buttonSearch2Joueur1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Prenom");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sexe");

        txtnom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnom.setText(" ");
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        txtprenom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprenom.setText(" ");
        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });

        txtsexe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsexe.setText(" ");
        txtsexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexeActionPerformed(evt);
            }
        });

        buttonAjouterJoueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAjouterJoueur.setText("Ajouter");
        buttonAjouterJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterJoueurActionPerformed(evt);
            }
        });

        buttonEditerJoueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEditerJoueur.setText("Editer");
        buttonEditerJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditerJoueurActionPerformed(evt);
            }
        });

        buttonSupprimerJoueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSupprimerJoueur.setText("Supprimer");
        buttonSupprimerJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerJoueurActionPerformed(evt);
            }
        });

        buttonSearchJoueur.setBackground(new java.awt.Color(0, 153, 153));
        buttonSearchJoueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearchJoueur.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearchJoueur.setText("Search");
        buttonSearchJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchJoueurActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Id");

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtid.setText(" ");
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Recherche dynamique");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        buttonDisplay1Joueur.setBackground(new java.awt.Color(153, 0, 153));
        buttonDisplay1Joueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDisplay1Joueur.setForeground(new java.awt.Color(255, 255, 255));
        buttonDisplay1Joueur.setText("Display");
        buttonDisplay1Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplay1JoueurActionPerformed(evt);
            }
        });

        jTable1Joueur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1Joueur);

        buttonSearch2Joueur.setBackground(new java.awt.Color(153, 153, 153));
        buttonSearch2Joueur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch2Joueur.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch2Joueur.setText("Clear");
        buttonSearch2Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearch2JoueurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDisplay1Joueur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearch2Joueur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonDisplay1Joueur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch2Joueur)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnom)
                                    .addComponent(txtprenom)
                                    .addComponent(txtsexe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonAjouterJoueur)
                                .addGap(18, 18, 18)
                                .addComponent(buttonEditerJoueur)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSupprimerJoueur)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSearchJoueur))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAjouterJoueur)
                    .addComponent(buttonEditerJoueur)
                    .addComponent(buttonSupprimerJoueur)
                    .addComponent(buttonSearchJoueur))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Joueur", jPanel1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nom");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Code");

        txtnomtournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnomtournoi.setText(" ");
        txtnomtournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomtournoiActionPerformed(evt);
            }
        });

        txtcodetournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcodetournoi.setText(" ");
        txtcodetournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodetournoiActionPerformed(evt);
            }
        });

        buttonAjouterTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAjouterTournoi.setText("Ajouter");
        buttonAjouterTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterTournoiActionPerformed(evt);
            }
        });

        buttonEditerTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEditerTournoi.setText("Editer");
        buttonEditerTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditerTournoiActionPerformed(evt);
            }
        });

        buttonSupprimerTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSupprimerTournoi.setText("Supprimer");
        buttonSupprimerTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerTournoiActionPerformed(evt);
            }
        });

        buttonSearchTournoi.setBackground(new java.awt.Color(0, 153, 153));
        buttonSearchTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearchTournoi.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearchTournoi.setText("Search");
        buttonSearchTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchTournoiActionPerformed(evt);
            }
        });

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Recherche dynamique");

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        buttonDisplayTournoi.setBackground(new java.awt.Color(153, 0, 153));
        buttonDisplayTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDisplayTournoi.setForeground(new java.awt.Color(255, 255, 255));
        buttonDisplayTournoi.setText("Display");
        buttonDisplayTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplayTournoiActionPerformed(evt);
            }
        });

        jTable2Tournoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2Tournoi);

        buttonClearTournoi.setBackground(new java.awt.Color(153, 153, 153));
        buttonClearTournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClearTournoi.setForeground(new java.awt.Color(255, 255, 255));
        buttonClearTournoi.setText("Clear");
        buttonClearTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearTournoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDisplayTournoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonClearTournoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonDisplayTournoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClearTournoi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Id");

        txtidtournoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtidtournoi.setText(" ");
        txtidtournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtournoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonAjouterTournoi)
                                .addGap(18, 18, 18)
                                .addComponent(buttonEditerTournoi)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSupprimerTournoi)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSearchTournoi))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtidtournoi)
                                    .addComponent(txtnomtournoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtcodetournoi, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtidtournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnomtournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodetournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAjouterTournoi)
                    .addComponent(buttonEditerTournoi)
                    .addComponent(buttonSupprimerTournoi)
                    .addComponent(buttonSearchTournoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Tournois", jPanel2);

        buttonDisplayMatch1.setBackground(new java.awt.Color(153, 0, 153));
        buttonDisplayMatch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDisplayMatch1.setForeground(new java.awt.Color(255, 255, 255));
        buttonDisplayMatch1.setText("Afficher vainqueurs");
        buttonDisplayMatch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplayMatch1ActionPerformed(evt);
            }
        });

        buttonDisplayMatch2.setBackground(new java.awt.Color(102, 0, 102));
        buttonDisplayMatch2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDisplayMatch2.setForeground(new java.awt.Color(255, 255, 255));
        buttonDisplayMatch2.setText("Afficher finalistes");
        buttonDisplayMatch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplayMatch2ActionPerformed(evt);
            }
        });

        jTable3Match.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3Match);

        buttonSearchMatch.setBackground(new java.awt.Color(0, 153, 153));
        buttonSearchMatch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearchMatch.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearchMatch.setText("Search");
        buttonSearchMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchMatchActionPerformed(evt);
            }
        });

        buttonSearch2Joueur1.setBackground(new java.awt.Color(153, 153, 153));
        buttonSearch2Joueur1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch2Joueur1.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch2Joueur1.setText("Clear");
        buttonSearch2Joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearch2Joueur1ActionPerformed(evt);
            }
        });

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDisplayMatch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(buttonDisplayMatch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(buttonSearch2Joueur1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearchMatch, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(buttonSearchMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch2Joueur1)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(buttonDisplayMatch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDisplayMatch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matchs", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Epreuves", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomActionPerformed

    private void buttonAjouterJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterJoueurActionPerformed
        try {
            pst = con.prepareStatement("INSERT INTO JOUEUR(NOM,PRENOM,SEXE) VALUES (?,?,?)");
            pst.setString(1, txtnom.getText());
            pst.setString(2, txtprenom.getText());
            pst.setString(3, txtsexe.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully added!");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAjouterJoueurActionPerformed

    private void buttonSupprimerJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerJoueurActionPerformed
        try {
            pst = con.prepareStatement("DELETE FROM JOUEUR WHERE NOM=?");
            pst.setString(1, txtnom.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully deleted!");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSupprimerJoueurActionPerformed

    private void buttonEditerJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditerJoueurActionPerformed
        try {
            pst = con.prepareStatement("UPDATE JOUEUR SET NOM=?, PRENOM=?, SEXE=? WHERE ID=?");
            pst.setString(1, txtnom.getText());
            pst.setString(2, txtprenom.getText());
            pst.setString(3, txtsexe.getText());
            pst.setString(4, txtid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully updated!");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEditerJoueurActionPerformed

    private void buttonSearchJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchJoueurActionPerformed
        String s = JOptionPane.showInputDialog(this, "Entrez le Nom / Prénom ou l'Id recherché");

        try {
            pst = con.prepareStatement("SELECT * FROM JOUEUR WHERE ID=? OR NOM=? OR PRENOM=?");
            pst.setString(1, s);
            pst.setString(2, s);
            pst.setString(3, s);

            rs = pst.executeQuery();

            if (rs.next()) {
                txtid.setText(rs.getString(1));
                txtnom.setText(rs.getString(2));
                txtprenom.setText(rs.getString(3));
                txtsexe.setText(rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSearchJoueurActionPerformed

    private void txtnomtournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomtournoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomtournoiActionPerformed

    private void txtcodetournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodetournoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodetournoiActionPerformed

    private void buttonAjouterTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterTournoiActionPerformed
        try {
            pst2 = con.prepareStatement("INSERT INTO TOURNOI(NOM,CODE) VALUES (?,?)");
            pst2.setString(1, txtnomtournoi.getText());
            pst2.setString(2, txtcodetournoi.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tourney Successfully added!");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAjouterTournoiActionPerformed

    private void buttonEditerTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditerTournoiActionPerformed
        try {
            pst2 = con.prepareStatement("UPDATE TOURNOI SET NOM=?, CODE=? WHERE ID=?");
            pst2.setString(1, txtnomtournoi.getText());
            pst2.setString(2, txtcodetournoi.getText());
            pst2.setString(3, txtidtournoi.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tourney Successfully updated!");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEditerTournoiActionPerformed

    private void buttonSupprimerTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerTournoiActionPerformed
        try {
            pst2 = con.prepareStatement("DELETE FROM TOURNOI WHERE NOM=?");
            pst2.setString(1, txtnomtournoi.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tourney Successfully deleted");
        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSupprimerTournoiActionPerformed

    private void buttonSearchTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchTournoiActionPerformed
        String s2 = JOptionPane.showInputDialog(this, "Entrez le Nom / Code ou l'Id recherché");

        try {
            pst2 = con.prepareStatement("SELECT * FROM tournoi WHERE id=? OR nom=? OR code=?");
            pst2.setString(1, s2);
            pst2.setString(2, s2);
            pst2.setString(3, s2);

            rs2 = pst2.executeQuery();

            if (rs2.next()) {
                txtidtournoi.setText(rs2.getString(1));
                txtnomtournoi.setText(rs2.getString(2));
                txtcodetournoi.setText(rs2.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSearchTournoiActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buttonDisplay1JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplay1JoueurActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, username, password);
            
            Statement st = con.createStatement();
            String query = "SELECT * FROM joueur";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1Joueur.getModel();
            
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colName);
            
            
            String id, nom, prenom, sexe;
            
            while (rs.next()) {                
                id = rs.getString(1);
                nom = rs.getString(2);
                prenom = rs.getString(3);
                sexe = rs.getString(4);
                String[] row = {id, nom, prenom, sexe};
                model.addRow(row);
            }
            
            //st.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDisplay1JoueurActionPerformed

    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String tf = jTextField1.getText();
        try {
            String query = "SELECT * FROM joueur WHERE prenom LIKE '%"+tf+"%' OR id LIKE '%"+tf+"%' OR sexe LIKE '%"+tf+"%' OR nom LIKE '%"+tf+"%'";
            
            pst = con.prepareStatement("SELECT * FROM JOUEUR WHERE ID=? OR NOM=? OR PRENOM=?");
            
            pst=con.prepareStatement(query);
            rs = pst.executeQuery();
            jTable1Joueur.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void buttonSearch2JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearch2JoueurActionPerformed
        jTable1Joueur.setModel(new DefaultTableModel());
    }//GEN-LAST:event_buttonSearch2JoueurActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
    String tf2 = jTextField2.getText();
            try {
                String query = "SELECT * FROM tournoi WHERE nom LIKE '%"+tf2+"%'";

                pst2 = con.prepareStatement("SELECT * FROM tournoi WHERE ID=? OR NOM=? OR CODE=?");

                pst2=con.prepareStatement(query);
                rs2 = pst2.executeQuery();
                jTable2Tournoi.setModel(DbUtils.resultSetToTableModel(rs2));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void buttonDisplayTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplayTournoiActionPerformed
        String tf2 = jTextField2.getText();
        try {
            String query = "SELECT * FROM tournoi WHERE nom LIKE '%"+tf2+"%'";
            
            pst2 = con.prepareStatement("SELECT * FROM tournoi WHERE ID=? OR NOM=? OR CODE=?");
            
            pst2=con.prepareStatement(query);
            rs2 = pst2.executeQuery();
            jTable2Tournoi.setModel(DbUtils.resultSetToTableModel(rs2));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_buttonDisplayTournoiActionPerformed

    private void buttonClearTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearTournoiActionPerformed
         jTable2Tournoi.setModel(new DefaultTableModel());
    }//GEN-LAST:event_buttonClearTournoiActionPerformed

    private void txtidtournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtournoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtournoiActionPerformed

    private void buttonDisplayMatch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplayMatch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDisplayMatch1ActionPerformed

    private void buttonDisplayMatch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplayMatch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDisplayMatch2ActionPerformed

    private void txtsexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexeActionPerformed

    private void buttonSearchMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchMatchActionPerformed
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, username, password);
            
            Statement st = con.createStatement();
            
            String query = 
                    
                    "SELECT mt.ID, J.NOM as Victoires, J1.NOM as Defaite\n" +
                    "FROM MATCH_TENNIS mt\n" +
                    "INNER JOIN JOUEUR J ON J.ID = mt.ID_VAINQUEUR\n" +
                    "INNER JOIN JOUEUR J1 ON J1.ID = mt.ID_FINALISTE\n" +
                    "ORDER BY mt.ID ASC";
            
                    //"WHERE J.NOM LIKE \"Nadal\" OR J1.NOM LIKE \"Nadal\" ORDER BY mt.ID ASC";
            
            ResultSet rs3 = st.executeQuery(query);
            ResultSetMetaData rsmd = rs3.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable3Match.getModel();
            
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colName);
            
            
            String id, nomVictoire, nomDefaite;
            
            while (rs3.next()) {                
                id = rs3.getString(1);
                nomVictoire = rs3.getString(2);
                nomDefaite = rs3.getString(3);
                String[] row = {id, nomVictoire, nomDefaite};
                model.addRow(row);
            }
            
            //st.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TennisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSearchMatchActionPerformed

    private void buttonSearch2Joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearch2Joueur1ActionPerformed
        jTable3Match.setModel(new DefaultTableModel());
    }//GEN-LAST:event_buttonSearch2Joueur1ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        String tf = jTextField3.getText();
        try {
            String query = "SELECT mt.ID, J.NOM as Victoires, J1.NOM as Defaite\n" +
                    "FROM MATCH_TENNIS mt\n" +
                    "INNER JOIN JOUEUR J ON J.ID = mt.ID_VAINQUEUR\n" +
                    "INNER JOIN JOUEUR J1 ON J1.ID = mt.ID_FINALISTE\n" +
                    "WHERE J.NOM LIKE '%"+tf+ "%' OR J1.NOM LIKE '%" +tf+ "%' ORDER BY mt.ID ASC";
            
            pst = con.prepareStatement("SELECT * FROM JOUEUR WHERE ID=? OR NOM=? OR PRENOM=?");
            
            pst=con.prepareStatement(query);
            rs = pst.executeQuery();
            jTable3Match.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TennisJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouterJoueur;
    private javax.swing.JButton buttonAjouterTournoi;
    private javax.swing.JButton buttonClearTournoi;
    private javax.swing.JButton buttonDisplay1Joueur;
    private javax.swing.JButton buttonDisplayMatch1;
    private javax.swing.JButton buttonDisplayMatch2;
    private javax.swing.JButton buttonDisplayTournoi;
    private javax.swing.JButton buttonEditerJoueur;
    private javax.swing.JButton buttonEditerTournoi;
    private javax.swing.JButton buttonSearch2Joueur;
    private javax.swing.JButton buttonSearch2Joueur1;
    private javax.swing.JButton buttonSearchJoueur;
    private javax.swing.JButton buttonSearchMatch;
    private javax.swing.JButton buttonSearchTournoi;
    private javax.swing.JButton buttonSupprimerJoueur;
    private javax.swing.JButton buttonSupprimerTournoi;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Joueur;
    private javax.swing.JTable jTable2Tournoi;
    private javax.swing.JTable jTable3Match;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtcodetournoi;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidtournoi;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnomtournoi;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txtsexe;
    // End of variables declaration//GEN-END:variables
}
