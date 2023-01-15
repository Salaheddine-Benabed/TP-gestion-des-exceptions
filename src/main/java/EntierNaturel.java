public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException{
        if(val < 0){
            throw new NombreNegatifException(val);
        }else{
            this.val = val;
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val < 0){
            throw new NombreNegatifException(val);
        }else{
            this.val = val;
        }
    }

    public void decrement() throws NombreNegatifException {
        if(val == 0) {
            throw new NombreNegatifException(-1);
        }
        val--;
    }


}
