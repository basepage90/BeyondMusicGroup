package beyond.bmg.cms.dao;

import java.util.List;
import java.util.Map;

import beyond.bmg.cms.domain.Manager;

public interface ManagerDao {
    int insert(Manager manager);
    List<Manager> findAll(Map<String,Object> params);
    Manager findByEmail(String email);
    Manager findByNo(int no);
    int delete(int no);
    Manager findByEmailPassword(Map<String,Object> params);
}
