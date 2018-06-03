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
public class Credits {
    private String cardNumber;
    private String cardHash;

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return the cardHash
     */
    public String getCardHash() {
        return cardHash;
    }

    /**
     * @param cardHash the cardHash to set
     */
    public void setCardHash(String cardHash) {
        this.cardHash = cardHash;
    }
    
    public String toString(){
        return cardNumber + "#" + cardHash;
    }
    
    
}
