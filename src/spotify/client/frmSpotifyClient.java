/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spotify.client;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author tiend
 */
public class frmSpotifyClient extends javax.swing.JFrame {

    /**
     * Creates new form frmSpotifyClient
     */
    public frmSpotifyClient() {
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

        jDialog_Register = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_LoginR = new javax.swing.JButton();
        jDialog_Login = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btn_RegisterL = new javax.swing.JButton();
        jDialog_PlayList = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDialog_AddSongs = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBrower = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAddSong = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();
        jDialog_Search = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Search = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btn_Refersh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_Logout = new javax.swing.JMenu();
        jMenuItem_Login = new javax.swing.JMenuItem();
        jMenuItem_Register = new javax.swing.JMenuItem();
        jMenuItem_PlayList = new javax.swing.JMenuItem();
        jMenuItem_AddSong = new javax.swing.JMenuItem();
        jMenuItem_Search = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jDialog_Register.setSize(new java.awt.Dimension(600, 400));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("REGISTER");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Username :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Password :");

        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_register.setText("Register");

        btn_LoginR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_LoginR.setText("Login");

        javax.swing.GroupLayout jDialog_RegisterLayout = new javax.swing.GroupLayout(jDialog_Register.getContentPane());
        jDialog_Register.getContentPane().setLayout(jDialog_RegisterLayout);
        jDialog_RegisterLayout.setHorizontalGroup(
            jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_RegisterLayout.createSequentialGroup()
                .addGroup(jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_RegisterLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(jDialog_RegisterLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDialog_RegisterLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btn_LoginR))
                    .addComponent(jTextField4)
                    .addComponent(jTextField3))
                .addGap(0, 106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_RegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(240, 240, 240))
        );
        jDialog_RegisterLayout.setVerticalGroup(
            jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_RegisterLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addGroup(jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(59, 59, 59)
                .addGroup(jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(66, 66, 66)
                .addGroup(jDialog_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register)
                    .addComponent(btn_LoginR))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jDialog_Login.setSize(new java.awt.Dimension(600, 400));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("LOGIN");

        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Username :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Password :");

        btn_RegisterL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_RegisterL.setText("Register");

        javax.swing.GroupLayout jDialog_LoginLayout = new javax.swing.GroupLayout(jDialog_Login.getContentPane());
        jDialog_Login.getContentPane().setLayout(jDialog_LoginLayout);
        jDialog_LoginLayout.setHorizontalGroup(
            jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_LoginLayout.createSequentialGroup()
                        .addComponent(btn_RegisterL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Login)
                        .addGap(86, 86, 86))
                    .addGroup(jDialog_LoginLayout.createSequentialGroup()
                        .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTextField5))
                        .addContainerGap(82, Short.MAX_VALUE))))
        );
        jDialog_LoginLayout.setVerticalGroup(
            jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jDialog_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Login)
                    .addComponent(btn_RegisterL))
                .addGap(35, 35, 35))
        );

        jDialog_PlayList.setSize(new java.awt.Dimension(600, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PlayList");

        btnPlay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStop.setText("Stop");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Songs");

        javax.swing.GroupLayout jDialog_PlayListLayout = new javax.swing.GroupLayout(jDialog_PlayList.getContentPane());
        jDialog_PlayList.getContentPane().setLayout(jDialog_PlayListLayout);
        jDialog_PlayListLayout.setHorizontalGroup(
            jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_PlayListLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog_PlayListLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop)
                        .addGap(74, 74, 74))
                    .addGroup(jDialog_PlayListLayout.createSequentialGroup()
                        .addGroup(jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog_PlayListLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 119, Short.MAX_VALUE))))
        );
        jDialog_PlayListLayout.setVerticalGroup(
            jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_PlayListLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog_PlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStop)
                    .addComponent(btnPlay))
                .addGap(32, 32, 32))
        );

        jDialog_AddSongs.setSize(new java.awt.Dimension(600, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Add Songs");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Songs :");

        btnBrower.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBrower.setText("Brower");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnAddSong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddSong.setText("Add");

        btn_Home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Home.setText("Home");

        javax.swing.GroupLayout jDialog_AddSongsLayout = new javax.swing.GroupLayout(jDialog_AddSongs.getContentPane());
        jDialog_AddSongs.getContentPane().setLayout(jDialog_AddSongsLayout);
        jDialog_AddSongsLayout.setHorizontalGroup(
            jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AddSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_AddSongsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_AddSongsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addGroup(jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDialog_AddSongsLayout.createSequentialGroup()
                                .addComponent(btnBrower)
                                .addGap(45, 45, 45)
                                .addComponent(btnAddSong)
                                .addGap(48, 48, 48)
                                .addComponent(btn_Home))
                            .addComponent(jTextField1))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jDialog_AddSongsLayout.setVerticalGroup(
            jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AddSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog_AddSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSong)
                    .addComponent(btnBrower)
                    .addComponent(btn_Home))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jDialog_Search.setSize(new java.awt.Dimension(600, 400));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Search");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Songs :");

        btnSearch.setText("Search");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        btn_Refersh.setText("Refersh");
        btn_Refersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefershActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog_SearchLayout = new javax.swing.GroupLayout(jDialog_Search.getContentPane());
        jDialog_Search.getContentPane().setLayout(jDialog_SearchLayout);
        jDialog_SearchLayout.setHorizontalGroup(
            jDialog_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_SearchLayout.createSequentialGroup()
                .addGroup(jDialog_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog_SearchLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel12))
                    .addGroup(jDialog_SearchLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Refersh)))
                .addContainerGap())
        );
        jDialog_SearchLayout.setVerticalGroup(
            jDialog_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_SearchLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jDialog_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btn_Refersh))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("AUDIO STREAMING");

        jMenu1.setText("Page");
        jMenuBar1.add(jMenu1);

        jMenu_Logout.setText("Menu");

        jMenuItem_Login.setText("Login");
        jMenuItem_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LoginActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem_Login);

        jMenuItem_Register.setText("Register");
        jMenuItem_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegisterActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem_Register);

        jMenuItem_PlayList.setText("PlayList");
        jMenuItem_PlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PlayListActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem_PlayList);

        jMenuItem_AddSong.setText("AddSongs");
        jMenuItem_AddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddSongActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem_AddSong);

        jMenuItem_Search.setText("Search");
        jMenuItem_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SearchActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem_Search);

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Logout.add(jMenuItem1);

        jMenuBar1.add(jMenu_Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LoginActionPerformed
        // TODO add your handling code here:
        jDialog_Login.setVisible(true);
        jMenuBar1.setEnabled(false);
        jDialog_Login.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        jDialog_Login.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar1.setEnabled(true);
                jDialog_Login.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_LoginActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btn_RefershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefershActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RefershActionPerformed

    private void jMenuItem_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegisterActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        jDialog_Register.setVisible(true);
        jMenuBar1.setEnabled(false);
        jDialog_Register.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        jDialog_Register.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar1.setEnabled(true);
                jDialog_Register.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_RegisterActionPerformed

    private void jMenuItem_PlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PlayListActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        jDialog_PlayList.setVisible(true);
        jMenuBar1.setEnabled(false);
        jDialog_PlayList.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        jDialog_PlayList.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar1.setEnabled(true);
                jDialog_PlayList.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_PlayListActionPerformed

    private void jMenuItem_AddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddSongActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        jDialog_AddSongs.setVisible(true);
        jMenuBar1.setEnabled(false);
        jDialog_AddSongs.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        jDialog_AddSongs.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar1.setEnabled(true);
                jDialog_AddSongs.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_AddSongActionPerformed

    private void jMenuItem_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SearchActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        jDialog_Search.setVisible(true);
        jMenuBar1.setEnabled(false);
        jDialog_Search.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        jDialog_Search.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar1.setEnabled(true);
                jDialog_Search.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_SearchActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        int n = JOptionPane.showConfirmDialog(  
                null,
                "Ban co muon thoat khong?!" ,
                "",
                JOptionPane.YES_NO_OPTION);

      if(n == JOptionPane.YES_OPTION)
      {        
          System.exit(0);      
      }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSpotifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSpotifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSpotifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSpotifyClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSpotifyClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSong;
    private javax.swing.JButton btnBrower;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_LoginR;
    private javax.swing.JButton btn_Refersh;
    private javax.swing.JButton btn_RegisterL;
    private javax.swing.JButton btn_register;
    private javax.swing.JDialog jDialog_AddSongs;
    private javax.swing.JDialog jDialog_Login;
    private javax.swing.JDialog jDialog_PlayList;
    private javax.swing.JDialog jDialog_Register;
    private javax.swing.JDialog jDialog_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_AddSong;
    private javax.swing.JMenuItem jMenuItem_Login;
    private javax.swing.JMenuItem jMenuItem_PlayList;
    private javax.swing.JMenuItem jMenuItem_Register;
    private javax.swing.JMenuItem jMenuItem_Search;
    private javax.swing.JMenu jMenu_Logout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txt_Search;
    // End of variables declaration//GEN-END:variables
}