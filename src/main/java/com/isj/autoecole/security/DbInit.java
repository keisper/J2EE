package com.isj.autoecole.security;



import com.isj.autoecole.repository.EleveRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DbInit implements CommandLineRunner {
    private EleveRepository eleveRepository;

    public DbInit(EleveRepository eleveRepository) {
        this.eleveRepository = eleveRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
