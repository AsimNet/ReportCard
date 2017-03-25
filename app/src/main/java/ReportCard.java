/**
 * Created by DevCenter on 3/25/17.
 */

public class ReportCard {

    public static final String UNIVRSITY_NAME = "KFUPM";

    private double _gpa;
    private char _grade;

    ReportCard(double gpa, char grade){
        this._gpa = gpa;
        this._grade = grade;
    }


    public double getGPA(){
        return this._gpa;
    }
    public void setGPA(double gpa){
        this._gpa = gpa;
    }
    public char getGrade(){
        return  this._grade;
    }

    public void setGrade(char grade){
        this._grade = grade;
    }

    public String toString(){
        return "**"+UNIVRSITY_NAME+"**\n\n"+"student's grade: "+ this.getGPA() + ",\n student's GPA: "+this.getGPA();
    }

}
