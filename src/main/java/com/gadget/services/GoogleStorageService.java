package com.gadget.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoogleStorageService {

//    @Value("${gcp.bucket.name}")
//    private String bucketName;
//
//    @Value("${gcp.bucket.prefix}")
//    private String bucketPrefix;
//
//    @Value("${gcp.bucket.lb.domain}")
//    private String lbDomain;
//
//    public String transformGCPStorageUrl(String storageUrl, String prefix) {
//        String[] storageUrlSplit = storageUrl.split("\\.");
//        //TODO fix
//        String fileId = "dummy_id";
//        return new StringBuilder()
//                .append("https://")
//                .append(lbDomain)
//                .append("/")
//                .append(prefix)
//                .append("/")
//                .append(fileId)
//                .toString();
//    }

}
