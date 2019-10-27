package ui;
import model.Legion;
import java.util.Scanner;

public class Angels  {

  public static void main(String[] args) {
    try {
      new ProcessBuilder("cmd","/c","color b").inheritIO().start().waitFor();
    }catch (Exception e) {
    }
    

    Scanner in = new Scanner(System.in);

//Relationship
    Legion legion = new Legion("Maximum Superior");

    String menu;
    int menu1 = 0;
    int menu2 = 0;
    boolean loop = true;

    System.out.println("\n        Welcome to the wondeful world of the Angels\n \n Choose between the following options  \n 1.Menu \n 2.Exit");
    while (loop){
      menu = in.next();
      if(menu.equals("1") || menu.equals("2")){
        menu1 = Integer.parseInt(menu);
        loop = false;
      }
      else {
        System.out.println("Please enter a valid option" );
        loop = true;
      }
    }
    loop = true;
    boolean centinela;
    while (loop) {
        switch (menu1){
          case 1:
            System.out.print("    Menu \n\n 1.Add archangel \n 2.Count archangels added\n 3.See the information of an archangel by name\n 4.See the information of an archangel by power\n 5.See the celebrations of a month\n 6.See all the celabrations\n 7.Exit\n");
            while (loop){
              menu = in.next();
              if(menu.equals("1") || menu.equals("2") || menu.equals("3") || menu.equals("4") || menu.equals("5") || menu.equals("6") || menu.equals("7")){
                menu2 = Integer.parseInt(menu);
                loop = false;
              }
              else {
                System.out.println("Please enter a valid option" );
                loop = true;
              }
            }
            loop = true;
            switch (menu2) {
              case 1:
                System.out.println("\nEnter the name of the angel\n");
              in.nextLine();
                String pName = in.nextLine();
                System.out.println("\nEnter the an URL picture of the angel\n");
              in.nextLine();
                String pPicture = in.nextLine();
                System.out.println("\nEnter the prayer of the angel\n");
              in.nextLine();
                String pPrayer = in.nextLine();
                System.out.println("\nEnter the celabration month of the angel\n");
              in.nextLine();
                String pMonth = in.nextLine();
                System.out.println("\nEnter the calebration day of the angel\n");
              in.nextLine();
                String pDay = in.nextLine();
                System.out.println("\nEnter the power of the angel\n");
              in.nextLine();
                String pPower = in.nextLine();
                System.out.println("\n Candle information\nEnter the color of the angel candle\n");
              in.nextLine();
                String pColor = in.nextLine();
                System.out.println("\nEnter the size of the angel candle\n");
              in.nextLine();
                String ppSize = in.nextLine();
                double pSize = Double.parseDouble(ppSize);
                System.out.println("\nEnter the essence of the angel candle\n");
              in.nextLine();
                String pEssence = in.nextLine();
                System.out.println("\nEnter the grade of illuminance of the angel candle\n");
              in.nextLine();
                int pIlluminance = in.nextInt();

                legion.createArchangel(pName, pPicture, pPrayer, pMonth, pDay, pPower, pColor, pSize, pEssence, pIlluminance);

              break;

              case 2:
                System.out.println("The number of archangels created is: " + legion.countArchangels());
              break;

              case 3:
                System.out.println("Enter the name of the angel");
              in.nextLine();
                String name3 =  in.nextLine();
                legion.searchAngelName(name3);
              break;

              case 4:
                System.out.println("Enter the power of the angel");
              in.nextLine();
                String power4 =  in.nextLine();
                legion.searchAngelPower(power4);
              break;

              case 5:
              System.out.println("Enter the the month");
            in.nextLine();
              String month5 =  in.nextLine();
              legion.searchAngelName(month5);
              break;

              case 6:
                legion.allCelebrations();
              break;

              case 7:
                loop = false;
              break;
            }
          break;
          case 2:
            loop = false;
          break;
        }
    }
  }
}
