package javaders.day13loops;

public class Loops01Tekrar {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tam sayilari konsola yazdiriniz

        for (int i=21; i<181  ;  i++){
            if (i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // Size verilen kucuk harfle yazilmis String in index i cift sayi olan charakter lerini
        // buyuk harfe donusturunuz
        //miami==> MiAmI

        String s="miami";
        for (int i = 0;  i<s.length(); i++){
            String a = s.substring(i,i+1);
            if (i%2==0){
                System.out.print(a.toUpperCase());
            }else{
                System.out.print(a);
            }
        }

        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J

        String t="Hello Java";
        for (int i=0; i<t.length(); i++){
            char b=t.charAt(i);
            if (b=='a'){
                break;
            }else{
                System.out.print(b);
            }

        }
        System.out.println();
        //Verilen bir String'de son'a' dan sonraki tum karakterleri ters sirada yazdiriniz
        // "Tokatci"   //ict

        String c = "Tokatci";
        for (int i=c.length()-1; i>-1; i--){
            char ch=c.charAt(i);
            if (ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }












    }
}
