package examples;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.layout.GroupLayout;

/* JADX INFO: loaded from: GUIFormExamples.jar:examples/ContactEditor.class */
public class ContactEditor extends JFrame {
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JList jList1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;

    public ContactEditor() {
        initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jTextField3 = new JTextField();
        this.jLabel4 = new JLabel();
        this.jTextField4 = new JTextField();
        this.jLabel5 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jPanel2 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jTextField5 = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jList1 = new JList();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jLabel7 = new JLabel();
        this.jRadioButton1 = new JRadioButton();
        this.jRadioButton2 = new JRadioButton();
        this.jRadioButton3 = new JRadioButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        setDefaultCloseOperation(3);
        setTitle("E-mail Contacts");
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(" Name "));
        this.jLabel1.setText("First Name:");
        this.jLabel2.setText("Last Name:");
        this.jTextField1.setText("John");
        this.jTextField2.setText("Guy");
        this.jLabel3.setText("Title:");
        this.jTextField3.setText("Prof, DrSC");
        this.jLabel4.setText("Nickname:");
        this.jTextField4.setText("gui-master");
        this.jLabel5.setText("Display Format:");
        this.jComboBox1.setModel(new DefaultComboBoxModel(new String[]{"[Nickname]  First_Name + Last_Name"}));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(1).add(1, jPanel1Layout.createSequentialGroup().addContainerGap().add(jPanel1Layout.createParallelGroup(2).add(this.jLabel5).add(this.jLabel3).add(this.jLabel1)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(1).add(1, jPanel1Layout.createSequentialGroup().add(jPanel1Layout.createParallelGroup(1).add(this.jTextField3, -1, 157, 32767).add(2, this.jTextField1, -1, 157, 32767)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(2).add(this.jLabel2).add(this.jLabel4)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(1).add(this.jTextField2, -1, 157, 32767).add(this.jTextField4, -1, 157, 32767))).add(this.jComboBox1, -1, 376, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(1).add(1, jPanel1Layout.createSequentialGroup().add(jPanel1Layout.createParallelGroup(3).add(this.jLabel1).add(this.jTextField2, -2, -1, -2).add(this.jTextField1, -2, -1, -2).add(this.jLabel2)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(3).add(this.jLabel3).add(this.jTextField4, -2, -1, -2).add(this.jLabel4).add(this.jTextField3, -2, -1, -2)).addPreferredGap(0).add(jPanel1Layout.createParallelGroup(3).add(this.jLabel5).add(this.jComboBox1, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(" E-mail "));
        this.jLabel6.setText("E-mail Address:");
        this.jList1.setModel(new AbstractListModel() { // from class: examples.ContactEditor.1
            String[] strings = {"john.guy@xxxxxx.yyy", "gui@yyyyyy.xxx"};

            public int getSize() {
                return this.strings.length;
            }

            public Object getElementAt(int i) {
                return this.strings[i];
            }
        });
        this.jScrollPane1.setViewportView(this.jList1);
        this.jButton1.setText("Add");
        this.jButton2.setText("Edit");
        this.jButton3.setText("Remove");
        this.jButton4.setText("Default");
        this.jLabel7.setText("Mail Format:");
        this.buttonGroup1.add(this.jRadioButton1);
        this.jRadioButton1.setSelected(true);
        this.jRadioButton1.setText("HTML");
        this.jRadioButton1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jRadioButton1.setMargin(new Insets(0, 0, 0, 0));
        this.buttonGroup1.add(this.jRadioButton2);
        this.jRadioButton2.setText("Plain Text");
        this.jRadioButton2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jRadioButton2.setMargin(new Insets(0, 0, 0, 0));
        this.buttonGroup1.add(this.jRadioButton3);
        this.jRadioButton3.setText("Custom");
        this.jRadioButton3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jRadioButton3.setMargin(new Insets(0, 0, 0, 0));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(1).add(1, jPanel2Layout.createSequentialGroup().addContainerGap().add(jPanel2Layout.createParallelGroup(1).add(1, jPanel2Layout.createSequentialGroup().add(12, 12, 12).add(this.jRadioButton1).addPreferredGap(0).add(this.jRadioButton2).addPreferredGap(0).add(this.jRadioButton3)).add(1, jPanel2Layout.createSequentialGroup().add(jPanel2Layout.createParallelGroup(1).add(1, jPanel2Layout.createSequentialGroup().add(this.jLabel6).addPreferredGap(0).add(this.jTextField5, -1, 298, 32767)).add(this.jScrollPane1, -1, 376, 32767)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(1).add(this.jButton2).add(this.jButton1).add(this.jButton3).add(this.jButton4))).add(this.jLabel7)).addContainerGap()));
        jPanel2Layout.linkSize(new Component[]{this.jButton1, this.jButton2, this.jButton3, this.jButton4}, 1);
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(1).add(1, jPanel2Layout.createSequentialGroup().add(jPanel2Layout.createParallelGroup(3).add(this.jLabel6).add(this.jTextField5, -2, -1, -2).add(this.jButton1)).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(1).add(1, jPanel2Layout.createSequentialGroup().add(this.jButton2).addPreferredGap(0).add(this.jButton3).addPreferredGap(0).add(this.jButton4)).add(this.jScrollPane1, 0, 81, 32767)).addPreferredGap(0).add(this.jLabel7).addPreferredGap(0).add(jPanel2Layout.createParallelGroup(3).add(this.jRadioButton1).add(this.jRadioButton2).add(this.jRadioButton3)).addContainerGap()));
        this.jButton5.setText("Cancel");
        this.jButton6.setText("OK");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(1).add(1, layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(1).add(2, layout.createSequentialGroup().add(this.jButton6).addPreferredGap(0).add(this.jButton5)).add(this.jPanel1, 0, -1, 32767).add(2, this.jPanel2)).addContainerGap()));
        layout.linkSize(new Component[]{this.jButton5, this.jButton6}, 1);
        layout.setVerticalGroup(layout.createParallelGroup(1).add(1, layout.createSequentialGroup().addContainerGap().add(this.jPanel1, -2, -1, -2).addPreferredGap(0).add(this.jPanel2).addPreferredGap(0).add(layout.createParallelGroup(3).add(this.jButton5).add(this.jButton6)).addContainerGap()));
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
            Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, (String) null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex);
        } catch (IllegalAccessException ex2) {
            Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex2);
        } catch (InstantiationException ex3) {
            Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex3);
        }
        EventQueue.invokeLater(new Runnable() { // from class: examples.ContactEditor.2
            @Override // java.lang.Runnable
            public void run() {
                new ContactEditor().setVisible(true);
            }
        });
    }
}
