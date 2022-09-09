package ru.smak;

import ru.smak.math.Lagrange;
import ru.smak.math.Polynomial;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var x = new double[]{1, 2, 3, -5, 2, 0};
        var y = new double[]{9, -2, 3, 5, -2};
        Polynomial p1 = new Polynomial(x);
        Polynomial p2 = new Polynomial(y);
        Polynomial p3 = p1.plus(p2);
        System.out.println(p1.getPower());
        System.out.println(p2.getPower());
        System.out.println(p3.getPower());
        System.out.println(new Polynomial(new double[]{0}));
        System.out.println(new Polynomial(new double[]{1}));
        System.out.println(new Polynomial(new double[]{-1}));
        System.out.println(new Polynomial(new double[]{0, 1}));
        System.out.println(new Polynomial(new double[]{0, -1}));
        System.out.println(new Polynomial(new double[]{1, 1}));
        System.out.println(new Polynomial(new double[]{-1, 1}));
        System.out.println(new Polynomial(new double[]{0, 1, 2}));
        System.out.println(new Polynomial(new double[]{0, 2, -1}));
        System.out.println(new Polynomial(new double[]{0, -2, -1}));
        System.out.println(new Polynomial(new double[]{3, -2, 1}));
        System.out.println(new Polynomial(new double[]{-1, 0, 0, -1, 0, 0, 0, 2, 0, 0, 1, 0, 0, 2, 1}));
        Polynomial p4 =new Polynomial(new double[]{5,3,1});
        Polynomial p5 =new Polynomial(new double[]{5,0,-10,-1,2});
        System.out.println(p4.times(new Polynomial()));
        try
        {
            System.out.println(p4.div(0));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        var d = new HashMap<Double, Double>();
        d.put(-1., 1.);
        d.put(0., 0.);
        d.put(1., 1.);
        var L = new Lagrange(d);
        d.put(0., 9.);
        System.out.println(L);
    }
}
