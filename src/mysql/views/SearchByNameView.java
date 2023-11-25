package mysql.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class SearchByNameView extends JFrame {
    private JFrame frame;
    private JTextField emailTextField;
    private JTextField reviewTextField;
    private JTextArea titleTextArea;
    private JTextArea genreTextArea;
    private JTextArea dateTextArea;
    private JTextArea starTextArea;
    private JTextArea directorTextArea;
    private JTextArea writerTextArea;
    private JTextArea actorTextArea;
    private JButton submitButton;
    private JLabel posterLabel;
    private JPasswordField passwordField;

    public SearchByNameView() {
        this.getContentPane().setBackground(new Color(255, 239, 149));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 907, 562);
        this.setBackground(new Color(255, 239, 149));

        this.getContentPane().setLayout(null);

        JLabel titleLabel = new JLabel("Result of Search");
        titleLabel.setForeground(new Color(43, 0, 170));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 25));
        titleLabel.setBounds(341, 30, 208, 41);
        this.getContentPane().add(titleLabel);

        posterLabel = new JLabel("");
        posterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        posterLabel.setBounds(557, 30, 306, 269);
        //posterLabel.setSize(550, 250);
        this.getContentPane().add(posterLabel);

        JLabel nameLabel = new JLabel("Title");
        nameLabel.setForeground(new Color(43, 0, 170));
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        nameLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        nameLabel.setBounds(10, 70, 40, 29);
        this.getContentPane().add(nameLabel);

        JLabel genreLabel = new JLabel("Genre");
        genreLabel.setHorizontalAlignment(SwingConstants.LEFT);
        genreLabel.setForeground(new Color(43, 0, 170));
        genreLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        genreLabel.setBounds(10, 110, 54, 29);
        this.getContentPane().add(genreLabel);

        JLabel dateLabel = new JLabel("Release Date");
        dateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        dateLabel.setForeground(new Color(43, 0, 170));
        dateLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        dateLabel.setBounds(10, 150, 118, 29);
        this.getContentPane().add(dateLabel);

        titleTextArea = new JTextArea();
        titleTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        titleTextArea.setBackground(new Color(166, 249, 247));
        titleTextArea.setBounds(138, 68, 411, 29);
        titleTextArea.setEditable(false);
        this.getContentPane().add(titleTextArea);

        genreTextArea = new JTextArea();
        genreTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        genreTextArea.setBackground(new Color(166, 249, 247));
        genreTextArea.setBounds(138, 108, 411, 29);
        genreTextArea.setEditable(false);
        this.getContentPane().add(genreTextArea);

        dateTextArea = new JTextArea();
        dateTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        dateTextArea.setBackground(new Color(166, 249, 247));
        dateTextArea.setBounds(138, 148, 411, 29);
        dateTextArea.setEditable(false);
        this.getContentPane().add(dateTextArea);

        JLabel startLabel = new JLabel("Star Rating");
        startLabel.setHorizontalAlignment(SwingConstants.LEFT);
        startLabel.setForeground(new Color(43, 0, 170));
        startLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        startLabel.setBounds(10, 190, 97, 29);
        this.getContentPane().add(startLabel);

        starTextArea = new JTextArea();
        starTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        starTextArea.setBackground(new Color(166, 249, 247));
        starTextArea.setBounds(138, 188, 411, 29);
        starTextArea.setEditable(false);
        this.getContentPane().add(starTextArea);

        JLabel directorLabel = new JLabel("Directed by");
        directorLabel.setHorizontalAlignment(SwingConstants.LEFT);
        directorLabel.setForeground(new Color(43, 0, 170));
        directorLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        directorLabel.setBounds(10, 230, 102, 29);
        this.getContentPane().add(directorLabel);

        JLabel writerLabel = new JLabel("Written by");
        writerLabel.setHorizontalAlignment(SwingConstants.LEFT);
        writerLabel.setForeground(new Color(43, 0, 170));
        writerLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        writerLabel.setBounds(10, 270, 90, 29);
        this.getContentPane().add(writerLabel);

        JLabel actorLabel = new JLabel("Actors");
        actorLabel.setHorizontalAlignment(SwingConstants.LEFT);
        actorLabel.setForeground(new Color(43, 0, 170));
        actorLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        actorLabel.setBounds(10, 316, 57, 29);
        this.getContentPane().add(actorLabel);

        directorTextArea = new JTextArea();
        directorTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        directorTextArea.setBackground(new Color(166, 249, 247));
        directorTextArea.setBounds(138, 228, 411, 29);
        directorTextArea.setEditable(false);
        this.getContentPane().add(directorTextArea);

        writerTextArea = new JTextArea();
        writerTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        writerTextArea.setBackground(new Color(166, 249, 247));
        writerTextArea.setBounds(138, 268, 411, 29);
        writerTextArea.setEditable(false);
        this.getContentPane().add(writerTextArea);

        actorTextArea = new JTextArea();
        actorTextArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        actorTextArea.setBackground(new Color(166, 249, 247));
        actorTextArea.setBounds(138, 316, 411, 196);
        actorTextArea.setEditable(false);
        this.getContentPane().add(actorTextArea);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
        emailLabel.setForeground(new Color(43, 0, 170));
        emailLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        emailLabel.setBounds(557, 316, 48, 29);
        this.getContentPane().add(emailLabel);

        JLabel reviewLabel = new JLabel("Your rating");
        reviewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        reviewLabel.setForeground(new Color(43, 0, 170));
        reviewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        reviewLabel.setBounds(557, 424, 96, 29);
        this.getContentPane().add(reviewLabel);

        emailTextField = new JTextField();
        emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
        emailTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
        emailTextField.setBounds(655, 318, 208, 27);
        this.getContentPane().add(emailTextField);
        emailTextField.setColumns(10);

        reviewTextField = new JTextField();
        reviewTextField.setHorizontalAlignment(SwingConstants.LEFT);
        reviewTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
        reviewTextField.setColumns(10);
        reviewTextField.setBounds(655, 417, 208, 29);
        this.getContentPane().add(reviewTextField);

        submitButton = new JButton("SUBMIT");
        submitButton.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 20));
        submitButton.setForeground(new Color(43, 0, 170));
        submitButton.setBackground(new Color(255, 121, 0));
        submitButton.setBounds(557, 464, 306, 48);
        this.getContentPane().add(submitButton);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordLabel.setForeground(new Color(43, 0, 170));
        passwordLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
        passwordLabel.setBounds(557, 366, 86, 29);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(655, 368, 208, 27);
        this.add(passwordField);

        GroupLayout gl_contentPane = new GroupLayout(this.getContentPane());
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(5)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(78))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(genreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(64))
                                                        .addComponent(dateLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(startLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(21))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(directorLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(16))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(writerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(28)))
                                                .addGap(10)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGap(203)
                                                                .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                .addGap(2))
                                                        .addComponent(titleTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                        .addComponent(genreTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                        .addComponent(dateTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                        .addComponent(starTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                        .addComponent(directorTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                        .addComponent(writerTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                                                .addGap(8)
                                                .addComponent(posterLabel, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(actorLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(71)
                                                .addComponent(actorTextArea, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                .addGap(8)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(emailLabel, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                                                .addGap(50)
                                                                .addComponent(emailTextField, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(12)
                                                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(reviewLabel, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                                .addGap(2)
                                                                .addComponent(reviewTextField, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                                        .addComponent(submitButton, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))))
                                .addGap(23))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(40)
                                                .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                .addGap(11)
                                                .addComponent(genreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(11)
                                                .addComponent(dateLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                .addGap(11)
                                                .addComponent(startLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                .addGap(11)
                                                .addComponent(directorLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                .addGap(11)
                                                .addComponent(writerLabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(26))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGap(38)
                                                                .addComponent(titleTextArea, GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)))
                                                .addGap(11)
                                                .addComponent(genreTextArea, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(11)
                                                .addComponent(dateTextArea, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(11)
                                                .addComponent(starTextArea, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(11)
                                                .addComponent(directorTextArea, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(11)
                                                .addComponent(writerTextArea, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(2))
                                        .addComponent(posterLabel, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                .addGap(17)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(actorLabel)
                                        .addComponent(actorTextArea, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGap(2)
                                                                .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(21)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(passwordLabel)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGap(2)
                                                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                                                .addGap(22)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGap(7)
                                                                .addComponent(reviewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(reviewTextField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                                .addGap(11)
                                                .addComponent(submitButton, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                                .addGap(6))
        );
        this.getContentPane().setLayout(gl_contentPane);

        this.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public String getEmailTextField() {
        return emailTextField.getText();
    }

    public void setEmailTextField(String emailTextField) {
        this.emailTextField.setText(emailTextField);
    }

    public BigDecimal getReviewTextField() {
        String stringValue = reviewTextField.getText();
        return new BigDecimal(stringValue);
    }

    public void setReviewTextField(BigDecimal reviewTextField) {
        this.reviewTextField.setText(String.valueOf(reviewTextField));
    }

    public String getTitleTextArea() {
        return titleTextArea.getText();
    }

    public void setTitleTextArea(String titleTextArea) {
        this.titleTextArea.setText(titleTextArea);
    }

    public String getGenreTextArea() {
        return genreTextArea.getText();
    }

    public void setGenreTextArea(String genreTextArea) {
        this.genreTextArea.setText(genreTextArea);
    }

    public String getDateTextArea() {
        return dateTextArea.getText();
    }

    public void setDateTextArea(String dateTextArea) {
        this.dateTextArea.setText(dateTextArea);
    }

    public Double getStarTextArea() {
        return Double.parseDouble(starTextArea.getText());
    }

    public void setStarTextArea(BigDecimal starTextArea) {
        this.starTextArea.setText(String.valueOf(starTextArea));
    }

    public String getDirectorTextArea() {
        return directorTextArea.getText();
    }

    public void setDirectorTextArea(String directorTextArea) {
        this.directorTextArea.setText(directorTextArea);
    }

    public String getWriterTextArea() {
        return writerTextArea.getText();
    }

    public void setWriterTextArea(String writerTextArea) {
        this.writerTextArea.setText(writerTextArea);
    }

    public String getActorTextArea() {
        return actorTextArea.getText();
    }

    public void setActorTextArea(String actorTextArea) {
        this.actorTextArea.setText(actorTextArea);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JLabel getPosterLabel() {
        return posterLabel;
    }

    public String getPasswordField() {
        return passwordField.getText();
    }

    public void setPasswordField(String passwordField) {
        this.passwordField.setText(passwordField);
    }

    public void setPosterLabel(String posterLabel) {
        this.posterLabel.setIcon(new ImageIcon(posterLabel));
    }

    public void submitReview(ActionListener actionListener) {
        submitButton.addActionListener(actionListener);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        refresh();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void refresh() {
        reviewTextField.setText(null);
        emailTextField.setText(null);
        passwordField.setText(null);
    }
}