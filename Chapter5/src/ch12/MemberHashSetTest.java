package ch12;

import ch10.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberKang);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberLee);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
