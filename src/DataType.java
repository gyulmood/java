public class DataType {

    public static void main(String[] args) {

        // 1byte = 8bit
        // 정수의 데이터 타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
        // 실수의 데이터 타입 : float(4byte), double(8byte)
        // 문자의 데이터 타입 : char(2byte)

        // 변수가 어떤 타입인지에 따라 데이터가 사용하는 메모리 양이 결정된다.

        // 상수(constant)의 데이터 타입 : 정수-int, 실수-double

        byte byteDataType = 1;
        short shortDataType = 12345;
        int intDataType = 1274556;
        long longDataType = 65748723657L;

        System.out.println("byte 의 메모리 크기 : " + Byte.BYTES + "byte (" + Byte.SIZE + "bit)");
        System.out.println("short 의 메모리 크기 : " + Short.BYTES + "byte (" + Short.SIZE + "bit)");
        System.out.println("int 의 메모리 크기 : " + Integer.BYTES + "byte (" + Integer.SIZE + "bit)");
        System.out.println("long 의 메모리 크기 : " + Long.BYTES + "byte (" + Long.SIZE + "bit)");

        System.out.println("float 의 메모리 크기 : " + Float.BYTES + "byte (" + Float.SIZE + "bit)");
        System.out.println("long 의 메모리 크기 : " + Long.BYTES + "byte (" + Long.SIZE + "bit)");

        System.out.println("char 의 메모리 크기 : " + Character.BYTES + "byte (" + Character.SIZE + "bit)");

        int a = 4;
        float b = 2.27F;

        float c = a + b;
        double d = a + b;

        System.out.println("c = " + c); // 6.27
        System.out.println("d = " + d); // 6.269999980926514

        // a + b 는 implicit conversion으로 인하여 (float) a  + (float) b 로 계산된다.
        // d는 double 형이 되면서 더 큰 정밀도를 가져 6.27이 아닌 값을 가진다
        // (원인: 부동소숫점; 정해진 비트 수 안에 소수를 끼워넣어야 하는데 이 과정에서 오차가 생긴다.)
    }
}
