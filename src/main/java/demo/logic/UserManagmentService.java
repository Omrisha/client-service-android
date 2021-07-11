package demo.logic;

import demo.layout.UserBoundary;

import java.util.List;

public interface UserManagmentService {
    UserBoundary store(UserBoundary user);

    List<UserBoundary> search(int size, int page, String sortOrder);

    void delete();
}
