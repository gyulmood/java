public class Method {

    public static String callMyName(String name) { // name : parameter (파라미터/매개변수)
        return "my name is " + name;
    }

    public static void main(String[] args) {

        String text = callMyName("gyul"); // gyul : argument (인자)
        System.out.println(text);
    }
}
