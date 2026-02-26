package com.example.demo.controller;

import com.example.demo.model.GeminiResponse;
import com.example.demo.service.GeminiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gemini")
@RequiredArgsConstructor
public class GeminiController
{
    private final GeminiService geminiService;

    @GetMapping("/ask")
    public String askGeminiAPI(@RequestBody String prompt)
    {
        return geminiService.askGemini(prompt);
    }

    @PostMapping("/ask-with-response")
    public GeminiResponse askWithResponse(@RequestBody String text) {
        return geminiService.askGeminiWithResponse(text);
    }
}
