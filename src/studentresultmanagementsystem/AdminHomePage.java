package studentresultmanagementsystem;

import javax.swing.JOptionPane;

//admin home page consist of all features like update student , insert student and student results, list student results.
public class AdminHomePage extends javax.swing.JFrame {

    public AdminHomePage() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 530));
        setMinimumSize(new java.awt.Dimension(700, 530));
        setPreferredSize(new java.awt.Dimension(700, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-student.png"))); // NOI18N
        jButton1.setText("Insert New Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, 60));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-edit student.png"))); // NOI18N
        jButton2.setText("Update New Student");
        jButton2.setMaximumSize(new java.awt.Dimension(141, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(141, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(141, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 250, 60));

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-checklist-30.png"))); // NOI18N
        jButton3.setText("List Students");
        jButton3.setMaximumSize(new java.awt.Dimension(141, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(141, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(141, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, 60));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-grade-24.png"))); // NOI18N
        jButton4.setText("Insert New Result");
        jButton4.setMaximumSize(new java.awt.Dimension(141, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(141, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(141, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 250, 60));

        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-checklist-30.png"))); // NOI18N
        jButton5.setText("List Students Results");
        jButton5.setMaximumSize(new java.awt.Dimension(141, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(141, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(141, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 60));

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-logout-50.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        InsertNewStudent frame = new InsertNewStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        UpdateStudentResult frame = new UpdateStudentResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        ListStudents frame = new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        InsertResult frame = new InsertResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        ListStudentResults frame = new ListStudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;

}
