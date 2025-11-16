import java.util.Scanner;

public class Machine {
	private static final String Котон = null;
	private static final String Норма = null;
	//самопрограмирующиися машина с начально задаными константами .
	//Определение необходимых ресурсов — чётко определить, какие ресурсы понадобятся для выполнения задач проекта.
	//Оценка доступных ресурсов — оценить, какие ресурсы доступны в данный момент (анализ текущих навыков команды, наличия оборудования и бюджета).
	//Ресурсы — это все материалы, доступные в окружающей нас среде, которые технологически достижимы, экономически целесообразны и культурно приемлемы и помогают удовлетворять потребности и желания.
	//ресурс откудато получается 
	/*Материальные — оборудование, здания, сырьё и готовая продукция.
Финансовые — денежные средства, инвестиции и кредиты.
Информационные — базы данных, программное обеспечение и технологии.
Человеческие — сотрудники с их знаниями и навыками.
Природные — земля, вода, минералы и другие природные компоненты.*/
	//начальное состояние включен выключен 
	 private boolean isPoweredOn = false;
	 //программа выбора запуск да нет меню 
	 private boolean     working = true;
	 
	 Kotton coton;
	 //программа сканирования вод текста  инструмент для чтения пользовательского ввода из консоли, файлов или строк. 
     Scanner scanner = new Scanner(System.in);
    
    //старт главного класса 
    public void start() {
    	System.out.println("Машинка включена в розетку ");
    	System.out.println();
    	System.out.println("1 - Включить машинку");
    	System.out.println(" > ");
    	 
    
		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if(number == 1) {
            System.out.println("Спасибо! Вы ввели число " + number);
            on();
		}
			else {
	            System.out.println("Неправильне число");
	           }
    
		}
             else {
                  System.out.println("Извините, но это явно не число или не то число . Перезапустите программу и попробуйте снова!");
           
        }
	
        
    
       
    //ЦЫКЛ Повторение фрагмента неопределенное количество раз
  //   while(working) {
        
}
        public void menu() {
        System.out.println("\nВыберите действие:");
        System.out.println("        Menu");
        System.out.println("2 -Hand wash ");
        System.out.println("3 -Cotton ");
        System.out.println("4 - Synthetics ");
        System.out.println("0 - Выключить");
        System.out.print("> ");
     //далее считываем при помощи метода сканирования 
        int choice = scanner.nextInt();
      //переключатель выбора метода в котором прописан выбор 
        switch (choice) {
            case 2:
            	handWash();
                break;
            case 3:
            	cotton();
                break;
            case 4:
                sunthetics();
                break;
            case 0:
                working = false;
                if (isPoweredOn) {
                    powerOff();
                }
                System.out.println("Программа завершена");
                break;
            default:
                System.out.println("Неверный выбор");
        }
        scanner.close();
    }
    //ОЗУ означает оперативную память . Это краткосрочное хранилище, которое содержит программы, запущенные в данный момент на вашем компьютере
    //освобождает память, выделенную для объектов, которые больше не используются
    
  //  scanner.close();
//}
   // Включение машинки 
   private void on() {
       if (!isPoweredOn) {
           isPoweredOn = true;
           System.out.println("  Машинка  включена.");
           menu();
       } else {
           System.out.println("машинка выключена  уже включен");
       }
       
   }
   
   public void cotton() {
	  
	// если условие истино 
	   if(!isPoweredOn) {
		   System.out.println("Машинка выключена. Сначала включите её.");
	   }else {
	      coton = new Kotton( "Котон" ,"Норма", 1000, 60);
	      
	        System.out.println("\nВыберите действие:   Корекция режима ");

	        System.out.println("1 - Полоскание");
	        System.out.println("2 - Отжим ");
	        System.out.println("3 - Температура");
	        System.out.println("4 - Старт Пауза");
	        System.out.println("0 - Выключить");
			
	        System.out.print("> ");
	     //далее считываем при помощи метода сканирования 
	        int choice = scanner.nextInt();
	      //переключатель выбора метода в котором прописан выбор 
	        switch (choice) {
	            case 1:
	            	coton.rinsing();
	                break;
	            case 2:
	           	 coton.press();
	                break;
	            case 3:
	            	coton.temp();
	                break;
	            case 4:
	               coton.startPause();
	                break;
	            case 0:
	                working = false;
	                if (isPoweredOn) {
	                    powerOff();
	                }
	                System.out.println("Программа завершена");
	                break;
	            default:
	                System.out.println("Неверный выбор");
	        }
	   }  
	   
	   scanner.close();
   }
   
   private void  handWash() {
		
		
	}
   private void sunthetics() {
   }
   
  private void  powerOff(){
   }
  
   }

