package Pr3.Op;
import Pr3.Fun.Exp;
import Pr3.Fun.TE;
public abstract class Oper implements Exp {
    private final TE left;
    private final TE right;

    public Oper(TE left, TE right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int evaluate(int left, int right);

    public int evaluate(int x, int y, int z) {
        return evaluate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}
