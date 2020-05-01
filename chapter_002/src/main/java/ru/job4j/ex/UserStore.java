package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @version 14.04.2020
 * @since 0.1
 */
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User us = null;
        for (int index = 0; index < users.length; index++) {
            User one = users[index];
            if (one.getUsername().equals(login)) {
               us = one;
               break;
            }
        }
        if (us == null) {
            throw new UserNotFoundException("Not found");
        }
        return us;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Not validate");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username is less than 3 characters.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Mikhail Pushkarev", true)
        };
        try {
            User user = findUser(users, "Mikhail Pushkarev");
           if (validate(user)) {
               System.out.println("This user has an access");
           }
        } catch (UserInvalidException ex) {
            ex.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
