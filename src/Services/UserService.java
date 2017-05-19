package Services;

import DataModel.User;
import Interfaces.ILogger;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public class UserService extends AbstractService {

    private UserService userSrv;

    public UserService(ILogger log) {
        super(log);
        userSrv = new UserService(log);
    }

    public User getUserByID(int id) {

        User user = new User();

        return  user;
    }
}
