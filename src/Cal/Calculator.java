package Cal; 

import java.awt.*; 
import java.awt.event.*; 

class CreateCal {
    public static void main(String[] args) {
        new Calculator(); 
    }
}

class CallListner extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); 
    }
}

public class Calculator implements ActionListener {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    TextField tf;
    Label lb;
    String fv,sv,op,dt;
    double fdv,sdv,tot;

    public Calculator() { 
        Frame f1 = new Frame(); 
        f1.setBackground(Color.BLACK); 
        f1.addWindowListener(new CallListner()); 
        f1.setBounds(750, 200, 420, 600); 
        f1.setTitle("My Calculator"); 

        Font fon0 = new Font("Calibri", Font.TRUETYPE_FONT, 17);
        Font fon1 = new Font("Calibri", Font.BOLD, 30);
        Font fon2 = new Font("Calibri", Font.BOLD, 40);
        Font fon3 = new Font("Calibri", Font.BOLD, 60);

        MenuBar mbar = new MenuBar();
        MenuItem mi1 = new MenuItem("Standred");
        MenuItem mi2 = new MenuItem("Scientific");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("View Help");
        MenuItem mi5 = new MenuItem("About Calculator");
        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);
        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        Menu m3 = new Menu("Help");
        m3.add(mi4);
        m3.add(mi5);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.setFont(fon0);
        f1.setMenuBar(mbar);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        GridLayout g1 = new GridLayout(5, 4, 4, 4);

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        b11 = new Button("=");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("*");
        b15 = new Button("/");
        b16 = new Button("%");
        b17 = new Button(".");
        b18 = new Button("x^2");
        b19 = new Button("SQ");
        b20 = new Button("CE");

        b0.setFont(fon1);
        b0.setBackground(Color.GRAY);
        b1.setFont(fon1);
        b1.setBackground(Color.GRAY);
        b2.setFont(fon1);
        b2.setBackground(Color.GRAY);
        b3.setFont(fon1);
        b3.setBackground(Color.GRAY);
        b4.setFont(fon1);
        b4.setBackground(Color.GRAY);
        b5.setFont(fon1);
        b5.setBackground(Color.GRAY);
        b6.setFont(fon1);
        b6.setBackground(Color.GRAY);
        b7.setFont(fon1);
        b7.setBackground(Color.GRAY);
        b8.setFont(fon1);
        b8.setBackground(Color.GRAY);
        b9.setFont(fon1);
        b9.setBackground(Color.GRAY);
        b17.setFont(fon1);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setFont(fon1);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setFont(fon1);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setFont(fon1);
        b20.setBackground(Color.LIGHT_GRAY);

        b11.setFont(fon2);
        b11.setBackground(Color.ORANGE);
        b12.setFont(fon2);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setFont(fon2);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setFont(fon2);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setFont(fon2);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setFont(fon2);
        b16.setBackground(Color.LIGHT_GRAY);

        tf = new TextField("0", 11);
        tf.setFont(fon3);
        tf.setBackground(Color.BLACK);
        tf.setForeground(Color.LIGHT_GRAY);
        tf.setEditable(false);

        lb = new Label("Designed By Imesh D. Perera");
        lb.setBounds(50, 100, 100, 30);
        lb.setForeground(Color.WHITE);
        lb.setFont(fon0);

        p2.add(b16); p2.add(b18); p2.add(b19); p2.add(b20);
        p2.add(b7); p2.add(b8); p2.add(b9); p2.add(b12);
        p2.add(b4); p2.add(b5); p2.add(b6); p2.add(b13);
        p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b14);
        p2.add(b17); p2.add(b0); p2.add(b15); p2.add(b11);

        p1.add(tf);
        p3.add(lb);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);
        f1.add(p3, BorderLayout.SOUTH);
        f1.add(p4, BorderLayout.WEST);
        f1.add(p5, BorderLayout.EAST);

        p2.setLayout(g1);
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.BLACK);

        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this);
        b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this); b11.addActionListener(this); b12.addActionListener(this);
        b13.addActionListener(this); b14.addActionListener(this); b15.addActionListener(this);
        b16.addActionListener(this); b17.addActionListener(this); b18.addActionListener(this);
        b19.addActionListener(this); b20.addActionListener(this);
        
        f1.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(b0)) {
            if (tf.getText().equals("0")) {
                tf.setText("0");
            } else {
                tf.setText(tf.getText() + b0.getLabel());
            }
        } else if (o.equals(b1)) {
            if (tf.getText().equals("0")) {
                tf.setText(b1.getLabel());
            } else {
                tf.setText(tf.getText() + b1.getLabel());
            }
        } else if (o.equals(b2)) {
            if (tf.getText().equals("0")) {
                tf.setText(b2.getLabel());
            } else {
                tf.setText(tf.getText() + b2.getLabel());
            }
        } else if (o.equals(b3)) {
            if (tf.getText().equals("0")) {
                tf.setText(b3.getLabel());
            } else {
                tf.setText(tf.getText() + b3.getLabel());
            }
        } else if (o.equals(b4)) {
            if (tf.getText().equals("0")) {
                tf.setText(b4.getLabel());
            } else {
                tf.setText(tf.getText() + b4.getLabel());
            }
        } else if (o.equals(b5)) {
            if (tf.getText().equals("0")) {
                tf.setText(b5.getLabel());
            } else {
                tf.setText(tf.getText() + b5.getLabel());
            }
        } else if (o.equals(b6)) {
            if (tf.getText().equals("0")) {
                tf.setText(b6.getLabel());
            } else {
                tf.setText(tf.getText() + b6.getLabel());
            }
        } else if (o.equals(b7)) {
            if (tf.getText().equals("0")) {
                tf.setText(b7.getLabel());
            } else {
                tf.setText(tf.getText() + b7.getLabel());
            }
        } else if (o.equals(b8)) {
            if (tf.getText().equals("0")) {
                tf.setText(b8.getLabel());
            } else {
                tf.setText(tf.getText() + b8.getLabel());
            }
        } else if (o.equals(b9)) {
            if (tf.getText().equals("0")) {
                tf.setText(b9.getLabel());
            } else {
                tf.setText(tf.getText() + b9.getLabel());
            }
        } else if (o.equals(b17)) {
            if (dt == null) {
                tf.setText(tf.getText() + b17.getLabel());
                dt = "on";
            }
        } else if (o.equals(b12)) {
            fv = tf.getText();
            tf.setText("");
            op = b12.getLabel();
            dt = null;
        } else if (o.equals(b13)) {
            fv = tf.getText();
            tf.setText("");
            op = b13.getLabel();
            dt = null;
        } else if (o.equals(b14)) {
            fv = tf.getText();
            tf.setText("");
            op = b14.getLabel();
            dt = null;
        } else if (o.equals(b15)) {
            fv = tf.getText();
            tf.setText("");
            op = b15.getLabel();
            dt = null;
        } else if (o.equals(b16)) {
            fv = tf.getText();
            tf.setText("");
            op = b16.getLabel();
            dt = null;
        } else if (o.equals(b20)) {
            fv = "0";
            tf.setText(fv);
            sv = null;
            op = null;
        } else if (o.equals(b18)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = fdv * fdv;
            tf.setText(tot + "");
            sv = null;
            op = null;
        } else if (o.equals(b19)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.sqrt(fdv);
            tf.setText(tot + "");
            sv = null;
            op = null;
        } else if (o.equals(b11)) {
            if (op == null || "".equals(tf.getText()) || "".equals(fv)) {
                // Do nothing
            } else {
                sv = tf.getText();
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);
                if (op.equals("+")) {
                    tot = fdv + sdv;
                } else if (op.equals("-")) {
                    tot = fdv - sdv;
                } else if (op.equals("*")) {
                    tot = fdv * sdv;
                } else if (op.equals("/")) {
                    tot = fdv / sdv;
                } else if (op.equals("%")) {
                    tot = (fdv / 100) * sdv;
                } else {
                    fv = "0";
                    tf.setText(fv);
                    sv = null;
                    op = null;
                }
                tf.setText(tot + "");
            }
        } else {
            tf.setText("ERROR");
        }
    }
}
