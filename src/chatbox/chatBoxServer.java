/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author ZhengKhai
 */
public class chatBoxServer extends javax.swing.JFrame {

    static ChatBox server;
    final static int port = 9000;
    /**
     * Creates new form chatBoxClient
     */
    public chatBoxServer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jPanel5 = new JPanel();
        jLabel4 = new JLabel();
        jLabel11 = new JLabel();
        jLabel6 = new JLabel();
        jPanel3 = new JPanel();
        jPanel8 = new JPanel();
        jLabel13 = new JLabel();
        jTextField1 = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel7 = new JLabel();
        jPanel6 = new JPanel();
        jLabel8 = new JLabel();
        jLabel12 = new JLabel();
        jPanel7 = new JPanel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(3);
        Container contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
            0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
            . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
            red ) ,jPanel1. getBorder () ) ); jPanel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
            beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //======== jPanel2 ========
            {

                //======== jPanel4 ========
                {

                    //---- jLabel1 ----
                    jLabel1.setHorizontalAlignment(0);
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/materialdesignicon/home-white-18dp/2x/baseline_home_white_18dp.png")));

                    //---- jLabel2 ----
                    jLabel2.setHorizontalAlignment(0);
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/materialdesignicon/contact_support-white-18dp/2x/baseline_contact_support_white_18dp.png")));

                    //---- jLabel3 ----
                    jLabel3.setHorizontalAlignment(0);
                    jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/materialdesignicon/chat_bubble_outline-white-18dp/2x/baseline_chat_bubble_outline_white_18dp.png")));

                    //---- jLabel5 ----
                    jLabel5.setHorizontalAlignment(0);
                    jLabel5.setIcon(new ImageIcon(getClass().getResource("/bug_report-white-18dp/2x/baseline_bug_report_white_18dp.png")));

                    GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
                    jPanel4.setLayout(jPanel4Layout);
                    jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup()
                            .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    );
                    jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup()
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(112, Short.MAX_VALUE))
                    );
                }

                //======== jPanel5 ========
                {

                    //---- jLabel4 ----
                    jLabel4.setHorizontalAlignment(0);
                    jLabel4.setIcon(new ImageIcon(getClass().getResource("/face-white-18dp/2x/baseline_face_white_18dp.png")));

                    //---- jLabel11 ----
                    jLabel11.setHorizontalAlignment(2);
                    jLabel11.setText("Typing . . .");

                    GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
                    jPanel5.setLayout(jPanel5Layout);
                    jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup()
                            .addGroup(jPanel5Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addContainerGap(146, Short.MAX_VALUE)
                                    .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                    jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup()
                            .addGroup(jPanel5Layout.createParallelGroup()
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap()))
                            .addComponent(jLabel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    );
                }

                //---- jLabel6 ----
                jLabel6.setHorizontalAlignment(0);
                jLabel6.setIcon(new ImageIcon(getClass().getResource("/whiteadmin.png")));

                //======== jPanel3 ========
                {

                    //======== jPanel8 ========
                    {

                        //---- jLabel13 ----
                        jLabel13.setHorizontalAlignment(0);
                        jLabel13.setIcon(new ImageIcon(getClass().getResource("/send-white-18dp/2x/baseline_send_white_18dp.png")));

                        //---- jTextField1 ----
                        jTextField1.setText("Type Here . . .");

                        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
                        jPanel8.setLayout(jPanel8Layout);
                        jPanel8Layout.setHorizontalGroup(
                            jPanel8Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addContainerGap(22, Short.MAX_VALUE)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                        );
                        jPanel8Layout.setVerticalGroup(
                            jPanel8Layout.createParallelGroup()
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel8Layout.createParallelGroup()
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jTextField1))
                                    .addContainerGap())
                        );
                    }

                    //======== jScrollPane1 ========
                    {

                        //---- jTextArea1 ----
                        jTextArea1.setColumns(20);
                        jTextArea1.setRows(5);
                        jScrollPane1.setViewportView(jTextArea1);
                    }

                    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup()
                                    .addComponent(jScrollPane1)
                                    .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    );
                }

                //---- jLabel7 ----
                jLabel7.setHorizontalAlignment(2);
                jLabel7.setIcon(new ImageIcon(getClass().getResource("/liveuser20blue.png")));

                //======== jPanel6 ========
                {

                    //---- jLabel8 ----
                    jLabel8.setHorizontalAlignment(0);
                    jLabel8.setIcon(new ImageIcon(getClass().getResource("/face-white-18dp/2x/baseline_face_white_18dp.png")));

                    //---- jLabel12 ----
                    jLabel12.setHorizontalAlignment(2);
                    jLabel12.setText("Typing . . .");

                    GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
                    jPanel6.setLayout(jPanel6Layout);
                    jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup()
                            .addGroup(jPanel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap(155, Short.MAX_VALUE)
                                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                    jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup()
                            .addGroup(jPanel6Layout.createParallelGroup()
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap()))
                            .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    );
                }

                //======== jPanel7 ========
                {

                    //---- jLabel9 ----
                    jLabel9.setHorizontalAlignment(0);
                    jLabel9.setIcon(new ImageIcon(getClass().getResource("/face-white-18dp/2x/baseline_face_white_18dp.png")));

                    //---- jLabel10 ----
                    jLabel10.setHorizontalAlignment(2);
                    jLabel10.setText("Typing . . .");

                    GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                    jPanel7.setLayout(jPanel7Layout);
                    jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup()
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup()
                            .addComponent(jLabel9, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup()
                                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                .addComponent(jPanel7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatBoxServer().setVisible(true);
            }
        });
        server = new ChatBox(port);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JPanel jPanel5;
    private JLabel jLabel4;
    private JLabel jLabel11;
    private JLabel jLabel6;
    private JPanel jPanel3;
    private JPanel jPanel8;
    private JLabel jLabel13;
    private JTextField jTextField1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JLabel jLabel7;
    private JPanel jPanel6;
    private JLabel jLabel8;
    private JLabel jLabel12;
    private JPanel jPanel7;
    private JLabel jLabel9;
    private JLabel jLabel10;
    // End of variables declaration//GEN-END:variables


}
