package banana.move.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="account")
public class Account {

    @Id
    @GeneratedValue
    private int acctId;
    @Column(unique=true)
    private String username;
    private String password;
    private String type;

    public Account(){}

    public Account(int acctId, String username, String password, String type) {
        this.acctId = acctId;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
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
