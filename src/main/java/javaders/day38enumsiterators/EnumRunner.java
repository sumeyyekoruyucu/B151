package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {
       String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);//Springfield

       String abbreviationOfFlorida =UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);//FL

        System.out.println(UsStatesEnum.ALASKA);//ALASKA

        UsStatesEnum state =UsStatesEnum.ALASKA;//Data tipine String dedik hata verdi.. data tipi enum in kendisi olacak
        System.out.println(state);//ALASKA
        //enumdaki datayi get method olmadan kullanirsaniz data tipine enum ismini verin.

       String stateName= UsStatesEnum.getStateNameByUsingAbbreviation("AK");
       System.out.println(stateName);//Alaska

        String abbreviationOfAlaska=UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);//AK





    }
}
