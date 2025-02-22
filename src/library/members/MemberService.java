package CoreJavaPractices.src.library.members;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MemberService {
    private final Map <String, Member> members = new ConcurrentHashMap <> ();

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public Optional<Member> findMember(String id) {
        return Optional.ofNullable(members.get(id));
    }
}
