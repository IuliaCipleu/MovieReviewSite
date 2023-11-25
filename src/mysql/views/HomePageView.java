package mysql.views;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePageView extends JFrame {

    private JFrame frame;
    private JTextField searchMovieTextField;
    private JTextPane todayMoviesTextPane;
    private JButton showTodayButton;
    private JComboBox genreComboBox;
    private JButton goMovieButton;
    private JTextField emailTextField;
    private JPasswordField passwordTextField;
    private JButton createButton;

    public HomePageView() {
        //frame = new JFrame();
        this.setBackground(UIManager.getColor("Button.shadow"));
        this.getContentPane().setBackground(new Color(243, 209, 129));
        this.setBounds(100, 100, 730, 555);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        JLabel titleTextLabel = new JLabel("IMDB - Home Page");
        titleTextLabel.setBounds(178, 5, 339, 33);
        titleTextLabel.setForeground(new Color(101, 0, 191));
        titleTextLabel.setToolTipText("");
        titleTextLabel.setMaximumSize(new Dimension(30, 14));
        titleTextLabel.setLabelFor(this);
        titleTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleTextLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        titleTextLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleTextLabel.setVerticalTextPosition(SwingConstants.CENTER);
        titleTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
        this.getContentPane().add(titleTextLabel);

        JLabel searchTextLabel = new JLabel("Search Movie by Name");
        searchTextLabel.setForeground(new Color(101, 0, 191));
        searchTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
        searchTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        searchTextLabel.setBounds(10, 80, 212, 33);
        this.getContentPane().add(searchTextLabel);

        searchMovieTextField = new JTextField();
        searchMovieTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
        searchMovieTextField.setBounds(232, 71, 314, 33);
        this.getContentPane().add(searchMovieTextField);
        searchMovieTextField.setColumns(10);

        todayMoviesTextPane = new JTextPane();
        todayMoviesTextPane.setForeground(new Color(101, 0, 191));
        todayMoviesTextPane.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        todayMoviesTextPane.setBackground(new Color(216, 184, 241));
        todayMoviesTextPane.setBounds(429, 115, 270, 301);
        this.getContentPane().add(todayMoviesTextPane);

        showTodayButton = new JButton("Show Movies Released Today");
        showTodayButton.setForeground(new Color(101, 0, 191));
        showTodayButton.setBackground(new Color(216, 184, 241));
        showTodayButton.setFont(new Font("Yu Gothic", Font.BOLD, 15));
        showTodayButton.setBounds(429, 438, 270, 45);
        this.getContentPane().add(showTodayButton);

        JLabel searchGenreTextLabel = new JLabel("Search Movie by Genre");
        searchGenreTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
        searchGenreTextLabel.setForeground(new Color(101, 0, 191));
        searchGenreTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        searchGenreTextLabel.setBounds(10, 124, 212, 33);
        this.getContentPane().add(searchGenreTextLabel);

        genreComboBox = new JComboBox();
        genreComboBox.setMaximumRowCount(20);
        genreComboBox.setModel(new DefaultComboBoxModel(new String[]{"Action", "Animation", "Comedy", "Crime", "Horror", "Mystery", "Romance", "Thriller"}));
        genreComboBox.setForeground(new Color(101, 0, 191));
        genreComboBox.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        genreComboBox.setBounds(232, 115, 188, 30);
        this.getContentPane().add(genreComboBox);

        goMovieButton = new JButton("Go");
        goMovieButton.setForeground(new Color(101, 0, 191));
        goMovieButton.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        goMovieButton.setBounds(556, 71, 143, 32);
        this.getContentPane().add(goMovieButton);

        JLabel iconLabel = new JLabel("");
        iconLabel.setIcon(new ImageIcon("C:\\Users\\Cipleu\\Documents\\IULIA\\SCOALA\\facultate\\Year 2 Semester 1\\OOP\\code\\project\\resources\\icon2.png"));
        iconLabel.setBounds(10, 3, 59, 66);
        this.getContentPane().add(iconLabel);

        JLabel iconLabel2 = new JLabel("");
        iconLabel2.setIcon(new ImageIcon("C:\\Users\\Cipleu\\Documents\\IULIA\\SCOALA\\facultate\\Year 2 Semester 1\\DB\\PROJECT\\PHOTO\\icon3.png"));
        iconLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        iconLabel2.setBounds(315, 176, 75, 61);
        this.getContentPane().add(iconLabel2);

        JLabel createNewAccountTextLabel = new JLabel("Create/Delete Account");
        createNewAccountTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
        createNewAccountTextLabel.setForeground(new Color(101, 0, 191));
        createNewAccountTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
        createNewAccountTextLabel.setBounds(83, 204, 203, 33);
        this.getContentPane().add(createNewAccountTextLabel);

        JLabel emailTextLabel = new JLabel("Email ");
        emailTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
        emailTextLabel.setForeground(new Color(101, 0, 191));
        emailTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        emailTextLabel.setBounds(16, 281, 53, 29);
        this.getContentPane().add(emailTextLabel);

        JLabel passwordTextLabel = new JLabel("Password");
        passwordTextLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordTextLabel.setForeground(new Color(101, 0, 191));
        passwordTextLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        passwordTextLabel.setBounds(10, 352, 86, 29);
        this.getContentPane().add(passwordTextLabel);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
        emailTextField.setColumns(10);
        emailTextField.setBounds(106, 267, 312, 33);
        this.getContentPane().add(emailTextField);

        passwordTextField = new JPasswordField();
        passwordTextField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordTextField.setForeground(new Color(128, 0, 150));
        passwordTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
        passwordTextField.setBounds(106, 336, 313, 33);
        this.getContentPane().add(passwordTextField);

        createButton = new JButton("Create/Delete");
        createButton.setForeground(new Color(101, 0, 191));
        createButton.setFont(new Font("Yu Gothic", Font.BOLD, 15));
        createButton.setBackground(new Color(217, 177, 248));
        createButton.setBounds(84, 438, 270, 45);
        this.getContentPane().add(createButton);

        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(10)
                                .addComponent(iconLabel, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addGap(109)
                                .addComponent(titleTextLabel, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                .addGap(197))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(10)
                                .addComponent(searchTextLabel, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addGap(10)
                                .addComponent(searchMovieTextField, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addGap(10)
                                .addComponent(goMovieButton, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addGap(15))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(10)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(searchGenreTextLabel, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                                .addGap(10)
                                                .addComponent(genreComboBox, 0, 188, Short.MAX_VALUE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(73)
                                                .addComponent(createNewAccountTextLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(29)
                                                .addComponent(iconLabel2, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                .addGap(30))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(6)
                                                .addComponent(emailTextLabel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                .addGap(37)
                                                .addComponent(emailTextField, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                .addGap(2))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(passwordTextLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(10)
                                                .addComponent(passwordTextField, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                                .addGap(1)))
                                .addGap(9)
                                .addComponent(todayMoviesTextPane, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addGap(15))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(84)
                                .addComponent(createButton, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addGap(75)
                                .addComponent(showTodayButton, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addGap(15))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(3)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(iconLabel, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(2)
                                                .addComponent(titleTextLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(31)))
                                .addGap(2)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(9)
                                                .addComponent(searchTextLabel, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                        .addComponent(searchMovieTextField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(goMovieButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGap(2)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGap(9)
                                                                .addComponent(searchGenreTextLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(genreComboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                .addGap(19)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGap(28)
                                                                .addComponent(createNewAccountTextLabel))
                                                        .addComponent(iconLabel2, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                                .addGap(30)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGap(14)
                                                                .addComponent(emailTextLabel))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                                                                .addGap(10)))
                                                .addGap(26)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGap(16)
                                                                .addComponent(passwordTextLabel))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                                                                .addGap(12)))
                                                .addGap(35))
                                        .addComponent(todayMoviesTextPane, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
                                .addGap(22)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(createButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showTodayButton, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(33))
        );
        this.getContentPane().setLayout(groupLayout);

        this.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public String getSearchMovieTextField() {
        return searchMovieTextField.getText();
    }

    public void setSearchMovieTextField(String searchMovieTextField) {
        this.searchMovieTextField.setText(searchMovieTextField);
    }

    public String getTodayMoviesTextPane() {
        return todayMoviesTextPane.getText();
    }

    public void setTodayMoviesTextPane(String todayMoviesTextPane) {
        this.todayMoviesTextPane.setText(todayMoviesTextPane);
    }

    public JButton getShowTodayButton() {
        return showTodayButton;
    }

    public void setShowTodayButton(JButton showTodayButton) {
        this.showTodayButton = showTodayButton;
    }

    public String getGenreComboBox() {
        return genreComboBox.getSelectedItem().toString();
    }

    public void setGenreComboBox(JComboBox genreComboBox) {
        this.genreComboBox = genreComboBox;
    }

    public JButton getGoMovieButton() {
        return goMovieButton;
    }

    public void setGoMovieButton(JButton goMovieButton) {
        this.goMovieButton = goMovieButton;
    }

    public String getEmailTextField() {
        return emailTextField.getText();
    }

    public void setEmailTextField(String emailTextField) {
        this.emailTextField.setText(emailTextField);
    }

    public String getPasswordTextField() {
        return passwordTextField.getText();
    }

    public void setPasswordTextField(String passwordTextField) {
        this.passwordTextField.setText(passwordTextField);
    }

    public JButton getCreateButton() {
        return createButton;
    }

    public void setCreateButton(JButton createButton) {
        this.createButton = createButton;
    }

    public void showMovieByName(ActionListener actionListener) {
        goMovieButton.addActionListener(actionListener);
    }

    public void showTodayMovie(ActionListener actionListener) {
        showTodayButton.addActionListener(actionListener);
    }

    public void selectGenre(ActionListener actionListener) {
        genreComboBox.addActionListener(actionListener);
    }

    public void createAccount(ActionListener actionListener) {
        createButton.addActionListener(actionListener);
    }

    public void refresh() {
        searchMovieTextField.setText(null);
        //searchPersonTextField.setText(null);
        todayMoviesTextPane.setText(null);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        refresh();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}