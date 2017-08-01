package org.vsanyc.dbimporter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vsanyc.dbimporter.service.ImportService;

/**
 * Created by ivan on 1.8.17.
 */
@RestController
@RequestMapping("import")
public class DbImportRest {

    @Autowired
    private ImportService importService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/sqlite/{dbName}")
    public String importDataSqlite(@PathVariable String dbName) {
        importService.importData(dbName);
        return "imported";
    }
}
