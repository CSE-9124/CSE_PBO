package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

class E_Control_Flow {
    public static void main(String[] args) {
    
        System.out.println("1. IF ELSE");
            int score = 80;
            char grade;

            if (score >= 80) {
                grade = 'A';
            } else if (score >= 75) {
                grade = 'B';
            } else if (score >= 65) {
                grade = 'C';
            } else {
                grade = 'E';
            }

            System.out.println("Your grade is " + grade);

        System.out.println("2. SWITCH CASE");
            int month = 9;
            
            switch (month) {
                case 12:
                    System.out.println("December");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                default:
                    break;
            }

        System.out.println("3. TERNARY OPERATOR");
            int skor = 85;
            char nilai = skor >= 80 ? 'A' : 'B';
            System.out.println("Nilai kamu adalah " + nilai);
            
        System.out.println("4. TRY CATCH");
            try {
                @SuppressWarnings("unused")
                int result = 10/0;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                System.out.println("End");
            }
    }
}
