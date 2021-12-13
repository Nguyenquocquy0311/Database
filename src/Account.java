public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(Object o) {
        Account acc = (Account) o;
        if (acc.getUsername().equals(((Account) o).getUsername()) && acc.getPassword().equals(((Account) o).getPassword())) {
            return true;
        }
        return false;
    }
}
