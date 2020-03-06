package customCollection;
import java.util.*;
public class CustomCollection {
	ArrayList<Elements> list=new ArrayList<Elements>();
	Scanner sc=new Scanner(System.in);
	class Elements{
		int element;
		Elements(int element){
			this.element=element;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int data[]={1,2,3,4,5,6,7,8,9,10},choice;
		CustomCollection custom=new CustomCollection();
		custom.initialize(data);
		do{
		System.out.println("\nEnter your choice:");
		System.out.println("1.Add Elements 2.Delete Elements 3.Print Elements 4.Fetch a element 5.Exit");
		choice=sc.nextInt();
		switch(choice){
			case 1:custom.addElements();break;
			case 2:custom.removeElements();break;
			case 3:custom.printElements();break;
			case 4:custom.fetchElement();break;
		}
		}while(choice<5);
	}
	public void initialize(int data[]){
		int n=data.length;
		for(int i=0;i<n;i++){
			list.add(new Elements(data[i]));
		}
	}
	public void addElements(){
		String ch;
		int e;
		do{
			System.out.println("Enter the values you want to add:");
			e=sc.nextInt();
			list.add(new Elements(e));
			System.out.println("Do you want to add more:");
			ch=sc.next();
		}while(ch.equals("Yes"));
		System.out.print("After Insertion ");
		printElements();
	}
	public void removeElements(){
		String ch;
		do{
			System.out.println("Enter element index you want to remove:");
			int e=sc.nextInt();
			list.remove(e);
			System.out.println("Do you want to delete more:");
			ch=sc.next();
		}while(ch.equals("Yes"));
		System.out.print("After Deletion ");
		printElements();
	}
	public void printElements(){
		System.out.println("The elements in the list are:");
		int n=list.size();
			for(int i=0;i<n;i++){
				Elements e=list.get(i);
				System.out.print(e.element+" ");
			}
		}
	public void fetchElement(){
		System.out.println("Enter the index:");
		int n=sc.nextInt();
		Elements e=list.get(n);
		System.out.print("The element at index "+n+" is:"+e.element);
	}
}