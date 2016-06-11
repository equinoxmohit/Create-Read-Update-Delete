/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.createreadupdatedelete;

//import com.mohitpaudel.createreadupdatedelete.entity.Person;
import com.mohitpaudel.createreadupdatedelete.entity.Teacher;
        /**
         *
         * @author Mohit
         */

public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher person = new Teacher();
        person.setFirstName("Ravi");
        person.setLastName("Shankar");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }

}
