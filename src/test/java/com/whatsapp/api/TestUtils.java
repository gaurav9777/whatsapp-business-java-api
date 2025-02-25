package com.whatsapp.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class TestUtils {


    public final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @return String with file contents
     */
    public String fromResource(String fileName) throws IOException, URISyntaxException {

        byte[] encoded = Files.readAllBytes(Paths.get(Objects.requireNonNull(this.getClass() //
                .getResource(fileName)).toURI()));
        return new String(encoded, StandardCharsets.UTF_8);


    }
}
