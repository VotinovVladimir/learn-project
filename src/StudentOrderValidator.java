import java.sql.SQLOutput;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();

    }

    static void checkAll(){
        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if(so==null){
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success){
                continue;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Finish 2");




    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is running" );
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;


    }

    static AnswerWedding checkWedding (StudentOrder so) {
        System.out.println("Wedding �������");
        return new AnswerWedding();

    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("�������� �����������");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){
        System.out.println("����� ����������");
    }
}
