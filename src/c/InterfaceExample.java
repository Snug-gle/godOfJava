package c;

import c.service.MemberManager;
import c.service.MemberManagerImpl;

public class InterfaceExample {
    public static void main(String[] args) {
        MemberManager member = new MemberManagerImpl();
    }
}
