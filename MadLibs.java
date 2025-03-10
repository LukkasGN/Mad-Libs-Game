import java.util.Scanner;

public class MadLibs {
    /*
    This program generates a mad libbed story, a story with blanck spaces that can be filled 
    by the player before reading/knowing the full story, generating some funny results
  
    Author: Lucas Gabriel Nordio
  
    Date: 10/03/2025
    */
        public static void main(String[] args){
        
        try (//Creating Scanner object
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to MadLibs! Please fill in the following questions:");

            //Names
            System.out.println("Enter the first name: ");
            String name1 = scanner.nextLine();

            System.out.println("Enter the second name: ");
            String name2 = scanner.nextLine();

            //Adjectives
            String adjective1 = "";
            String adjective2 = "";
            String adjective3 = "";

            System.out.println("Enter three adjectives: ");
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        adjective1 = scanner.nextLine();
                        System.out.println("Adjective 1: " + adjective1);
                        break;
                    case 1:
                        adjective2 = scanner.nextLine();
                        System.out.println("Adjective 2: " + adjective2);
                        break;
                    case 2:
                        adjective3 = scanner.nextLine();
                        System.out.println("Adjective 3: " + adjective3);
                        break;
                    default:
                        break;
                }
            }
            
            //Verb
            System.out.println("Insert a verb: ");
            String verb1 = scanner.nextLine();

            //Nouns
            String noun1 = "";
            String noun2 = "";
            String noun3 = "";
            String noun4 = "";
            String noun5 = "";
            String noun6 = "";

            System.out.println("Enter six nouns: ");

            for (int i = 0; i < 6; i++) {
                switch (i) {
                    case 0:
                        noun1 = scanner.nextLine();
                        System.out.println("Noun 1: " + noun1);
                        break;
                    case 1:
                        noun2 = scanner.nextLine();
                        System.out.println("Noun 2: " + noun2);
                        break;
                    case 2:
                        noun3 = scanner.nextLine();
                        System.out.println("Noun 3: " + noun3);
                        break;
                    case 3:
                        noun4 = scanner.nextLine();
                        System.out.println("Noun 4: " + noun4);
                        break;
                    case 4:
                        noun5 = scanner.nextLine();
                        System.out.println("Noun 5: " + noun5);
                        break;
                    case 5:
                        noun6 = scanner.nextLine();
                        System.out.println("Noun 6: " + noun6);
                        break;
                    default:
                        break;
                }
            }
            
            //Number
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            //Place
            @SuppressWarnings("unused")
            String bug = ""; //Variable for solving the nextLine bug after a nextInt
            System.out.println("Enter a place: ");
            bug =scanner.nextLine();
            String place1 = scanner.nextLine();

            //The template for the story
            String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+
            "s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+
            ". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "
            +number+", in a world where "+noun6+"s ruled the world.";

            System.out.println(story);
        }
      }       
  }
  