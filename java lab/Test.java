class Test {
    static void checkAge(int age) throws Exception {
        if(age < 18)
            throw new Exception("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch(Exception e) {
            System.out.println(e);
        }

        // Unchecked exception
        int a = 10/0; // ArithmeticException
    }
}