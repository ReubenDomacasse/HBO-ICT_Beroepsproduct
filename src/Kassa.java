import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
public class Kassa {

    private NumberFormat formatter = new DecimalFormat("#0.00");

    private int aantalproducten= 0;

    private int btn_k1 = 0;
    private int btn_k2 = 0;
    private int btn_k3 = 0;
    private int btn_k4 = 0;
    private int btn_k5 = 0;
    private int btn_k6 = 0;
    private int btn_k7 = 0;
    private int btn_k8 = 0;
    private int btn_k9 = 0;

    private boolean panels =  true;

    private  JLabel naam_Kassa =new JLabel("Kassasysteem “Domino’s”");
    private JTextField status_Kassa = new JTextField("");

    private JCheckBox  cb_Product1 = new JCheckBox ("");
    private JCheckBox  cb_Product2 = new JCheckBox ("");
    private JCheckBox  cb_Product3 = new JCheckBox ("");
    private JCheckBox  cb_Product4 = new JCheckBox ("");
    private JCheckBox  cb_Product5 = new JCheckBox ("");
    private JCheckBox  cb_Product6 = new JCheckBox ("");
    private JCheckBox  cb_Product7 = new JCheckBox ("");
    private JCheckBox  cb_Product8 = new JCheckBox ("");
    private JCheckBox  cb_Product9 = new JCheckBox ("");

    private JTextField aantal_Product1 = new JTextField("");
    private JTextField aantal_Product2 = new JTextField("");
    private JTextField aantal_Product3 = new JTextField("");
    private JTextField aantal_Product4 = new JTextField("");
    private JTextField aantal_Product5 = new JTextField("");
    private JTextField aantal_Product6 = new JTextField("");
    private JTextField aantal_Product7 = new JTextField("");
    private JTextField aantal_Product8 = new JTextField("");
    private JTextField aantal_Product9 = new JTextField("");

    private JTextField naam_Product1 = new JTextField("");
    private JTextField naam_Product2 = new JTextField("");
    private JTextField naam_Product3 = new JTextField("");
    private JTextField naam_Product4 = new JTextField("");
    private JTextField naam_Product5 = new JTextField("");
    private JTextField naam_Product6 = new JTextField("");
    private JTextField naam_Product7 = new JTextField("");
    private JTextField naam_Product8 = new JTextField("");
    private JTextField naam_Product9 = new JTextField("");

    private JTextField prijs_Product1 = new JTextField("");
    private JTextField prijs_Product2 = new JTextField("");
    private JTextField prijs_Product3 = new JTextField("");
    private JTextField prijs_Product4 = new JTextField("");
    private JTextField prijs_Product5 = new JTextField("");
    private JTextField prijs_Product6 = new JTextField("");
    private JTextField prijs_Product7 = new JTextField("");
    private JTextField prijs_Product8 = new JTextField("");
    private JTextField prijs_Product9 = new JTextField("");

    private String [] product = {"product1","product2","product3","product4","product5","product6","product7","product8","product9"};
    //private String [] prijsproduct = {"€10,00","€7,50","€5,00","€4,00","€3,00","€2,00","€1,75","€1,50","€1,00"};
    private double [] prijsproduct = {10.00,7.50,5.00,4.00,3.00,2.00,1.75,1.50,1.00};
    private String [] boodschappen = new String[10];
    private int [] productaantal = new int[10];
    private int [] productlijst_y = {100,140,180,220,260,300,340,380,420,460,500,540,580};

    private ImageIcon img_p1 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (15).jpg");
    private ImageIcon img_p2 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (21).jpg");
    private ImageIcon img_p3 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (22).jpg");
    private ImageIcon img_p4 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (19).jpg");
    private ImageIcon img_p5 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (18).jpg");
    private ImageIcon img_p6 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\p (17).jpg");
    private ImageIcon img_p7 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\d (1).jpg");
    private ImageIcon img_p8 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\d (2).jpg");
    private ImageIcon img_p9 = new ImageIcon("C:\\Users\\root\\IdeaProjects\\HBO-ICT_Beroepsproduct\\resources\\d (3).jpg");

    private Kassa()
    {
        JFrame f= new JFrame("Kassabon");

        int s_lb_x = 0;
        int s_lb_y = 0;
        int s_lb_h = 0;
        int s_lb_b = 0;

        int p_btn_w = 175;
        int p_btn_h = 175;

        int p_btn1_x = 20;
        int p_btn2_x = 220;
        int p_btn3_x = 420;

        int p_btn1_y = 160;
        int p_btn2_y = 360;
        int p_btn3_y = 560;

        Color p_btn = Color.white;

        Font tekst = new Font("Verdana",Font.BOLD,30);

        int s_tf_x = 30;
        int s_tf_y = 70;
        int s_tf_w = 550;
        int s_tf_h = 50;

        Color s_tf = Color.white;

        Font tekst_product = new Font("Verdana",Font.BOLD,10);

        int p_cb_x = 630;
        int p_lant_x = 660;
        int p_lpn_x = 690;
        int p_lpr_x = 890;

        int p_ltf_h = 25;
        int p_ltf_b = 190;

        int p_lant_h = 25;
        int p_lant_b = 20;

        int p_lpr_h = 25;
        int p_lpr_b = 50;

        int p_cb_h = 25;
        int p_cb_b = 25;

        Color p_l_tf = Color.white;

        Color p_cb = Color.white;
        Color p_lant = Color.white;
        Color p_lpn= Color.white;
        Color p_lpr= Color.white;


        if (panels){
            JPanel P_Status = new JPanel();
            P_Status.setBounds(10,10,600,130);
            P_Status.setBackground(Color.lightGray);
            f.add(P_Status);

            //Maak panel
            JPanel P_Knop_producten=new JPanel();
            P_Knop_producten.setBounds(10,150,600,600);
            P_Knop_producten.setBackground(Color.gray);
            f.add(P_Knop_producten);

            //Maak panel
            JPanel P_Lijst_producten=new JPanel();
            P_Lijst_producten.setBounds(620,10,350,500);
            P_Lijst_producten.setBackground(Color.blue);
            f.add(P_Lijst_producten);

            //Maak panel
            JPanel P_Berekening=new JPanel();
            P_Berekening.setBounds(620,520,350,170);
            P_Berekening.setBackground(Color.red);
            f.add(P_Berekening);

            //Maak panel
            JPanel P_Navigatie=new JPanel();
            P_Navigatie.setBounds(620,700,350,50);
            P_Navigatie.setBackground(Color.green);
            f.add(P_Navigatie);
        }

        //Buttons productlijst_y
        JButton p1=new JButton(product[0]+"  "+prijsproduct[0],img_p1);
        p1.setBounds(p_btn1_x,p_btn1_y,p_btn_w,p_btn_h);
        p1.setBackground(p_btn);
        p1.setHorizontalTextPosition(JButton.CENTER);
        p1.setVerticalTextPosition(JButton.TOP);
        f.add(p1);

        JButton p2=new JButton(product[1]+"  "+prijsproduct[1],img_p2);
        p2.setBounds(p_btn2_x,p_btn1_y,p_btn_w,p_btn_h);
        p2.setBackground(p_btn);
        p2.setHorizontalTextPosition(JButton.CENTER);
        p2.setVerticalTextPosition(JButton.TOP);
        f.add(p2);

        JButton p3=new JButton(product[2]+"  "+prijsproduct[2],img_p3);
        p3.setBounds(p_btn3_x,p_btn1_y,p_btn_w,p_btn_h);
        p3.setBackground(p_btn);
        p3.setHorizontalTextPosition(JButton.CENTER);
        p3.setVerticalTextPosition(JButton.TOP);
        f.add(p3);

        //Buttons productlijst_y

        JButton p4=new JButton(product[3]+"  "+prijsproduct[3],img_p4);
        p4.setBounds(p_btn1_x,p_btn2_y,p_btn_w,p_btn_h);
        p4.setBackground(p_btn);
        p4.setHorizontalTextPosition(JButton.CENTER);
        p4.setVerticalTextPosition(JButton.TOP);
        f.add(p4);

        JButton p5=new JButton(product[4]+"  "+prijsproduct[4],img_p5);
        p5.setBounds(p_btn2_x,p_btn2_y,p_btn_w,p_btn_h);
        p5.setBackground(p_btn);
        p5.setHorizontalTextPosition(JButton.CENTER);
        p5.setVerticalTextPosition(JButton.TOP);
        f.add(p5);

        JButton p6=new JButton(product[5]+"  "+prijsproduct[5],img_p6);
        p6.setBounds(p_btn3_x,p_btn2_y,p_btn_w,p_btn_h);
        p6.setBackground(p_btn);
        p6.setHorizontalTextPosition(JButton.CENTER);
        p6.setVerticalTextPosition(JButton.TOP);
        f.add(p6);

        //Buttons productlijst_y

        JButton p7=new JButton(product[6]+"  "+prijsproduct[6],img_p7);
        p7.setBounds(p_btn1_x,p_btn3_y,p_btn_w,p_btn_h);
        p7.setBackground(p_btn);
        p7.setHorizontalTextPosition(JButton.CENTER);
        p7.setVerticalTextPosition(JButton.TOP);
        f.add(p7);

        JButton p8=new JButton(product[7]+"  "+prijsproduct[7],img_p8);
        p8.setBounds(p_btn2_x,p_btn3_y,p_btn_w,p_btn_h);
        p8.setBackground(p_btn);
        p8.setHorizontalTextPosition(JButton.CENTER);
        p8.setVerticalTextPosition(JButton.TOP);
        f.add(p8);

        JButton p9=new JButton(product[8]+"  "+prijsproduct[8],img_p9);
        p9.setBounds(p_btn3_x,p_btn3_y,p_btn_w,p_btn_h);
        p9.setBackground(p_btn);
        p9.setHorizontalTextPosition(JButton.CENTER);
        p9.setVerticalTextPosition(JButton.TOP);
        f.add(p9);

        //Status panel

        naam_Kassa.setBounds(s_lb_x, s_lb_y,s_lb_b,s_lb_h);
        naam_Kassa.setBackground(p_cb);
        f.add(naam_Kassa);

        status_Kassa.setBounds(s_tf_x,s_tf_y,s_tf_w,s_tf_h);
        status_Kassa.setBackground(s_tf);
        status_Kassa.setFont(tekst);
        status_Kassa.setEditable(false);
        f.add(status_Kassa);

        //Productaantal panel
        aantal_Product1.setBounds(p_lant_x, productlijst_y[0],p_lant_b,p_lant_h);
        aantal_Product1.setBackground(p_lant);
        aantal_Product1.setFont(tekst_product);
        aantal_Product1.setEditable(false);
        f.add(aantal_Product1);

        aantal_Product2.setBounds(p_lant_x, productlijst_y[1],p_lant_b,p_lant_h);
        aantal_Product2.setBackground(p_lant);
        aantal_Product2.setFont(tekst_product);
        aantal_Product2.setEditable(false);
        f.add(aantal_Product2);

        aantal_Product3.setBounds(p_lant_x, productlijst_y[2],p_lant_b,p_lant_h);
        aantal_Product3.setBackground(p_lant);
        aantal_Product3.setFont(tekst_product);
        aantal_Product3.setEditable(false);
        f.add(aantal_Product3);

        aantal_Product4.setBounds(p_lant_x, productlijst_y[3],p_lant_b,p_lant_h);
        aantal_Product4.setBackground(p_lant);
        aantal_Product4.setFont(tekst_product);
        aantal_Product4.setEditable(false);
        f.add(aantal_Product4);

        aantal_Product5.setBounds(p_lant_x, productlijst_y[4],p_lant_b,p_lant_h);
        aantal_Product5.setBackground(p_lant);
        aantal_Product5.setFont(tekst_product);
        aantal_Product5.setEditable(false);
        f.add(aantal_Product5);

        aantal_Product6.setBounds(p_lant_x, productlijst_y[5],p_lant_b,p_lant_h);
        aantal_Product6.setBackground(p_lant);
        aantal_Product6.setFont(tekst_product);
        aantal_Product6.setEditable(false);
        f.add(aantal_Product6);

        aantal_Product7.setBounds(p_lant_x, productlijst_y[6],p_lant_b,p_lant_h);
        aantal_Product7.setBackground(p_lant);
        aantal_Product7.setFont(tekst_product);
        aantal_Product7.setEditable(false);
        f.add(aantal_Product7);

        aantal_Product8.setBounds(p_lant_x, productlijst_y[7],p_lant_b,p_lant_h);
        aantal_Product8.setBackground(p_lant);
        aantal_Product8.setFont(tekst_product);
        aantal_Product8.setEditable(false);
        f.add(aantal_Product8);

        aantal_Product9.setBounds(p_lant_x, productlijst_y[8],p_lant_b,p_lant_h);
        aantal_Product9.setBackground(p_lant);
        aantal_Product9.setFont(tekst_product);
        aantal_Product9.setEditable(false);
        f.add(aantal_Product9);

        //Lijst Productnaam

        naam_Product1.setBounds(p_lpn_x, productlijst_y[0],p_ltf_b,p_ltf_h);
        naam_Product1.setBackground(p_lpn);
        naam_Product1.setFont(tekst_product);
        naam_Product1.setEditable(false);
        f.add(naam_Product1);

        naam_Product2.setBounds(p_lpn_x, productlijst_y[1],p_ltf_b,p_ltf_h);
        naam_Product2.setBackground(p_lpn);
        naam_Product2.setFont(tekst_product);
        naam_Product2.setEditable(false);
        f.add(naam_Product2);

        naam_Product3.setBounds(p_lpn_x, productlijst_y[2],p_ltf_b,p_ltf_h);
        naam_Product3.setBackground(p_lpn);
        naam_Product3.setFont(tekst_product);
        naam_Product3.setEditable(false);
        f.add(naam_Product3);

        naam_Product4.setBounds(p_lpn_x, productlijst_y[3],p_ltf_b,p_ltf_h);
        naam_Product4.setBackground(p_lpn);
        naam_Product4.setFont(tekst_product);
        naam_Product4.setEditable(false);
        f.add(naam_Product4);

        naam_Product5.setBounds(p_lpn_x, productlijst_y[4],p_ltf_b,p_ltf_h);
        naam_Product5.setBackground(p_lpn);
        naam_Product5.setFont(tekst_product);
        naam_Product5.setEditable(false);
        f.add(naam_Product5);

        naam_Product6.setBounds(p_lpn_x, productlijst_y[5],p_ltf_b,p_ltf_h);
        naam_Product6.setBackground(p_lpn);
        naam_Product6.setFont(tekst_product);
        naam_Product6.setEditable(false);
        f.add(naam_Product6);

        naam_Product7.setBounds(p_lpn_x, productlijst_y[6],p_ltf_b,p_ltf_h);
        naam_Product7.setBackground(p_lpn);
        naam_Product7.setFont(tekst_product);
        naam_Product7.setEditable(false);
        f.add(naam_Product7);

        naam_Product8.setBounds(p_lpn_x, productlijst_y[7],p_ltf_b,p_ltf_h);
        naam_Product8.setBackground(p_lpn);
        naam_Product8.setFont(tekst_product);
        naam_Product8.setEditable(false);
        f.add(naam_Product8);

        naam_Product9.setBounds(p_lpn_x, productlijst_y[8],p_ltf_b,p_ltf_h);
        naam_Product9.setBackground(p_lpn);
        naam_Product9.setFont(tekst_product);
        naam_Product9.setEditable(false);
        f.add(naam_Product9);


        //Lijst productprijs

        prijs_Product1.setBounds(p_lpr_x, productlijst_y[0],p_lpr_b,p_lpr_h);
        prijs_Product1.setBackground(p_lpr);
        prijs_Product1.setFont(tekst_product);
        prijs_Product1.setEditable(false);
        f.add(prijs_Product1);

        prijs_Product2.setBounds(p_lpr_x, productlijst_y[1],p_lpr_b,p_lpr_h);
        prijs_Product2.setBackground(p_lpr);
        prijs_Product2.setFont(tekst_product);
        prijs_Product2.setEditable(false);
        f.add(prijs_Product2);

        prijs_Product3.setBounds(p_lpr_x, productlijst_y[2],p_lpr_b,p_lpr_h);
        prijs_Product3.setBackground(p_lpr);
        prijs_Product3.setFont(tekst_product);
        prijs_Product3.setEditable(false);
        f.add(prijs_Product3);

        prijs_Product4.setBounds(p_lpr_x, productlijst_y[3],p_lpr_b,p_lpr_h);
        prijs_Product4.setBackground(p_lpr);
        prijs_Product4.setFont(tekst_product);
        prijs_Product4.setEditable(false);
        f.add(prijs_Product4);

        prijs_Product5.setBounds(p_lpr_x, productlijst_y[4],p_lpr_b,p_lpr_h);
        prijs_Product5.setBackground(p_lpr);
        prijs_Product5.setFont(tekst_product);
        prijs_Product5.setEditable(false);
        f.add(prijs_Product5);

        prijs_Product6.setBounds(p_lpr_x, productlijst_y[5],p_lpr_b,p_lpr_h);
        prijs_Product6.setBackground(p_lpr);
        prijs_Product6.setFont(tekst_product);
        prijs_Product6.setEditable(false);
        f.add(prijs_Product6);

        prijs_Product7.setBounds(p_lpr_x, productlijst_y[6],p_lpr_b,p_lpr_h);
        prijs_Product7.setBackground(p_lpr);
        prijs_Product7.setFont(tekst_product);
        prijs_Product7.setEditable(false);
        f.add(prijs_Product7);

        prijs_Product8.setBounds(p_lpr_x, productlijst_y[7],p_lpr_b,p_lpr_h);
        prijs_Product8.setBackground(p_lpr);
        prijs_Product8.setFont(tekst_product);
        prijs_Product8.setEditable(false);
        f.add(prijs_Product8);

        prijs_Product9.setBounds(p_lpr_x, productlijst_y[8],p_lpr_b,p_lpr_h);
        prijs_Product9.setBackground(p_lpr);
        prijs_Product9.setFont(tekst_product);
        prijs_Product9.setEditable(false);
        f.add(prijs_Product9);

        //ActionListener knoppen productlijst_y
        p1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k1++;
                addProduct(1);
            }
        } );

        p2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k2++;
                addProduct(2);
            }
        } );

        p3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k3++;
                addProduct(3);
            }
        } );

        p4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k4++;
                addProduct(4);
            }
        } );

        p5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k5++;
                addProduct(5);
            }
        } );

        p6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k6++;
                addProduct(6);
            }
        } );

        p7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k7++;
                addProduct(7);
            }
        } );

        p8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k8++;
                addProduct(8);
            }
        } );

        p9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_k9++;
                addProduct(9);
            }
        } );

        f.setSize(1000,800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    private void setStatus(int klick, JTextField status_Kassa,String product, double prijsproduct){
        aantalproducten++;
        status_Kassa.setText(klick+"x  "+product+"\tTotaal: €"+formatter.format(klick*prijsproduct));
    }
    private void addProduct(int keuze){
        switch (keuze){
            case 1:
                setStatus(btn_k1,status_Kassa,product[0],prijsproduct[0]);
                naam_Product1.setText(product[0]);
                aantal_Product1.setText(""+getBtn_k1());
                prijs_Product1.setText(""+formatter.format(getBtn_k1()*prijsproduct[0]));
                productaantal[0] = getBtn_k1();
                break;
            case 2:
                setStatus(btn_k2,status_Kassa,product[1],prijsproduct[1]);
                naam_Product2.setText(product[1]);
                aantal_Product2.setText(""+getBtn_k2());
                prijs_Product2.setText(""+formatter.format(getBtn_k2()*prijsproduct[1]));
                productaantal[1] = getBtn_k2();

                break;
            case 3:
                setStatus(btn_k3,status_Kassa,product[2],prijsproduct[2]);
                naam_Product3.setText(product[2]);
                aantal_Product3.setText(""+getBtn_k3());
                prijs_Product3.setText(""+formatter.format(getBtn_k3()*prijsproduct[2]));
                productaantal[2] = getBtn_k3();
                break;
            case 4:
                setStatus(btn_k4,status_Kassa,product[3],prijsproduct[3]);
                naam_Product4.setText(product[3]);
                aantal_Product4.setText(""+getBtn_k4());
                prijs_Product4.setText(""+formatter.format(getBtn_k4()*prijsproduct[3]));
                productaantal[3] = getBtn_k4();
                break;
            case 5:
                setStatus(btn_k5,status_Kassa,product[4],prijsproduct[4]);
                naam_Product5.setText(product[4]);
                aantal_Product5.setText(""+getBtn_k5());
                prijs_Product5.setText(""+formatter.format(getBtn_k5()*prijsproduct[4]));
                productaantal[4] = getBtn_k5();
                break;
            case 6:
                setStatus(btn_k6,status_Kassa,product[5],prijsproduct[5]);
                naam_Product6.setText(product[5]);
                aantal_Product6.setText(""+getBtn_k6());
                prijs_Product6.setText(""+formatter.format(getBtn_k6()*prijsproduct[5]));
                productaantal[5] = getBtn_k6();
                break;
            case 7:
                setStatus(btn_k7,status_Kassa,product[6],prijsproduct[6]);
                naam_Product7.setText(product[6]);
                aantal_Product7.setText(""+getBtn_k7());
                prijs_Product7.setText(""+formatter.format(getBtn_k7()*prijsproduct[6]));
                productaantal[6] = getBtn_k7();
                break;
            case 8:
                setStatus(btn_k8,status_Kassa,product[7],prijsproduct[7]);
                naam_Product8.setText(product[7]);
                aantal_Product8.setText(""+getBtn_k8());
                prijs_Product8.setText(""+formatter.format(getBtn_k8()*prijsproduct[7]));
                productaantal[7] = getBtn_k8();
                break;
            case 9:
                setStatus(btn_k9,status_Kassa,product[8],prijsproduct[8]);
                naam_Product9.setText(product[8]);
                aantal_Product9.setText(""+getBtn_k9());
                prijs_Product9.setText(""+formatter.format(getBtn_k9()*prijsproduct[8]));
                productaantal[8] = getBtn_k9();
                break;
            default:
                naam_Product1.setText("");
                naam_Product2.setText("");
                naam_Product3.setText("");
                naam_Product4.setText("");
                naam_Product5.setText("");
                naam_Product6.setText("");
                naam_Product7.setText("");
                naam_Product8.setText("");
                naam_Product9.setText("");
                break;
        }

    }

    public int getBtn_k1() {
        return btn_k1;
    }

    public int getBtn_k2() {
        return btn_k2;
    }

    public int getBtn_k3() {
        return btn_k3;
    }

    public int getBtn_k4() {
        return btn_k4;
    }

    public int getBtn_k5() {
        return btn_k5;
    }

    public int getBtn_k6() {
        return btn_k6;
    }

    public int getBtn_k7() {
        return btn_k7;
    }

    public int getBtn_k8() {
        return btn_k8;
    }

    public int getBtn_k9() {
        return btn_k9;
    }

    public static void main(String args[])
    {
        new Kassa();
    }
}