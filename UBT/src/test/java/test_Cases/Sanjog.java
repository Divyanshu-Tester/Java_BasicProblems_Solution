package test_Cases;

import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Sanjog 

{
	 // Base URL of the site for which we're retrieving the sitemap
    private static final String BASE_URL = "https://sanjog.xynes.com";
    
    // Endpoint for the sitemap
    private static final String SITEMAP_ENDPOINT = "/sitemap.xml";
    
  @Test
	  public void testGetSitemap() 
	  
	  {
	        try {
	            // Create a URL object
	            @SuppressWarnings("deprecation")
				URL url = new URL(BASE_URL + SITEMAP_ENDPOINT);
	            
	            // Open an HTTP connection to the URL
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            
	            // Set the request method to GET
	            connection.setRequestMethod("GET");
	            
	            // Get the response code (should be 200 if successful)
	            int responseCode = connection.getResponseCode();
	            
	            // If response code is 200, read the sitemap content
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                // Use BufferedReader to read the response from the input stream
	                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuilder content = new StringBuilder();

	                // Read each line of the sitemap and append it to the StringBuilder
	                while ((inputLine = in.readLine()) != null) {
	                    content.append(inputLine).append("\n");
	                }
	                
	                // Close the BufferedReader
	                in.close();
	                
	                // Print the content of the sitemap
	                System.out.println("Sitemap content: \n" + content.toString());
	            } else {
	                System.out.println("Failed to fetch sitemap. HTTP Response Code: " + responseCode);
	            }
	            
	            // Close the connection
	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	  
  }

