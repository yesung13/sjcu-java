package project02;

public class StringBufferEx {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This");
        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my"); // 0부터 시작
        System.out.println(sb);

        sb.replace(8, 10, "your"); // 8~10번째 위치를 your로 대치하여 공간 확장이후 출력
        System.out.println(sb);

        sb.delete(8, 13);
        System.out.println(sb);

        sb.setLength(4);
        System.out.println(sb);
    }
}
