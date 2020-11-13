package Pr3;
import Pr3.Op.*;
import Pr3.Al.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(
                new plus(
                        new min(
                                new umn(
                                        new Var("x"),
                                        new Var("x")
                                ),
                                new umn(
                                        new Const(2),
                                        new Var("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x, x, x));
    }
}