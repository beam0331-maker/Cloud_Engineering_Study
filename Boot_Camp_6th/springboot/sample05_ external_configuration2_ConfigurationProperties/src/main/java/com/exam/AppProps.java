package com.exam;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;


@ConfigurationProperties(prefix = "app")
public class AppProps {

    String name;
    List<User> user;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AppProps{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }

    // "usuer:[{"name":"KIM","age":20},{...}]
    // name, age를 저장할 때 사용할 중첩 class

    public static class User{
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }// end User
}// end AppProps

