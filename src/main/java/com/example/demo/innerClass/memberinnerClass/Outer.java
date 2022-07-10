package com.example.demo.innerClass.memberinnerClass;

/**
 * 成员内部类
 *
 * @author chenyaguo
 * @date 2022/2/24 9:59
 */
public class Outer {

    private String outerName = "outer";

    private Inner inner = new Inner();

    public class Inner {
        private String innerName = "inner";

        public void show() {
            System.out.println(outerName);
        }
    }

    public void show() {
        System.out.println(inner.innerName);
        inner.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner inner = outer.new Inner();
        inner.show();

    }

}
