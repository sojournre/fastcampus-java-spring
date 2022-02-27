package ch13;

import ch10.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }
    
    public void addMember(Member member) {
        treeSet.add(member);
    }
    
    public boolean removeMember(int memberId) {
        Iterator<Member> iterator =treeSet.iterator();
        
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println("memberId = " + memberId + "가 존재하지 않습니다.");
        return false;
    }
    
    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }
}
