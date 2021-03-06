package week11;

public class StudentData{
    public static void main(String[] args) {

        //Student object include name,age,gpa
        
        Student std01 = new Student("Mark",18,4.00);
        
        Student std02 = new Student("Jane",18,2.20);
        
        Student std03 = new Student("Peter",19,4.00);
        
        Student std04 = new Student("Mark",22,1.75);
        
        //Write the equal statement to test the objects below
        //name
        System.out.println("This name std01 and std02 is "+std01.equals(std02));
        System.out.println("This name std01 and std03 is "+std01.equals(std03));
        System.out.println("This name std02 and std04 is "+std02.equals(std04));
        System.out.println("This name std01 and std04 is "+std01.equals(std04));
        System.out.println("------------------------------------------------------------------");
        //age
        System.out.println("This age std01 and std02 is "+std01.equals(std02));
        System.out.println("This age std03 and std04 is "+std03.equals(std04));
        System.out.println("This age std01 and std03 is "+std01.equals(std03));
        System.out.println("------------------------------------------------------------------");
        //gpa
        System.out.println("This GPA std01 and std03 is "+std01.equals(std03));
        System.out.println("This GPA std02 and std04 is "+std02.equals(std04));
        System.out.println("This GPA std02 and std03 is "+std02.equals(std03));
        System.out.println("------------------------------------------------------------------");
    }
}