package com.learn.generic.home01;

public class TestWithJUnit {

    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,11,"john"));
        dao.save("003",new User(3,12,"tom"));
        dao.save("004",new User(4,13,"smith"));
        System.out.println(dao.list());
        dao.delete("001");
        System.out.println(dao.list());
    }
}
