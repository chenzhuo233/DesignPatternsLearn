package Proxy;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void insert() {
        System.out.println("插入用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
