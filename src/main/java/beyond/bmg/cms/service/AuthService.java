package beyond.bmg.cms.service;

import beyond.bmg.cms.domain.Member;

public interface AuthService {
    Member getMember(String email, String password, String memberType);
}
