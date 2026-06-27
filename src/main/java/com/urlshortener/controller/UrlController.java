package com.urlshortener.controller;

import com.urlshortener.entity.Url;
import com.urlshortener.service.UrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten")
    public Map<String, String> shortenUrl(@RequestBody Map<String, String> request) {
        String originalUrl = request.get("originalUrl");

        Url url = urlService.shortenUrl(originalUrl);

        return Map.of(
                "originalUrl", url.getOriginalUrl(),
                "shortUrl", "http://localhost:8080/" + url.getShortCode()
        );
    }

    @GetMapping("/{shortCode}")
    public void redirectToOriginalUrl(@PathVariable String shortCode,
                                      HttpServletResponse response) throws IOException {

        Optional<Url> url = urlService.getOriginalUrl(shortCode);

        if (url.isPresent()) {
            response.sendRedirect(url.get().getOriginalUrl());
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Short URL not found");
        }
    }
}