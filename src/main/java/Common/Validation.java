/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.ArrayList;
import model.Report;

/**
 *
 * @author Administrator
 */
public class Validation {
    public static boolean checkReport(ArrayList<Report> list_Rp, int id, String courseName) {
        for (Report rp : list_Rp) {
            if (id == rp.getId() && courseName.equalsIgnoreCase(rp.getCourseName())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkCourseName(String input) {
        if (input.equalsIgnoreCase("java") || input.equalsIgnoreCase(".net") || input.equalsIgnoreCase("c/c++"))
            return true;
        return false;
    }
}
