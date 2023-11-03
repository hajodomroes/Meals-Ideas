import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

class GUI{

    public GUI() {
        // FRAME
        JFrame frame = new JFrame("Meals GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);

        // BUTTON
        JButton button = new JButton("Show Meals");

        // TABLE
        String[] colums = {"name", "complexLevel", "ingrediants", "category"};
        String[][] data = {};

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                ArrayList<java.lang.String> arrayList = new DBConnection().getDataAsArrayList("select * from mealsList");
                for (String e : arrayList) {
                    e -> {
                        data.stream.toList.add(e);}
                }
            }
        });

        JTable table = new JTable(data, colums);
        table.setBounds(50, 50, 700, 200);



        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(table, BorderLayout.NORTH);


        frame.setVisible(true);
    }
}