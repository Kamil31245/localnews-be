package com.kamil.dev.local.news.demo.controllers;

import com.kamil.dev.local.news.demo.services.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/news")
public class NewsController {

    private final OpenAiService openAiService;

    @GetMapping()
    public String getNews() {
        return "HI, LATEST NEWS FROM: MINESOTTA";
    }

    @GetMapping("/open-ai")
    public String getChatCompletion(@RequestParam String prompt) {
        return openAiService.getChatCompletions(prompt);
    }
}
