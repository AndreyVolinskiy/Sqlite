package service.impl;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.User;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Andrey Volinskiy on 21.02.2018.
 */
public class UserServiceImpl implements UserService {

    private static final String URL = "jdbc:sqlite:src/main/resources/miracle.sqlite";
    private Dao<User, Integer> dao;
    {
        try {
            ConnectionSource source = new JdbcConnectionSource(URL);
            dao = DaoManager.createDao(source, User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int create(User user) throws SQLException {
        return dao.create(user);
    }

    public int createMany(List<User> users) throws SQLException {
        return dao.create(users);
    }

    public List<User> findAll() throws SQLException {
        return dao.queryForAll();
    }

    public int update(User user) throws SQLException {
        return dao.update(user);
    }

    public int delete(User user) throws SQLException {
        return dao.delete(user);
    }

    public int deleteById(int id) throws SQLException {
        return dao.deleteById(id);
    }

    public User findOne(int id) throws SQLException {
        return dao.queryForId(id);
    }

    public List<User> findIgors() throws SQLException {
        return dao.queryBuilder()
                .where()
                .eq("name","Igor")
                .query();
    }

    public List<User> findLike(String field, String value) throws SQLException {
       return dao.queryBuilder()
                .where()
                .like(field,"%" + value + "%")
                .query();
    }

    public List<User> exapple() throws SQLException {
        return dao.queryBuilder()
                .limit(12L)
                .where()
                .eq("","")
                .and()
                .eq("","")
                .and()
                .between("age",10,30)
                .and()
                .isNotNull("name")
                .query();
    }

    public List<User> find(long count,long offSet) throws SQLException {
        return dao.queryBuilder()
                .limit(count)
                .offset(offSet)
                .query();
    }
}
