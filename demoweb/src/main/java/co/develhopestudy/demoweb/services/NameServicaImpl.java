package co.develhopestudy.demoweb.services;

import co.develhopestudy.demoweb.repository.NameDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NameServicaImpl implements NameService {

    private final NameDAO repository;

    @Override
    public String returnName(String name) {
        return repository.returnName(name);
    }

    @Override
    public String invertName(String name) {
        return repository.invertName(name);
    }

}
