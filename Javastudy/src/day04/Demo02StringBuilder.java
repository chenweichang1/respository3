package day04;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("stringBuilder1:"+stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println("stringBuilder2:"+stringBuilder2);

//        stringBuilder1.append("def").append("abc");链式编程
        stringBuilder1.append("def");
        stringBuilder1.append("abc");
        System.out.println("stringBuilder1:"+stringBuilder1);


        String str = "hello";
        System.out.println("str:"+str);
        StringBuilder stringBuilder = new StringBuilder(str); //String -> StringBuilder
        stringBuilder.append("world!!~!~");
        System.out.println("stringBuilder:"+stringBuilder);

        String toString = stringBuilder.toString();   //String <- StringBuilder
        System.out.println("toString:"+toString);

    }
}
