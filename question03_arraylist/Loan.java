/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03_arraylist;

import java.util.logging.Logger;

/**
 *
 * @author Shabnam Shaik
 */
public class Loan {

    private String studentName;
    private String typeofLoan;

    public Loan(String studentName, String typeofLoan) {
        this.studentName = studentName;
        this.typeofLoan = typeofLoan;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTypeofLoan() {
        return typeofLoan;
    }

    public void setTypeofLoan(String typeofLoan) {
        this.typeofLoan = typeofLoan;
    }

    @Override
    public String toString() {
        return "studentName=" + studentName + "\ntypeofLoan=" + typeofLoan;
    }

}
