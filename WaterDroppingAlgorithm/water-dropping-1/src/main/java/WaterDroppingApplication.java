import java.lang.reflect.Array;
import java.util.Arrays;

public class WaterDroppingApplication {

    static class Hole{
        int data;
        double percentage;

        public Hole(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

       /* Create an Array*/
       /* Hole[][] holes=new Hole[3][3];
        holes[0][0]=new Hole(0);
        holes[0][1]=new Hole(0);
        holes[0][2]=new Hole(0);
        holes[1][0]=new Hole(0);
        holes[1][1]=new Hole(1);
        holes[1][2]=new Hole(0);
        holes[2][0]=new Hole(1);
        holes[2][1]=new Hole(0);
        holes[2][2]=new Hole(0);*/

        Hole[][] holes={
                {new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0)},
                {new Hole(1),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0)},
                {new Hole(0),new Hole(0),new Hole(1),new Hole(1),new Hole(1),new Hole(0),new Hole(0)},
                {new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0)},
                {new Hole(1),new Hole(1),new Hole(1),new Hole(0),new Hole(0),new Hole(1),new Hole(0)},
                {new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(1)},
                {new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0),new Hole(0)},
        };


        System.out.println("Print the pattern");
        WaterDroppingApplication.printPattern(holes);
        System.out.println(">>>>>>>>>>>>");

        System.out.println("Print the percentage of each hole");
        WaterDroppingApplication.getPercentage(3,holes);

        WaterDroppingApplication.printPercentage(holes);
        System.out.println(">>>>>>>>>>>>");

        System.out.println("Final Percentage of water:"+ WaterDroppingApplication.calculateFinalPercentage(holes));


    }

    static void getPercentage(int start,Hole[][] array) {

        int irow, jrow;//1
        array[0][start].percentage = 100.00;

        for (irow = 0; irow < array.length - 1; irow++) { //0
            for (jrow = 0; jrow < array.length; jrow++) { //1
                if (array[irow][jrow].percentage != 0.0) {
                    if (array[irow + 1][jrow].data == 1) {//[1,1]
                        if (jrow - 2 >= 0) {
                            if (array[irow + 1][jrow - 1].data == 1) {
                                array[irow + 2][jrow - 2].percentage = array[irow + 2][jrow - 2].percentage + array[irow][jrow].percentage / 4.0;
                                array[irow + 2][jrow].percentage = array[irow + 2][jrow].percentage + array[irow][jrow].percentage / 4.0;
                            } else {
                                array[irow + 1][jrow - 1].percentage = array[irow + 1][jrow - 1].percentage + array[irow][jrow].percentage / 2.0;
                            }

                        }
                        if (jrow + 1 < array.length - 1) {
                            if (array[irow + 1][jrow + 1].data == 1) {
                                array[irow + 2][jrow].percentage = array[irow + 2][jrow].percentage + array[irow][jrow].percentage / 4.0;
                                array[irow + 2][jrow + 2].percentage = array[irow + 2][jrow + 2].percentage + array[irow][jrow].percentage / 4.0;
                            } else {
                                array[irow + 1][jrow + 1].percentage = array[irow + 1][jrow + 1].percentage + array[irow][jrow].percentage / 2.0;
                            }
                        }
                    } else {
                        array[irow + 1][jrow].percentage = array[irow + 1][jrow].percentage+ array[irow][jrow].percentage;
                    }
                }
            }
        }
    }

    public static void printPattern(Hole[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j].data + " ");
            }

            System.out.println();
        }
    }

    public static void printPercentage(Hole[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j].percentage + " ");
            }

            System.out.println();
        }
    }

    public static double calculateFinalPercentage(Hole[][] array){
        double p=0.0;
        Hole[] percentage=array[array.length-1];

        for(Hole ele:percentage){
            p=p+ele.percentage;
        }
        return p;
    }
}
