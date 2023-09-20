package practices.day_08_practicesArray;

public class C03_Array {

    public static void main(String[] args) {

        /*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.


      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

     */

        int arr1[][] = {{1, 2}, {3, 4, 5}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int sinir = 0;
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) { //distaki arraylerin kisa olaninin uzunlugu kadar donguye aldik

            if (arr1[i].length < arr2[i].length) {
                sinir = arr1[i].length;
            } else {
                sinir = arr2[i].length;
            }
            for (int j = 0; j < sinir; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + "," + j + " indexindeki elemanlarin toplami " + toplam);
            }
        }

    }


        /*
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {
                // Her bir iç array'in aynı index'e sahip elemanlarını toplarız.
                int sum = arr1[i][j] + arr2[i][j];
                // Sonucu yazdırırız.
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        2. cozum

        int minLength = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < minLength; i++) {
          int innerMaxLength = Math.min(arr1[i].length, arr2[i].length);
     int sum = 0;
     for (int j = 0; j < innerMaxLength; j++) {
        sum += arr1[i][j] + arr2[i][j];
     }
     System.out.println("Index " + i + " toplam: " + sum);
      }
         */





}
