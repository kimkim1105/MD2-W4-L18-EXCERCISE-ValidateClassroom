public class ValidateClassroomTest {
    private static ValidateClassroom validateClassroom;
    public static final String[] validClassroom = new String[]{"C0318G"};
    public static final String[] invalidClassroom = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        validateClassroom =new ValidateClassroom();
        for (String str:
             validClassroom) {
            boolean isvalid =validateClassroom.validate(str);
            System.out.println("Classroom "+str+" is valid: "+isvalid);
        }
        for (String str:
                invalidClassroom) {
            boolean isvalid =validateClassroom.validate(str);
            System.out.println("Classroom "+str+" is valid: "+isvalid);
        }
    }
}
