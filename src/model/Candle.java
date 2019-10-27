
package model;

public class Candle {


//Atributes
  private String color;
  private double size;
  private String essence;
  private int illuminance;

//Methods
//Constructor
  /**
    * It creates a candle <br>
    * <b>post: </b> The color, size, essence and the illuminance degrees were initialized with values given in parameters. <br>
    * @param pColor Candle color. pColor != null && pColor != "".
    * @param pSize Size candle. pSize > 0.0.
    * @param pEssence Candle essence. pEssence != null && pEssence != "".
    * @param pIlluminance Candle illuminance. pEssence > 0.
    */
  public Candle (String pColor, double pSize, String pEssence, int pIlluminance ){
    color = pColor;
    size = pSize;
    essence = pEssence;
    illuminance = pIlluminance;
  }

// Getters
  /**
     * It gets the color of the candle
     * @return color of candle
     */
  public String getColor(){
    return color;
  }
  /**
     * It gets the size of the candle
     * @return size of candle
     */
  public double getSize(){
    return size;
  }
  /**
     * It gets the essence of the candle
     * @return essence of candle
     */
  public String getEssence(){
    return essence;
  }
  /**
     * It gets the illuminance grade of the candle
     * @return illuminance of candle
     */
  public int getIlluminance(){
    return illuminance;
  }
// Setters
  /**
     * It sets the color of the candle
     * @param pColor
     */
  public void setColor(String pColor){
    color = pColor;
  }
  /**
     * It sets the size of the candle
     * @param pSize
     */
  public void setSize(double pSize){
    size = pSize;
  }
  /**
     * It sets the essence of the candle
     * @param pEssence
     */
  public void setEssence(String pEssence){
    essence = pEssence;
  }
  /**
     * It sets the illuminance of the candle
     * @param pIlluminance
     */
  public void setIlluminance(int pIlluminance){
    illuminance = pIlluminance;
  }
//toString
  /**
     * It converts all the candle information to string
     * @return candle information
     */
  public String toString (){
    return "   Candle:\nColor: "+ color + "\nSize: " + size + "\nEssence: " + essence + "\nIlluminance: " + illuminance;
  }

}
