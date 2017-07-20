public class TestProgramApp {
    public static void main(String[] args) {

        ProgramConfiguration test = ProgramConfiguration.getInstance();



        ProgramConfiguration test2 = ProgramConfiguration.getInstance();

        System.out.println(test);
        System.out.println(test2);
    }
}
