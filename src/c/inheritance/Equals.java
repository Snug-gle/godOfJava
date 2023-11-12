package c.inheritance;

import c.model.MemberDTO;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalsMethod2();
    }

    private void equalsMethod() {
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        }
        System.out.println("obj1 and obj2 is different");
    }

    private void equalsMethod2() {
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        }
        System.out.println("obj1 and obj2 is different");
    }
}