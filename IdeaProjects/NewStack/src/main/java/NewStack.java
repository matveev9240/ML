/**
 * Created by владимир on 20.10.2016.
 */
import java.util.Stack;
import java.util.Scanner;

import java.util.EmptyStackException;
class NewStack
{
    static void showpush(Stack st, int b)
    {
        st.push(new Integer(b));
        }
    static void showpop(Stack st)
    {
        Integer b = (Integer) st.pop();
        System.out.println(b);
        }
    public static void main(String args[])
    {
        int i;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Stack st = new Stack();
        for(i=0;i<count;i++) {
            int a = scanner.nextInt();
            if (a == 1 || a == 2) {
                if (a == 1) {

                    int b = scanner.nextInt();
                    showpush(st, b);
                } else {
                    try
                    {
                       showpop(st);
                    }
                    catch (EmptyStackException e)
                    {
                       System.out.println("empty stack");
                    }



                }

            }
              else {
                System.out.println("warning!!!");
            }
        }

        }



    }



