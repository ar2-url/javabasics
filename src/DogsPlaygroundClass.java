public class DogsPlaygroundClass {

    public static void main(String[] args) {
        Dog2 szarik = new Dog2("Szary", 234, "Jan", "kundel", "boolean");

        szarik.setOwnerName("Janek");
        szarik.setName("Szarik");
        //szarik.getOwnerName("Lucek");
        //szarik.getIdentity(4567);
        szarik.feed();
        szarik.scratch();

        Dog2 cywil = new Dog2("cywil", 999, "Porucznik", "owczarek", "no");
        cywil.setOwnerName("Marian");
        cywil.feed();
        cywil.scratch();
        cywil.setIdentity(2222);


        System.out.println(szarik);    //?????????????
        System.out.println(cywil);
    }


}
