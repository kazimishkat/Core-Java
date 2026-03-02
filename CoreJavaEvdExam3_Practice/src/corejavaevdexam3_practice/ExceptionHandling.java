/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejavaevdexam3_practice;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        try {
            double k= i/j;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}
