package org.config.patproject.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.util.FileUtil;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddFilesInDatabaseService {
    public String readFile() throws IOException {
        return FileUtil.readAsString(new File(getClass().getClassLoader().getResource("en.txt").getFile()));
    }

    public boolean filterChain(){

        return false;
    }
}


/*Копировать
Здесь мы передаем объект File методу readFileToString() класса FileUtils .
 Этот служебный класс позволяет загружать контент без необходимости написания какого-либо шаблонного
 кода для создания экземпляра InputStream и чтения данных*/
