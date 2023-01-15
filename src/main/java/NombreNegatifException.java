public class NombreNegatifException extends  Exception{

    private  int val;

    public NombreNegatifException(int val) {
        super("Erreur: valeur négative: " + val);
        this.val = val;
    }

    public int getValeur() {
        return val;
    }
}
