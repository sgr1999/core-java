package org.example.concepts.collection;

import java.util.HashSet;
import java.util.Objects;

class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id && Objects.equals(name, user.name);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class HashCodeConcept {

    public static void main(String[] args) {

        String str1 = new String("Sagar");
        String str2 = new String("Sagar");

        System.out.println(str1.equals(str2));

        User user = new User(1,"Sagar");
        User user1 = new User(1,"Sagar");

        HashSet<User> set = new HashSet<>();
        set.add(user);
        set.add(user1);

        System.out.println("User "+user.hashCode());
        System.out.println("User1 "+user1.hashCode());

        System.out.println("User "+(31 * user.getId() + user.getName().hashCode()));
        System.out.println("User1 "+(31 * user1.getId() + user1.getName().hashCode()));
        System.out.println(set.size());
    }
}
