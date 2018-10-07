package Functions;

import Functions.basic.Cos;
import Functions.basic.Sin;

import java.io.*;

import static Functions.TabulatedFunctions.outputTabulatedFunction;
import static Functions.TabulatedFunctions.tabulate;
import static Functions.TabulatedFunctions.writeTabulatedFunction;

/**
 * Created by Алена on 17.09.2018.
 */
public class Test {
    private static void printTabulatedFunction(TabulatedFunction func1){
        System.out.println("Your tabulated function:");
        for(int i=0; i<func1.getPointCount(); ++i){
            System.out.println("x: "+func1.getPointX(i)+", y: "+func1.getPointY(i));
        }
    }

    public static void main(String[] args) {
        //double[] vals = {0,0.25,1,2.25,4,6.25,9};
            /*TabulatedFunction func1 = new LinkedListTabulatedFunction(0, 3, vals);
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", function value at x=0.25: " + func1.getFunctionValue(0.25));
            func1.addPoint(new FunctionPoint(3.5, 12.25));
            System.out.println("Added point (3.5 12.25)");
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", count of points: " + func1.getPointCount() + ", function value of last point: " + func1.getPointY(func1.getPointCount() - 1));
            func1.addPoint(new FunctionPoint(1.25, 1.5625));
            System.out.println("Added point (1.25 1.5625)");
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", count of points: " + func1.getPointCount() + ", function value of 3 point: " + func1.getPointY(3));
            func1.deletePoint(3);
            System.out.println("Deleted point at index 3");
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", count of points: " + func1.getPointCount() + ", function value of 3 point: " + func1.getPointY(3));
            /*func1.setPoint(4, new FunctionPoint(0.25, 0.0625));
            System.out.println("Setted point (0.25 0.0625) at index 4");
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", count of points: " + func1.getPointCount() + ", function value of 4 point: " + func1.getPointY(4));
            func1.setPoint(7, new FunctionPoint(5, 25));
            System.out.println("Setted point (5 25) at index 7");
            printTabulatedFunction(func1);
            System.out.println("left border = " + func1.getLeftDomainBorder() + ", right border = " + func1.getRightDomainBorder() +
                    ", count of points: " + func1.getPointCount() + ", function value of last point: " + func1.getPointY(func1.getPointCount() - 1));*/

            Sin s = new Sin();
            Cos c = new Cos();
            double k=0;
            System.out.println("Function value");
            for(int i=0; k < 2*Math.PI; ++i){
                k=0.1*i;
                System.out.println("x = " + k + " sin(x) = " + s.getFunctionValue(k) + ", cos(x) = " + c.getFunctionValue(k));
            }
            Function f1 = tabulate(s, 0, 2*Math.PI, 10);
            Function f2 = tabulate(c, 0, 2*Math.PI, 10);
            System.out.println("Tabulated function value");
            k=0;
            for(int i=0; k < 2*Math.PI; ++i){
                k=0.1*i;
                System.out.println("x = " + k + " sin(x) = " + f1.getFunctionValue(k) + ", cos(x) = " + f2.getFunctionValue(k));
            }

            /*FileWriter input = null;
            //FileOutputStream outputStream = null;
            File file;
            try {
                file = new File("Cos.txt");
                //file.createNewFile();
                input= new FileWriter(file);
                //outputStream = new FileOutputStream(file);
                //serializeBuilding(dwelling, outputStream);
                //outputStream.flush();
                //outputStream.close();
                writeTabulatedFunction(tabulate(c, 0, 2*Math.PI, 63), input);
                input.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }catch(Throwable e){
            System.out.println(e.getMessage());
        }*/
    }

}
