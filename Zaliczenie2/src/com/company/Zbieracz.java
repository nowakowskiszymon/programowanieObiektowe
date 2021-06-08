package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Zbieracz extends JFrame implements KeyListener {
    private final JTextField wpisanaLiczba;
    private final JTextField wynikOgolny;
    private int wynik = 0;

    public Zbieracz() throws HeadlessException {
        super("Zbieracz");
        Label label = new Label();

        wpisanaLiczba = new JTextField();
        wynikOgolny = new JTextField(String.valueOf(wynik));
        wynikOgolny.setEditable(false);

        JTextField puste1 = new JTextField();
        puste1.setEditable(false);
        JTextField puste2 = new JTextField();
        puste2.setEditable(false);


        JPanel p1 = new JPanel(new GridLayout(1, 3));
        p1.add(new Label("Wprowadź liczbę całkowitą i naciśnij enter"));
        p1.add(wpisanaLiczba);
        p1.add(new Label("Skumulowana wartość to:"));

        JPanel p2 = new JPanel(new GridLayout(1, 1));

        p2.add(puste1);
        p2.add(wynikOgolny);
        p2.add(puste2);

        JPanel p3 = new JPanel(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2, BorderLayout.SOUTH);

        setContentPane(p3);

        setSize(900, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        wpisanaLiczba.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (wpisanaLiczba.getText().equals("")){
                    JOptionPane.showMessageDialog(label, "Wprowadź liczbę!", "Ostrzeżenie",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    wynik += Integer.parseInt(wpisanaLiczba.getText());
                wpisanaLiczba.setText(null);
                wynikOgolny.setText(Integer.toString(wynik));

            }
        });

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent arg) {


    }
}
