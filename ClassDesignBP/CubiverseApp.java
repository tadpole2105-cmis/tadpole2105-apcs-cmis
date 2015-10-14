public class CubiverseApp
{
    public static void main ( String[] argv )
    {
        int numCubiverses = 5;
        Cubiverse[] zero = new Cubiverse[numCubiverses]; //zero will have 5 items
        Cubiverse[] threeA = new Cubiverse[numCubiverses];
        Cubiverse[] threeB = new Cubiverse[numCubiverses];
        double x, y, z;
        int w, h, d;
        String name;//
        for ( int i = 0; i < numCubiverses; i++ ) //loop 5 times
        {
            //1
            zero[i] = new Cubiverse(); //1st item of zero
            //2    
            w = (int)(Math.random() * i * 10) + 1;
            h = (int)(Math.random() * i * 10) + 1;
            d = (int)(Math.random() * i * 10) + 1;
            name = "CubiVerse-"+i * Math.random();
            threeA[i] = new Cubiverse( w, h, d, name); //only has these 4 so mult arg con should have these 4

            //3
            x = Math.random();
            y = Math.random();
            z = Math.random();
            name = "CubiVerse-"+i * Math.random();
            threeB[i] = new Cubiverse(x, y, z, name);
        }
        
        System.out.println("Zero Arguments\n==============");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(zero[i]);
        }
        
        
        System.out.println("Three A Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(threeA[i]);
        }
        
        
        System.out.println("Three B Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(threeB[i]);
        }     
    }
}