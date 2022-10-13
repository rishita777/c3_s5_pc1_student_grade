
package com.Marks;
public class studentMarksImpl
{

    public static void main(String[] args)
    {
        StudentMarks studentMarks=new StudentMarks();

        int nonMedicalPathway= studentMarks.calculateMarks(90,98,91);
        System.out.println("Total Marks for Non Medical Students " +nonMedicalPathway);

        int medicalPathway=studentMarks.calculateMarks(65,77,74,79);
        System.out.println("Total Marks for Medical Students " +medicalPathway);

        int commercePathway= studentMarks.calculateMarks(77.88,88,99);
        System.out.println("Total Marks for Commerce Students " +commercePathway);
    }
}


