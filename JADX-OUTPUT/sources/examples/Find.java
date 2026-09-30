package examples;

import java.awt.EventQueue;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.layout.GroupLayout;

/* JADX INFO: loaded from: GUIFormExamples.jar:examples/Find.class */
public class Find extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private JCheckBox jCheckBox3;
    private JCheckBox jCheckBox4;
    private JLabel jLabel1;
    private JTextField jTextField1;

    public Find() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jCheckBox1 = new JCheckBox();
        this.jCheckBox2 = new JCheckBox();
        this.jCheckBox3 = new JCheckBox();
        this.jCheckBox4 = new JCheckBox();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        setDefaultCloseOperation(3);
        setTitle("Find");
        this.jLabel1.setText("Find What:");
        this.jCheckBox1.setText("Match Case");
        this.jCheckBox1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jCheckBox1.setMargin(new Insets(0, 0, 0, 0));
        this.jCheckBox2.setText("Wrap Around");
        this.jCheckBox2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jCheckBox2.setMargin(new Insets(0, 0, 0, 0));
        this.jCheckBox3.setText("Whole Words");
        this.jCheckBox3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jCheckBox3.setMargin(new Insets(0, 0, 0, 0));
        this.jCheckBox4.setText("Search Backwards");
        this.jCheckBox4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jCheckBox4.setMargin(new Insets(0, 0, 0, 0));
        this.jButton1.setText("Find");
        this.jButton2.setText("Cancel");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(1).add(1, layout.createSequentialGroup().addContainerGap().add(this.jLabel1).addPreferredGap(0).add(layout.createParallelGroup(1).add(this.jTextField1, -1, 192, 32767).add(1, layout.createSequentialGroup().add(layout.createParallelGroup(1).add(this.jCheckBox3).add(this.jCheckBox1)).addPreferredGap(0).add(layout.createParallelGroup(1).add(this.jCheckBox2).add(this.jCheckBox4)))).addPreferredGap(0).add(layout.createParallelGroup(1, false).add(this.jButton1, -1, -1, 32767).add(2, this.jButton2, -1, -1, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(1).add(1, layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(3).add(this.jLabel1).add(this.jTextField1, -2, -1, -2).add(this.jButton1)).addPreferredGap(0).add(layout.createParallelGroup(1).add(1, layout.createSequentialGroup().add(layout.createParallelGroup(3).add(this.jCheckBox1).add(this.jCheckBox2)).addPreferredGap(0).add(layout.createParallelGroup(3).add(this.jCheckBox3).add(this.jCheckBox4))).add(this.jButton2)).addContainerGap(-1, 32767)));
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
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, (String) null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex);
        } catch (IllegalAccessException ex2) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex2);
        } catch (InstantiationException ex3) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex3);
        }
        EventQueue.invokeLater(new Runnable() { // from class: examples.Find.1
            @Override // java.lang.Runnable
            public void run() {
                new Find().setVisible(true);
            }
        });
    }
}
