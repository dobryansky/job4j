

package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {

        for (User user: users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User with this login not found");
    }


    public static boolean validate(User user) throws UserInvalidException {
      if (user.getUsername().length() < 3||!user.isValid()){
          throw new UserInvalidException("Wrong user");
      }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("PF", true),
                new User("VASILII VASILIEV", false),
                new User("PF", true)
        };
        String[] logins = {"Petr Arsentev","PF", "IVAN IVANOV", "VASILII VASILIEV"};

        try {


            for (String login: logins) {
                User user = findUser(users, login);
                if (validate(user)) {
                    System.out.println("User " + login + " has an access");
                }
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

