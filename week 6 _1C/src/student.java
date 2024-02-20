public class student
{
    String F_name;
    String L_name;
    int birth_year;
    String ID ;
    String major;

    public student()
    {
        this.F_name = "noll";
        this.L_name = "noll";
        this.birth_year = 0;
        this.ID = "null";
        this.major ="null";


    }

    public student(String f_name, String l_name, int birth_year, String ID, String major)
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
