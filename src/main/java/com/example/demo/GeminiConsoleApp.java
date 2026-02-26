package com.example.demo;

import com.example.demo.model.GeminiResponse;
import com.example.demo.service.GeminiService;
import com.google.genai.Client;

import java.util.Scanner;

public class GeminiConsoleApp {

    public static void main(String[] args) {
        Client client = new Client();  // SDK-ul citește API key din environment
        GeminiService service = new GeminiService(client);

        Scanner input = new Scanner(System.in);
        System.out.println("Introducere text gemini:");

        while (true) {
            System.out.print("Text: "); // Add a prompt for user input
            String prompt = input.nextLine();
            if (prompt.equalsIgnoreCase("exit")) {
                System.out.println("Exit gemini.");
                break;
            }
            GeminiResponse response;
            response = service.askGeminiWithResponse(prompt);
            System.out.println(response);
        }
        input.close(); // Close the scanner when done
    }
}
