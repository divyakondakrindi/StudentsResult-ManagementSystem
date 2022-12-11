
package studentresultmanagementsystem;

import ConnectorPackage.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InsertNewStudent extends javax.swing.JFrame {


    public InsertNewStudent() {
        initComponents();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 480));
        setMinimumSize(new java.awt.Dimension(600, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 108, 34));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel2.setText("Roll Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, 108, 34));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 157, 108, 35));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 224, 108, 37));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel5.setText("Course Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 293, 108, 38));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        jLabel6.setText("Branch Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 370, 108, 35));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 139, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 99, 139, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 231, 139, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male\t", "Female" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 163, 139, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 301, 139, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "CS", "Electronics", "Mechanical", "Chemical", " " }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 376, 139, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-submit-document-32.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/icons8-cancel-24.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementsystem/wp4720655-anime-school-aesthetic-wallpapers.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1250, -570, 1850, 1050));

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        String rollNo = jTextField2.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        String fatherName = jTextField3.getText();
        String course = (String)jComboBox2.getSelectedItem();
        String branch = (String)jComboBox3.getSelectedItem();
        
        try{
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+ name + "', '" + rollNo +"', '"+ gender +"', '"+ fatherName +"', '"+ course +"', '"+ branch +"')");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            InsertNewStudent frame = new InsertNewStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(InsertNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertNewStudent().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;

}
