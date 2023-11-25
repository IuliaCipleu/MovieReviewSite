package mysql.views;

import mysql.models.Movie;
import mysql.models.MovieTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SearchGenreView extends JFrame {
    private JFrame frame;
    private JLabel titleLabel;
    private JTextPane titlePane;
    //private JTextPane moviesTextPane;
    private JTextArea moviesTextPane;

    public SearchGenreView(List<Movie> movieAll) {
        this.getContentPane().setForeground(new Color(62, 58, 69));
        this.getContentPane().setBackground(new Color(245, 241, 144));
        this.setBounds(100, 100, 951, 468);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);

        titleLabel = new JLabel("Movies");
        titleLabel.setForeground(new Color(45, 4, 115));
        titleLabel.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 25));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(452, 41, 94, 41);
        this.getContentPane().add(titleLabel);

        titlePane = new JTextPane();
        titlePane.setForeground(new Color(45, 4, 115));
        titlePane.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 25));
        titlePane.setBackground(new Color(245, 241, 144));
        titlePane.setBounds(316, 24, 131, 47);
        titlePane.setEditable(false);
        this.getContentPane().add(titlePane);

//        moviesTextPane = new JTextPane();
//        moviesTextPane.setForeground(new Color(87, 88, 140));
//        moviesTextPane.setFont(new Font("Yu Gothic", Font.BOLD, 18));
//        moviesTextPane.setBackground(new Color(255, 179, 149));
//        moviesTextPane.setBounds(23, 101, 849, 417);
//        this.getContentPane().add(moviesTextPane);

        moviesTextPane = new JTextArea();
        moviesTextPane.setForeground(new Color(39, 40, 122));
        moviesTextPane.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        moviesTextPane.setBackground(new Color(255, 179, 149));
        moviesTextPane.setBounds(23, 101, 849, 417);
        //this.getContentPane().add(moviesTextPane);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(23, 101, 849, 220);
        scrollPane.setForeground(new Color(227, 173, 119, 255));
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.getContentPane().add(scrollPane);

        String[] columnNamesMovies = {"ID", "Title", "Rating", "Release Date", "ID Poster"};
        JTable table = new JTable();
        table.setBackground(new Color(255, 179, 149));
        table.setForeground(new Color(234, 122, 74, 255));
        table.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        table.setRowHeight(25);
        scrollPane.setViewportView(table);

        MovieTableModel movieTableModel = new MovieTableModel();
        table.setModel(movieTableModel);
        int columnNumber = table.getColumnCount();
        for (int i = 0; i < columnNumber; i++) {
            table.getColumnModel().getColumn(i).setHeaderValue(columnNamesMovies[i]);
        }
        movieTableModel.setMoviess(movieAll);
//        JScrollBar scrollBar = new JScrollBar();
//        scrollBar.setBackground(new Color(159, 160, 195));
//        scrollBar.setBounds(897, 11, 17, 566);
//        this.getContentPane().add(scrollBar);

//        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
//        groupLayout.setHorizontalGroup(
//                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(groupLayout.createSequentialGroup()
//                                .addGap(23)
//                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(groupLayout.createSequentialGroup()
//                                                .addGap(293)
//                                                .addComponent(titlePane, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
//                                                .addGap(5)
//                                                .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
//                                                .addGap(326))
//                                        .addComponent(moviesTextPane, GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
//                                .addGap(25)
//                                .addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(21))
//        );
//        groupLayout.setVerticalGroup(
//                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(groupLayout.createSequentialGroup()
//                                .addGap(24)
//                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(groupLayout.createSequentialGroup()
//                                                .addComponent(titlePane)
//                                                .addGap(11))
//                                        .addGroup(groupLayout.createSequentialGroup()
//                                                .addGap(17)
//                                                .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
//                                .addGap(19)
//                                .addComponent(moviesTextPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
//                                .addGap(59))
//                        .addGroup(groupLayout.createSequentialGroup()
//                                .addGap(11)
//                                .addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
//        );
//        this.getContentPane().setLayout(groupLayout);
        this.setResizable(false);
        this.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public String getTitlePane() {
        return titlePane.getText();
    }

    public void setTitlePane(String titlePane) {
        this.titlePane.setText(titlePane);
    }

    public String getMoviesTextPane() {
        return moviesTextPane.getText();
    }

    public void setMoviesTextPane(String moviesTextPane) {
        this.moviesTextPane.setText(moviesTextPane);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

}