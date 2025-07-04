package Task_27;

import java.util.Scanner;

/*Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
 take the Site URL input from the user :Example Scenarios
Input: example.com,Output: The website type is: Commercial website
Input: example.org, Output: The website type is: Non-profit organization
Input: example.edu, Output: The website type is: Educational institution
Input: example.gov, Output: The website type is: Government website
Input: example.net, Output: The website type is: Network-related website
Input: example.info, Output: The website type is: Informational website
Input: example.xyz, Output: The website type is: Unknown or other types of websites */
public class website {
    public static void main(String[] args) {

        System.out.println("Enter the URL");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        if(url.contains(".com")){
            System.out.println("The website type is: Commercial website: " +url );
        }
        else if(url.contains(".org")){
            System.out.println("The website type is: Non-profit organization: " +url );
        }
        else if(url.contains(".edu")){
            System.out.println("The website type is: Educational institution: " +url );
        }
        else if(url.contains(".gov")){
            System.out.println("The website type is: Government website: " +url );
        }
        else if(url.contains(".net")){
            System.out.println("The website type is: Network-related website: " +url );
        }
        else if(url.contains(".info")){
            System.out.println("The website type is: Informational website: " +url );
        }
        else if(url.contains(".xyz")){
            System.out.println("The website type is: Unknown or other types of websites: " +url );
        }
        else{
            System.out.println("Enter data is not valid: " +url);
        }
        }
    }
