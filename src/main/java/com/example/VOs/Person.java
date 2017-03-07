package com.example.VOs;

import java.util.List;

/**
 * Created by dmpr0116 on 07.03.2017.
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected List<String> phones;
    protected String address;
    protected String CAFid;
    protected List<String> emails;
    protected String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCAFid() {
        return CAFid;
    }

    public void setCAFid(String CAFid) {
        this.CAFid = CAFid;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getId() != person.getId()) return false;
        if (!getName().equals(person.getName())) return false;
        if (!getPhones().equals(person.getPhones())) return false;
        if (getAddress() != null ? !getAddress().equals(person.getAddress()) : person.getAddress() != null)
            return false;
        if (getCAFid() != null ? !getCAFid().equals(person.getCAFid()) : person.getCAFid() != null) return false;
        if (getEmails() != null ? !getEmails().equals(person.getEmails()) : person.getEmails() != null) return false;
        return getTitle() != null ? getTitle().equals(person.getTitle()) : person.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getPhones().hashCode();
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getCAFid() != null ? getCAFid().hashCode() : 0);
        result = 31 * result + (getEmails() != null ? getEmails().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }
}
