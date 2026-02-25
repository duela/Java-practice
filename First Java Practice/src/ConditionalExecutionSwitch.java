public class ConditionalExecutionSwitch {
    public static void main(String[] args){
        String grade = "Di";
        double gradePoint = 0.0;
        String standard = "";
        switch (grade){
            case "A+":
            case "A-":
                standard = "Excellent";
                gradePoint = 4.0;
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "A":
                standard = "Excellent";
                gradePoint = 3.7;
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "B+":
                gradePoint = 3.3;
                case "B-":
                    gradePoint = 3.0;
                    case "B":
                        gradePoint = 2.7;
                standard = "Good";
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "C+":
                gradePoint = 2.3;
                case"C-":
                    gradePoint = 2.0;
                    case"C":
                        gradePoint = 1.7;
                standard = "Satisfactory";
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "D+":
                gradePoint = 1.3;
                case "D":
                    gradePoint = 1.0;
                standard = "Pass";
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "F":
                gradePoint = 0.0;
                standard = "Fail";
                System.out.println(standard + " grade point of: " + gradePoint);
                break;
            case "P":
                standard = "Ungraded pass";
                System.out.println(standard + " grade point of: " + gradePoint + ", not included in GPA calculation");
                break;
            case "Di":
                standard = "Distinction";
                System.out.println(standard + " grade point of: " + gradePoint + ", not included in GPA calculation");
                break;
            case null:
                System.out.println("Null value passed, contact IT helpdesk");
                break;
            default:
                System.out.println("Invalid grade value passed, please see your course adviser");
                break;
        }
    }
}
