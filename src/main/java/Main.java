public class Main {
    public static void main(String[] args) throws NombreNegatifException {
        try{
            EntierNaturel entierNaturel = new EntierNaturel(1);
            //entierNaturel.setVal(-1);
            entierNaturel.decrement();
            System.out.println(entierNaturel.getVal());
            entierNaturel.decrement();
        }catch (NombreNegatifException e){
            System.out.println(e);
        }


    }
}
