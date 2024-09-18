    import models.Student;
    import models.Attributes;
    import models.Stream;
    import models.Invoice;

    public class Main {
        public static void main(String[] args) {

            Student student = new Student("John Doe", 10, 12345, 16, 'M');
            Attributes attributes = new Attributes(95.0, 12, true);
            Stream stream = new Stream("Physics", "Economics", "Business");
            Invoice invoice = new Invoice(1000, 20, 50);

            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("ID: " + student.getiD());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: " + student.getGender());

            System.out.println("Attendance: " + attributes.getStdAttendance() + "%");
            System.out.println("Assignments Submitted: " + attributes.getStdAssignments());
            System.out.println("Achievements: " + (attributes.isAchievements() ? "Yes" : "No"));

            System.out.println("Science: " + stream.getScience());
            System.out.println("Commerce: " + stream.getCommerce());
            System.out.println("Management: " + stream.getManagement());

            double finalFee = invoice.getMonthlyFee() - (invoice.getMonthlyFee() * invoice.getScholarship() / 100) + invoice.getTransportation();
            System.out.println("Monthly Fee: " + invoice.getMonthlyFee());
            System.out.println("Scholarship: " + invoice.getScholarship() + "%");
            System.out.println("Transportation Fee: " + invoice.getTransportation());
            System.out.println("Final Fee (after scholarship and transportation): " + finalFee);
        }
    }
