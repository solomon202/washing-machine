import java.util.Scanner;

public class Kotton {
	
	
	public String getPoloscanie() {
		return poloscanie;
	}

	
	public int getOtjim() {
		return otjim;
	}

	public void setOtjim(int otjim) {
		this.otjim = otjim;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	private int otjim;
	private int temp;
	private String name;
	private String  poloscanie;
	
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
		    	 String poloscanie = ("Полоскания +");
		    	setPoloscanie(poloscanie);
		        break;
		        //Оператор break завершает только тот цикл, в котором он находится в данный момент. Если этот цикл выполняется внутри другого цикла, внешний цикл не будет остановлен.
		    case 2:
		    	System.out.println( "Суппер полоскание  ");
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

	 public void setPoloscanie(String poloscanie) {
			this.poloscanie = poloscanie;
			 System.out.println(name + poloscanie);
		}
	
	
	}


