/**
 * Created by владимир on 07.10.2016.
 */
import java.util.*;
import java.io.*;



public class Delenie {
    int a;
int massiv[] = new int[a];

    public Delenie( int[] massiv) {

        this.massiv = massiv;

    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        try {
            st = new StringTokenizer(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a= Integer.parseInt(st.nextToken());

        int massive[] = new int[a];
        for(int i=0;i<a;i++)
        {

            massive[i] =  Integer.parseInt(st.nextToken());

        }

        Delenie delenie = new Delenie(massive);
    }}
