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
    }
}
