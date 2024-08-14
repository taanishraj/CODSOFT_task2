import java.util.Scanner;
public class sgrade {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m1,m2,m3,m4,m5,tot,choice;
            float per;
            System.out.println("STUDENT GRADE CALCULATOR");
            System.out.println("ENTER THE MARKS OF 5 SUBJECTS ATTEMPTED /100");
            m1=sc.nextInt();
            m2=sc.nextInt();
            m3=sc.nextInt();
            m4=sc.nextInt();
            m5=sc.nextInt();
            tot=m1+m2+m3+m4+m5;
            per=tot/5;
            System.out.print("OBTAINED MARKS:\t");
            System.out.print(+m1+"\t");
            System.out.print(+m2+"\t");
            System.out.print(+m3+"\t");
            System.out.print(+m4+"\t");
            System.out.print(+m5+"\t");
            System.out.print("\nTOTAL MARKS:"+tot);
            System.out.println("\nAVERAGE PERCENTAGE:"+per);
            if(per>=90){
                System.out.println("GRADE=A");
            }else if(per>=80){
                System.out.println("GRADE=B");
            }else if(per>=70){
                System.out.println("GRADE=C");
            }else if(per>=60){
                System.out.println("GRADE=D");
            }else if(per>=50){
                System.out.println("GRADE=E");
            }else if(per<50){
                System.out.println("GRADE=F");
            }
            System.out.println("Do you want to Calculate Marks of another Student?(YES-1/NO-0)");
            choice=sc.nextInt();
            switch(choice){
            case 1 -> main(args);
            case 2 -> System.exit(0);
            }

        } 
    }
}
