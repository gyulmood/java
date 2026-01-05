public class Array {

    public static void main(String[] args) {

        String[] classMembers = {"민지", "철수", "영희"};
        for (String member : classMembers) {
            System.out.println(member);
        }
        System.out.println("classMembers.length=" + classMembers.length);

        String[] class2Members = new String[4];
        // length 는 배열 안의 원소의 갯수가 아닌, 배열이 담을 수 있는 최대 원소의 갯수
        System.out.println("class2Members.length=" + class2Members.length);

        class2Members[0] = "민철";
        class2Members[1] = "영수";
        System.out.println("class2Members.length=" + class2Members.length);
    }
}
