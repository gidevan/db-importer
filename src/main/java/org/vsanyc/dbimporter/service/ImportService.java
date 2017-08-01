package org.vsanyc.dbimporter.service;

import org.springframework.stereotype.Service;

/**
 * Created by ivan on 1.8.17.
 */
@Service
public interface ImportService {
    String importData(String dbName);
}
