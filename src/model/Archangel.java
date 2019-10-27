package model;
import model.Candle;

public class Archangel{

//Atributes
  private String name;
  private String picture;
  private String prayer;
  private String month;
  private String day;
  private String power;

//Relationships
  private Candle candle;

//Methods
//Constructor
  /**
    * It creates an archangel with a respective candle <br>
    * <b>post: </b> An archangel has been created. <br>
    * @param pName Archangel name. pName != null && pName != "".
    * @param pPicture Archangel picture. pPicture != null && pPicture != "".
    * @param pPrayer Archangel prayer. pPrayer != null && pPrayer != "".
    * @param pMonth Archangel celebration month. pMonth != null && pMonth !="".
    * @param pDay Archangel celebration day of the month. pDay != null && pDay !="".
    * @param pPower The power of the archangel. pPower != null && pPower !="".
    * @param pColor Candle color of the archangel. pColor != null && pColor != "".
    * @param pSize Size candle of the archangel. pSize > 0.0.
    * @param pEssence Candle essence of the archangel. pEssence != null && pEssence != "".
    * @param pIlluminance Candle illuminance of the archangel. pEssence > 0.
    */
  public Archangel (String pName, String pPicture, String pPrayer, String pMonth, String pDay, String pPower, String pColor, double pSize, String pEssence, int pIlluminance){
    name = pName;
    picture = pPicture;
    prayer = pPrayer;
    month = pMonth;
    day = pDay;
    power = pPower;
    candle = new Candle(pColor, pSize, pEssence, pIlluminance);
  }

//Getters
  /**
     * It gets the name of the archangel
     * @return name of the archangel
     */
  public String getName(){
    return name;
  }
  /**
     * It gets the picture of the archangel
     * @return picture of the archangel
     */
  public String getPicture(){
    return picture;
  }
  /**
     * It gets the prayer of the archangel
     * @return prayer of the archangel
     */
  public String getPrayer(){
    return prayer;
  }
  /**
     * It gets the celebration month of the archangel
     * @return celebration month of the archangel
     */
  public String getMonth(){
    return month;
  }
  /**
     * It gets the celebration day of the archangel
     * @return celebration day of the archangel
     */
  public String getDay(){
    return day;
  }
  /**
     * It gets the power of the archangel
     * @return power of the archangel
     */
  public String getPower(){
    return power;
  }
  /**
     * It gets the candle of the archangel
     * @return candle of the archangel
     */
  public Candle getCandle(){
    return candle;
  }

  //Setters
  /**
     * It sets the name of the archangel
     * @param pName
     */
  public void setName(String pName){
    name = pName;
  }
  /**
     * It sets the picture of the archangel
     * @param pPicture
     */
  public void setPicture(String pPicture){
    picture = pPicture;
  }
  /**
     * It sets the prayer of the archangel
     * @param pPrayer
     */
  public void setPrayer(String pPrayer){
    prayer = pPrayer;
  }
  /**
     * It sets the celebration month of the archangel
     * @param pMonth
     */
  public void setMonth(String pMonth){
    month = pMonth;
  }
  /**
     * It sets the celebration day of the archangel
     * @param pDay
     */
  public void setDay(String pDay){
    day = pDay;
  }
  /**
     * It sets the power of the archangel
     * @param pPower
     */
  public void setPower(String pPower){
    power = pPower;
  }
  /**
     * It sets the candle of the archangel
     * @param pCandle
     */
  public void setCandle(Candle pCandle){
    candle = pCandle;
  }
//toString
  /**
     * It converts all the archangel information to string
     * @return Archangel information
     */
  public String toString(){
    String infoCandle = candle.toString();
    return "   Archangel\nName: "+ name + "\nURL picture: " + picture + "\nPrayer: " + prayer + "\nCelebration date: " + month + " " + day + "\nPower: " + power + "\n" + infoCandle + "\n";
  }
  /**
     * It gives the name and the celabration date of the Archangel
     * @return the name and the celebration date
     */
     public String nameAndDate(){
       return "\n" + name + ": " + month + " " + day + ".\n";
     }
   /**
      * It gives the name and the celabration date of the Archangel
      * @return the name and the celebration date
      */
      public String nameDayColorEssence(){
        return "\n" + name + ": " + day + "Candle: " + candle.getColor() + " " + candle.getEssence() + ".\n";
      }


}
