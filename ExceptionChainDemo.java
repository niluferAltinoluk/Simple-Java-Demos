
public class ExceptionChainDemo {
    public static void main( String args[] )
    {
        try
        {
            m1();
            System.out.println("statements after calling m1()");
        }
        catch(Exception e)
        {
             System.out.println("catch in main "+e.getMessage());
             
        }
        finally
        {
            System.out.println("Finally in main");
        }
        System.out.println("After finally in main");
    }
    public static void m1() throws Exception
    {
         try
        {
            m2();
            System.out.println("statements after calling m2()");
        }
        catch(Exception e)
        {
           
            System.out.println("catch in m1 "+e.getMessage());
            throw e;
        }
        finally
        {
            System.out.println("Finally in m1");
        }
         System.out.println("After finally in m1");
    }
    public static void m2() throws Exception
    {
         try
        {
            m3();
            System.out.println("statements after calling m3()");
        }
        catch(Exception e)
        {
            
            System.out.println("catch in m2: "+e.getMessage());
            throw e;
        }
        finally
        {
            System.out.println("Finally in m2");
        }
         System.out.println("After finally in m2");
    }
    public static void m3() throws Exception
    {
         throw new Exception("ex in m3");
    }
    
}
