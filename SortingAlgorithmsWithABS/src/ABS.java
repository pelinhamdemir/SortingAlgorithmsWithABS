import java.util.Random;
import java.util.Scanner;

public class ABS {
    public static void main(String[] args) {
        int [] seri = new int[10];
        int settings = 5;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the sort you want to use:");
        String setting = keyboard.nextLine();
//determining algorithm type
        if(setting.equalsIgnoreCase("selection"))
            settings =1;

        if(setting.equalsIgnoreCase("insertion"))
            settings =2;

        if(setting.equalsIgnoreCase("merge"))
            settings =3;

        if(setting.equalsIgnoreCase("quick"))
            settings =4;

        if(setting.equalsIgnoreCase("nosort"))
            settings =5;

        switch (settings){//chooses the options
            case 1:
                System.out.println("Enter array:");
                for (int i = 0; i < 10; i++) {
                    seri[i] = keyboard.nextInt();
                }
                SelectionSort(seri);
                ABS(seri);
                break;
            case 2:

                System.out.println("Enter array:");
                for (int i = 0; i < 10; i++) {
                    seri[i] = keyboard.nextInt();
                }
                InsertionSort(seri);
                ABS(seri);
                break;
            case 3:

                System.out.println("Enter array:");

                for (int i = 0; i < 10; i++) {
                    seri[i] = keyboard.nextInt();
                }
                Mergesort(seri);
                ABS(seri);
                break;
            case 4:

                System.out.println("Enter array:");
                for (int i = 0; i < 10; i++) {
                    seri[i] = keyboard.nextInt();
                }
                Quicksort(seri);
                ABS(seri);
                break;
            case 5:

                System.out.println("Enter array:");
                for (int i = 0; i < 10; i++) {
                    seri[i] = keyboard.nextInt();
                }
                absolute(seri);
        }




    }
    public static void ABS(int[] arr) {// takes the diff between indexes next to each other.
        //In case of finding two pairs with same diff,checks the sums of each pairs and updates.
        int smallestDiff = Integer.MAX_VALUE;
        int no1 = 0, no2 = 0;
        int max = 0,min = 0;
        for (int i = 1; i < arr.length; i++) {
            int currentD = Math.abs(arr[i] - arr[i - 1]);
            if (currentD < smallestDiff) {
                smallestDiff = currentD;
                no1 = arr[i - 1];
                no2 = arr[i];
            } else if (currentD == smallestDiff) {
                if (arr[i] + arr[i - 1] < no1 + no2) {
                    no1 = arr[i];
                    no2 = arr[i - 1];
                }
            }
            max = Math.max(no1, no2);
            min = Math.min(no1, no2);

        }
        System.out.println("ABS:" + smallestDiff + ", Min=" + min + ", Max=" + max);
    }
    public static void absolute(int[] seri) {//compares the differences between each indexes in the list.

        int no1;
        int no2;
        int min = 0;
        int max = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentD;
        for (int i = 0; i < seri.length; i++) {
            for (int j = i + 1 ; j < seri.length; j++) {
                currentD = Math.abs(seri[i] - seri[j]);
                Math.abs(currentD);

                if (currentD <= smallestDiff) {
                    smallestDiff = currentD;
                    no1 = seri[i];
                    no2 = seri[j];

                    if (no1 < no2) {
                        max = no2;
                        min = no1;
                    } else {
                        max = no1;
                        min = no2;
                    }
                }
            }
        }
        System.out.println("ABS:" + smallestDiff + ", Min=" + min + ", Max=" + max);
    }


    public static void SelectionSort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[min]))
                    min = j;
            exch(a, i, min);
        }
    }
    private static boolean less(int v, int w)
    { return v-w < 0; }
    private static void exch(int[] a, int i, int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


  private static void merge(int[] a, int[] aux, int lo, int mid, int hi)
    {
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
    public static void InsertionSort(int[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--)
                if (less(a[j], a[j-1]))
                    exch(a, j, j-1);
                else break;
    }


    private static void sort(int[] a, int[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
        int N= a.length ;
    }

    public static void Mergesort(int[] a)
    {
        int N= a.length ;
        int [] aux = new int[a.length];
        sort(a,aux,0,a.length - 1);
        for(int i = 0 ; i<N/2;i++){
            int temp = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = temp;
        }
    }



    public static void Sort(int[] seri, int left, int right) {
        if (right>left) {
            int pivotIndex = partition(seri, left, right);
            Sort(seri, left, pivotIndex - 1);
            Sort(seri, pivotIndex + 1, right);
        }
    }
    static Random random = new Random();
    private static int partition(int[] a, int lo, int hi)
    {
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void shuffle(int[] e)
    {
        int N = e.length;
        for (int i = 0; i < N; i++)
        {
            int r = random.nextInt(i+1);

            exch(e, i, r);
        }
    }

    public static void Quicksort(int[] p)
    {
        shuffle(p);
        Sort(p, 0, p.length - 1);
    }

    public static void swap(int[] students, int i, int j) {
        int temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }




}
