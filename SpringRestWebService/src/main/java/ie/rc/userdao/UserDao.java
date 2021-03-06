package ie.rc.userdao;

import java.util.List;

public interface UserDao {

	List<User> getUsers();
	User getUser(int id) throws UserDaoException;
	User addUser(User userToAdd);
	User updateUser(User userToUpdate) throws UserDaoException;
	void deleteUser(int id) throws UserDaoException;
	void close();
}
