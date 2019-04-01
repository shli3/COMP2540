package lab1;

public class Stack
{
    public Stack() {
    }
    String[] a = new String[60000];
    static int counter = 0;

    void push(String TakeIn)
    {

        try{

            TakeIn = a[counter];
            if(counter > 59999) throw new ArrayIndexOutOfBoundsException("Array limit exceeded! Pop something");
            
            else counter++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }

    boolean pop()
    {

        if(counter == 0) return false;

        else{
            a[counter] = null;
            counter--;
        }

        return true;

    }

    void top()
    {

        System.out.println(a[counter]);

    }

    boolean isEmpty()
    {

        if(counter == 0) return false;

        else return true;

    }

    int size(String arrayy[])
    {
        
        while(arrayy[counter + 1] != null)
        {
            counter++;
        }

        return counter + 1;

    }

}