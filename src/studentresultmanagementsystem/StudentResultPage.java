
package studentresultmanagementsystem;

import ConnectorPackage.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StudentResultPage extends javax.swing.JFrame {


    public StudentResultPage() {
        initComponents();
    }
    
    public StudentResultPage(String rollNo) {
        initComponents();
        jTextField2.setText(rollNo);
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 560));
        setMinimumSize(new java.awt.Dimension(700, 530));
        setPreferredSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Roll No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 93, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 152, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 152, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 32, 140, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 32, 140, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 90, 140, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 149, 140, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 149, 140, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Physics");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Mathematics");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("Chemistry");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Electrical");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Biology");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel12.setText("100");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel13.setText("100");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel14.setText("100");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel15.setText("100");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jLabel17.setText("30");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel18.setText("30");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel19.setText("30");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel20.setText("30");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel21.setText("30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 140, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 140, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 140, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 140, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 140, -1));

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel22.setText("Total Marks");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel23.setText("Passing Marks");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel24.setText("Marks Obtained");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, 20));

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel25.setText("Verdict");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 70, 40));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 100, 30));

        jLabel26.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel26.setText("Total");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 120, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-logout-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        String rollNo =jTextField2.getText();
        try{
            Connection con = ConnectionProvider.getcon();
            Statement st = con.prepareStatement("create", ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
            else{
                jTextField1.setText(rs.getString(1));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                
                jTextField10.setText(rs.getString(8));
                jTextField11.setText(rs.getString(9));
                jTextField12.setText(rs.getString(10));
                jTextField13.setText(rs.getString(11));
                jTextField14.setText(rs.getString(12));
                jTextField8.setText(rs.getString(13));
                
                jTextField1.setEditable(false);
                jTextField3.setEditable(false);
                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                
                jTextField10.setEditable(false);
                jTextField11.setEditable(false);
                jTextField12.setEditable(false);
                jTextField13.setEditable(false);
                jTextField14.setEditable(false);
                jTextField8.setEditable(false);
                
                int m1 = Integer.parseInt(rs.getString(8));
                int m2 = Integer.parseInt(rs.getString(9));
                int m3 = Integer.parseInt(rs.getString(10));
                int m4 = Integer.parseInt(rs.getString(11));
                int m5 = Integer.parseInt(rs.getString(12));
                
                if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30){
                    jTextField7.setText("Fail");
                }
                else{
                    jTextField7.setText("Pass");
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
}
