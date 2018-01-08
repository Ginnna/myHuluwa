//package main.java;


import javax.swing.JFrame;


public final class Ground extends JFrame {

    private final static int OFFSET = 200;
    private final static int SPACE = 60;

    public Ground() {
        InitUI();
    }

    public void InitUI() {
        Field field = new Field(OFFSET, SPACE);
        add(field);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(field.getBoardWidth(),
                field.getBoardHeight() + 2* OFFSET-SPACE);
        setLocationRelativeTo(null);
        setTitle("Ground");
    }



}