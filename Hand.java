
/**
 * Write a description of class Hand here.
 * 
 * @author Kacey P. 
 * @version 9/27/17
 */
import java.lang.Math;
public class Hand
{
    private int num;
    public Hand(){
        num = 0;
    }

    public int drawNum(){
        num = (int)(Math.random() * 10) + 1;
        return num;
    }

    public int getNum(){
        return num;
    }
}
