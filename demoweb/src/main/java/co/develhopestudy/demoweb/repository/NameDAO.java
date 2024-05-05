package co.develhopestudy.demoweb.repository;

import org.springframework.stereotype.Repository;

@Repository
public class NameDAO {


    public String returnName(String name) {
        return name;
    }

    public String invertName(String name) {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
}
