import java.util.*;

import AuthenticationStatusChecking.AuthenticationStatus;

public class AccountManager {
    private Set<Account> dataList = new TreeSet<>(new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            return o1.getUser().getName().compareTo(o2.getUser().getName());
        }
    });

    public Set<Account> getDataList() {
        return dataList;
    }

    public void setDataList(Set<Account> dataList) {
        this.dataList = dataList;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : dataList) {
            AuthenticationStatusChecking control = new AuthenticationStatusChecking(account.getUser());

            if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)) {
                if((control.login() == AuthenticationStatus.FAIL)) {
                    throw new InvalidAuthenticationException("ERROR: Invalid email or password");   
                } else {

					account.showUserInfo();
				}
            }
        }
    }

}
