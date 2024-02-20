import java.awt.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //tamrin_1();
        //tamrin_2 is student class;
        //tamrin2=کلاس دانشجو را با تمام ملزمات آن ایجاد کنید

    }

    public static void tamrin_1()
    {

        Scanner S =new Scanner(System.in);

        int rad ;
        String color;

        circle[] circleArray =new circle[3];
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.println("add radius");
            rad = Integer.valueOf(S.nextLine());
            System.out.println("add color");
            color= S.nextLine();

            circleArray[i]=new circle(rad , color);

        }

        for ( circle temp:circleArray)
        {

          System.out.println(temp.toString());

        }




    }


}

class student_tamrin2
{
    String F_name;
    String L_name;
    int birth_year;
    String ID ;
    String major;

    public student_tamrin2()
    {
        this.F_name = "noll";
        this.L_name = "noll";
        this.birth_year = 0;
        this.ID = "null";
        this.major ="null";


    }

    public student_tamrin2(String f_name, String l_name, int birth_year, String ID, String major)
    {
        int now_year=1400;
        F_name = f_name;
        L_name = l_name;
        this.birth_year = (now_year)-(birth_year) ;
        this.ID = ID;
        this.major = major;
    }

    public String getF_name() {
        return F_name;
    }

    public void setF_name(String f_name) {
        F_name = f_name;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String l_name) {
        L_name = l_name;
    }

    public int getBirth_year()
    {
        return birth_year;
    }

    public void setBirth_year(int birth_year)
    {

        this.birth_year = birth_year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" +
                "First_name='" + F_name + '\'' +
                ", Last_name='" + L_name + '\'' +
                ", age =" + birth_year +
                ", ID='" + ID + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}


