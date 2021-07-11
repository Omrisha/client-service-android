package demo;

import demo.data.UserEntity;
import demo.layout.UserBoundary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import demo.errors.BadRequestExeption;
import demo.logic.UserManagmentService;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class UserManagmentController {

    private UserManagmentService userManagementService;

    @Autowired
    public UserManagmentController(UserManagmentService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @RequestMapping(path = "/users",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserBoundary store(@Valid @RequestBody UserBoundary user, BindingResult result)
    {
		return this.userManagementService.store(user);

    }

    @RequestMapping(path = "/users/search",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserBoundary> search(
            @RequestParam(name="size", required = false, defaultValue = "10") int size,
            @RequestParam(name="page", required = false, defaultValue = "0") int page,
            @RequestParam(name="sortOrder", required = false, defaultValue = "ASC") String sortOrder)
    {
        return this.userManagementService.search(size, page, sortOrder);
    }

    @RequestMapping(path = "/users",
            method = RequestMethod.DELETE)
    public void delete(){
        this.userManagementService.delete();
    }
}
