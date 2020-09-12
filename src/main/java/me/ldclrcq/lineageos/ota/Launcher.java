package me.ldclrcq.lineageos.ota;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import me.ldclrcq.lineageos.ota.domain.service.FileService;

import javax.inject.Inject;

public class Launcher implements QuarkusApplication {

    @Inject
    FileService fileService;

    @Override
    public int run(String... args) throws Exception {
        Quarkus.waitForExit();
        return 0;
    }
}
