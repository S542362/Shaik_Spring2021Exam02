/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_Intereface1;

/**
 *
 * @author Shabnam Shaik
 */
public interface Servings {

    default double String(String sh) {
        int str = sh.indexOf("b");
        return str;
    }

    /**
     *
     * @return
     */
    String servesperhead();
}
