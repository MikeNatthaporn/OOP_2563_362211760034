package Lab2;

public class BasicDataType {

    public static void main(String[] args) {

        //boolean
        boolean myboo =true;
        System.out.println(myboo);
        myboo =false;
        System.out.println(myboo);

        //character => 1character such as 'a','x','$'
        char c ='a';
        System.out.println(c);

        //integer => -2 -1 0 1 2 3 ...1000
        int number;
        number =100;
        System.out.println(number);//100
        System.out.println(number*5);//500
        //number =?100

        //real number => float, double => 10.11,-22.1
        float a =10.10f;
        double b =20.20;
        System.out.println(a+b);

        //String => message => "...."=>"hello"
        //String คือข้อมูลชนิดข้อความ ที่มีตัวอักษรต่อเรียงกัน

        String msg ="Hello RUTS Saiyai 2020";
        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        System.out.println(msg.length());

        //constant variable

        final int num =100;



    }//main


}//class
