package beyond.bmg.cms.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beyond.bmg.cms.dao.ManagerDao;
import beyond.bmg.cms.domain.Member;
import beyond.bmg.cms.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired ManagerDao managerDao;
  

    @Override
    public Member getMember(
            String email, String password, String memberType) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
        
        if (memberType.equals("manager")) {
            return managerDao.findByEmailPassword(params);
            
        } else {
            return null;
        }
    }
    
}










