using System;
using System.Linq;
using System.Runtime.CompilerServices;

namespace Basic
{
    class Program
    {
        static void Main(string[] args)
        {
             Main:
             Console.WriteLine("choose from the following");
             Console.WriteLine("1) Simple interest");
             Console.WriteLine("2) Compound interest");
             Console.WriteLine("3) area of circle");
             Console.WriteLine("4) volume of sphere");
             Console.WriteLine("5) body mass index");
             Console.WriteLine("6) bill split value per person");
             Console.WriteLine("7) gravitational force");
             Console.WriteLine("8) mass-energy equivalence");
             Console.WriteLine("9) multiplication table");
            Console.WriteLine("10) calculate the mean and median");
            Console.WriteLine("11) the geometric average of a list of numbers.");
            Console.WriteLine("12) sum and difference of two matrices");
            Console.WriteLine("13) Guessing game");

             int s = int.Parse(Console.ReadLine());

             switch (s)
             {
                 case 1:
                     //simple interest
                     Console.WriteLine("enter principal");
                     double p = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter time");
                     double t = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter rate");
                     double r = double.Parse(Console.ReadLine());


                     double SI = (p * t * r) / 100;

                     Console.WriteLine("Simple interest= " + SI);
                     break;

                 case 2:
                     //compound interest

                     Console.WriteLine("enter principal");
                     double pc = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter time");
                     double tc = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter rate");
                     double rc = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter number of times interest applied per time period");
                     double nc = double.Parse(Console.ReadLine());


                     double A = pc * (1 + (rc / nc)) * Math.Pow(nc, tc);

                     Console.WriteLine("amount =" + A);
                     double CI = A - pc;
                     Console.WriteLine("compound interest=" + CI);
                     break;

                     case 3:
                     //area of circle
                     const double Pi = 3.14;
                     Console.WriteLine("what is the radius");
                     double ra = double.Parse(Console.ReadLine());
                     double Ar = Pi * ra * ra;

                     Console.WriteLine("area of circle=" + Ar);
                     break;

                     case 4:
                     //volume of sphere
                     Console.WriteLine("what is the radius of sphere");
                     double rad = double.Parse(Console.ReadLine());
                     double V = (4f / 3f) * Pi * rad * rad * rad;

                     Console.WriteLine("volume of sphere=" + V);
                     break;

                     case 5:
                     //body mass index
                     Console.WriteLine("what is the weight in kg");
                     double wt = double.Parse(Console.ReadLine());
                     Console.WriteLine("what is the height in m");
                     double h = double.Parse(Console.ReadLine());
                     double BMI = wt / (h * h);

                     Console.WriteLine("Body mass index="+ BMI);
                     break;

                     case 6:
                     //bill split value per person
                     Console.WriteLine("enter the total bill amount");
                     double a = double.Parse(Console.ReadLine());
                     Console.WriteLine("enter the number of people");
                     double N = double.Parse(Console.ReadLine());

                     double BS = a / N;
                     Console.WriteLine("bill split value=" + BS);
                     break;

                     case 7:
                     // gravitational force
                     const double G = 6.67e-11;
                     Console.WriteLine("mass1:");
                     double m1 = double.Parse(Console.ReadLine());
                     Console.WriteLine("mass2");
                     double m2 = double.Parse(Console.ReadLine());
                     Console.WriteLine("distance between them");
                     double d = double.Parse(Console.ReadLine());

                     double F = G * (m1 * m2) / (d * d);
                     Console.WriteLine("gravitational force:" + F);
                     break;

                     case 8:
                     //mass-energy equivalence formula
                     const double c = 3e8;
                     Console.WriteLine("mass");
                     double m = double.Parse(Console.ReadLine());
                     double E = m * c * c;
                     Console.WriteLine("energy=" + E);
                     break;

                     case 9:
                       //multiplication 
            Console.WriteLine("write a number ");
            double num = double.Parse(Console.ReadLine());
            for (double i = 0; i <= 9; i++)
            {
                double mul = num * i;
                Console.WriteLine($"{num}*{i}={mul}");
            }
            break;
             

            case 10:
                // calculate mean and median
            int[] arr = new int[100];
            Console.WriteLine("how many number do you want?");
            double n = double.Parse(Console.ReadLine());
            Console.WriteLine("write the numbers");
            for(int i=0;i<n;i++)
            {
                arr[i] = Convert.ToInt32(Console.ReadLine());
            }

            /*int sum1 = 0;
            for(int k=0; k<n;k++)
            {
                sum1 += arr[k];
            }*/
            int sum = arr.Sum(); //alternative method
            Console.WriteLine("sum=" + sum);
            double mean = sum / n;
            double median = arr.Average();
            Console.WriteLine("mean=" + mean + "\nmedian=" + median);
            break;

            case 11:
            //geometric mean
            int[] arr1 = new int[100];
            Console.WriteLine("how many number do you want?");
            double no = double.Parse(Console.ReadLine());
            Console.WriteLine("write the numbers");
            for (int i = 0; i < no; i++)
            {
                arr1[i] = Convert.ToInt32(Console.ReadLine());
            }

            int product = 1;
            for (int j = 0; j < no; j++)
            {
                product = product * arr1[j];
            }

            Console.WriteLine(product);
            double gm = Math.Pow(product, 1 / no);
            Console.WriteLine("geometric mean=" + gm);
            break;

            case 12:
             Console.Write("Input the size of the square matrix : ");
            int ne = Convert.ToInt32(Console.ReadLine());

            int[,] mat1 = new int[ne, ne];
            int[,] mat2 = new int[ne, ne];
            int[,] add = new int[ne, ne];
            int[,] sub = new int[ne, ne];

            

            Console.WriteLine("enter the value of first matrix:");
            for (int i = 0; i < ne; i++)
            {
                for (int j = 0; j < ne; j++)
                {
                    Console.WriteLine("enter the value of"+ i +","+ j);
                    mat1[i,j] = Convert.ToInt32(Console.ReadLine());
                }  
            }
            Console.WriteLine("enter the value of second matrix:");
            for (int i = 0; i < ne; i++)
            {
                for (int j = 0; j < ne; j++)
                {
                    Console.WriteLine("enter the value of " + i + "," + j);
                    mat2[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("first matrix:");
            for(int i = 0; i < ne; i++)
            {
                for (int j = 0; j < ne; j++)
                {
                    Console.Write(mat1[i, j] + " ");
                }
                Console.WriteLine();
            }

            Console.WriteLine("second matrix:");
            for(int i = 0; i < ne; i++)
            {
                for (int j = 0; j < ne; j++)
                {
                    Console.Write(mat2[i, j] + " ");
                }
                Console.WriteLine();
            }


            for (int i = 0; i < ne; i++)
            {
                for (int j = 0; j < ne; j++)
                {
                    add[i, j] = mat1[i, j] + mat2[i, j];
                    sub[i, j] = mat1[i, j] - mat2[i, j];
                }
            }

            Console.Write("\nThe Addition of two matrix is : \n");
            for (int i = 0; i < ne; i++)
            {
                Console.Write("\n");
                for (int j = 0; j < ne; j++)
                    Console.Write("{0}\t", add[i, j]);
            }
            Console.Write("\n\n");

            Console.Write("\nThe subtrction of two matrix is : \n");
            for (int i = 0; i < ne; i++)
            {
                Console.Write("\n");
                for (int j = 0; j < ne; j++)
                    Console.Write("{0}\t", sub[i, j]);
            }
            Console.Write("\n\n");
            break;

            case 13:
            string choose;
            do
            {   
            var generator = new Random();
            var randNum = generator.Next(0, 10);
            Console.WriteLine("guess a number between 0-10");

                for (int i = 1; i <= 5; i++)
                {
                    int guessedNum = int.Parse(Console.ReadLine());
                    if (guessedNum == randNum)
                    {
                        Console.WriteLine("congratss");
                        goto again;
                    }
                    else if (guessedNum != randNum)
                    {
                        Console.WriteLine("fail");
                    }
                }
            again:
                Console.WriteLine("do you want to continue?(y/n)");
             choose = Console.ReadLine().ToLower();
            } while (choose == "y");

            break;
            }

             
            Console.WriteLine("\n do you want to continue? (y/n)");
             string ch = Console.ReadLine();
             if (ch == "y" || ch == "Y")
             {
                 Console.Clear();
                 goto Main;
             }
             else
             {
                 System.Environment.Exit(0);
             }



        }
    }
}

