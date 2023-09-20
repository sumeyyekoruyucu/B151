package mentor;

public class IfSwitchTernaryPracticeCevaplari {

    /*
     Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
     Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
          System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
          //kullanıcıya seçim içn işlem menusu yazdırdık
          int islem = scan.nextInt();//kullanıcının islem tercihi için veriable create edildi
          System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.
          double num1 = scan.nextDouble();//1 sayı assign edildi
          double num2 = scan.nextDouble();//2 sayı assign edildi
          if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
          }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
          } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
          } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
          } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");


     Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	         Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		          a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
	 Cevap:
	        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (a == b && a == c) {
                System.out.println("ucgen ve eskenar ucgendir");
            } else {
                System.out.println("ucgen fakat eskenar degil");
            }
        } else {
            System.out.println("ucgen degildir.");
        }


     Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	        INFO : BMI = kilo(kg) /(boy*boy)(m)
		           BMI <=20 oldukca zayifsiniz
		           20<BMI<=25 Normal sinirlardasiniz
		           25<BMI<=30 Sisman kategorisindesiniz
		           30<BMI ==> Obez grubundasiniz.
	Cevap:
	       Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu  kg giriniz : ");
        double kilo=scan.nextDouble()/100;

        double bmi=kilo/((boy)*(boy));
        if (bmi<=20){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
        } else if (bmi>20 & bmi<=25){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");
        } else if (bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");
        } else if (bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }


	Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
	Cevap:
          Scanner input = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String jobTitle = input.next();

        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if (jobTitle.equalsIgnoreCase("qa")) {
            System.out.println("Mesleginiz: " + qa);

        } else if (jobTitle.toLowerCase().equals("dev")) {
            System.out.println("Mesleginiz: " + dev);
        } else if (jobTitle.toLowerCase().equals("ba")) {
            System.out.println("Mesleginiz: " + ba);
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Mesleginiz: " + pm);
        } else {
            System.out.println("Hatali secim yaptiniz");
        }


    Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
	Cevap:
	      Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.print("yasınızı giriniz : ");
        int yas = scan.nextInt();

        System.out.print("kilonuzu  giriniz : ");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {//kilo sartı ve kontrolu yapıldı
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kilo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı


	Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
	Cevap:
	      Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.println("X ve Y degerleriniz giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");


	Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
	Cevap:
	      Scanner sc = new Scanner(System.in);
         System.out.println("Lutfen bir karakter giriniz");
         char ch = sc.next().charAt(0);
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Hatali giris yaptiniz.");
        }


	Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz
    Cevap:
          Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int quantity = scan.nextInt();

        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        double price = scan.nextDouble();
        double totalPrice;

        System.out
                .println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char card = scan.next().toLowerCase().charAt(0);

        if (card == 'y') {
            if (quantity > 10) {
                price *= 0.8; // price = price*0.8
                totalPrice = price * quantity;
                System.out
                        .println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            } else {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out
                        .println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            }
        } else if (card == 'n') {
            if (quantity > 10) {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);

            } else {
                price = price - price * 10 / 100;
                totalPrice = price * quantity;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
            }
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
        }


    Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
    Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.print("ehliyetiniz var ise -> 1 yok ise -> 0 yazınız : ");
        int ehliyetiniz = scan.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {//ehlivetin varlık yokluk sartına göre diger kosullar çalışacak
            if (ehliyetiniz == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200$ kitledim size");
            }
            System.out.print("hızınızı giriniz : ");
            int hızınız = scan.nextInt();

            if (ehliyetiniz == 1) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 100 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 150 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 320 $'dır.");
                } else if (hızınız > 94) {
                    System.out.println(" Ceza 500 $'dır.");
                } else System.out.println("hız sınırnda seyahat ediyorsunuz hayırlı yolculuklar");

            } else if (ehliyetiniz == 0) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 300 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 350 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 520 $'dır.");
                } else if (hızınız > 94) {
                    System.out.println(" Ceza 700 $'dır.");
                } else System.out.println("hız sınırında seyahat ediyorsunuz ancak ehliyetsiz olg için cezanız 200$");

            } else System.out.println("agam nişedin ehliyet vaa mı yoooh mu?");
        } else
            System.out.println("agam bizimle eglenir ehliyet vva mı yooh mu :)");//ehliyet verisinin hatalı olmasi kontrolu


    Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int onlarBasamagi = (sayi / 10) % 10, birlerBasamagi = (sayi % 10), yuzlerBasamagi = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("ikiyuz");
                    break;
                case 3:
                    System.out.println("ucyuz");
                    break;
                case 4:
                    System.out.println("dortyuz");
                    break;
                case 5:
                    System.out.println("besyuz");
                    break;
                case 6:
                    System.out.println("altiyuz");
                    break;
                case 7:
                    System.out.println("yediyuz");
                    break;
                case 8:
                    System.out.println("sekizyuz");
                    break;
                case 9:
                    System.out.println("dokuzyuz");
                    break;
            }
            switch (onlarBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kirk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmis");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }
            switch (birlerBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }


    Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)
    Cevap:
           Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        if (kacıncıGun <= 0 || kacıncıGun > 7) {
            System.out.println("hatalı veri girdiniz");
        } else {

            System.out.print("kac gun sonrasını öğrenmek istiyorsunuz : ");
            int kacGunSonrasi = scan.nextInt();
            int bulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam niddin!!!  hafta 7 gun :-( ");
            }
        }


    Soru-12:Bankamatik Sorusu-->Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
    Cevap:
         Scanner scan = new Scanner(System.in);
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4\nyapacagınız işlemi seciniz : ");
        int islem = scan.nextInt();
        int bakıye=1000;
        switch (islem) {
            case 1:
                System.out.println("mevcut bakıyeniz : "+bakıye);
                break;
            case 2:
                System.out.print("cekecegınız miktarı giriniz : ");
                int cekilenMiktar = scan.nextInt();
                if(cekilenMiktar>bakıye){
                    System.out.println("agam niddin olmayan parayı mi cekicen  :-) ");
                }else {
                    bakıye-=cekilenMiktar;
                    System.out.println("bakıyenizin güncel hali : "+bakıye);
                }
                break;
            case 3:
                System.out.print("yatıracagınız miktarı giriniz : ");
                int yatırılanMiktar = scan.nextInt();
                bakıye+=yatırılanMiktar;
                System.out.println("bakıyenizin güncel hali : "+bakıye);
                break;
            case 4:
                System.out.println("cıkısınız yapılmıstır yine bekleriz :-)");
                break;
        }


    Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
            A. Köln veya Frankfurta gidebilirsiniz.
            B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
              İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
              İşlemlerde direkt bunları cağırabilirsiniz.
              todo İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
       1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
              todo Frankfurt girildiyse,
                 örn: girdi= Frankfurt
                 case=FRANKFURT:
                 Rota = Frankfurt yazdırın.
                 Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
              todo case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
       2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
             case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
             case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
              todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        a.Bakiyemi belirtin.
        b.Toplam Tutarı belirtin.
        c.double paraUstu oluşturun ve hesaplayın.
        d.Double para üstünü yazdırın.
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
        double bakıye = 100;
        double frUcret = (60 / 20) * 5;
        double klUcret = (80 / 20) * 5;

        switch (hedef) {
            default:
                System.out.println("hatalı giriş yaptınız :-( ");
                break;
            case "FRANKFURT":
                System.out.println("ROTA : Frankfurt");
                System.out.println("Frankfurt " + frUcret + " EURO");
                System.out.print("kac kisi seyahat edeceksiniz :");
                int kisi = scan.nextInt();
                switch (kisi) {
                    case 1:
                        System.out.println("1 kişilik bilet talep ettiniz " + "bilet tutarınız : "
                                + frUcret + " EURO" + " güncel bakıyeniz: " + (bakıye -= frUcret)+" EURO");
                        break;
                    case 2:
                        System.out.println("2 kişilik bilet talep ettiniz " +
                                "bilet tutarınız : " + (frUcret * 2) + " EURO" + " güncel bakıyeniz: " + (bakıye -= frUcret * 2)+" EURO");
                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");
                        break;
                }
                break;
            case "KOLN":
                System.out.println("ROTA : Koln");
                System.out.println("Koln " + klUcret + " EURO");
                System.out.print("kac kisi seyahat edeceksiniz :");
                int kisi1 = scan.nextInt();
                switch (kisi1) {
                    case 1:
                        System.out.println("1 kişilik bilet talep ettiniz " + "bilet tutarınız : "
                                + klUcret + " EURO" + " güncel bakıyeniz: " + (bakıye -= klUcret)+" EURO");

                        break;
                    case 2:
                        System.out.println("2 kişilik bilet talep ettiniz " +
                                "bilet tutarınız : " + (klUcret * 2) + " EURO " + "güncel bakıyeniz: " + (bakıye -= klUcret * 2)+" EURO");

                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");
                        break;
                }
                break;
        }


    Soru-14:Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
            (İpucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)
            Örnek Ekran Çıktısı
            birinci kenarı giriniz: 2
            ikinci kenarı giriniz 15
            üçüncü kenarı giriniz: 7
            Bu bir dik üçgen değildir/Bu bir dik üçgendir
    Cevap:
           Scanner scanner = new Scanner(System.in);
           int a;
           int b;
           int c;
        System.out.print("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = scanner.nextInt();
        if ((a * a) + (b * b) == c * c) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((a * a) + (c * c) == b * b) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((b * b) + (c * c) == a * a) {
            System.out.println("Bu bir dik üçgendir.");
        } else {
            System.out.println("Bu üçgen bir dik üçgen değildir.");
        }


    Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
            ax^2 + bx + c;
            Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
            Delta = bb - 4ac
            Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
            Delta = 0 => 1 tane kök vardır x = -b/2a
            Delta < 0 ise kök yoktur.
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsayılarını giriniz : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Girdiğiniz denklemin iki tane kökü vardır\nX1= " + x1 + " X2= " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Girdiğiniz denklemin 1 tane kökü vardır\nx= " + x);
        } else {
            System.out.println("Girdiğiniz denklemin kökü yoktur");
        }
    Soru-16:Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
    Cevap:
           Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        int year = scan.nextInt();
        System.out.println("   ***   if cözumu   ***   ");
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL");
        } else {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL değildir.");
        }

        //  ternary cozumu ...
        System.out.println("   ***   ternary cözumu   ***   ");

        String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
                : year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
        System.out.println(result);


    Soru-17:Kullanicidan bir sayi aliniz
            Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
            Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();

        System.out.println("*****  TERNARY çözümü  *****");
        String result = (num >= 0) ? (num < 10 ? "rakam" : "pozitif sayı") : ("negatif sayı");
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");
        if (num >= 0) {
            if (num < 10) {
                System.out.println("rakam");

            } else System.out.println("pozitif sayı");

        } else System.out.println("negatif sayı");


    Soru-18:Kullanicidan bir character girmesini isteyiniz
            Character harf ise kucuk harf olup olmadigini kontrol ediniz
            Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
            Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
            Harf degilse ekrana "Harf degil" yazdiriniz
            97:a  122:z ascii değeri
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.print("Bir character giriniz : ");
        char ch = scan.next().charAt(0);

        System.out.println("*****  TERNARY çözümü  *****");
        String result = ((ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z')) ?
                ((ch <= 122 && ch >= 97) ? "Kucuk Harf" : "Buyuk Harf") : "Harf Degil";
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");
        if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A')) {
            if (ch <= 122 && ch >= 97) {
                System.out.println("küçük harf");
            } else System.out.println("Büyük harf");
        } else System.out.println("Harf değil");


    Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
            3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
            Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("*****  TERNARY çözümü  *****");
        String sonuc = (sayi > 99 && sayi < 1000) ? ("3 basamaklı sayi") : (sayi % 2 == 0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ");
        System.out.println(sonuc);
        System.out.println("*****  if  çözümü  *****");
        if (sayi < 1000 && sayi > 99) {
            System.out.println("3 basamaklı");
        } else if (sayi % 2 == 0) {
            System.out.println("3 basamaklı olmayan çift sayı");
        } else System.out.println("3 basamaklı olmayan tek sayı");
          //ActionDataType veriable=(şart) ? trueAction:falseAction;


    Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		    -> 0(dahil) ile 50 arasi - D
		    -> 50(dahil) ile 60 arası - C
		    -> 60(dahil) ile 80 arası - B
		    -> 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		*** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		             switch() de int, byte, short, char, String kullanilir.
    Cevap:
          Scanner scan = new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();
        String   note="";
        System.out.println("   1. yol   ");
        if(not>=0 && not<50) {
            //not = 0;
            note="kaldın";
        }else if(not>=50 && not<60){
            //not = 50;
            note="ucuz yırttın";
        }else if(not>=60 && not<80){
            //	not = 60;
            note="başarılı";
        }else if(not>=80 && not<=100){
            //not = 80;
            note="gayet başarılı";
        }

        switch(note) {
            case "kaldın":
                System.out.println("D");
                break;
            case "ucuz yırttın":
                System.out.println("C");
                break;
            case "başarılı":
                System.out.println("B");
                break;
            case "gayet başarılı":
                System.out.println("A");
                break;
            default:
                System.out.println("Gecerli not giriniz");
                break;
        }
        System.out.println("   2. yol   ");
        if(not>=0 && not<50) {
            not = 0;
        }else if(not>=50 && not<60){
            not = 50;
        }else if(not>=60 && not<80){
            not = 60;
        }else if(not>=80 && not<=100){
            not = 80;
        }
        switch(not) {
            case 0:
                System.out.println("D");
                break;
            case 50:
                System.out.println("C");
                break;
            case 60:
                System.out.println("B");
                break;
            case 80:
                System.out.println("A");
                break;
            default:
                System.out.println("Gecerli not giriniz");
                break;
        }
     */

}
