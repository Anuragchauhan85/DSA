public class chardatatype {

    public static void main(String[] args) {
        char adi='a';
        System.out.println(adi);                 //ascii value a=97 b=98 ...z=122,  A=65 B=66...z=90,   0=48 1=49 ... 9=57
        char eva='$';
        System.out.println(eva);
        char abhi='#';
        System.out.println(abhi);
        char ravi ='3';
        System.out.println(ravi);

//typecasting form one datatype to another datatype
        char a='A';
        int b= a;                     //implecit typecasting
        System.out.println(b);

        char ch='#';
        int INT = (int)ch;           //explecit typecasting
        System.out.println(INT);



        char c= 'c';
        System.out.println(c+0);    //it is also a way of typecasting
        System.out.println(c+c);
        System.out.println(c*c);
        System.out.println(c/c);
        System.out.println(c%c);


        int n=65;
        char x=(char)n;
        System.out.println(x);

        char v=' ';               //space have ascii value is 32
        int m=v;
        System.out.println(m);
    } 
}