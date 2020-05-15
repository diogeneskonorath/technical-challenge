package com.diogeneskonorath.technicalchallenge.dao;

import java.nio.file.*;
import java.util.List;

public class WatchFiles {
    public String observer() throws Exception {
        String result = "";
        WatchService watcher =  FileSystems.getDefault().newWatchService();
        Path path = Paths.get("/home/diogenes/Documentos/git/desafio-tecnico/data/in/");
        path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
        System.out.println("iniciando monitoramento:");

            WatchKey key;
            key = watcher.take();
            List<WatchEvent<?>> eventList= key.pollEvents();
            for (WatchEvent<?> event : eventList){
                WatchEvent.Kind<?> eventKind = event.kind();
                String fileName = event.context().toString();
                if (eventKind == StandardWatchEventKinds.OVERFLOW){
                    continue;
                }else {
                    result = fileName;
                }
            }

        return result;
    }
}
