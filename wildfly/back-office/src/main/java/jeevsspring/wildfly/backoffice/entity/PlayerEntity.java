package jeevsspring.wildfly.backoffice.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Marco Romagnolo
 */
@Entity
@Cacheable
@Table(name="PLAYER")
public class PlayerEntity implements Serializable {

    @Id
    private String id;

    @Column("NICKNAME")
    private String nickname;

    @Column("USERNAME")
    private String username;

    @Column("PASSWORD")
    private String password;

    @OneToOne(fetch=FetchType.LAZY, mappedBy = "player")
    private AccountEntity account;

    @OneToOne(fetch=FetchType.LAZY, mappedBy = "player")
    private WalletEntity wallet;

    @OneToOne(fetch=FetchType.LAZY, mappedBy = "player")
    private SessionEntity session;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public WalletEntity getWallet() {
        return wallet;
    }

    public void setWallet(WalletEntity wallet) {
        this.wallet = wallet;
    }

    public SessionEntity getSession() {
        return session;
    }

    public void setSession(SessionEntity session) {
        this.session = session;
    }
}
