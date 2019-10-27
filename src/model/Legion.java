package model;
import model.Archangel;

public class Legion{
//Constants
  //Jesus said that a legion of angels has 6000 angels
  public final int NUMBEROFARCHANGELS = 6000;

//Atributes
  private String name;

//Relationships
  Archangel archangels[];

//Constructor
/**
  * It creates a Legion <br>
  * <b>post: </b> A Legion has been initialized. <br>
  * @param pName Legion name. pName != null && pName != "".
  */
  public Legion (String pName){
    name = pName;
    archangels = new Archangel[NUMBEROFARCHANGELS];

  }
//Archangel creator
  public void createArchangel (String pName, String pPicture, String pPrayer, String pMonth, String pDay, String pPower, String pColor, double pSize, String pEssence, int pIlluminance){

    Archangel saint = new Archangel (pName, pPicture, pPrayer, pMonth, pDay, pPower, pColor, pSize, pEssence, pIlluminance);
    boolean created = false;

    for (int i=0 ; i<NUMBEROFARCHANGELS && !created; i++){
      if (archangels[i] == null){
        archangels[i] = saint;
        created = true;
      }
    }
  }
  /**
    * It counts the number of angels created <br>
    * @return number of angels created
    */
  public int countArchangels(){
    int numberOfArchangelsCreated = 0;
    boolean stop = false;
    for (int i = 0; i<NUMBEROFARCHANGELS && !stop ; i++){
      if (archangels[i] != null){
        numberOfArchangelsCreated++;
        stop = true;
      }
    }
    return numberOfArchangelsCreated;
  }
  /**
    * It searchs an angel by name <br>
    * @param pName Angel name. pName != null && pName != "".
    * @return information of the angel
    */
  public String searchAngelName (String pName){
    String dataArchangel = "";
    boolean found = false;
    for (int i = 0; i<NUMBEROFARCHANGELS && !found ; i++){
      if (getArchangel(i).getName().equals(pName)){
        dataArchangel = getArchangel(1).toString();
        found = true;
      }
    }
    if (found)
      return dataArchangel;
    else
      return "Angel has not been found";
  }
  /**
    * It searchs an angel by power <br>
    * @param pPower Angel pwer. pPower != null && pPower != "".
    * @return information of the angel
    */
  public String searchAngelPower (String pPower){
    String dataArchangel = "";
    boolean found = false;
    for (int i = 0 ; i<NUMBEROFARCHANGELS && !found ; i++){
      if (getArchangel(i).getPower().equalsIgnoreCase(pPower)){
        dataArchangel = getArchangel(i).toString();
        found = true;
      }
    }
    if (found)
      return dataArchangel;
    else
      return "Angel has not been found";
  }
  /**
    * It gives all the celabrations in a month <br>
    * @param pMonth month. pMonth != null && pMonth != "".
    * @return information of the celebration days in a month
    */
  public String monthCelebrations(String pMonth){
    String dataMonth = "";
    for (int i = 0 ; i<NUMBEROFARCHANGELS ; i++){
      if (getArchangel(i).getMonth().equalsIgnoreCase(pMonth))
        dataMonth += getArchangel(i).nameDayColorEssence();
    }
    return dataMonth;
  }
  /**
    * It gives all the celebrations of the year <br>
    * @return information of the celebration days in the year
    */
  public String allCelebrations(){
    String dataCelebrations = "";
    for (int i = 0 ; i<NUMBEROFARCHANGELS ; i++)
      dataCelebrations += getArchangel(i).nameAndDate();
    return dataCelebrations;
  }
  /**
     * It gets an archangel of the array
     * @return archangel
     */
  public Archangel getArchangel (int i){
    return archangels[i];
  }

}
