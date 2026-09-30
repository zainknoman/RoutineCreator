package examples;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.layout.GroupLayout;

/* JADX INFO: loaded from: GUIFormExamples.jar:examples/Antenna.class */
public class Antenna extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JCheckBox jCheckBox1;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField8;
    private JTextField jTextField9;

    public Antenna() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jCheckBox1 = new JCheckBox();
        this.jPanel2 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jTextField3 = new JTextField();
        this.jLabel8 = new JLabel();
        this.jTextField4 = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.jTextField5 = new JTextField();
        this.jLabel9 = new JLabel();
        this.jTextField6 = new JTextField();
        this.jButton1 = new JButton();
        this.jTextField8 = new JTextField();
        this.jLabel10 = new JLabel();
        this.jTextField9 = new JTextField();
        this.jButton2 = new JButton();
        this.jComboBox2 = new JComboBox();
        this.jButton5 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        setDefaultCloseOperation(3);
        setTitle("Antenna");
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(" Position/Direction "));
        this.jLabel1.setText("Direction [°]:");
        this.jLabel2.setText("Height [m]:");
        this.jTextField1.setText("140.000");
        this.jTextField2.setText("110.000");
        this.jCheckBox1.setText("Height is Lower Edge (Not Center)");
        this.jCheckBox1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jCheckBox1.setMargin(new Insets(0, 0, 0, 0));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(1).add(jPanel1Layout.createSequentialGroup().addContainerGap().add(jPanel1Layout.createParallelGroup(2).add(this.jLabel2).add(this.jLabel1)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(1).add(this.jCheckBox1).add(this.jTextField2, -1, 376, 32767).add(this.jTextField1, -1, 376, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(1).add(jPanel1Layout.createSequentialGroup().add(jPanel1Layout.createParallelGroup(3).add(this.jLabel1).add(this.jTextField1, -2, -1, -2)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(3).add(this.jLabel2).add(this.jTextField2, -2, -1, -2)).addPreferredGap(0).add(this.jCheckBox1).addContainerGap(-1, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(" System "));
        this.jLabel3.setText("Channels:");
        this.jLabel4.setText("Antenna Type:");
        this.jLabel5.setText("Electrical Downtilt From [°]:");
        this.jLabel6.setText("Polarization:");
        this.jLabel7.setText("Frequency From [MHz]:");
        this.jTextField3.setText("2");
        this.jLabel8.setText("Watts:");
        this.jTextField4.setText("12.000");
        this.jComboBox1.setModel(new DefaultComboBoxModel(new String[]{"Kathrein 742151"}));
        this.jTextField5.setText("0.000");
        this.jLabel9.setText("To:");
        this.jTextField6.setText("10.000");
        this.jButton1.setText("Adjust");
        this.jTextField8.setText("943.000");
        this.jLabel10.setText("To:");
        this.jTextField9.setText("951.000");
        this.jButton2.setText("Adjust");
        this.jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"X +45°"}));
        this.jButton5.setText("Adjust");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(1).add(jPanel2Layout.createSequentialGroup().addContainerGap().add(jPanel2Layout.createParallelGroup(1).add(2, this.jLabel7).add(2, this.jLabel6).add(2, this.jLabel5).add(2, this.jLabel4).add(2, this.jLabel3)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(1).add(this.jComboBox1, 0, 307, 32767).add(jPanel2Layout.createSequentialGroup().add(jPanel2Layout.createParallelGroup(1).add(this.jTextField8, -1, 98, 32767).add(this.jTextField5, -1, 98, 32767).add(this.jTextField3, -1, 98, 32767)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(2).add(this.jLabel8).add(this.jLabel9).add(this.jLabel10)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(1).add(2, this.jTextField4, -1, 97, 32767).add(2, this.jTextField6, -1, 97, 32767).add(2, this.jTextField9, -1, 97, 32767)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(1).add(this.jButton5).add(this.jButton1).add(this.jButton2))).add(this.jComboBox2, 0, 307, 32767)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(1).add(jPanel2Layout.createSequentialGroup().add(jPanel2Layout.createParallelGroup(3).add(this.jLabel3).add(this.jTextField3, -2, -1, -2).add(this.jLabel8).add(this.jTextField4, -2, -1, -2).add(this.jButton5)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(3).add(this.jLabel4).add(this.jComboBox1, -2, -1, -2)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(3).add(this.jLabel5).add(this.jTextField5, -2, -1, -2).add(this.jButton1).add(this.jTextField6, -2, -1, -2).add(this.jLabel9)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(3).add(this.jLabel6).add(this.jComboBox2, -2, -1, -2)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(3).add(this.jLabel7).add(this.jTextField8, -2, -1, -2).add(this.jButton2).add(this.jTextField9, -2, -1, -2).add(this.jLabel10)).addContainerGap(-1, 32767)));
        this.jButton3.setText("Cancel");
        this.jButton4.setText("OK");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(1).add(this.jPanel2, -1, -1, 32767).add(this.jPanel1, -1, -1, 32767).add(2, layout.createSequentialGroup().add(this.jButton4).addPreferredGap(0).add(this.jButton3))).addContainerGap()));
        layout.linkSize(new Component[]{this.jButton3, this.jButton4}, 1);
        layout.setVerticalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().addContainerGap().add(this.jPanel1, -2, -1, -2).addPreferredGap(0).add(this.jPanel2, -2, -1, -2).addPreferredGap(0, -1, 32767).add(layout.createParallelGroup(3).add(this.jButton3).add(this.jButton4)).addContainerGap()));
        pack();
    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] installedLookAndFeels = UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(Antenna.class.getName()).log(Level.SEVERE, (String) null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Antenna.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex);
        } catch (IllegalAccessException ex2) {
            Logger.getLogger(Antenna.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex2);
        } catch (InstantiationException ex3) {
            Logger.getLogger(Antenna.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex3);
        }
        EventQueue.invokeLater(new Runnable() { // from class: examples.Antenna.1
            @Override // java.lang.Runnable
            public void run() {
                new Antenna().setVisible(true);
            }
        });
    }
}
