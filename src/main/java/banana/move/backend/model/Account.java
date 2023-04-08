package banana.move.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="account")
public class Account {

    @Id
    @GeneratedValue
    private int acct_id;
    @Column(unique=true)
    private String username;
    private String password;
    private String type;

    public Account(){}

    public Account(int acct_id, String username, String password, String type) {
        this.acct_id = acct_id;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
