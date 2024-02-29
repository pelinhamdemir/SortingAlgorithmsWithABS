import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double firstTime, finishTime, currentTime1=0,currentTime2=0,currentTime3=0, TimeAvg;
        int seed;
        int size =250;

        System.out.println("Enter a seed to create random generated values :");
        seed= keyboard.nextInt();
        System.out.println("Seed : "+ seed);
        System.out.println("Input size: "+ size);


        int [] array1;
        System.out.println();
        System.out.println("Sort option: Selection");

        System.out.println("Random");
        Random random = new Random(seed);
        array1 = RandomArrayCreater(250,random);
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;
        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Insertion");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;
        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Merge");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array1,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Quick");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        QuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        DescQuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: NoSort");
        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array1);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;


        size =1000;
        int[] array2 = new int[size];

        System.out.println("Input size: "+ size);

        System.out.println();

        System.out.println("Sort option: Selection");

        System.out.println("Random");
        array2 = RandomArrayCreater(size,random);

        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Insertion");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Merge");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        MergeABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array2,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        MergeABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array2,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Quick");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        QuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        DescQuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: NoSort");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array2);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        size =4000;
        int[] array3;

        System.out.println("Input size: "+ size);

        System.out.println();

        System.out.println("Sort option: Selection");

        System.out.println("Random");
        array3 = RandomArrayCreater(size,random);

        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        SelectionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Insertion");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Merge");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        MergeABS(array3,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Quick");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        QuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        QuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        DescQuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: NoSort");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        BasicABS(array3);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        size =16000;
        int [] array4;

        System.out.println("Input size: "+ size);

        System.out.println();

        System.out.println("Sort option: Selection");


        System.out.println("Random");
        array4 = RandomArrayCreater(size,random);

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Insertion");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Merge");
        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array4,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Quick");

        System.out.println("Random");


        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        QuickABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array4);

        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array4);

        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        DescQuickABS(array4);

        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        DescQuickABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        DescQuickABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: NoSort");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        BasicABS(array4);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        size =64000;
        int[] array5;

        System.out.println("Input size: "+ size);

        System.out.println();

        System.out.println("Sort option: Selection");

        System.out.println("Random");
        array5 = RandomArrayCreater(size,random);

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime= System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        SelectionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Insertion");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Merge");

        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        MergeABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Sort option: Quick");
        System.out.println("Random");

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Ascending");

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        QuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        DescQuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        DescQuickABS(array5);
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;
        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Sort option: NoSort");
        System.out.println("Random");
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;
        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;
        System.out.println("Ascending");
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;
        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();
        currentTime1=0;
        currentTime2=0;
        currentTime3=0;

        System.out.println("Descending");
        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"dsc");
        finishTime = System.currentTimeMillis();
        currentTime1 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime2 += finishTime - firstTime;

        firstTime = System.currentTimeMillis();
        InsertionABS(array5,"asc");
        finishTime = System.currentTimeMillis();
        currentTime3 += finishTime - firstTime;

        TimeAvg= (currentTime1+currentTime2+currentTime3)/3;
        System.out.println();

 }


    public static int[] RandomArrayCreater(int size, Random random) {//creates an array and fills the values of it randomly with the random object.

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }



    public static void SelectionABS(int[] arr, String string) {//Takes the diff between indexes next to each other and uses selection sort.
        //In case of finding two pairs with same diff,checks the sums of each pairs and updates.
        if(string=="asc")
            SelectionSort(arr);
        else SelectionSortforDesc(arr);
        int Dmin = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        int max = 0,min = 0;
        for (int i = 1; i < arr.length; i++) {
            int Dcurr = Math.abs(arr[i] - arr[i - 1]);
            if (Dcurr < Dmin) {
                Dmin = Dcurr;
                n1 = arr[i - 1];
                n2 = arr[i];
            } else if (Dcurr == Dmin) {
                if (arr[i] + arr[i - 1] < n1 + n2) {
                    n1 = arr[i];
                    n2 = arr[i - 1];
                }
            }
            max = Math.max(n1, n2);
            min = Math.min(n1, n2);

        }
        System.out.println(Dmin + " [" + min + " " + max + "]");
    }
    public static void InsertionABS(int[] arr,String string) {//uses insertion sort
        if(string=="asc")
            InsertionSort(arr);
        else descInsertionSort(arr);
        int Dmin = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        int max = 0,min = 0;
        for (int i = 1; i < arr.length; i++) {
            int Dcurr = Math.abs(arr[i] - arr[i - 1]);
            if (Dcurr < Dmin) {
                Dmin = Dcurr;
                n1 = arr[i - 1];
                n2 = arr[i];
            } else if (Dcurr == Dmin) {
                if (arr[i] + arr[i - 1] < n1 + n2) {
                    n1 = arr[i];
                    n2 = arr[i - 1];
                }
            }
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }

        }

        System.out.println(Dmin + " [" + min + " " + max + "]");
    }
    public static void MergeABS(int[] arr, String string) {//uses merge sort.
        int max = 0,min = 0;
        if(string=="asc")
            Mergesort(arr);
        else descMergesort(arr);

        int Dmin = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;

        for (int i = 1; i < arr.length; i++) {
            int Dcurr = Math.abs(arr[i] - arr[i - 1]);
            if (Dcurr < Dmin) {
                Dmin = Dcurr;
                n1 = arr[i - 1];
                n2 = arr[i];
            } else if (Dcurr == Dmin) {
                if (arr[i] + arr[i - 1] < n1 + n2) {
                    n1 = arr[i];
                    n2 = arr[i - 1];
                }
            }
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }

        }
        System.out.println(Dmin + " [" + min + " " + max + "]");
    }
    public static void QuickABS(int[] arr) {//uses quick sort
            Quicksort(arr);

        int Dmin = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        int max = 0,min = 0;
        for (int i = 1; i < arr.length; i++) {
            int Dcurr = Math.abs(arr[i] - arr[i - 1]);
            if (Dcurr < Dmin) {
                Dmin = Dcurr;
                n1 = arr[i - 1];
                n2 = arr[i];
            } else if (Dcurr == Dmin) {
                if (arr[i] + arr[i - 1] < n1 + n2) {
                    n1 = arr[i];
                    n2 = arr[i - 1];
                }
            }
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }
        }
        System.out.println(Dmin + " [" + min + " " + max + "]");
    }

    public static void DescQuickABS(int[] arr) {//uses quick sort with desc order
        descQuicksort(arr);

        int Dmin = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        int max = 0,min = 0;
        for (int i = 1; i < arr.length; i++) {
            int Dcurr = Math.abs(arr[i] - arr[i - 1]);
            if (Dcurr < Dmin) {
                Dmin = Dcurr;
                n1 = arr[i - 1];
                n2 = arr[i];
            } else if (Dcurr == Dmin) {
                if (arr[i] + arr[i - 1] < n1 + n2) {
                    n1 = arr[i];
                    n2 = arr[i - 1];
                }
            }
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }
        }
        System.out.println(Dmin + " [" + min + " " + max + "]");
    }
    public static void BasicABS(int[] arr) {
        int max = 0, min = 0;
        int count = arr.length;
        int n1, n2;

        int Dmin = Integer.MAX_VALUE;
        int Dcurr;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1 ; j < count; j++) {
                Dcurr = Math.abs(arr[i] - arr[j]);
                if(Dcurr<0)
                    Dcurr= -Dcurr;
                if (Dcurr <= Dmin) {
                    Dmin = Dcurr;
                    n1 = arr[i];
                    n2 = arr[j];

                    if (n1 > n2) {
                        max = n1;
                        min = n2;
                    } else {
                        max = n2;
                        min = n1;
                    }
                }
            }
        }
        System.out.println(Dmin + " [" + min + " " + max + "]");
    }

    public static void InsertionSort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--)
                if (less(a[j], a[j - 1]))
                    exch(a, j, j - 1);
                else break;

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


    private static void exch(int[] a, int i, int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    private static void sort(int[] a, int[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);

    }
    public static void descMergesort(int[] a)
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
    public static void Quicksort(int[] a)
    {
        shuffle(a);
        Sort(a, 0, a.length - 1);
    }


    public static void Mergesort(int[] a)
    {

        int [] aux = new int[a.length];
        sort(a,aux,0,a.length - 1);

    }

    public static void shuffle(int[] a)
    {
        int p = a.length;
        for (int i = 0; i < p; i++)
        {
            int r = uniform.nextInt(i+1);
            exch(a, i, r);
        }
    }

    public static void Sort(int[] array1, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array1, left, right);
            Sort(array1, left, pivotIndex - 1);
            Sort(array1, pivotIndex + 1, right);
        }
    }
    static Random uniform = new Random();

    private static boolean less(int v, int w)
    { return v-w < 0; }


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

    public static void descInsertionSort(int[] a)
    {
        int N = a.length;
        int temp;
        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--)
                if (less(a[j], a[j-1]))
                    exch(a, j, j-1);
                else break;

        for (int i = 0; i < N / 2; i++) {
            temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;

        }
    }



    public static void descQuicksort(int[] a)
    {
        int N = a.length;
        int temp;
        shuffle(a);
        Sort(a, 0, a.length - 1);
        for (int i = 0; i < N / 2; i++) {
            temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;

        }
    }

    public static void SelectionSortforDesc(int[] a) {
        int N = a.length;
        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1])
                    exch(a, j, j - 1);
            }
        }

        for (int i = 0; i < N / 2; i++) {
            temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;

        }
    }

}


