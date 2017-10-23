package cn.ico.boot.domain;

public class User {
    private String username;
    private String password;
    private String[] favor;
    private String country;
    private String[] skills;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getFavor() {
        return favor;
    }

    public void setFavor(String[] favor) {
        this.favor = favor;
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
}
