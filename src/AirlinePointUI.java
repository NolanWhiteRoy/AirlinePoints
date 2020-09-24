/*
 * Programmer: Nolan White-Roy 
 * Date: January 8, 2020 
 * Program Name: Airline Points
 * Program Description: This program uses ArrayLists to simulate a airline points 
 * program. The program can record airline points data for its passengers 
 * and determine if a passenger qualifies for bonus points. The user can also choose 
 * from a list of operators to reset the data, remove users from the database, 
 * list all users in the database, and search for a particular user based on their 
 * full name. 
 */

import java.util.*;
import java.awt.Color;

public class AirlinePointUI extends javax.swing.JFrame {

    // Global Variable decleration. 
    ArrayList<passenger> passengerList = new ArrayList<>();

    public AirlinePointUI() {
        initComponents();

        // Change background colour. 
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weekOneTxtField = new javax.swing.JTextField();
        weekTwoTxtField = new javax.swing.JTextField();
        weekThreeTxtField = new javax.swing.JTextField();
        weekFourTxtField = new javax.swing.JTextField();
        firstNameTxtField = new javax.swing.JTextField();
        lastNameTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTxtBox = new javax.swing.JTextArea();
        searchBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        subTitleLbl = new javax.swing.JLabel();
        subTitle2Lbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        weekOneLbl = new javax.swing.JLabel();
        weekTwoLbl = new javax.swing.JLabel();
        weekThreeLbl = new javax.swing.JLabel();
        weekFourLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        weekOneTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekOneTxtField.setNextFocusableComponent(weekTwoTxtField);

        weekTwoTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekTwoTxtField.setNextFocusableComponent(weekThreeTxtField);

        weekThreeTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekThreeTxtField.setNextFocusableComponent(weekFourTxtField);

        weekFourTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekFourTxtField.setNextFocusableComponent(addBtn);

        firstNameTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        firstNameTxtField.setNextFocusableComponent(lastNameTxtField);

        lastNameTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lastNameTxtField.setNextFocusableComponent(weekOneTxtField);

        addBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.setNextFocusableComponent(removeBtn);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        listBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        listBtn.setText("List");
        listBtn.setNextFocusableComponent(searchBtn);
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        outputTxtBox.setEditable(false);
        outputTxtBox.setColumns(20);
        outputTxtBox.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        outputTxtBox.setRows(5);
        jScrollPane1.setViewportView(outputTxtBox);

        searchBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setNextFocusableComponent(resetBtn);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        titleLbl.setText("Airline Points");

        subTitleLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        subTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subTitleLbl.setText("Passenger Information");

        subTitle2Lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        subTitle2Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subTitle2Lbl.setText("Operators");

        lastNameLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lastNameLbl.setText("Last Name:");

        firstNameLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        firstNameLbl.setText("First Name:");

        weekOneLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekOneLbl.setText("Week One Points:");

        weekTwoLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekTwoLbl.setText("Week Two Points:");

        weekThreeLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekThreeLbl.setText("Week Three Points:");

        weekFourLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        weekFourLbl.setText("Week Four Points:");

        exitBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setFocusCycleRoot(true);
        exitBtn.setNextFocusableComponent(firstNameTxtField);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setNextFocusableComponent(exitBtn);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.setNextFocusableComponent(listBtn);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(weekThreeLbl)
                                            .addComponent(weekFourLbl)
                                            .addComponent(weekTwoLbl)
                                            .addComponent(weekOneLbl)
                                            .addComponent(lastNameLbl)
                                            .addComponent(firstNameLbl)
                                            .addComponent(exitBtn))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lastNameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(firstNameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(weekFourTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(weekThreeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(weekOneTxtField)
                                                        .addComponent(weekTwoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(subTitleLbl)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subTitle2Lbl)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(listBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                        .addGap(0, 5, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(titleLbl)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTitleLbl)
                    .addComponent(subTitle2Lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLbl)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLbl)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekOneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekOneLbl)
                    .addComponent(listBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekTwoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekTwoLbl)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekThreeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn)
                    .addComponent(weekThreeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekFourTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekFourLbl))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        // Names arrayList to find index in passengerList. 
        ArrayList<String> names = new ArrayList<>();

        //Adds names to the names ArrayList
        passengerList.forEach((p) -> {
            names.add(p.fullName);
        });

        try {
            // If full name is valid (alphabetical characters), also ensures no blank fields.
            if (firstNameTxtField.getText().matches("^[a-zA-Z]+$") && lastNameTxtField.getText().matches("^[a-zA-Z]+$")) {

                // If points are valid (0 or positive number characters), also ensures no blank fields.
                if (weekOneTxtField.getText().matches("^[0-9]+") && weekOneTxtField.getText().matches("^[0-9]+") && weekThreeTxtField.getText().matches("^[0-9]+") && weekFourTxtField.getText().matches("^[0-9]+")) {

                    // Passenger object strings. 
                    String firstName, lastName, fullName, weekOne, weekTwo, weekThree, weekFour, totalPoints, bonusPoints;

                    // Take info from text boxes and store in strings. 
                    firstName = (firstNameTxtField.getText());
                    lastName = (lastNameTxtField.getText());

                    // Convert the inputed name to proper formatting. 
                    firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                    lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

                    // Full name. 
                    fullName = firstName + " " + lastName;

                    if (names.contains(fullName)) {

                        // Display message to indicated passenger was successfully added. 
                        outputTxtBox.setText("User, " + fullName + ", already exists. " + "\n" + "Note: Remove user and add again to modify points.");
                        
                    } else {

                        weekOne = (weekOneTxtField.getText());
                        weekTwo = (weekTwoTxtField.getText());
                        weekThree = (weekThreeTxtField.getText());
                        weekFour = (weekFourTxtField.getText());

                        // Convert point strings to integers to calculate total points. 
                        int weekOneAsInt = Integer.parseInt(weekOne);
                        int weekTwoAsInt = Integer.parseInt(weekTwo);
                        int weekThreeAsInt = Integer.parseInt(weekThree);
                        int weekFourAsInt = Integer.parseInt(weekFour);

                        // Math to calculate total points. 
                        int totalPointsAsInt = (weekOneAsInt + weekTwoAsInt + weekThreeAsInt + weekFourAsInt);

                        // Convert point total back to string to be stored in array. 
                        totalPoints = String.valueOf(totalPointsAsInt);

                        // If total points INT is more than 5000, add 1000 bonus points. Else, don't add bonus points. 
                        if (totalPointsAsInt > 5000) {
                            int bonusPointsAsInt = 1000;
                            bonusPoints = String.valueOf(bonusPointsAsInt);

                        } else {
                            int bonusPointsAsInt = 0;
                            bonusPoints = String.valueOf(bonusPointsAsInt);
                        }

                        // Add strings to passenger object. 
                        passengerList.add(new passenger(fullName, weekOne, weekTwo, weekThree, weekFour, totalPoints, bonusPoints));

                        // Clear text boxes. 
                        firstNameTxtField.setText("");
                        lastNameTxtField.setText("");
                        weekOneTxtField.setText("");
                        weekTwoTxtField.setText("");
                        weekThreeTxtField.setText("");
                        weekFourTxtField.setText("");

                        // Display message to indicated passenger was successfully added. 
                        outputTxtBox.setText("User Added: " + fullName);

                        //Puts focus back on first text field for ease of user input. 
                        firstNameTxtField.requestFocus();
                    }

                } else {
                    // Error message. 
                    outputTxtBox.setText("Error, invalid points input.");
                    //Puts focus back on points text field. 
                    weekOneTxtField.requestFocus();
                }

            } else {
                // Error message. 
                outputTxtBox.setText("Error, invalid name input.");
                //Puts focus back on first name text field for ease of user editing. 
                firstNameTxtField.requestFocus();
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        // Output String. 
        String output = "";

        if (passengerList.size() > 0) {
            outputTxtBox.setText("");
            
            // Run through the arrayList, but no more than its size.
            for (int i = 0; i < passengerList.size(); i++) {
                output = output + "Passenger Name: " + passengerList.get(i).fullName + "\n"
                        + "Week One Points: " + passengerList.get(i).weekOne + "\n"
                        + "Week Two Points: " + passengerList.get(i).weekTwo + "\n"
                        + "Week Three Points: " + passengerList.get(i).weekThree + "\n"
                        + "Week Four Points: " + passengerList.get(i).weekFour + "\n"
                        + "Total Points: " + passengerList.get(i).totalPoints + "\n"
                        + "Bonus Points: " + passengerList.get(i).bonusPoints + "\n" + "\n";
            }
        } else {
            output += "No passengers found.";
            //Puts focus back on first name text field for ease of user input.  
            firstNameTxtField.requestFocus();
        }

        // Write to the text area. 
        outputTxtBox.setText(output);
    }//GEN-LAST:event_listBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // Temoporary output string. 
        String output = "";

        // Names arrayList to find index in passengerList. 
        ArrayList<String> names = new ArrayList<>();

        //Adds names to the names ArrayList
        passengerList.forEach((p) -> {
            names.add(p.fullName);
        });

        // If text fields are empty.
        if (firstNameTxtField.getText().isEmpty() || lastNameTxtField.getText().isEmpty()) {

            // Error message. 
            outputTxtBox.setText("Blank search field.");

            //Puts focus back on first name text field for ease of user input. 
            firstNameTxtField.requestFocus();
        } else {

            // Temp names for search. 
            String firstNameTemp, lastNameTemp, fullNameTemp;

            // Get name search from text fields. 
            firstNameTemp = (firstNameTxtField.getText());
            lastNameTemp = (lastNameTxtField.getText());

            // Convert the inputed name to proper formatting. 
            firstNameTemp = firstNameTemp.substring(0, 1).toUpperCase() + firstNameTemp.substring(1).toLowerCase();
            lastNameTemp = lastNameTemp.substring(0, 1).toUpperCase() + lastNameTemp.substring(1).toLowerCase();

            // Full name. 
            fullNameTemp = firstNameTemp + " " + lastNameTemp;

            // Clear output text.
            outputTxtBox.setText("");

            // Searches for the name. 
            if (names.contains(fullNameTemp)) {
                // Finds the index of the name if it exists. 
                int x = names.indexOf(fullNameTemp);

                output = output + "Passenger Name: " + passengerList.get(x).fullName + "\n"
                        + "Week One Points: " + passengerList.get(x).weekOne + "\n"
                        + "Week Two Points: " + passengerList.get(x).weekTwo + "\n"
                        + "Week Three Points: " + passengerList.get(x).weekThree + "\n"
                        + "Week Four Points: " + passengerList.get(x).weekFour + "\n"
                        + "Total Points: " + passengerList.get(x).totalPoints + "\n"
                        + "Bonus Points: " + passengerList.get(x).bonusPoints + "\n";

                // Puts focus back on first name text field for ease of user input.  
                firstNameTxtField.requestFocus();

                // Clear text boxes. 
                firstNameTxtField.setText("");
                lastNameTxtField.setText("");

            } else {
                // No passenger found. 
                output = "Passenger not found.";

                //Puts focus back on first name text field for ease of user input. 
                firstNameTxtField.requestFocus();
            }
            // Write output to the text area. 
            outputTxtBox.setText(output);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Exit system. 
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed

        // Temoporary output string. 
        String output = "";

        if (passengerList.size() > -1) {

            // Clear array. 
            passengerList.clear();

            // Clear text boxes. 
            firstNameTxtField.setText("");
            lastNameTxtField.setText("");
            weekOneTxtField.setText("");
            weekTwoTxtField.setText("");
            weekThreeTxtField.setText("");
            weekFourTxtField.setText("");

            // Display message to indicated passenger was successfully added. 
            output = ("Data reset successful.");

            //Puts focus back on first name text field for ease of user input. 
            firstNameTxtField.requestFocus();
        } else {
            output = ("No stored information. Please add elements to reset.");
        }

        // Display message to indicated passenger was successfully added. 
        outputTxtBox.setText(output);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        
    // Temporary output string. 
        String output = "";

        // Names array list to search through passenger list. 
        ArrayList<String> names = new ArrayList<>();

        //Adds names to the names ArrayList
        passengerList.forEach((p) -> {
            names.add(p.fullName);
        });

        // If text fields are empty. 
        if (firstNameTxtField.getText().isEmpty() || lastNameTxtField.getText().isEmpty()) {

            // Error message. 
            outputTxtBox.setText("Blank search field.");

            //Puts focus back on first name text field for ease of user input. 
            firstNameTxtField.requestFocus();

        } // Else search for the index and remove passenger.
        else {

            // Temp names for search. 
            String firstNameTemp, lastNameTemp, fullNameTemp;

            // Get name search from text fields. 
            firstNameTemp = (firstNameTxtField.getText());
            lastNameTemp = (lastNameTxtField.getText());

            // Convert the inputed name to proper formatting. 
            firstNameTemp = firstNameTemp.substring(0, 1).toUpperCase() + firstNameTemp.substring(1).toLowerCase();
            lastNameTemp = lastNameTemp.substring(0, 1).toUpperCase() + lastNameTemp.substring(1).toLowerCase();

            // Full name. 
            fullNameTemp = firstNameTemp + " " + lastNameTemp;

            // Clear output text.
            outputTxtBox.setText("");

            // Searches for the name in array.
            if (names.contains(fullNameTemp)) {

                // Finds the index of the name if it exists.
                int x = names.indexOf(fullNameTemp);

                // Remove passenger object from array. 
                passengerList.remove(x);

                // Clear text boxes. 
                firstNameTxtField.setText("");
                lastNameTxtField.setText("");

                // Confirmation message. 
                output = ("Passenger removed.");

            } else {
                // Error message. 
                output = ("Passenger not found.");
            }
            // Write output to the text area.
            outputTxtBox.setText(output);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    class passenger {

        String firstName, lastName, fullName, weekOne, weekTwo, weekThree, weekFour, totalPoints, bonusPoints;

        passenger(String _fullName, String _weekOne, String _weekTwo,
                String _weekThree, String _weekFour, String _totalPoints,
                String _bonusPoints) {

            fullName = _fullName;
            weekOne = _weekOne;
            weekTwo = _weekTwo;
            weekThree = _weekThree;
            weekFour = _weekFour;
            totalPoints = _totalPoints;
            bonusPoints = _bonusPoints;
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AirlinePointUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirlinePointUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirlinePointUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlinePointUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AirlinePointUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JButton listBtn;
    private javax.swing.JTextArea outputTxtBox;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel subTitle2Lbl;
    private javax.swing.JLabel subTitleLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel weekFourLbl;
    private javax.swing.JTextField weekFourTxtField;
    private javax.swing.JLabel weekOneLbl;
    private javax.swing.JTextField weekOneTxtField;
    private javax.swing.JLabel weekThreeLbl;
    private javax.swing.JTextField weekThreeTxtField;
    private javax.swing.JLabel weekTwoLbl;
    private javax.swing.JTextField weekTwoTxtField;
    // End of variables declaration//GEN-END:variables
}
