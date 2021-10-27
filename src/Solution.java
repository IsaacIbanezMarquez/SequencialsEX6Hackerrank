import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/*  Un alumne arriba cada dia tard a classe X segons durant tot l'any. Considerem que en un curs normal de 1r de DAM fem 33 setmanes lectives i que no ens coincideix amb cap festa ni cap vaga. Digueu quantes hores, minuts i segons deixa de fer aquest alumne respecte la resta.

Input Format

x segons de retard, serà un nombre enter >= 0.

Constraints

Suposem que x que no és negatiu.

Output Format

h: hores totals perdudes m: minuts totals perduts s: segons totals perduts

Sample Input 0

1
Sample Output 0

0
2
45
Sample Input 1

300
Sample Output 1

13
45
0
Sample Input 2

10
Sample Output 2

0
27
30

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int totalTime = 33 * 5;
        int retardedS = sc.nextInt()*totalTime;

        int h = retardedS / 3600;
        retardedS = retardedS % 3600;
        int m = retardedS / 60;
        retardedS = retardedS % 60;

        System.out.println(h);

        System.out.println(m);

        System.out.println(retardedS);

    }

}
