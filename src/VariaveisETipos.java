
//class to review primitive variables and data types

public class VariaveisETipos {

    public static void main(String[] args) {
        // primitive types


        int age = 20;
        //integer type (32 bits)

        double salary = 1611.11;
        //double precision floating-point (64 bits)

        float height = 1.68F;
        //single precision floating-point (32 bits)

        char gender = 'M';
        //character type (16 bits)

        boolean isAdult = age >= 18;
        //boolean type (true or false)


        //byte and short types
        byte level = 10;// -128  to 127
        short population = 32000;//-32,768 to 32,768;

        //long type (64 bits)
        long distance = 15000000000000L;

        //non primitive types
        String text = "Hello!";

        //outputs
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is adult? " + isAdult);
        System.out.println("Level: " + level);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance + " km");
    }

}
