package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    public static final long serialVersionUID = 1l;

    private Integer id;
    private String name;
    private String email;
    private Date birthDay;
    private Double baseSalary;

    private Department department;

    public Seller () {
    }

    public Seller(Integer id, String name, String email, Date birthDay, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return getId().equals(seller.getId());
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDay=" + birthDay +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
