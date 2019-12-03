package Proxy;

public class UserProxy implements UserService{
    private UserServiceImpl userService;

    public UserProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void insert() {
         log("insert");
         userService.insert();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    public void log(String str){
        System.out.println("正在使用UserImpl的"+str);
    }
}
