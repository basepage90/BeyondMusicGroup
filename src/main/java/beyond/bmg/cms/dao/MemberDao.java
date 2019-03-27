package beyond.bmg.cms.dao;

import beyond.bmg.cms.domain.Member;

public interface MemberDao {
    int insert(Member member);
    int delete(int no);
}
