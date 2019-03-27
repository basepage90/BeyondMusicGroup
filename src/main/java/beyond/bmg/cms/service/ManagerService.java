package beyond.bmg.cms.service;

import java.util.List;

import beyond.bmg.cms.domain.Manager;

public interface ManagerService {
    void add(Manager manager);
    List<Manager> list(int pageNo, int pageSize);
    Manager get(int no);
    void delete(int no);
}
