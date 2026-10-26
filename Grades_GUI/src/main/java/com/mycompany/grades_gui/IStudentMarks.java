/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.grades_gui;

/**
 *
 * @author FS
 */
public interface IStudentMarks {
        int[][] GetMarks();

    int GetTotalMarks();

    double GetAverageMarks();

    int GetPassCount();

    int GetFailCount();

    int GetStudentsProcessed();
    
}
