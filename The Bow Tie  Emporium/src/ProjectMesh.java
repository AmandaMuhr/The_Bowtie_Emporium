/*import java.util.ArrayList;

import java.util.Scanner;*/

public class ProjectMesh

	{

	

		public static String color;
		
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

			}

		public static void Inventory()

			{
				for (int i = 1; i < 100000000; i++)
					{
					ColorChoice();
					System.out.println(color + "AAAAAA");

					
					}
				
				}
	}