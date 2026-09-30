package defpackage;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/* JADX INFO: loaded from: GUIFormExamples.jar:MainWindow.class */
public class MainWindow extends JFrame {
    private static final String pattern = "dd MMMMM yyyy";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("da", "DK"));
    private static final String tdate = simpleDateFormat.format(new Date());
    private static final String[] StartBlocks = {"******************************************************************************", "*  Developed By          :  ", "*  Purpose                   : ", "*  Date                          :  " + tdate, "******************************************************************************", "", " SUBROUTINE ", "", " $INSERT I_COMMON", " $INSERT I_EQUATE", "I_F", "", "*$INSERT I_ENQUIRY.COMMON", "", " GOSUB INIT", " GOSUB PROCESS"};
    private static final String[] apps = {"ACCOUNT", "CUSTOMER", "FUNDS.TRANSFER", "TELLER", "DRAWINGS", "STMT.ENTRY", "STMT.PRINTED", "STMT.ENTRY.DETAIL", "REPO", "SEC.TRADE", "MM.MONEY.MARKET", "FOREX", "ACCOUNT.CLOSURE", "LD.LOANS.AND.DEPOSITS", "MG.MORTGAGE", "USER"};
    private static final String[] type = {"", "$HIS", "$NAU"};
    String position = "";
    private JButton btn_add;
    private JButton btn_add_all;
    private JButton btn_add_fld;
    private JButton btn_add_fun_post;
    private JButton btn_del;
    private JButton btn_del_all;
    private JButton btn_del_fld;
    private JButton btn_eval;
    private JButton btn_fun_add;
    private JButton btn_fun_del;
    private JButton btn_gen;
    private JButton btn_ofs;
    private JButton btn_ofs_post;
    private JButton btn_reset;
    private JButton btn_tem;
    private JButton btn_write;
    private JCheckBox chk_con;
    private JCheckBox chk_hdr;
    private Choice dl_apps;
    private Choice dl_fld;
    private Choice dl_fun;
    private Choice dl_type;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private Label label1;
    private Label label10;
    private Label label11;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    private Label label6;
    private Label label7;
    private Label label8;
    private Label label9;
    private JLabel lbl_line;
    private Label lbl_msg;
    private List lst_fld;
    private List lst_fun;
    private List lst_tables;
    private TextArea txt_code;
    private JTextField txt_dev;
    private JTextField txt_pur;
    private TextField txt_rtn;
    private JTextField txt_sep;
    private JTextField txt_sr_fld;

    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.label1 = new Label();
        this.txt_rtn = new TextField();
        this.label2 = new Label();
        this.dl_apps = new Choice();
        this.lst_tables = new List();
        this.label3 = new Label();
        this.dl_type = new Choice();
        this.label5 = new Label();
        this.label4 = new Label();
        this.dl_fun = new Choice();
        this.label6 = new Label();
        this.lst_fun = new List();
        this.label7 = new Label();
        this.label9 = new Label();
        this.lst_fld = new List();
        this.label10 = new Label();
        this.dl_fld = new Choice();
        this.btn_add_all = new JButton();
        this.btn_del_all = new JButton();
        this.chk_con = new JCheckBox();
        this.txt_sep = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.txt_dev = new JTextField();
        this.jLabel3 = new JLabel();
        this.txt_pur = new JTextField();
        this.txt_sr_fld = new JTextField();
        this.label11 = new Label();
        this.chk_hdr = new JCheckBox();
        this.btn_add_fun_post = new JButton();
        this.lbl_line = new JLabel();
        this.btn_gen = new JButton();
        this.btn_fun_add = new JButton();
        this.btn_fun_del = new JButton();
        this.btn_reset = new JButton();
        this.btn_add = new JButton();
        this.btn_del = new JButton();
        this.btn_add_fld = new JButton();
        this.btn_del_fld = new JButton();
        this.btn_tem = new JButton();
        this.btn_ofs = new JButton();
        this.btn_write = new JButton();
        this.btn_eval = new JButton();
        this.btn_ofs_post = new JButton();
        this.txt_code = new TextArea();
        this.label8 = new Label();
        this.lbl_msg = new Label();
        setDefaultCloseOperation(3);
        setTitle("T24 InfoBasic Routine Code Generator");
        addWindowListener(new WindowAdapter() { // from class: MainWindow.1
            public void windowOpened(WindowEvent evt) {
                MainWindow.this.formWindowOpened(evt);
            }
        });
        this.jPanel1.setLayout(new AbsoluteLayout());
        this.jPanel2.setBackground(new Color(204, 204, 204));
        this.jPanel2.setLayout(new AbsoluteLayout());
        this.label1.setFont(new Font("Calibri", 1, 13));
        this.label1.setForeground(new Color(51, 51, 51));
        this.label1.setText("Routine Name");
        this.jPanel2.add(this.label1, new AbsoluteConstraints(20, 20, -1, -1));
        this.jPanel2.add(this.txt_rtn, new AbsoluteConstraints(137, 17, 197, 21));
        this.label2.setFont(new Font("Calibri", 0, 14));
        this.label2.setText("Applcations");
        this.jPanel2.add(this.label2, new AbsoluteConstraints(20, 50, -1, -1));
        this.dl_apps.setFont(new Font("Calibri", 0, 11));
        this.dl_apps.addItemListener(new ItemListener() { // from class: MainWindow.2
            public void itemStateChanged(ItemEvent evt) {
                MainWindow.this.dl_appsItemStateChanged(evt);
            }
        });
        this.jPanel2.add(this.dl_apps, new AbsoluteConstraints(137, 52, 265, -1));
        this.jPanel2.add(this.lst_tables, new AbsoluteConstraints(420, 70, 246, 110));
        this.label3.setFont(new Font("Calibri", 0, 14));
        this.label3.setText("History / Un auth");
        this.jPanel2.add(this.label3, new AbsoluteConstraints(20, 80, -1, -1));
        this.dl_type.setFont(new Font("Calibri", 0, 11));
        this.jPanel2.add(this.dl_type, new AbsoluteConstraints(137, 82, 265, 21));
        this.label5.setFont(new Font("Calibri", 1, 13));
        this.label5.setForeground(new Color(51, 51, 51));
        this.label5.setText("Tables Added");
        this.jPanel2.add(this.label5, new AbsoluteConstraints(420, 50, -1, 20));
        this.label4.setFont(new Font("Calibri", 0, 14));
        this.label4.setText("Functions");
        this.jPanel2.add(this.label4, new AbsoluteConstraints(330, 260, 70, -1));
        this.dl_fun.setFont(new Font("Calibri", 0, 11));
        this.jPanel2.add(this.dl_fun, new AbsoluteConstraints(420, 260, 250, -1));
        this.label6.setFont(new Font("Calibri", 1, 13));
        this.label6.setForeground(new Color(51, 51, 51));
        this.label6.setText("Functions Added");
        this.jPanel2.add(this.label6, new AbsoluteConstraints(1000, 50, -1, -1));
        this.jPanel2.add(this.lst_fun, new AbsoluteConstraints(1002, 76, 247, 240));
        this.label7.setFont(new Font("Calibri", 1, 13));
        this.label7.setForeground(new Color(51, 51, 51));
        this.label7.setText("Routine Codes");
        this.jPanel2.add(this.label7, new AbsoluteConstraints(420, 190, 100, -1));
        this.label7.getAccessibleContext().setAccessibleName("Routine Codes");
        this.label9.setFont(new Font("Calibri", 1, 13));
        this.label9.setForeground(new Color(51, 51, 51));
        this.label9.setText("Fields Added");
        this.jPanel2.add(this.label9, new AbsoluteConstraints(730, 50, -1, -1));
        this.jPanel2.add(this.lst_fld, new AbsoluteConstraints(727, 76, 246, 240));
        this.label10.setFont(new Font("Calibri", 0, 14));
        this.label10.setText("Search Fields");
        this.jPanel2.add(this.label10, new AbsoluteConstraints(20, 220, 110, -1));
        this.dl_fld.setFont(new Font("Calibri", 0, 11));
        this.jPanel2.add(this.dl_fld, new AbsoluteConstraints(142, 147, 260, -1));
        this.btn_add_all.setText("+ All");
        this.btn_add_all.addActionListener(new ActionListener() { // from class: MainWindow.3
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_add_allActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_add_all, new AbsoluteConstraints(140, 180, -1, -1));
        this.btn_del_all.setForeground(new Color(102, 0, 51));
        this.btn_del_all.setText("-All");
        this.btn_del_all.addActionListener(new ActionListener() { // from class: MainWindow.4
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_del_allActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_del_all, new AbsoluteConstraints(210, 180, -1, -1));
        this.chk_con.setForeground(new Color(51, 51, 51));
        this.chk_con.setText("Fields within array");
        this.jPanel2.add(this.chk_con, new AbsoluteConstraints(20, 250, -1, -1));
        this.jPanel2.add(this.txt_sep, new AbsoluteConstraints(160, 250, 34, -1));
        this.jLabel1.setForeground(new Color(51, 51, 51));
        this.jLabel1.setText("Seperator");
        this.jPanel2.add(this.jLabel1, new AbsoluteConstraints(200, 250, -1, 20));
        this.jLabel2.setText("Developer");
        this.jPanel2.add(this.jLabel2, new AbsoluteConstraints(350, 20, -1, -1));
        this.jPanel2.add(this.txt_dev, new AbsoluteConstraints(410, 20, 254, -1));
        this.jLabel3.setText("Purpose");
        this.jPanel2.add(this.jLabel3, new AbsoluteConstraints(680, 20, -1, -1));
        this.jPanel2.add(this.txt_pur, new AbsoluteConstraints(730, 17, 450, -1));
        this.txt_sr_fld.addKeyListener(new KeyAdapter() { // from class: MainWindow.5
            public void keyReleased(KeyEvent evt) {
                MainWindow.this.txt_sr_fldKeyReleased(evt);
            }
        });
        this.jPanel2.add(this.txt_sr_fld, new AbsoluteConstraints(140, 220, 260, -1));
        this.label11.setFont(new Font("Calibri", 0, 14));
        this.label11.setText("Fields");
        this.jPanel2.add(this.label11, new AbsoluteConstraints(27, 147, 62, -1));
        this.chk_hdr.setForeground(new Color(51, 51, 51));
        this.chk_hdr.setText("Add fields headers in array ");
        this.chk_hdr.setToolTipText("");
        this.jPanel2.add(this.chk_hdr, new AbsoluteConstraints(20, 280, 210, -1));
        this.btn_add_fun_post.setText("Add");
        this.btn_add_fun_post.addActionListener(new ActionListener() { // from class: MainWindow.6
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_add_fun_postActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_add_fun_post, new AbsoluteConstraints(620, 290, -1, -1));
        this.lbl_line.setText("Select Line");
        this.jPanel2.add(this.lbl_line, new AbsoluteConstraints(560, 290, -1, 20));
        this.btn_gen.setForeground(new Color(0, 102, 0));
        this.btn_gen.setText("Generate");
        this.btn_gen.addActionListener(new ActionListener() { // from class: MainWindow.7
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_genActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_gen, new AbsoluteConstraints(20, 313, 80, 30));
        this.btn_fun_add.setText("Add");
        this.btn_fun_add.addActionListener(new ActionListener() { // from class: MainWindow.8
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_fun_addActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_fun_add, new AbsoluteConstraints(410, 290, -1, -1));
        this.btn_fun_del.setForeground(new Color(102, 0, 51));
        this.btn_fun_del.setText("Remove");
        this.btn_fun_del.addActionListener(new ActionListener() { // from class: MainWindow.9
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_fun_delActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_fun_del, new AbsoluteConstraints(470, 290, -1, -1));
        this.btn_reset.setForeground(new Color(51, 51, 51));
        this.btn_reset.setText("Reset");
        this.btn_reset.addActionListener(new ActionListener() { // from class: MainWindow.10
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_resetActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_reset, new AbsoluteConstraints(1190, 13, -1, 30));
        this.btn_add.setText("Add");
        this.btn_add.addActionListener(new ActionListener() { // from class: MainWindow.11
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_addActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_add, new AbsoluteConstraints(270, 110, -1, -1));
        this.btn_del.setForeground(new Color(102, 0, 51));
        this.btn_del.setText("Remove");
        this.btn_del.addActionListener(new ActionListener() { // from class: MainWindow.12
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_delActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_del, new AbsoluteConstraints(330, 110, -1, -1));
        this.btn_add_fld.setText("Add");
        this.btn_add_fld.addActionListener(new ActionListener() { // from class: MainWindow.13
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_add_fldActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_add_fld, new AbsoluteConstraints(270, 180, -1, -1));
        this.btn_del_fld.setForeground(new Color(102, 0, 51));
        this.btn_del_fld.setText("Remove");
        this.btn_del_fld.addActionListener(new ActionListener() { // from class: MainWindow.14
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_del_fldActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_del_fld, new AbsoluteConstraints(330, 180, -1, -1));
        this.btn_tem.setText("Template");
        this.btn_tem.addActionListener(new ActionListener() { // from class: MainWindow.15
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_temActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_tem, new AbsoluteConstraints(450, 220, 80, -1));
        this.btn_ofs.setText("OGM");
        this.btn_ofs.addActionListener(new ActionListener() { // from class: MainWindow.16
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_ofsActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_ofs, new AbsoluteConstraints(550, 190, -1, -1));
        this.btn_write.setText("RD/WR");
        this.btn_write.addActionListener(new ActionListener() { // from class: MainWindow.17
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_writeActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_write, new AbsoluteConstraints(540, 220, -1, -1));
        this.btn_eval.setText("EVAL");
        this.btn_eval.addActionListener(new ActionListener() { // from class: MainWindow.18
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_evalActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_eval, new AbsoluteConstraints(610, 220, -1, -1));
        this.btn_ofs_post.setText("OPM");
        this.btn_ofs_post.addActionListener(new ActionListener() { // from class: MainWindow.19
            public void actionPerformed(ActionEvent evt) {
                MainWindow.this.btn_ofs_postActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.btn_ofs_post, new AbsoluteConstraints(610, 190, -1, -1));
        this.jPanel1.add(this.jPanel2, new AbsoluteConstraints(10, 0, 2135, 350));
        this.txt_code.addMouseListener(new MouseAdapter() { // from class: MainWindow.20
            public void mouseReleased(MouseEvent evt) {
                MainWindow.this.txt_codeMouseReleased(evt);
            }
        });
        this.jPanel1.add(this.txt_code, new AbsoluteConstraints(10, 358, 1257, 310));
        this.label8.setFont(new Font("Calibri", 0, 11));
        this.label8.setText("Developed by Muhammad Omer");
        this.jPanel1.add(this.label8, new AbsoluteConstraints(1080, 680, 190, -1));
        this.lbl_msg.setForeground(new Color(102, 0, 0));
        this.jPanel1.add(this.lbl_msg, new AbsoluteConstraints(20, 680, 860, 20));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 1282, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));
        pack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void formWindowOpened(WindowEvent evt) {
        try {
            int alen = apps.length;
            Arrays.sort(apps);
            this.dl_apps.add("SELECT");
            for (int i = 0; i < alen; i++) {
                this.dl_apps.add(apps[i]);
            }
            int tlen = type.length;
            for (int i2 = 0; i2 < tlen; i2++) {
                this.dl_type.add(type[i2]);
            }
            Functions fnc = new Functions();
            Arrays.sort(fnc.aFun);
            int flen = fnc.aFun.length;
            this.dl_fun.add("SELECT");
            this.dl_fld.add("SELECT");
            for (int i3 = 0; i3 < flen; i3++) {
                this.dl_fun.add(fnc.aFun[i3]);
            }
            setResizable(false);
            Font fn_style = new Font("Calibri", 1, 12);
            this.txt_code.setFont(fn_style);
            this.lbl_line.setVisible(false);
            this.lbl_msg.setVisible(true);
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_del_allActionPerformed(ActionEvent evt) {
        this.lst_fld.removeAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_add_allActionPerformed(ActionEvent evt) {
        if (this.dl_fld.getItemCount() > 1) {
            for (int j = 0; j < this.dl_fld.getItemCount(); j++) {
                this.lst_fld.add(this.dl_fld.getItem(j));
            }
            this.lbl_msg.setText("All fields added");
            return;
        }
        this.lbl_msg.setText("please select table");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dl_appsItemStateChanged(ItemEvent evt) {
        String item = this.dl_apps.getSelectedItem();
        if (!"SELECT".equals(item)) {
            if (item.equals("ACCOUNT")) {
                Fields fld = new Fields();
                String[] arr = fld.I_F_Account;
                this.dl_fld.removeAll();
                for (String str : arr) {
                    this.dl_fld.add(str);
                }
                return;
            }
            if (item.equals("CUSTOMER")) {
                Fields fld2 = new Fields();
                String[] arr2 = fld2.I_F_Customer;
                this.dl_fld.removeAll();
                for (String str2 : arr2) {
                    this.dl_fld.add(str2);
                }
                return;
            }
            if (item.equals("FUNDS.TRANSFER")) {
                Fields fld3 = new Fields();
                String[] arr3 = fld3.I_F_FundsTransfer;
                this.dl_fld.removeAll();
                for (String str3 : arr3) {
                    this.dl_fld.add(str3);
                }
                return;
            }
            if (item.equals("MG.MORTGAGE")) {
                Fields fld4 = new Fields();
                String[] arr4 = fld4.I_F_Mortgage;
                this.dl_fld.removeAll();
                for (String str4 : arr4) {
                    this.dl_fld.add(str4);
                }
                return;
            }
            if (item.equals("TELLER")) {
                Fields fld5 = new Fields();
                String[] arr5 = fld5.I_FTeller;
                this.dl_fld.removeAll();
                for (String str5 : arr5) {
                    this.dl_fld.add(str5);
                }
                return;
            }
            if (item.equals("DRAWINGS")) {
                Fields fld6 = new Fields();
                String[] arr6 = fld6.I_FDrawings;
                this.dl_fld.removeAll();
                for (String str6 : arr6) {
                    this.dl_fld.add(str6);
                }
                return;
            }
            if (item.equals("STMT.ENTRY")) {
                Fields fld7 = new Fields();
                String[] arr7 = fld7.I_FStmt_Entry;
                this.dl_fld.removeAll();
                for (String str7 : arr7) {
                    this.dl_fld.add(str7);
                }
                return;
            }
            if (item.equals("REPO")) {
                Fields fld8 = new Fields();
                String[] arr8 = fld8.I_F_Repo;
                this.dl_fld.removeAll();
                for (String str8 : arr8) {
                    this.dl_fld.add(str8);
                }
                return;
            }
            if (item.equals("SEC.TRADE")) {
                Fields fld9 = new Fields();
                String[] arr9 = fld9.I_F_SecTrade;
                this.dl_fld.removeAll();
                for (String str9 : arr9) {
                    this.dl_fld.add(str9);
                }
                return;
            }
            if (item.equals("MM.MONEY.MARKET")) {
                Fields fld10 = new Fields();
                String[] arr10 = fld10.I_F_MoneyMarket;
                this.dl_fld.removeAll();
                for (String str10 : arr10) {
                    this.dl_fld.add(str10);
                }
                return;
            }
            if (item.equals("FOREX")) {
                Fields fld11 = new Fields();
                String[] arr11 = fld11.I_F_Forex;
                this.dl_fld.removeAll();
                for (String str11 : arr11) {
                    this.dl_fld.add(str11);
                }
                return;
            }
            if (item.equals("ACCOUNT.CLOSURE")) {
                Fields fld12 = new Fields();
                String[] arr12 = fld12.I_F_AccountClosure;
                this.dl_fld.removeAll();
                for (String str12 : arr12) {
                    this.dl_fld.add(str12);
                }
                return;
            }
            if (item.equals("LD.LOANS.AND.DEPOSITS")) {
                Fields fld13 = new Fields();
                String[] arr13 = fld13.I_F_LoanNDeposit;
                this.dl_fld.removeAll();
                for (String str13 : arr13) {
                    this.dl_fld.add(str13);
                }
                return;
            }
            if (item.equals("USER")) {
                Fields fld14 = new Fields();
                String[] arr14 = fld14.I_F_User;
                this.dl_fld.removeAll();
                for (String str14 : arr14) {
                    this.dl_fld.add(str14);
                }
                return;
            }
            return;
        }
        this.dl_fld.removeAll();
        this.dl_fld.add("SELECT");
        this.dl_fld.select("SELECT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void txt_sr_fldKeyReleased(KeyEvent evt) {
        try {
            int count = this.dl_fld.getItemCount();
            String search = this.txt_sr_fld.getText().toUpperCase();
            if (!"".equals(search) && search.length() > 1 && count > 0) {
                for (int j = 0; j < count; j++) {
                    String itm = this.dl_fld.getItem(j);
                    if (itm.contains(search)) {
                        this.dl_fld.select(itm);
                    }
                }
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void txt_codeMouseReleased(MouseEvent evt) {
        try {
            if (!"".equals(this.txt_code.getText())) {
                this.position = String.valueOf(this.txt_code.getSelectionStart());
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_add_fun_postActionPerformed(ActionEvent evt) {
        if (!"SELECT".equals(this.dl_fun.getSelectedItem()) && !"Select".equals(this.dl_fun.getSelectedItem()) && !"".equals(this.dl_fun.getSelectedItem())) {
            int pos = Integer.valueOf(this.position).intValue();
            int code_start = pos + 1;
            this.txt_code.insert(System.lineSeparator(), pos);
            String Ifun = this.dl_fun.getSelectedItem();
            Functions fnc = new Functions();
            if ("ReadSeq".equals(Ifun)) {
                int count = fnc.ReadSeq.length;
                for (int j = 0; j < count; j++) {
                    int len = fnc.ReadSeq[j].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.ReadSeq[j], code_start);
                    code_start = code_start + len + 1;
                }
            }
            if ("Readlist".equals(Ifun)) {
                int count2 = fnc.Readlist.length;
                for (int j2 = 0; j2 < count2; j2++) {
                    int len2 = fnc.Readlist[j2].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Readlist[j2], code_start);
                    code_start = code_start + len2 + 1;
                }
            }
            if ("Fread".equals(Ifun)) {
                int count3 = fnc.Fread.length;
                for (int j3 = 0; j3 < count3; j3++) {
                    int len3 = fnc.Fread[j3].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Fread[j3], code_start);
                    code_start = code_start + len3 + 1;
                }
            }
            if ("Fwrite".equals(Ifun)) {
                int count4 = fnc.FWrite.length;
                for (int j4 = 0; j4 < count4; j4++) {
                    int len4 = fnc.FWrite[j4].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.FWrite[j4], code_start);
                    code_start = code_start + len4 + 1;
                }
            }
            if ("WriteFile".equals(Ifun)) {
                int count5 = fnc.WriteFile.length;
                for (int j5 = 0; j5 < count5; j5++) {
                    int len5 = fnc.WriteFile[j5].length();
                    String fun_code = fnc.WriteFile[j5];
                    this.txt_code.insert(System.lineSeparator() + fun_code, code_start);
                    code_start = code_start + len5 + 1;
                }
            }
            if ("Locate".equals(Ifun)) {
                int count6 = fnc.Locate.length;
                for (int j6 = 0; j6 < count6; j6++) {
                    int len6 = fnc.Locate[j6].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Locate[j6], code_start);
                    code_start = code_start + len6 + 1;
                }
            }
            if ("CallCDT".equals(Ifun)) {
                int count7 = fnc.CallCDT.length;
                for (int j7 = 0; j7 < count7; j7++) {
                    int len7 = fnc.CallCDT[j7].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.CallCDT[j7], code_start);
                    code_start = code_start + len7 + 1;
                }
            }
            if ("GetLocalRef".equals(Ifun)) {
                int count8 = fnc.GetLocalRef.length;
                for (int j8 = 0; j8 < count8; j8++) {
                    int len8 = fnc.GetLocalRef[j8].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.GetLocalRef[j8], code_start);
                    code_start = code_start + len8 + 1;
                }
            }
            if ("Convert".equals(Ifun)) {
                int count9 = fnc.Convert.length;
                for (int j9 = 0; j9 < count9; j9++) {
                    int len9 = fnc.Convert[j9].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Convert[j9], code_start);
                    code_start = code_start + len9 + 1;
                }
            }
            if ("Change".equals(Ifun)) {
                int count10 = fnc.Change.length;
                for (int j10 = 0; j10 < count10; j10++) {
                    int len10 = fnc.Change[j10].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Change[j10], code_start);
                    code_start = code_start + len10 + 1;
                }
            }
            if ("CallCDD".equals(Ifun)) {
                int count11 = fnc.CallCDD.length;
                for (int j11 = 0; j11 < count11; j11++) {
                    int len11 = fnc.CallCDD[j11].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.CallCDD[j11], code_start);
                    code_start = code_start + len11 + 1;
                }
            }
            if ("SubString".equals(Ifun)) {
                int count12 = fnc.SubString.length;
                for (int j12 = 0; j12 < count12; j12++) {
                    int len12 = fnc.SubString[j12].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.SubString[j12], code_start);
                    code_start = code_start + len12 + 1;
                }
            }
            if ("Trim".equals(Ifun)) {
                int count13 = fnc.Trim.length;
                for (int j13 = 0; j13 < count13; j13++) {
                    int len13 = fnc.Trim[j13].length();
                    this.txt_code.insert(System.lineSeparator() + fnc.Trim[j13], code_start);
                    code_start = code_start + len13 + 1;
                }
            }
            this.txt_code.insert("\n ", code_start + 1);
            this.position = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_genActionPerformed(ActionEvent evt) {
        try {
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
            String[] TotCount = this.lst_tables.getItems();
            ArrayList<String> IF_Tabs = new ArrayList<>();
            for (String item : TotCount) {
                if (item.contains("$")) {
                    int last = item.length() - 4;
                    String item2 = item.substring(0, last).replace(" ", "");
                    if (!LstCheckExistsIF(IF_Tabs, item2)) {
                        IF_Tabs.add("$INSERT I_F." + item2);
                    }
                } else if (!item.equals("STMT.PRINTED") && !item.equals("STMT.ENTRY.DETAIL") && !LstCheckExistsIF(IF_Tabs, item)) {
                    IF_Tabs.add("$INSERT  I_F." + item);
                }
            }
            int slen = StartBlocks.length;
            for (int i = 0; i < slen; i++) {
                if (" SUBROUTINE ".equals(StartBlocks[i]) && !"".equals(this.txt_rtn.getText())) {
                    this.txt_code.append("\n" + StartBlocks[i] + " " + this.txt_rtn.getText().toUpperCase());
                } else if ("*  Developed By          :  ".equals(StartBlocks[i]) && !"".equals(this.txt_dev.getText())) {
                    this.txt_code.append("\n" + StartBlocks[i] + " " + this.txt_dev.getText());
                } else if ("*  Purpose                   : ".equals(StartBlocks[i]) && !"".equals(this.txt_pur.getText())) {
                    this.txt_code.append("\n" + StartBlocks[i] + " " + this.txt_pur.getText());
                } else if ("I_F".equals(StartBlocks[i])) {
                    int cnt = IF_Tabs.size();
                    for (int k = 0; k < cnt; k++) {
                        this.txt_code.append("\n " + IF_Tabs.get(k));
                    }
                } else {
                    this.txt_code.append("\n" + StartBlocks[i]);
                }
            }
            this.txt_code.append("\n");
            this.txt_code.append("\nRETURN");
            Init();
            if (this.lst_fun.getItemCount() == 0 && this.lst_fld.getItemCount() == 0) {
                BlankProcess();
                CodeOfFields();
            } else {
                Process();
                CodeOfFields();
            }
            this.txt_code.append("\n RETURN");
            this.txt_code.append("\n END ");
            this.btn_gen.setEnabled(false);
            this.btn_add_all.setEnabled(false);
            this.btn_del_all.setEnabled(false);
            this.btn_fun_add.setEnabled(false);
            this.btn_fun_del.setEnabled(false);
            this.btn_ofs.setEnabled(false);
            this.btn_tem.setEnabled(false);
            this.btn_add_fld.setEnabled(false);
            this.btn_del_fld.setEnabled(false);
            this.btn_add.setEnabled(false);
            this.btn_del.setEnabled(false);
            this.btn_write.setEnabled(false);
            this.lbl_line.setVisible(true);
            this.btn_add_fun_post.setVisible(true);
            this.btn_write.setEnabled(false);
            this.btn_tem.setEnabled(false);
            this.btn_ofs.setEnabled(false);
            this.btn_eval.setEnabled(false);
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_fun_addActionPerformed(ActionEvent evt) {
        if (!this.dl_fun.getSelectedItem().equals("SELECT")) {
            String inp = this.dl_fun.getSelectedItem();
            String[] arr = this.lst_fun.getItems();
            if (!ChkInArray(arr, inp)) {
                this.lst_fun.add(inp);
                this.dl_fun.select("SELECT");
                this.lbl_msg.setText("");
                return;
            }
            this.lbl_msg.setText("Already added");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_fun_delActionPerformed(ActionEvent evt) {
        if (this.lst_fun.getItemCount() >= 1) {
            String rItm = this.lst_fun.getSelectedItem();
            this.lst_fun.remove(rItm);
        } else {
            this.lbl_msg.setText("No Item found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_resetActionPerformed(ActionEvent evt) {
        this.btn_gen.setEnabled(true);
        this.lst_fun.removeAll();
        this.lst_tables.removeAll();
        this.dl_apps.select("SELECT");
        this.dl_fun.select("SELECT");
        this.txt_code.setText("");
        this.txt_rtn.setText("");
        this.txt_code.setBackground(Color.white);
        this.txt_code.setForeground(Color.black);
        this.lst_fld.removeAll();
        this.dl_fld.removeAll();
        this.dl_fld.select("SELECT");
        this.chk_con.setSelected(false);
        this.chk_hdr.setSelected(false);
        this.txt_sep.setText("");
        this.lbl_msg.setText("");
        this.txt_dev.setText("");
        this.txt_pur.setText("");
        this.btn_add_all.setEnabled(true);
        this.btn_del_all.setEnabled(true);
        this.btn_fun_add.setEnabled(true);
        this.btn_fun_del.setEnabled(true);
        this.btn_ofs.setEnabled(true);
        this.btn_tem.setEnabled(true);
        this.btn_write.setEnabled(true);
        this.btn_add_fld.setEnabled(true);
        this.btn_del_fld.setEnabled(true);
        this.lbl_line.setVisible(false);
        this.btn_add_fun_post.setVisible(false);
        this.btn_add_fld.setEnabled(true);
        this.btn_del_fld.setEnabled(true);
        this.btn_add.setEnabled(true);
        this.btn_del.setEnabled(true);
        this.btn_write.setEnabled(true);
        this.btn_tem.setEnabled(true);
        this.btn_ofs.setEnabled(true);
        this.btn_eval.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_addActionPerformed(ActionEvent evt) {
        try {
            if (!"SELECT".equals(this.dl_apps.getSelectedItem())) {
                String Itms = this.dl_apps.getSelectedItem();
                String chk_Itm = this.dl_apps.getSelectedItem() + this.dl_type.getSelectedItem();
                String[] chk = this.lst_tables.getItems();
                for (String chk1 : chk) {
                    if (chk1.equals(chk_Itm)) {
                        this.lst_tables.remove(Itms);
                    }
                }
                if (this.dl_type.getSelectedItem() == null || "".equals(this.dl_type.getSelectedItem())) {
                    this.lst_tables.add(Itms);
                } else {
                    this.lst_tables.add(Itms + this.dl_type.getSelectedItem());
                }
            }
            this.dl_apps.select(0);
            this.dl_type.select(0);
            this.dl_fld.removeAll();
            this.dl_fld.select("SELECT");
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_delActionPerformed(ActionEvent evt) {
        try {
            if (!"".equals(this.lst_tables.getSelectedItem())) {
                String item = this.lst_tables.getSelectedItem();
                if (item.contains("$")) {
                    int last = item.length() - 4;
                    String item2 = item.substring(0, last).replace(" ", "");
                    this.lst_tables.remove(item);
                    this.dl_apps.add(item2);
                } else {
                    this.lst_tables.remove(item);
                }
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_add_fldActionPerformed(ActionEvent evt) {
        if (!this.dl_fld.getSelectedItem().equals("SELECT")) {
            int count = this.dl_fld.getItemCount();
            if (count > 0) {
                String inp = this.dl_fld.getSelectedItem();
                String[] arr = this.lst_fld.getItems();
                if (!ChkInArray(arr, inp)) {
                    this.lst_fld.add(inp);
                    this.dl_fld.select("SELECT");
                    this.lbl_msg.setText("");
                    return;
                }
                this.lbl_msg.setText("Already added");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_del_fldActionPerformed(ActionEvent evt) {
        int len = this.lst_fld.getItemCount();
        if (len > 0) {
            String rItm = this.lst_fld.getSelectedItem();
            if (!"".equals(rItm)) {
                this.lst_fld.remove(rItm);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_temActionPerformed(ActionEvent evt) {
        try {
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
            this.txt_code.setText("");
            this.btn_gen.setEnabled(false);
            TempleateCode tmp = new TempleateCode();
            int count = tmp.TCode.length;
            for (int k = 0; k < count; k++) {
                if (tmp.TCode[k].contains("SUBROUTINE")) {
                    String code = tmp.TCode[k];
                    this.txt_code.append("\n" + code + " " + this.txt_rtn.getText().toUpperCase());
                } else {
                    this.txt_code.append("\n" + tmp.TCode[k]);
                }
            }
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_ofsActionPerformed(ActionEvent evt) {
        try {
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
            this.txt_code.setText("");
            this.btn_gen.setEnabled(false);
            OFS_rtn ofs = new OFS_rtn();
            int count = ofs.Code.length;
            for (int k = 0; k < count; k++) {
                if (ofs.Code[k].contains("SUBROUTINE")) {
                    String code = ofs.Code[k];
                    this.txt_code.append("\n" + code + " " + this.txt_rtn.getText());
                } else {
                    this.txt_code.append("\n" + ofs.Code[k]);
                }
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_writeActionPerformed(ActionEvent evt) {
        try {
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
            this.txt_code.setText("");
            this.btn_gen.setEnabled(false);
            FWrite wr = new FWrite();
            int count = wr.Code.length;
            for (int k = 0; k < count; k++) {
                if (wr.Code[k].contains("SUBROUTINE")) {
                    String code = wr.Code[k];
                    this.txt_code.append("\n" + code + " " + this.txt_rtn.getText());
                } else {
                    this.txt_code.append("\n" + wr.Code[k]);
                }
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_evalActionPerformed(ActionEvent evt) {
        String str;
        int ccount = this.lst_fld.getItemCount();
        if (this.lst_tables.getItemCount() > 0 && ccount > 0) {
            String table = this.lst_tables.getItem(0);
            String eval = "SELECT FBNK." + table + " ";
            String fields = " SAVING EVAL  \"";
            String replace = "";
            if ("ACCOUNT".equals(table)) {
                replace = "AC.";
            } else if ("CUSTOMER".equals(table)) {
                replace = "EB.CUS.";
            } else if ("FUNDS.TRANSFER".equals(table)) {
                replace = "FT.";
            } else if ("TELLER".equals(table)) {
                replace = "TT.TE.";
            } else if ("DRAWINGS".equals(table)) {
                replace = "TF.DR.";
            } else if ("STMT.ENTRY".equals(table)) {
                replace = "AC.STE.";
            } else if ("REPO".equals(table)) {
                replace = "RP.";
            } else if ("SEC.TRADE".equals(table)) {
                replace = "SC.SBS.";
            } else if ("MM.MONEY.MARKET".equals(table)) {
                replace = "MM.";
            } else if ("FOREX".equals(table)) {
                replace = "FX.";
            } else if ("ACCOUNT.CLOSURE".equals(table)) {
                replace = "AC.ACL.";
            } else if ("MG.MORTGAGE".equals(table) || "MG.MORTGAGE".equals(table)) {
                replace = "MG.";
            } else if ("USER".equals(table)) {
                replace = "EB.USE";
            }
            String[] alFields = this.lst_fld.getItems();
            int count = alFields.length;
            for (int i = 0; i < count; i++) {
                String fname = alFields[i].replace(replace, "");
                if (i + 1 != count) {
                    str = fields + fname + " :'" + this.txt_sep.getText() + "': ";
                } else {
                    str = fields + fname + "\"";
                }
                fields = str;
            }
            this.lbl_msg.setText("");
            this.txt_code.setText(eval + fields);
            return;
        }
        this.lbl_msg.setText("Add table and fields");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btn_ofs_postActionPerformed(ActionEvent evt) {
        try {
            this.txt_code.setBackground(new Color(20, 26, 31));
            this.txt_code.setForeground(new Color(28, 158, 89));
            this.txt_code.setText("");
            this.btn_gen.setEnabled(false);
            OFS_OPM ofs = new OFS_OPM();
            int count = ofs.Code.length;
            for (int k = 0; k < count; k++) {
                if (ofs.Code[k].contains("SUBROUTINE")) {
                    String code = ofs.Code[k];
                    this.txt_code.append("\n" + code + " " + this.txt_rtn.getText());
                } else {
                    this.txt_code.append("\n" + ofs.Code[k]);
                }
            }
        } catch (Exception ex) {
            this.lbl_msg.setText(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, (String) null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex);
        } catch (IllegalAccessException ex2) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex2);
        } catch (InstantiationException ex3) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, (String) null, (Throwable) ex3);
        }
        EventQueue.invokeLater(new Runnable() { // from class: MainWindow.21
            @Override // java.lang.Runnable
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private void Init() {
        int len = this.lst_tables.getItemCount();
        if (len > 0) {
            this.txt_code.append("\n");
            this.txt_code.append("\n********");
            this.txt_code.append("\n INIT:");
            this.txt_code.append("\n********");
            this.txt_code.append("\n");
            String app = "";
            for (int i = 0; i < len; i++) {
                if (!this.lst_tables.getItem(i).contains("$")) {
                    if ("ACCOUNT".equals(this.lst_tables.getItem(i))) {
                        app = "ACC";
                    } else if ("MG.MORTGAGE".equals(this.lst_tables.getItem(i))) {
                        app = "MG";
                    } else if ("CUSTOMER".equals(this.lst_tables.getItem(i))) {
                        app = "CUS";
                    } else if ("FUNDS.TRANSFER".equals(this.lst_tables.getItem(i))) {
                        app = "FN";
                    } else if ("TELLER".equals(this.lst_tables.getItem(i))) {
                        app = "TT";
                    } else if ("DRAWINGS".equals(this.lst_tables.getItem(i))) {
                        app = "DRA";
                    } else if ("STMT.ENTRY".equals(this.lst_tables.getItem(i))) {
                        app = "STMT";
                    } else if ("STMT.PRINTED".equals(this.lst_tables.getItem(i))) {
                        app = "STPR";
                    } else if ("STMT.ENTRY.DETAIL".equals(this.lst_tables.getItem(i))) {
                        app = "ST.DT";
                    } else if ("REPO".equals(this.lst_tables.getItem(i))) {
                        app = "REPO";
                    } else if ("SEC.TRADE".equals(this.lst_tables.getItem(i))) {
                        app = "SEC";
                    } else if ("MM.MONEY.MARKET".equals(this.lst_tables.getItem(i))) {
                        app = "MM";
                    } else if ("FOREX".equals(this.lst_tables.getItem(i))) {
                        app = "FX";
                    } else if ("ACCOUNT.CLOSURE".equals(this.lst_tables.getItem(i))) {
                        app = "ACL";
                    } else if ("LD.LOANS.AND.DEPOSITS".equals(this.lst_tables.getItem(i))) {
                        app = "LND";
                    } else if ("USER".equals(this.lst_tables.getItem(i))) {
                        app = "USR";
                    }
                } else {
                    int index = this.lst_tables.getItem(i).indexOf(36);
                    String[] split = {this.lst_tables.getItem(i).substring(0, index), this.lst_tables.getItem(i).substring(index)};
                    if (this.lst_tables.getItem(i).contains("ACCOUNT")) {
                        String post = split[1];
                        if (post.contains("HIS")) {
                            app = "ACC.HIS";
                        } else {
                            app = "ACC.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("CUSTOMER")) {
                        String post2 = split[1];
                        if (post2.contains("HIS")) {
                            app = "CUS.HIS";
                        } else {
                            app = "CUS.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("FUNDS.TRANSFER")) {
                        String post3 = split[1];
                        if (post3.contains("HIS")) {
                            app = "FN.HIS";
                        } else {
                            app = "FN.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("TELLER")) {
                        String post4 = split[1];
                        if (post4.contains("HIS")) {
                            app = "TT.HIS";
                        } else {
                            app = "TT.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("DRAWINGS")) {
                        String post5 = split[1];
                        if (post5.contains("HIS")) {
                            app = "TT.HIS";
                        } else {
                            app = "TT.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("MG.MORTGAGE")) {
                        String post6 = split[1];
                        if (post6.contains("HIS")) {
                            app = "MG.HIS";
                        } else {
                            app = "MG.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY")) {
                        String post7 = split[1];
                        if (post7.contains("HIS")) {
                            app = "STMT.HIS";
                        } else {
                            app = "STMT.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("STMT.PRINTED")) {
                        String post8 = split[1];
                        if (post8.contains("HIS")) {
                            app = "STPR.HIS";
                        } else {
                            app = "STPR.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY.DETAIL")) {
                        String post9 = split[1];
                        if (post9.contains("HIS")) {
                            app = "ST.DT.HIS";
                        } else {
                            app = "ST.DT.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("REPO")) {
                        String post10 = split[1];
                        if (post10.contains("HIS")) {
                            app = "REPO.HIS";
                        } else {
                            app = "REPO.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("SEC.TRADE")) {
                        String post11 = split[1];
                        if (post11.contains("HIS")) {
                            app = "SEC.HIS";
                        } else {
                            app = "SEC.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("MM.MONEY.MARKET")) {
                        String post12 = split[1];
                        if (post12.contains("HIS")) {
                            app = "MM.HIS";
                        } else {
                            app = "MM.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("FOREX")) {
                        String post13 = split[1];
                        if (post13.contains("HIS")) {
                            app = "FX.HIS";
                        } else {
                            app = "FX.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("ACCOUNT.CLOSURE")) {
                        String post14 = split[1];
                        if (post14.contains("HIS")) {
                            app = "ACL.HIS";
                        } else {
                            app = "ACL.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("LD.LOANS.AND.DEPOSITS")) {
                        String post15 = split[1];
                        if (post15.contains("HIS")) {
                            app = "LND.HIS";
                        } else {
                            app = "LND.NAU";
                        }
                    } else if (this.lst_tables.getItem(i).contains("USER")) {
                        String post16 = split[1];
                        if (post16.contains("HIS")) {
                            app = "USR.HIS";
                        } else {
                            app = "USR.NAU";
                        }
                    }
                }
                this.txt_code.append("\n FN." + app + "=\"F." + this.lst_tables.getItem(i) + '\"');
                this.txt_code.append("\n F." + app + "=''");
                this.txt_code.append("\n CALL OPF(FN." + app + ",F." + app + ")");
            }
            this.txt_code.append("\n");
            this.txt_code.append("\nRETURN");
            return;
        }
        this.txt_code.append("\n");
        this.txt_code.append("\n********");
        this.txt_code.append("\n INIT:");
        this.txt_code.append("\n********");
        this.txt_code.append("\n");
        this.txt_code.append("\n");
        this.txt_code.append("\nRETURN");
    }

    public static int countOccurrences(String haystack, char needle) {
        int count = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle) {
                count++;
            }
        }
        return count;
    }

    public boolean LstCheckExistsIF(ArrayList<String> arr, String value) {
        int len = arr.size();
        for (int j = 0; j < len; j++) {
            if (arr.get(j).contains(value)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsChar(String s, char search) {
        if (s.length() == 0) {
            return false;
        }
        return s.charAt(0) == search || containsChar(s.substring(1), search);
    }

    private void BlankProcess() {
        this.txt_code.append("\n");
        this.txt_code.append("\n***************");
        this.txt_code.append("\n PROCESS:");
        this.txt_code.append("\n***************");
        this.txt_code.append("\n");
    }

    private boolean ChkInArray(String[] arr, String value) {
        for (String str : arr) {
            if (str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    private String Set_Field_Prefix(String header) {
        String idfy = header.substring(0, 3);
        if ("AC.".equals(idfy)) {
            String idfy2 = header.substring(0, 6);
            if ("AC.STE".equals(idfy2) || "AC.ACL".equals(idfy2)) {
                header = header.substring(7);
            } else {
                header = header.substring(3);
            }
        } else if ("TT.".equals(idfy)) {
            header = header.substring(6);
        } else if ("EB.".equals(idfy)) {
            String idfy3 = header.substring(0, 6);
            if ("EB.CUS".equals(idfy3) || "EB.USE".equals(idfy3)) {
                header = header.substring(7);
            } else {
                header = header.substring(3);
            }
        } else if ("FT.".equals(idfy)) {
            header = header.substring(3);
        } else if ("TF.".equals(idfy)) {
            header = header.substring(6);
        } else if ("RP.".equals(idfy)) {
            header = header.substring(3);
        } else if ("SC.".equals(idfy)) {
            header = header.substring(7);
        } else if ("MM.".equals(idfy) || "FX.".equals(idfy) || "MG.".equals(idfy) || "LD.".equals(idfy)) {
            header = header.substring(3);
        }
        return header;
    }

    private void Process() {
        String str;
        BlankProcess();
        if (this.chk_hdr.isSelected() && this.lst_fld.getItemCount() > 0) {
            int headerCount = this.lst_fld.getItemCount();
            String HeaderTxt = " MY.DATA<-1> = '";
            String sep = this.txt_sep.getText();
            for (int h = 0; h < headerCount; h++) {
                String header = this.lst_fld.getItem(h);
                if (h == 0) {
                    str = HeaderTxt + " " + Set_Field_Prefix(header) + " ";
                } else {
                    str = HeaderTxt + sep + " " + Set_Field_Prefix(header) + " ";
                }
                HeaderTxt = str;
            }
            this.txt_code.append("\n");
            this.txt_code.append(HeaderTxt + "'");
            this.txt_code.append("\n");
        }
        Functions fnc = new Functions();
        String[] fun = this.lst_fun.getItems();
        for (String Ifun : fun) {
            if ("ReadSeq".equals(Ifun)) {
                this.txt_code.append("\n");
                int count = fnc.ReadSeq.length;
                for (int j = 0; j < count; j++) {
                    this.txt_code.append("\n" + fnc.ReadSeq[j]);
                }
                this.txt_code.append("\n");
            }
            if ("Readlist".equals(Ifun)) {
                this.txt_code.append("\n");
                int count2 = fnc.Readlist.length;
                for (int j2 = 0; j2 < count2; j2++) {
                    this.txt_code.append("\n" + fnc.Readlist[j2]);
                }
                this.txt_code.append("\n");
            }
            if ("Fread".equals(Ifun)) {
                if (this.lst_tables.getItemCount() > 0) {
                    FReadTables();
                } else {
                    this.txt_code.append("\n");
                    int count3 = fnc.Fread.length;
                    for (int j3 = 0; j3 < count3; j3++) {
                        this.txt_code.append("\n" + fnc.Fread[j3]);
                    }
                    this.txt_code.append("\n");
                }
            }
            if ("Fwrite".equals(Ifun)) {
                if (this.lst_tables.getItemCount() > 0) {
                    FWriteTables();
                } else {
                    this.txt_code.append("\n");
                    int count4 = fnc.FWrite.length;
                    for (int j4 = 0; j4 < count4; j4++) {
                        this.txt_code.append("\n" + fnc.FWrite[j4]);
                    }
                    this.txt_code.append("\n");
                }
            }
            if ("WriteFile".equals(Ifun)) {
                this.txt_code.append("\n");
                int count5 = fnc.WriteFile.length;
                for (int j5 = 0; j5 < count5; j5++) {
                    this.txt_code.append("\n" + fnc.WriteFile[j5]);
                }
                this.txt_code.append("\n");
            }
            if ("Locate".equals(Ifun)) {
                this.txt_code.append("\n");
                int count6 = fnc.Locate.length;
                for (int j6 = 0; j6 < count6; j6++) {
                    this.txt_code.append("\n" + fnc.Locate[j6]);
                }
                this.txt_code.append("\n");
            }
            if ("CallCDT".equals(Ifun)) {
                this.txt_code.append("\n");
                int count7 = fnc.CallCDT.length;
                for (int j7 = 0; j7 < count7; j7++) {
                    this.txt_code.append("\n" + fnc.CallCDT[j7]);
                }
                this.txt_code.append("\n");
            }
            if ("Change".equals(Ifun)) {
                this.txt_code.append("\n");
                int count8 = fnc.Change.length;
                for (int j8 = 0; j8 < count8; j8++) {
                    this.txt_code.append("\n" + fnc.Change[j8]);
                }
                this.txt_code.append("\n");
            }
            if ("Convert".equals(Ifun)) {
                this.txt_code.append("\n");
                int count9 = fnc.Convert.length;
                for (int j9 = 0; j9 < count9; j9++) {
                    this.txt_code.append("\n" + fnc.Convert[j9]);
                }
                this.txt_code.append("\n");
            }
            if ("FindStr".equals(Ifun)) {
                this.txt_code.append("\n");
                int count10 = fnc.FindStr.length;
                for (int j10 = 0; j10 < count10; j10++) {
                    this.txt_code.append("\n" + fnc.FindStr[j10]);
                }
                this.txt_code.append("\n");
            }
            if ("CallCDD".equals(Ifun)) {
                this.txt_code.append("\n");
                int count11 = fnc.CallCDD.length;
                for (int j11 = 0; j11 < count11; j11++) {
                    this.txt_code.append("\n" + fnc.CallCDD[j11]);
                }
                this.txt_code.append("\n");
            }
            if ("SubString".equals(Ifun)) {
                this.txt_code.append("\n");
                int count12 = fnc.SubString.length;
                for (int j12 = 0; j12 < count12; j12++) {
                    this.txt_code.append("\n" + fnc.SubString[j12]);
                }
                this.txt_code.append("\n");
            }
            if ("Trim".equals(Ifun)) {
                this.txt_code.append("\n");
                int count13 = fnc.Trim.length;
                for (int j13 = 0; j13 < count13; j13++) {
                    this.txt_code.append("\n" + fnc.Trim[j13]);
                }
                this.txt_code.append("\n");
            }
        }
    }

    private void FReadTables() {
        String strReplace;
        String app = "";
        int len = this.lst_tables.getItemCount();
        for (int i = 0; i < len; i++) {
            if (!this.lst_tables.getItem(i).contains("$")) {
                if ("ACCOUNT".equals(this.lst_tables.getItem(i))) {
                    app = "ACC";
                } else if ("CUSTOMER".equals(this.lst_tables.getItem(i))) {
                    app = "CUS";
                } else if ("FUNDS.TRANSFER".equals(this.lst_tables.getItem(i))) {
                    app = "FN";
                } else if ("TELLER".equals(this.lst_tables.getItem(i))) {
                    app = "TT";
                } else if ("DRAWINGS".equals(this.lst_tables.getItem(i))) {
                    app = "DRA";
                } else if ("STMT.ENTRY".equals(this.lst_tables.getItem(i))) {
                    app = "STMT";
                } else if ("STMT.PRINTED".equals(this.lst_tables.getItem(i))) {
                    app = "STPR";
                } else if ("STMT.ENTRY.DETAIL".equals(this.lst_tables.getItem(i))) {
                    app = "ST.DT";
                } else if ("REPO".equals(this.lst_tables.getItem(i))) {
                    app = "REPO";
                } else if ("SEC.TRADE".equals(this.lst_tables.getItem(i))) {
                    app = "SEC";
                } else if ("MM.MONEY.MARKET".equals(this.lst_tables.getItem(i))) {
                    app = "MM";
                } else if ("FOREX".equals(this.lst_tables.getItem(i))) {
                    app = "FX";
                } else if ("ACCOUNT.CLOSURE".equals(this.lst_tables.getItem(i))) {
                    app = "ACL";
                } else if ("MG.MORTGAGE".equals(this.lst_tables.getItem(i))) {
                    app = "MG";
                } else if ("USER".equals(this.lst_tables.getItem(i))) {
                    app = "USE";
                }
            } else {
                int index = this.lst_tables.getItem(i).indexOf(36);
                String[] split = {this.lst_tables.getItem(i).substring(0, index), this.lst_tables.getItem(i).substring(index)};
                if (this.lst_tables.getItem(i).contains("ACCOUNT")) {
                    String post = split[1];
                    if (post.contains("HIS")) {
                        app = "ACC.HIS";
                    } else {
                        app = "ACC.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("CUSTOMER")) {
                    String post2 = split[1];
                    if (post2.contains("HIS")) {
                        app = "CUS.HIS";
                    } else {
                        app = "CUS.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("FUNDS.TRANSFER")) {
                    String post3 = split[1];
                    if (post3.contains("HIS")) {
                        app = "FN.HIS";
                    } else {
                        app = "FN.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("TELLER")) {
                    String post4 = split[1];
                    if (post4.contains("HIS")) {
                        app = "TT.HIS";
                    } else {
                        app = "TT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("DRAWINGS")) {
                    String post5 = split[1];
                    if (post5.contains("HIS")) {
                        app = "TT.HIS";
                    } else {
                        app = "TT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY")) {
                    String post6 = split[1];
                    if (post6.contains("HIS")) {
                        app = "STMT.HIS";
                    } else {
                        app = "STMT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.PRINTED")) {
                    String post7 = split[1];
                    if (post7.contains("HIS")) {
                        app = "STPR.HIS";
                    } else {
                        app = "STPR.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY.DETAIL")) {
                    String post8 = split[1];
                    if (post8.contains("HIS")) {
                        app = "ST.DT.HIS";
                    } else {
                        app = "ST.DT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("REPO")) {
                    String post9 = split[1];
                    if (post9.contains("HIS")) {
                        app = "REPO.HIS";
                    } else {
                        app = "REPO.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("SEC.TRADE")) {
                    String post10 = split[1];
                    if (post10.contains("HIS")) {
                        app = "SEC.HIS";
                    } else {
                        app = "SEC.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("MM.MONEY.MARKET")) {
                    String post11 = split[1];
                    if (post11.contains("HIS")) {
                        app = "MM.HIS";
                    } else {
                        app = "MM.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("FOREX")) {
                    String post12 = split[1];
                    if (post12.contains("HIS")) {
                        app = "FX.HIS";
                    } else {
                        app = "FX.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("ACCOUNT.CLOSURE")) {
                    String post13 = split[1];
                    if (post13.contains("HIS")) {
                        app = "ACL.HIS";
                    } else {
                        app = "ACL.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("LD.LOANS.AND.DEPOSITS")) {
                    String post14 = split[1];
                    if (post14.contains("HIS")) {
                        app = "LND.HIS";
                    } else {
                        app = "LND.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("MG.MORTGAGE")) {
                    String post15 = split[1];
                    if (post15.contains("HIS")) {
                        app = "MG.HIS";
                    } else {
                        app = "MG.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("USER")) {
                    String post16 = split[1];
                    if (post16.contains("HIS")) {
                        app = "USR.HIS";
                    } else {
                        app = "USR.NAU";
                    }
                }
            }
            Functions func = new Functions();
            String[] split2 = Arrays.toString(func.Fread).split(",");
            String code = "";
            int count = split2.length;
            for (int y = 0; y < count; y++) {
                if (y + 1 != count) {
                    if ("Y.ID".equals(split2[y])) {
                        strReplace = code + "Y." + app + ".ID,";
                    } else {
                        strReplace = code + split2[y] + "." + app + ",";
                    }
                } else {
                    String last = split2[y].substring(0, split2[y].length() - 1);
                    strReplace = (code + (last.replace(")", "") + "." + app + ")")).replace("[", "");
                }
                code = strReplace;
            }
            this.txt_code.append("\n " + code);
        }
        this.txt_code.append("\n ");
    }

    private void FWriteTables() {
        String app = "";
        int len = this.lst_tables.getItemCount();
        for (int i = 0; i < len; i++) {
            if (!this.lst_tables.getItem(i).contains("$")) {
                if ("ACCOUNT".equals(this.lst_tables.getItem(i))) {
                    app = "ACC";
                } else if ("CUSTOMER".equals(this.lst_tables.getItem(i))) {
                    app = "CUS";
                } else if ("FUNDS.TRANSFER".equals(this.lst_tables.getItem(i))) {
                    app = "FN";
                } else if ("TELLER".equals(this.lst_tables.getItem(i))) {
                    app = "TT";
                } else if ("DRAWINGS".equals(this.lst_tables.getItem(i))) {
                    app = "DRA";
                } else if ("STMT.ENTRY".equals(this.lst_tables.getItem(i))) {
                    app = "STMT";
                } else if ("STMT.PRINTED".equals(this.lst_tables.getItem(i))) {
                    app = "STPR";
                } else if ("STMT.ENTRY.DETAIL".equals(this.lst_tables.getItem(i))) {
                    app = "ST.DT";
                } else if ("REPO".equals(this.lst_tables.getItem(i))) {
                    app = "REPO";
                } else if ("SEC.TRADE".equals(this.lst_tables.getItem(i))) {
                    app = "SEC";
                } else if ("MM.MONEY.MARKET".equals(this.lst_tables.getItem(i))) {
                    app = "MM";
                } else if ("FOREX".equals(this.lst_tables.getItem(i))) {
                    app = "FX";
                } else if ("ACCOUNT.CLOSURE".equals(this.lst_tables.getItem(i))) {
                    app = "ACL";
                } else if ("MG.MORTGAGE".equals(this.lst_tables.getItem(i))) {
                    app = "MG";
                } else if ("USER".equals(this.lst_tables.getItem(i))) {
                    app = "USR";
                }
            } else {
                int index = this.lst_tables.getItem(i).indexOf(36);
                String[] split = {this.lst_tables.getItem(i).substring(0, index), this.lst_tables.getItem(i).substring(index)};
                if (this.lst_tables.getItem(i).contains("ACCOUNT")) {
                    String post = split[1];
                    if (post.contains("HIS")) {
                        app = "ACC.HIS";
                    } else {
                        app = "ACC.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("CUSTOMER")) {
                    String post2 = split[1];
                    if (post2.contains("HIS")) {
                        app = "CUS.HIS";
                    } else {
                        app = "CUS.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("FUNDS.TRANSFER")) {
                    String post3 = split[1];
                    if (post3.contains("HIS")) {
                        app = "FN.HIS";
                    } else {
                        app = "FN.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("MG.MORTGAGE")) {
                    String post4 = split[1];
                    if (post4.contains("HIS")) {
                        app = "MG.HIS";
                    } else {
                        app = "MG.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("TELLER")) {
                    String post5 = split[1];
                    if (post5.contains("HIS")) {
                        app = "TT.HIS";
                    } else {
                        app = "TT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("DRAWINGS")) {
                    String post6 = split[1];
                    if (post6.contains("HIS")) {
                        app = "TT.HIS";
                    } else {
                        app = "TT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY")) {
                    String post7 = split[1];
                    if (post7.contains("HIS")) {
                        app = "STMT.HIS";
                    } else {
                        app = "STMT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.PRINTED")) {
                    String post8 = split[1];
                    if (post8.contains("HIS")) {
                        app = "STPR.HIS";
                    } else {
                        app = "STPR.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("STMT.ENTRY.DETAIL")) {
                    String post9 = split[1];
                    if (post9.contains("HIS")) {
                        app = "ST.DT.HIS";
                    } else {
                        app = "ST.DT.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("REPO")) {
                    String post10 = split[1];
                    if (post10.contains("HIS")) {
                        app = "REPO.HIS";
                    } else {
                        app = "REPO.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("SEC.TRADE")) {
                    String post11 = split[1];
                    if (post11.contains("HIS")) {
                        app = "SEC.HIS";
                    } else {
                        app = "SEC.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("MM.MONEY.MARKET")) {
                    String post12 = split[1];
                    if (post12.contains("HIS")) {
                        app = "MM.HIS";
                    } else {
                        app = "MM.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("FOREX")) {
                    String post13 = split[1];
                    if (post13.contains("HIS")) {
                        app = "FX.HIS";
                    } else {
                        app = "FX.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("ACCOUNT.CLOSURE")) {
                    String post14 = split[1];
                    if (post14.contains("HIS")) {
                        app = "ACL.HIS";
                    } else {
                        app = "ACL.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("LD.LOANS.AND.DEPOSITS")) {
                    String post15 = split[1];
                    if (post15.contains("HIS")) {
                        app = "LND.HIS";
                    } else {
                        app = "LND.NAU";
                    }
                } else if (this.lst_tables.getItem(i).contains("USER")) {
                    String post16 = split[1];
                    if (post16.contains("HIS")) {
                        app = "USR.HIS";
                    } else {
                        app = "USR.NAU";
                    }
                }
            }
            Functions func = new Functions();
            String[] split2 = func.FWrite[0].split(",");
            String code = "";
            int count = split2.length;
            String set_id = "";
            for (int y = 0; y < count; y++) {
                if (y + 1 != count) {
                    if ("Y.ID".equals(split2[y])) {
                        code = code + "Y." + app + ".ID,";
                        set_id = "Y." + app + ".ID";
                    } else {
                        code = code + split2[y] + "." + app + ",";
                    }
                } else {
                    String last = split2[y].substring(0, split2[y].length() - 1);
                    code = (code + (last.replace(")", "") + "." + app + ")")).replace("[", "");
                }
            }
            this.txt_code.append("\n " + code);
            String end = " CALL JOURNAL.UPDATE(" + set_id + ")";
            this.txt_code.append("\n " + end);
        }
        this.txt_code.append("\n ");
    }

    private void CodeOfFields() {
        int count = this.lst_fld.getItemCount();
        if (count > 0) {
            ArrayList<String> ClearVar = new ArrayList<>();
            this.txt_code.append("\n");
            String MyData = "MY.DATA<-1> = ";
            for (int d = 0; d < count; d++) {
                String itm = this.lst_fld.getItem(d);
                String Start = itm.substring(0, 3);
                if (this.chk_con.isSelected() && !"".equals(this.txt_sep.getText())) {
                    String sep = this.txt_sep.getText();
                    if ("AC.".equals(Start)) {
                        String Start2 = itm.substring(0, 6);
                        if ("AC.STE".equals(Start2)) {
                            this.txt_code.append("\n  Y." + itm + "=R.STMT<" + itm + ">");
                            if (d == 0) {
                                MyData = MyData + "Y." + itm;
                                ClearVar.add("Y." + itm);
                            } else {
                                MyData = MyData + " : '" + sep + "' : Y." + itm;
                                ClearVar.add("Y." + itm);
                            }
                        } else if ("AC.ACL".equals(Start2)) {
                            this.txt_code.append("\n  Y." + itm + "=R.ACL<" + itm + ">");
                            if (d == 0) {
                                MyData = MyData + "Y." + itm;
                                ClearVar.add("Y." + itm);
                            } else {
                                MyData = MyData + " : '" + sep + "' : Y." + itm;
                                ClearVar.add("Y." + itm);
                            }
                        } else {
                            this.txt_code.append("\n  Y." + itm + "=R.ACC<" + itm + ">");
                            if (d == 0) {
                                MyData = MyData + "Y." + itm;
                                ClearVar.add("Y." + itm);
                            } else {
                                MyData = MyData + " : '" + sep + "' : Y." + itm;
                                ClearVar.add("Y." + itm);
                            }
                        }
                    } else if ("TT.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.TT<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "' : Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("EB.".equals(Start)) {
                        String Start3 = itm.substring(0, 6);
                        if ("EB.CUS".equals(Start3)) {
                            this.txt_code.append("\n  Y." + itm + "=R.CUS<" + itm + ">");
                            if (d == 0) {
                                MyData = MyData + "Y." + itm;
                                ClearVar.add("Y." + itm);
                            } else {
                                MyData = MyData + " : '" + sep + "' : Y." + itm;
                                ClearVar.add("Y." + itm);
                            }
                        } else if ("EB.USE".equals(Start3)) {
                            this.txt_code.append("\n  Y." + itm + "=R.USR<" + itm + ">");
                            if (d == 0) {
                                MyData = MyData + "Y." + itm;
                                ClearVar.add("Y." + itm);
                            } else {
                                MyData = MyData + " : '" + sep + "' : Y." + itm;
                                ClearVar.add("Y." + itm);
                            }
                        }
                    } else if ("FT.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.FT<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("TF.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.TT<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("RP.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.REPO<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("SC.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.SEC<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("MM.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.MM<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("FX.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.FX<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("LD.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.LND<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    } else if ("MG.".equals(Start)) {
                        this.txt_code.append("\n  Y." + itm + "=R.MG<" + itm + ">");
                        if (d == 0) {
                            MyData = MyData + "Y." + itm;
                            ClearVar.add("Y." + itm);
                        } else {
                            MyData = MyData + " : '" + sep + "': Y." + itm;
                            ClearVar.add("Y." + itm);
                        }
                    }
                } else if ("AC.".equals(Start)) {
                    String Start4 = itm.substring(0, 6);
                    if ("AC.STE".equals(Start4)) {
                        this.txt_code.append("\n  Y." + itm + "=R.STMT<" + itm + ">");
                        ClearVar.add("Y." + itm);
                    } else if ("AC.ACL".equals(Start4)) {
                        this.txt_code.append("\n  Y." + itm + "=R.ACL<" + itm + ">");
                        ClearVar.add("Y." + itm);
                    } else {
                        this.txt_code.append("\n  Y." + itm + "=R.ACC<" + itm + ">");
                        ClearVar.add("Y." + itm);
                    }
                } else if ("TT.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.TT<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("EB.".equals(Start)) {
                    String Start5 = itm.substring(0, 6);
                    if ("EB.CUS".equals(Start5)) {
                        this.txt_code.append("\n  Y." + itm + "=R.CUS<" + itm + ">");
                        ClearVar.add("Y." + itm);
                    }
                    if ("EB.USE".equals(Start5)) {
                        this.txt_code.append("\n  Y." + itm + "=R.USR<" + itm + ">");
                        ClearVar.add("Y." + itm);
                    }
                } else if ("FT.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.TT<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("TF.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.TT<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("RP.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.REPO<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("MG.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.MG<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("SC.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.SEC<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("MM.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.MM<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("FX.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.FX<" + itm + ">");
                    ClearVar.add("Y." + itm);
                } else if ("LD.".equals(Start)) {
                    this.txt_code.append("\n  Y." + itm + "=R.LND<" + itm + ">");
                    ClearVar.add("Y." + itm);
                }
            }
            if (this.chk_con.isSelected() && !"".equals(this.txt_sep.getText())) {
                this.txt_code.append("\n");
                this.txt_code.append("\n" + MyData);
            }
            this.txt_code.append("\n");
            for (int v = 0; v < ClearVar.size(); v++) {
                this.txt_code.append("\n" + ClearVar.get(v) + " = ''");
            }
            this.txt_code.append("\n");
        }
    }
}
