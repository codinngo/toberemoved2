import java.util.Scanner;

public class avg{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n;

System.out.println("Enter number of elements in array\n");
n = sc.nextInt();

int[] a = new int[n];

System.out.println("Enter elements in array\n");

for(int i = 0; i<n; i++){

a[i] = sc.nextInt();

}

float count = 0;

for(int i = 0; i<n; i++){

count += a[i];

}

System.out.println("Average: " + count/n);
 
}




}