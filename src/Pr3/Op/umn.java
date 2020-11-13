package Pr3.Op;
import Pr3.Fun.TE;
public class umn extends Oper{
    public umn(TE left, TE right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }

    protected double evaluate(double left, double right) {
        return left * right;
    }
}
