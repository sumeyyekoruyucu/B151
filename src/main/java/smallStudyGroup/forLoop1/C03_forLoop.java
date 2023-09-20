package smallStudyGroup.forLoop1;

public class C03_forLoop {
    public static void main(String[] args) {
         /*
        soru 8) input olarak girilen bir stringi forLoop kullanarak ters cevirin.
         */
        String str="Ali Can";
        String strBos="";
        for (int i = str.length()-1; i >=0 ; i--) {
            strBos+=str.substring(i,i+1);
        }
        System.out.println(strBos);

    }
}
