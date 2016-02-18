public abstract class SuperHero
   {
   private String suitColor;
   private boolean hasCape;
   
   public abstract String createmotto(); // means that each subclass will have method "createmotto"
   //public abstract String capecolor();
   //public abstract boolean hascape();
  
   
   
   public SuperHero()
      {
      this.suitColor = new String();
      this.hasCape = false;
      } // end zero-arg constructor SuperHero

   public void setSuitColor(String suitColor)
      {
      this.suitColor = new String( suitColor );
      } // end method setSuitColor
      
   public String getSuitColor()
      {
      return suitColor; 
      } // end method getSuitColor
   
   public void setCape(boolean cape)
      {
      this.hasCape = cape;  
      } // end method setCape
      
   public boolean isCaped()
      {
      return hasCape;   
      } // end method isCaped
      

   } // end abstract class SuperHero




   