package main;

import model.User;
import service.impl.UserServiceImpl;

import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Andrey Volinskiy on 21.02.2018.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User("Peter",22);
        List<User> ts = Arrays.asList(new User("Peter", 22), new User("Peter James", 26), new User("Bob", 23), new User("Smith", 24));
        userService.createMany(ts);
        // /start
        // hello
        // hello how are u??


        // bot id name
        // bot_answer id answer bot_id

        // id message sender_id recipient_id

        // відповіді бота
        // юзери
        // боти
        // історія переписки щоб можна було робити пошук по ній order by id desc
        // crud user
        // find by id name update by and group by

//        List<User> igors = userService.findIgors();
//        igors.forEach(System.out::println);
//
//        List<User> like = userService.findLike("name", "I");
//        like.forEach(System.out::println);

        // userService.deleteById(4);

//        List<User> users = userService.findAll();
//
//        users.forEach(s -> {
//            s.setAge(19);
//            try {
//                userService.update(s);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        });
//
//        users.forEach(System.out::println);
//        users.forEach(s -> System.out.println(s.getName()));
//        users.forEach(s -> {
//            System.out.println("Start");
//            System.out.println(s.getName());
//        });
    }
}
