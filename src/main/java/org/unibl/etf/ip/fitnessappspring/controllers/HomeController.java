package org.unibl.etf.ip.fitnessappspring.controllers;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.unibl.etf.ip.fitnessappspring.models.Exercise;
import org.unibl.etf.ip.fitnessappspring.models.NewsItem;

import java.net.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/home")
public class HomeController {

     @GetMapping("/exercises")
    public List<Exercise> getRssFeedExercises(){
         List<Exercise> participantJsonList = new ArrayList<Exercise>();

         URL url = null;
         try {
             url = new URL("https://api.api-ninjas.com/v1/exercises");
             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
             connection.setRequestProperty("accept", "application/json");
             connection.setRequestProperty("X-Api-Key", "w3it0klfkIPE+XQ32i8l9w==qHctbTEtVlrq5Kty");
             InputStream responseStream = connection.getInputStream();
             ObjectMapper mapper = new ObjectMapper();
             JsonNode root = mapper.readTree(responseStream);
             System.out.println(root);
             System.out.println(root.path("name").asText());
              participantJsonList = mapper.readValue(root.traverse(), new TypeReference<List<Exercise>>(){});
             for(Exercise e : participantJsonList){
                 System.out.println(e);
             }
         } catch (MalformedURLException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


         return participantJsonList;
     }

     @GetMapping("/news")
    public List<NewsItem> getRssFeedNews(){
         URL url = null;
         List<NewsItem> participantJsonList = new ArrayList<NewsItem>();
         try {
             url = new URL("https://feeds.feedburner.com/AceFitFacts");
             HttpURLConnection connection = (HttpURLConnection) url.openConnection();

             connection.setRequestProperty("accept", "application/json");

             InputStream responseStream = connection.getInputStream();
             OutputStream outputStream = new ByteArrayOutputStream();
             responseStream.transferTo(outputStream);

             XmlMapper xmlMapper = new XmlMapper();
             JsonNode jsonNode = xmlMapper.readTree(outputStream.toString());
             ObjectMapper objectMapper = new ObjectMapper();
             ObjectNode objectNode = objectMapper.convertValue(jsonNode.get("channel"), ObjectNode.class);
             participantJsonList = objectMapper.readValue(objectNode.get("item").traverse(),new TypeReference<List<NewsItem>>(){} );
             System.out.println(participantJsonList);

         } catch (MalformedURLException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         return  participantJsonList;
     }

}
