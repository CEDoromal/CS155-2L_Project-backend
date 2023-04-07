package banana.move.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="transaction")
public class Transaction {
    @Id
    private int transaction_id;
    private int acct_id;
    private String address;
    private int total_price;
    private String status;

    public Transaction() {
    }

    public Transaction(int transaction_id, int acct_id, String address, int total_price, String status) {
        this.transaction_id = transaction_id;
        this.acct_id = acct_id;
        this.address = address;
        this.total_price = total_price;
        this.status = status;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
