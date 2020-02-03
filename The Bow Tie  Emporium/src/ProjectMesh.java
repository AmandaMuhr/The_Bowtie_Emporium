/*import java.util.ArrayList;



import java.util.Scanner;*/



public class ProjectMesh



{







public static String color;

public static String color2;



public static void main(String[] args)



{

ColorChoice();

Inventory();







}



private static void ColorChoice()



{





int colorSelect = (int) (Math.random() * 5) + 1;

switch (colorSelect)



{



case 1:

{



color = ConsoleColors.RED_BOLD;



break;



}



case 2:

{



color = ConsoleColors.GREEN_BOLD;



break;



}



case 3:

{



color = ConsoleColors.YELLOW_BOLD;



break;



}



case 4:

{



color = ConsoleColors.BLUE_BOLD;



break;



}



case 5:

{



color = ConsoleColors.PURPLE_BOLD;



break;



}



case 6:

{



color = ConsoleColors.WHITE_BOLD;



break;



}



}



int BackColorSelect = (int) (Math.random() * 5) + 1;

switch (BackColorSelect)



{



case 1:

{



color2 = ConsoleColors.RED_BACKGROUND_BRIGHT;



break;



}



case 2:

{



color2 = ConsoleColors.GREEN_BACKGROUND_BRIGHT;



break;



}



case 3:

{



color2 = ConsoleColors.YELLOW_BACKGROUND_BRIGHT;



break;



}



case 4:

{



color2 = ConsoleColors.BLUE_BACKGROUND_BRIGHT;



break;



}



case 5:

{



color2 = ConsoleColors.PURPLE_BACKGROUND_BRIGHT;



break;



}



case 6:

{



color2 = ConsoleColors.CYAN_BACKGROUND_BRIGHT;



break;



}



}



}



public static void Inventory()



{



	boolean select = true;

		while(select)

		{

			ColorChoice();

			System.out.println(color2+color+"  :so+/-.`                              `.-/+oo:  \\r\\n");

			ColorChoice();

			System.out.println(color2+color+"  dmmmmmmmmhyo/.                  .:+shmmmmmmmmm` \\r\\n");

			ColorChoice();

			System.out.println(color2+color+" :mmmmmmmmmmmmmmmy+.          ./ymmmmmmmmmmmmmmm/ \\r\\n");

			ColorChoice();

			System.out.println(color2+color+" smmmmmmmmmmmmmmmmmmd+ ```  /hmmmmmmmmmmmmmmmmmmy \\r\\n");

			ColorChoice();

			System.out.println(color2+color+" dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm \\r\\n");

			ColorChoice();

			System.out.println(color2+color+"`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm.\\r\\n");

			ColorChoice();

			System.out.println(color2+color+"`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm-\\r\\n");

			ColorChoice();

			System.out.println(color2+color+"`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm-\\r\\n");

			ColorChoice();

			System.out.println(color2+color+" mmmmmmmmmmmmmmmmmmmm+ `...`/dmmmmmmmmmmmmmmmmmmm`\\r\\n");

			ColorChoice();

			System.out.println(color2+color+" smmmmmmmmmmmmmmmmh/`         /ymmmmmmmmmmmmmmmmh \\r\\n");

			ColorChoice();

			System.out.println(color2+color+" -mmmmmmmmmmmmmy/`              `/smmmmmmmmmmmmm: \\r\\n");

			ColorChoice();

			System.out.println(color2+color+"  smmmmmmmhs+-                      ./shmmmmmmmh  \\r\\n");

			ColorChoice();

			System.out.println(color2+color+"  `oo+/:.                                .-/+oo`  \\r\\n"+"\033[0m");

			//select = false;

			

			

		}

	

		final String ESC = "\033[";

		System.out.print(ESC + "2J" + "yeet"); 

		

		System.out.println("yeeeet?");

//	for (int i = 1; i < 2; i++)

//{

//ColorChoice();

//System.out.println("Test");

//ColorChoice();

//System.out.println("Test");

//

//

//}



}

}

