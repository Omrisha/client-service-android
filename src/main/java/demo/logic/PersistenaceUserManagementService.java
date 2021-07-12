package demo.logic;

import demo.data.UserEntity;
import demo.data.UserServiceDao;
import demo.layout.UserBoundary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersistenaceUserManagementService implements UserManagmentService {
    private UserServiceDao dao;

    @Autowired
    public PersistenaceUserManagementService(UserServiceDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public UserBoundary store(UserBoundary user) {
        UserEntity entity = new UserEntity(user);

        UserEntity existed = dao.findByEmail(entity.getEmail());

        if (existed != null){
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        UserEntity saved = dao.save(entity);

        return saved.toBoundary();
    }

    @Override
    public List<UserBoundary> search(int size, int page, String sortOrder) {
        Sort.Direction direction = sortOrder.equals("ASC") ? Sort.Direction.ASC : Sort.Direction.DESC;
        return dao.
                findAll(PageRequest.of(page, size, direction, "id"))
                .stream()
                .map(UserEntity::toBoundary)
                .collect(Collectors.toList());

    }

    @Override
    public void delete() {
        this.dao.deleteAll();
    }
}
