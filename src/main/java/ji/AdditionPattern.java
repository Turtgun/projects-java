package ji;

public class AdditionPattern {
    private int cn;
    private int an;
    private int sn;

    public AdditionPattern(int sn, int an) {
        this.cn = sn;
        this.sn = sn;
        this.an = an;
    }

    public int currentNumber() {
        return cn;
    }

    public void next() {
        cn += an;
    }
    public void prev() {
        if (cn==sn) {return;}
        cn -= an;
    }
}
