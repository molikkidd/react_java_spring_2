package com.amigoscode.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class S3Config {

    @Value("${aws.region}")
    private String awsRegion;

    public S3Client s3Client(){
        S3Client client = S3Client.builder()
                .region(Region.US_EAST_2)
                .build();
        return client;
    };
}
