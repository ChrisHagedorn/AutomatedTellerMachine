/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedtellermachine;

/**
 *
 * @author chrishagedorn
 */
public class Model {

    int creditCounter = 0;
    Credits[] credits = new Credits[100];
    PasswordSaver helper = new PasswordSaver();

    Model() {
        //Constructor
        String lines[] = helper.readLogins();
        creditCounter = lines.length;
        System.out.println(creditCounter);

        for (int i = 0; i < creditCounter; i++) {
            credits[i] = new Credits();
            String creditLine[] = lines[i].split("#");
            credits[i].setCardNumber(creditLine[0]);
            credits[i].setCardHash(creditLine[1]);

        }

    }

    void add(String hash, String number) {
        System.out.println("add called");
        Credits credit = new Credits();

        credit.setCardHash(hash);
        credit.setCardNumber(number);

        credits[creditCounter] = credit;
        creditCounter++;

      //  System.out.println(getCredits());
       helper.writeLogins(getCredits());

        //System.out.println("Wrote pin to save file");
    }

    String[] getCredits() {
        String[] tmpCredits = new String[creditCounter];
        for (int i = 0; i < creditCounter; i++) {
            tmpCredits[i] = credits[i].toString();
        }
        return tmpCredits;

    } 

}
