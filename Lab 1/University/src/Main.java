public class Main {

    public static void main(String[] args) {

        University Shire = new University();
        University Mordor = new University();
        University Erebor = new University();
        Shire.yearofFoundation = 1096;
        Mordor.yearofFoundation = 1973;
        Erebor.yearofFoundation = 1546;

        Mordor.Student = "John";
        Mordor.Student = "Oscar";
        Shire.Student = "Jim";
        Shire.Student = "Ronald";
        Erebor.Student = "Bruce";

        Student John = new Student(20);
        Student Oscar = new Student(21);
        Student Jim = new Student(22);
        Student Ronald = new Student(23);
        Student Bruce = new Student(24);
        Student Hunter = new Student(25);

        float[] markofStudent = {John.mark = 10, Oscar.mark = 9.2f , Jim.mark = 8.0f ,
                Ronald.mark = 9.1f , Bruce.mark = 10f, Hunter.mark = 8.2f};

        int sum = 0;
        for (float mark : markofStudent){
            sum += mark;
        }
        System.out.println(" The average mark of all universities is: " + sum/markofStudent.length);
    }

}
