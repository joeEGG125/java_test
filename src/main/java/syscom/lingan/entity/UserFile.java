package syscom.lingan.entity;

import java.io.Serializable;

public class UserFile implements Serializable {
    private String id;
    private String name;
    private String password;

    public UserFile() {
    }

    public UserFile(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpassword() {
        return password;
    }

    public void setEncryptedPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserFile{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
