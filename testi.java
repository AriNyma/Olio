public class testi
{
    static void function(int chosenNbr)
    {
    
        int counter = 0;

        while (counter < 10)
        {
            if (chosenNbr == counter)
            {
                System.out.println("Tämä on valittu luku " + chosenNbr);
            }
            else
            {
                System.out.println(counter);
            }
            counter++;            
        }
    }
    public static void main (String[] args) 
    {
    function(7);
    }
}