import java.util.Scanner;

public class Kotton {
	private String  poloscanie;
	private int otjim;
	private int temp;
	private String name;
	
	Scanner scanner = new Scanner(System.in);
	
	public Kotton(String name,String  poloscanie,int otjim,int temp) {
		 this. name = name;
		 this. poloscanie = poloscanie ;
		 this. otjim = otjim ;
		 this. temp = temp;
		 
		 
		 
		   System.out.println("     Тип : "  + name);
		   System.out.println("Полоскание : " + poloscanie);
		   System.out.println( "Отжим : " + otjim );
		   System.out.println( "Температура  : " + temp );
	}
	
	//полоскание 
	 public void rinsing(){
		 
		 
		 
		 int choice = scanner.nextInt();
		 switch (choice) {
		    case 1:
		    	System.out.println( "Суппер полоскание " );
		        break;
		        //Оператор break завершает только тот цикл, в котором он находится в данный момент. Если этот цикл выполняется внутри другого цикла, внешний цикл не будет остановлен.
		    case 2:
		    	System.out.println( "Без слива");
		        break;
		    default:
		    	 System.out.println("Неверный выбор");
		}
		 scanner.close();
		}
	 
	
	 public void press(){
		}
	 protected void temp(){
		}
	 protected void startPause(){
		}


	
	
	}


