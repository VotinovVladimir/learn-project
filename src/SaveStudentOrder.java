public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "�������";
        so.hLastName = "������";
        so.wFirstName = "������";
        so.wLastName = "�������";

        StudentOrder so1;
        so1 = new StudentOrder();
        so1.hFirstName = "�������";
        so1.hLastName = "�������";
        so1.wFirstName = "������";
        so1.wLastName ="��������";


        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer =199;
        System.out.println("saveStudentOrder");
        return answer;
    }
}
