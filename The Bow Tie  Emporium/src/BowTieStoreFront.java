//Does this really work?

import java.util.ArrayList;

import java.util.Scanner;



public class BowTieStoreFront 

{

	static int colorSelect = (int) (Math.random() * 6) + 1;;

	public static String color;



	static int SizePatternSelect;

	public static String pattern;



	static ArrayList<BowTie> order = new ArrayList<BowTie>();



	public static void main(String[] args) 

	{

		Welcome();

		ColorChoice();

		Inventory();

		//BowtieDisplay();

		PatternAndSizeChoice();

		

		

	}



	private static void BowtieDisplay() 

	{

	System.out.println(ConsoleColors.WHITE_BOLD + "The bowties here are diplayed in order, from 0-14. " +  ConsoleColors.RESET);

		for (BowTie t : order) 

		{

			System.out.println();

			System.out.println(t.getImage());

			System.out.println();

		}

		System.out.println(ConsoleColors.WHITE_BOLD + "The bowties here are diplayed in order, from 0-14. " +  ConsoleColors.RESET);	

	}



	private static void PatternAndSizeChoice() 

	{

		Scanner userIntInput = new Scanner(System.in);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "Select a pattern and size:" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "0 for a small normal bowtie " + ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "1 for a medium normal bowtie " +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "2 for a large  bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "3 for a small boardered bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "4 for a medium boardered bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "5 for a large boardered bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "6 for a small striped bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "7 for a medium striped bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "8 for a large striped bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "9 for a small polka dot bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "10 for a medium polka dot bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "11 for a large polka dot bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "12 for a small swirl bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "13 for a medium swirl bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "14 for a large swirl bowtie" +  ConsoleColors.RESET);

		System.out.println();

		System.out.println();

		System.out.println();

		

		System.out.println(ConsoleColors.WHITE_BOLD + "15 to see the inventory" +  ConsoleColors.RESET);

		

		SizePatternSelect = userIntInput.nextInt();



		if (SizePatternSelect == 15)

		{

			BowtieDisplay();

			PatternAndSizeChoice();

			

		}

		

		else 

		{

			System.out.println(order.get(SizePatternSelect).getImage());

			System.out.println("That will be $"+ order.get(SizePatternSelect).getPrice() + " .");
			System.out.println("Enjoy the bow tie!");

		}

		

	}



	private static void Welcome() 

	{                                                                                                                                                                                                  



		System.out.println("                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                    ........`           ........               smmmmmh                                                                                                                  \n" + 

				"                                   -NNNNNNNNo  `::::.   NNNNNNNN               yNMMMMm                                                                                                                  \n" + 

				"                                   .hdMMMMmy/  yMMMMm   hmMMMMhy               ``mMMMm                                                                                                                  \n" + 

				"                                     `NMMMd   `NMMMMM/   hMMMh     `:oyhdhyo-    mMMMm     `:oyhdhyo/.    -+yhddhs/`   osssss:/yhdhy+`.+yhdhs/`      `:oyhdhyo-                                         \n" + 

				"                                      oMMMM-  oMMMMMMd  .MMMM:    +mMMMMMMMMNo   mMMMm    omMMMMMMMMMh  /dNMMMMMMMMNs  NMMMMMNMMMMMMMmNMMMMMMMd`    +mMMMMMMMMNo                                        \n" + 

				"                                      `NMMMy `NMMNNMMM: oMMMd    yMMMN/.`sMMMM   mMMMm   yMMMNo-.:MMMd /MMMMs-.-sMMMMs -:mMMMMs-./MMMMMo-.oMMMM+   yMMMN/.`sMMMM`                                       \n" + 

				"                                       sMMMM.+MMMssMMMd mMMM/   /MMMMo-:omMMMh   mMMMm  :MMMMo    o++: NMMMd     dMMMN`  dMMMm    MMMMh   `MMMMs  /MMMMo-:omMMMh                                        \n" + 

				"                                       .NMMMsmMMM..MMMMsMMMm`   sMMMMNNMMMMms`   mMMMm  +MMMM:        `MMMMy     yMMMM.  dMMMm    MMMMh   `MMMMy  sMMMMNNMMMMms`                                        \n" + 

				"                                        sMMMMMMMy  yMMMMMMM+    sMMMMdyyo+-`     mMMMm  /MMMMo        `MMMMd     hMMMN`  dMMMm    MMMMh   `MMMMy  sMMMMdyyo+-`                                          \n" + 

				"                                        .MMMMMMM-  -MMMMMMN`    -NMMMd:```-/s`  `NMMMm` `mMMMN/` `./o` yMMMM/` `/MMMMo   mMMMm`  `MMMMh`  .MMMMy` -NMMMd:```-/s`                                        \n" + 

				"                                         yMMMMMh    hMMMMMs      /NMMMNmmmNMMh ymMMMMMmo -dMMMMmmmNMMh``yMMMMmdmMMMNo` ymMMMMMmohmMMMMMm/mmMMMMNm: /NMMMNmmmNMMh                                        \n" + 

				"                                         -ddddd:    -ddddd.       .+hdmNNmmhs: yddddddd+  `/ydmNNmmhs:   :sdmNNNmho.   sddddddd+yddddddd/dddddddd:  .+hdmNNmmhs:                                        \n" + 

				"                                          `````      `````           ``...`    ````````      ``...``       ``...`      ```````` ```````` ````````      ``...`                                           \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                .+++++++++++++++++    `-+oyyys+:.          `+++++++++++++++++.++++++++`   /+++++++/`+++++++++++++++`                                                    \n" + 

				"                                                :MMMMMMMMMMMMMMMMN  -smMMMMMMMMMms.        .MMMMMMMMMMMMMMMMM/MMMMMMMM-   hMMMMMMMh`MMMMMMMMMMMMMMM`                                                    \n" + 

				"                                                :MMMNssMMMMNshMMMN oNMMMmyo+ohNMMMN/       .MMMMssNMMMNsyMMMM./hMMMMo:`   :/MMMMN/- /sMMMMdsssyMMMM`                                                    \n" + 

				"                                                -hhdy  MMMMh -ddhyoMMMMy.     -mMMMN-      .hhdh  mMMMm `ddhh  oMMMM-       NMMMm    /MMMM+    hhyy`                                                    \n" + 

				"                                                       MMMMh     `NMMMm`       /MMMMy             mMMMm        oMMMM/-------MMMMm    /MMMMo------.                                                      \n" + 

				"                                                       MMMMh     -MMMMy        `MMMMd             mMMMm        oMMMMMMMMMMMMMMMMm    /MMMMMMMMMMMs                                                      \n" + 

				"                                                       MMMMh     -MMMMy        `MMMMd             mMMMm        oMMMMNmmmmmmmMMMMm    /MMMMNmmmmmmo                                                      \n" + 

				"                                                       MMMMh     `MMMMm        /MMMMs             mMMMm        oMMMM-      `NMMMm    /MMMM+    ````                                                     \n" + 

				"                                                       MMMMh      sMMMMs`     -mMMMN.             mMMMm        oMMMM-       NMMMm    /MMMM+    smdd/                                                    \n" + 

				"                                                    ./+MMMMm//`   `yMMMMmy++oyNMMMN:           .//NMMMN+/`   ./hMMMMo/    :/MMMMN/-`/sMMMMdyyyymMMMo                                                    \n" + 

				"                                                    sMMMMMMMMM.     /dNMMMMMMMMNms.            +MMMMMMMMM:   +MMMMMMMM`   mMMMMMMMy-MMMMMMMMMMMMMMMo                                                    \n" + 

				"                                                    :+++++++++`       ./osyyys+-`              -+++++++++.   -++++++++    ++++++++:.+++++++++++++++-                                                    \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                        ``                                                                                                                              \n" + 

				"                                            hmmmmmmmmmmdyo:        :sdmNMMNmy+.  .mmmmmmmm+   ````    dmmmmmmmmmmmmmmmmmmmmmmmd/mmmmmmmm`hmmmmmmmmmmmmmm:                                               \n" + 

				"                                            dNMMMMMMMMMMMMMh`    +mMMMMMMMMMMMNs`.NMMMMMMmo  +NNNNd   mMMMMMNNMMMMMMMMMMMMMMMMN+NMMMMMNm`dNMMMMMMMMMMMMM/                                               \n" + 

				"                                            `.MMMMh```-yMMMMo   hMMMMh:.`.:yMMMMd``.NMMMh`   mMMMMM:  `sMMMm`:MMMN--MMMMd-+MMMN `yMMMM-` `.MMMMd----mMMM/                                               \n" + 

				"                                             `MMMMh    /MMMMo  oMMMMo       oMMMMs  sMMMM.  /MMMMMMh  `NMMM+ `:///  MMMMh `+//:  yMMMM.   `MMMMh    :/::`                                               \n" + 

				"                                             `MMMMmssydMMMMs`  NMMMN`       `NMMMN  .MMMMs  mMMMMMMM- /MMMN`        MMMMh        yMMMM.   `MMMMmsssssso                                                 \n" + 

				"                                             `MMMMMMMMMMMMNs. `MMMMd         mMMMM`  yMMMN`:MMMhyMMMh dMMMo         MMMMh        yMMMM.   `MMMMMMMMMMMm                                                 \n" + 

				"                                             `MMMMd////sNMMMN- MMMMN         NMMMN   .MMMMohMMM:-MMMM/MMMN`         MMMMh        yMMMM.   `MMMMmoooooo+                                                 \n" + 

				"                                             `MMMMh     +MMMMy hMMMM:       /MMMMy    yMMMNMMMd  hMMMNMMMs          MMMMh        yMMMM.   `MMMMh    ./::-                                               \n" + 

				"                                             `MMMMh   `-hMMMMo .NMMMN+.   `+NMMMm.    -MMMMMMM/  :MMMMMMM.          MMMMh        yMMMM.   `MMMMd....+MMMh                                               \n" + 

				"                                            hdMMMMMmmmNNMMMMy`  -dMMMMNmdmNMMMMh.      hMMMMMm    dMMMMMh        /hdMMMMNdh.   /hNMMMMdy ydMMMMMNNNNNMMMd                                               \n" + 

				"                                            NNNNNNNNNNNmdho-     `:ymNMMMMMNds:`       :NNNNN+    /NNNNN-        oNNNNNNNNN.   oNNNNNNNm NNNNNNNNNNNNNNNh                                               \n" + 

				"                                            ...........``           `.-::--.`           .....      .....         `.........    `........ ...............`                                               \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                    .--------------` `-------         .------. .-----------.`          .-:/++/-.      ------------.`     `--------`--------`  `-------- -------`         -------                        \n" + 

				"                    hMMMMMMMMMMMMMM+ +MMMMMMN-       `mMMMMMMs dMMMMMMMMMMMNdy:     ./hmMMMMMMMmh/`   dMMMMMMMMMMNNdy:   /MMMMMMMM+MMMMMMMM-  /MMMMMMMN NMMMMMMy        oMMMMMMM`                       \n" + 

				"                    +yMMMMMddddNMMM+ -ymMMMMMm`      yMMMMMNs: +yMMMMNdddmNMMMMs   /mMMMNdhhdmMMMMd.  oyMMMMNdddmNMMMMs  -smMMMMhs-sdMMMMhs.  -smMMMMso syMMMMMM/      :NMMMMMyo                        \n" + 

				"                      MMMMd    smmm/   yMMMMMMy     +MMMMMMd     MMMMh   `-dMMMM: /MMMMd:`   .+MMMMm`  `MMMMd   `.mMMMM`   oMMMM:   +MMMM:      sMMMM    -MMMMMMN-    `mMMMMMM-                         \n" + 

				"                      MMMMm````.-.`    dMMMMMMM+   -NMMMMMMm     MMMMh     oMMMM/`NMMMm`       sMMMMo  `MMMMd    `mMMMN`   oMMMM:   +MMMM:      sMMMM    /MMMMMMMd`   hMMMMMMM:                         \n" + 

				"                      MMMMMmmmmmmd     mMMMdMMMN- `mMMNdMMMM     MMMMd..../NMMMN.:MMMMs        .MMMMh  `MMMMm//+odMMMm/    oMMMM:   +MMMM:      sMMMM    +MMMNmMMMs  oMMMhMMMM+                         \n" + 

				"                      MMMMMNNNNNNN     NMMM+sMMMm`yMMM+oMMMM`    MMMMMmmNMMMMMd: /MMMMs        `MMMMh  `MMMMMMMMMMMMs.     oMMMM:   +MMMM:      sMMMM    sMMMm-NMMM/:MMMd.MMMMo                         \n" + 

				"                      MMMMm-------    `MMMM:`dMMMmMMMy /MMMM-    MMMMMNNNmmhs:`  -MMMMh        :MMMMs  `MMMMNssyNMMMm-     oMMMM:   +MMMM:      sMMMM    yMMMh /MMMNmMMN- NMMMy                         \n" + 

				"                      MMMMd    -yyyo  -MMMM- .NMMMMMm` :MMMM:    MMMMd...`        dMMMM/      `dMMMM-  `MMMMd   -NMMMm.    oMMMM:   +MMMM+      hMMMM    dMMMy  sMMMMMM/  mMMMh                         \n" + 

				"                    `.MMMMm++++sMMMm .+MMMM:. :MMMMN- .:MMMMo.``.MMMMd..`         .mMMMMy/--:+mMMMN+  `-MMMMd.` `/MMMMd-.`.yMMMM/.  .NMMMNo:--/yMMMMy  `.NMMMy.``dMMMMs `.dMMMm..                       \n" + 

				"                    mMMMMMMMMMMMMMMm-MMMMMMMM` +hhh/ `MMMMMMMM+mMMMMMMMMh          .sNMMMMMMMMMMNh:   NMMMMMMMd +MMMMMMMMsMMMMMMMM   :mMMMMMMMMMMMNs`  dMMMMMMMo .yhhy` yMMMMMMMm                       \n" + 

				"                    shhhhhhhhhhhhhhs.hhhhhhhh        `hhhhhhhh:yhhhhhhhho            ./shmmmmdy+-     yhhhhhhho /hhhhhhhh+hhhhhhhh    `:ohdmmmdhs/.    shhhhhhh/        +hhhhhhhs                       \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        ");

		

		

		

		System.out.println("                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                          .:/:::::-`-:/:::::.`::::::::`.:::::::-`-/::::::. :/::::::.`::::::::`.:::::::-`-:::::::.                                                       \n" + 

				"                                                        `+mMMMMMMh-+NMMMMMMh-sNMMMMMMh-yMMMMMMMy.hMMMMMMMy.hMMMMMMMs.hMMMMMMMs-hMMMMMMNo:hNMMMMMm+`                                                     \n" + 

				"                                                       -yNMMMMMNy:sNMMMMMMd:oNMMMMMMN+:mMMMMMMMs.dMMMMMMMm-yMMMMMMMN//NMMMMMMMo-dMMMMMMMy-sNMMMMMMh:                                                    \n" + 

				"                                                     .oNMMMMMMNo:hMMMMMMMm/+NMMMMMMMy-yMMMMMMMMo.dMMMMMMMN/oNMMMMMMMy.dMMMMMMMN+-mMMMMMMMd-/NMMMMMMNo.                                                  \n" + 

				"                                                    :dMMMMMMMm/:dMMMMMMMm//mMMMMMMMN+/mMMMMMMMM++NMMMMMMMM//NMMMMMMMM/:NMMMMMMMN/-NMMMMMMMN+:mMMMMMMMm/                                                 \n" + 

				"                                                  .yNMMMMMMMd-+NMMMMMMMN+:mMMMMMMMMh.yMMMMMMMMm:sMMMMMMMMM+.mMMMMMMMMd.hMMMMMMMMN-:MMMMMMMMMo.hMMMMMMMMy.                                               \n" + 

				"                        ``                      `+NMMMMMMMMy.yMMMMMMMMNo-dMMMMMMMMm/+NMMMMMMMMh-yMMMMMMMMMs`dMMMMMMMMM/.MMMMMMMMMN./MMMMMMMMMh-oMMMMMMMMm+`                        ``                   \n" + 

				"                    .::+dMy:::.                -hMMMMMMMMN+-dMMMMMMMMMs.dMMMMMMMMMh.yMMMMMMMMMy.yMMMMMMMMMd-dMMMMMMMMMN`yMMMMMMMMMm-+MMMMMMMMMm:/mMMMMMMMMd:`                 .-:-hMN/-:-`              \n" + 

				"                 -+sNMMMMMMMMMmo-`           .sNMMMMMMMMm:/NMMMMMMMMMy`hMMMMMMMMMm:+MMMMMMMMMMs.hMMMMMMMMMN-sMMMMMMMMMMo.NMMMMMMMMMd-oMMMMMMMMMm+:dMMMMMMMMNs.             `:sdMMMMMMMMMNy/.            \n" + 

				"               `odddNNmmmmmmdNmmdy+`       `/dMMMMMMMMMh-oNMMMMMMMMMy`hMMMMMMMMMMh-dMMMMMMMMMMo/mMMMMMMMMMM:/NMMMMMMMMMM`+MMMMMMMMMMh-sMMMMMMMMMNs:yMMMMMMMMMm+           +hdmNNmmmmmmmmNmdhy`          \n" + 

				"               `+-``//```````s```/+`      .yNMMMMMMMMNs-yNMMMMMMMMMh.sMMMMMMMMMMN./MMMMMMMMMMN/oMMMMMMMMMMM:.NMMMMMMMMMMy.mMMMMMMMMMMy-yMMMMMMMMMMh-oMMMMMMMMMMd-         +:``:+.``````/o```y`          \n" + 

				"                s:  .h       s   :/     `oNMMMMMMMMMN+:hMMMMMMMMMMd-sMMMMMMMMMMMs.NMMMMMMMMMMd:sMMMMMMMMMMMo`NMMMMMMMMMMN-/MMMMMMMMMMMs-hMMMMMMMMMMd::NMMMMMMMMMNo`       .s  `/.      --  `o`          \n" + 

				"                ::` `d      ./  ./.    :dMMMMMMMMMMd//mMMMMMMMMMMd:+NMMMMMMMMMMN`oMMMMMMMMMMMh.sMMMMMMMMMMMh.mMMMMMMMMMMMh.hMMMMMMMMMMNo-dMMMMMMMMMMN/-dMMMMMMMMMMd/`     `s`  +:     .:`  +-           \n" + 

				"                `o. `s`     o.  -o   .sNMMMMMMMMMMh-oNMMMMMMMMMMm/+mMMMMMMMMMMM+.MMMMMMMMMMMMy.yMMMMMMMMMMMm.yMMMMMMMMMMMN:/NMMMMMMMMMMN+:mMMMMMMMMMMMs-yMMMMMMMMMMNy-     -/  o/     -o  `o.           \n" + 

				"                 s.  :-     s` `:: `+mMMMMMMMMMMMs-yMMMMMMMMMMMm+/mMMMMMMMMMMMm`yMMMMMMMMMMMMy:dMMMMMMMMMMMM-+MMMMMMMMMMMMh.yMMMMMMMMMMMN/:NMMMMMMMMMMMh:oNMMMMMMMMMMm+`   .o  ::`    :s  ::`           \n" + 

				"                 -:  .s     y` .s `/yhhhhhhhhhhh/`oyyhhhhhhhhhy+.oyyyhhhhhhhhh:`hhhhhhhhhhhhy/:yhhhhhhhhhhhh..hhhhhhhhhhhys-:yhhhhhyyyhhhs.:hhhhhhhhhhhyo./yhhhhhhhhhhy+`  `/` `/.   `::  o-            \n" + 

				"                  h` .h    -/  -+`oddddddddddddy.sddddddddddddy./ddddhhddddddd.:ddddddddddddh:/hdddddddddddd-`dddddddddddddo.sddddhddddddd+ mddddddddddddo`oddddddddddddy`  -/  o-   `+. ./`            \n" + 

				"                  +. .+`   o- `o`.yMMMMMMMMMMMMd.hMMMMMMMMMMMMd.oMMMMMMMMMMMMM-/MMMMMMMMMMMMm/+NMMMMMMMMMMMM:`MMMMMMMMMMMMMy-dMMMMMMMMMMMMs`MMMMMMMMMMMMMy.yMMMMMMMMMMMMN`  -+  s:   .y  +:             \n" + 

				"                  `o`./-```y-`-s .yMMMMMMMMMMMMd.hMMMMMMMMMMMMd.oMMMMMMMMMMMMM-/MMMMMMMMMMMMm/+NMMMMMMMMMMMM:`MMMMMMMMMMMMMy-dMMMMMMMMMMMMs`MMMMMMMMMMMMMy`yMMMMMMMMMMMMN`  `:-`+:```:h`.+-             \n" + 

				"                   +yhddhhhmdhs. .yMMMMMMMMMMMMd.hMMMMMMMMMMMMd.oMMMMMMMMMMMMM-/MMMMMMMMMMMMm/+NMMMMMMMMMMMM:`MMMMMMMMMMMMMy-dMMMMMMMMMMMMs`MMMMMMMMMMMMMy`yMMMMMMMMMMMMN`   .ohddhhhdmhy:              \n" + 

				"                    .:/osss/::`  .yMMMMMMMMMMMMd.hMMMMMMMMMMMMd.oMMMMMMMMMMMMM-/MMMMMMMMMMMMm/+NMMMMMMMMMMMM:`MMMMMMMMMMMMMy-dMMMMMMMMMMMMs`MMMMMMMMMMMMMy`yMMMMMMMMMMMMN`    `-:ossss::.               \n" + 

				"                      .hMMM:     .yMMMMMMMMMMMMd.hMMMMMMMMMMMMd.oMMMMMMMMMMMMM-/MMMMMMMMMMMMm/+MMMMMMMMMMMMM:`MMMMMMMMMMMMMy-dMMMMMMMMMMMMs`MMMMMMMMMMMMMy`yMMMMMMMMMMMMN`       yMMMd                  \n" + 

				"                      .hMMM:     `oMMMMMMMMMMMMy`oMMMMMMMMMMMMh`+NMMMMMMMMMMMm.-MMMMMMMMMMMMm-:mMMMMMMMMMMMN- NMMMMMMMMMMMNo.yMMMMMMMMMMMM+ dMMMMMMMMMMMMs`sMMMMMMMMMMMMh`       hMMMd                  \n" + 

				"                      .hMMM:      -hMMMMMMMMMNh- `yNMMMMMMMMMd: .sNMMMMMMMMMd:  sNMMMMMMMMMm+ `+mMMMMMMMMMNo` /mMMMMMMMMMNs` :dMMMMMMMMMNy. .dMMMMMMMMMMh- -hMMMMMMMMMMd-        hMMMd                  \n" + 

				"                      .hMMM:       `/hmNNNNmh/. - `/ymNNNNmdo. ```/ymNNNNNdo- -  -ymNNNNNmo- `. -omNNNNNds:``` -sdmNNNNms/``. .+dmNNNNmy/` : .+hmNNNNmh+``` `+hmNNNNmh+.         hMMMd                  \n" + 

				"                      .hMMM:         ``-::-.`  -d:  `.-::-.`  -ho`  `.::-.`  `do   `.::-.`  `ss`  `.-:-.`  `sh`  `.-:-.`  `+y-  `.-::.``  :m.  `.-::-.`  :h/  ``-::-.`           hMMMd                  \n" + 

				"                      .hMMM:                 .+mMNo.        `:dMNs-`       `/dMMy.`       `:hMMh:`       `-yNMh:`       `-yNMd/`        .sNMN+.        .+mMm+.                   hMMMd                  \n" + 

				"                      .hMMM:            :::+ymMMMMMNy+:--:/ydMMMMMNho::::/sdMMMMNNho:---/ohMMMMMMds/::::ohNMMNNmho:-.--/ymmNNNNhs:-.--/sdNNNNNds/-.--:ymMMMMMmh+:-               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMMMNMMNMMMNMMMMMMMMMMMMMMMMMMMMMMm:/oooooooo+oo+ooooooooooooooooooooooo+ss-dMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMNyhyyyysyhyyyyyyyyyyyyyyyyyyyyyhhyyyyyhyyyyyyyyyyyyyyymMMMMMd`sNNNNNNNNNMMNNNNNNNNNNNMMMMMNNNNNNNMNNm`hMMMMMNMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMNMm-hy..` .-......`` ..`````..``..-.....-...` `......` `sMMMMMh`hMMMMNdhhdmmdddhdmmmMNhdddhdmmdddmddmMm`hMNMMNMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMNMd`NN                                             dm-``sMMNMMh.hNNMMs             -my            ::hMm`yMMNMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMNMm-Nm                                             dM-``sMMMMMd`hMMNMo             :mo            .:hMm.dMNMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMh`Md                                             hM. `sMMMMMd`sMMNMs             :m+            .:hMm`hMMNNMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMNMd.Nd                                             hM. `sMMMMMd.yNNNMs             /mo            -:hMm`hMNMMNMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMNMd-Md                                             hM` `sMNMMMd`yMNNMo             /mo            .:hMd`hMMNMNNMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMh`Md                                             hM` `sMMMMMd`yMMMM+             :m+            .:dMd`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMMo            `/mo            ./dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMMdyyyyyyyyyyyyydNmyyyyyyyyyyyyhdNMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`ymyhmy/////////////:my/////////////+dMd`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`s+dhs+.............:mo............-/hMd`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`ydmmm+             /mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`Md                                             hM` `yMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMd`MN+++++++++++++++++++++++++++++++++++++++++++++mM+/`sMMMMMm`yMMMM+             :mo            .:hMh`hMMMMMMMMMMd               hMMMd                  \n" + 

				"                      .hMMM:           `MMMMMMMMh`sssssssssssssssssssssssssssssssssssssssssssssssssss`sMMMMMm`yMMMM+             :mo            .:hMh`hMMMMMMMMMMd               yNMMd                  \n" + 

				"                    +++syyyo+/         `MMMMMms//+syyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy+//smMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd            -++syyys+/-               \n" + 

				"                    MMMMMMMMMN         `MMMMMs`-mNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd:`yMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `MMMMMmhhmNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhNMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm`yMMMM+             :mo            .:dMh`hMMMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm`yMMMMy////////////+sNy////////////+smMh`hMMMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm`yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd`hMMMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssso`/ysssssssssssssssssssssssssssssssssssso`+sssssssssso            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy.:////////////////////////////////////////.syyyyyyyyyo            oMMMMMMMMNo               \n" + 

				"                    MMMMMMMMMN         `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNN:dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm-NNMMMMMMMMd            oMMMMMMMMNo               \n" + 

				"                .://yyyyyyyyyy//:`     `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMyoyosssssssssssssssssssssssssssssssssssssssssosomMMMMMMMd         ://oyyyyyyyyyo//.            \n" + 

				"               ./ssssssssssssssso/.    `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMsyNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmohMMMMMMMd       `:osssssssssssssss/:`          \n" + 

				"               :oooooooooooooooooo:    `sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss:/sssssssssssssssssssssssssssssssssssssssssssso/+sssssss+       .ooooooooooooooooooo`          \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        \n" + 

				"                                                                                                                                                                                                        ");

			



	}



	private static void ColorChoice() 

	{

		Scanner userIntInput = new Scanner(System.in);

		System.out.println(ConsoleColors.WHITE_BOLD + "Choose a color:");

		System.out.println();

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "1 for red");

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "2 for green");

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "3 for yellow");

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "4 for blue");

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "5 for purple");

		System.out.println();

		System.out.println(ConsoleColors.WHITE_BOLD + "6 for white");

		System.out.println();



		colorSelect = userIntInput.nextInt();



		switch (colorSelect)



		{



		case 1: {

			color = ConsoleColors.RED_BOLD;

			break;

		}



		case 2: {

			color = ConsoleColors.GREEN_BOLD;

			break;

		}



		case 3: {

			color = ConsoleColors.YELLOW_BOLD;

			break;

		}



		case 4: {

			color = ConsoleColors.BLUE_BOLD;

			break;

		}



		case 5: {

			color = ConsoleColors.PURPLE_BOLD;

			break;

		}



		case 6: {

			color = ConsoleColors.WHITE_BOLD;

			break;

		}

		

	}

	}



	public static void Inventory() 

	{



		order.add(new BowTie("White", "Small", 4.25,

				   color+ "  :so+/-.`                              `.-/+oo:  \r\n"

			      +color+ "  dmmmmmmmmhyo/.                  .:+shmmmmmmmmm` \r\n"

			      +color+ " :mmmmmmmmmmmmmmmy+.          ./ymmmmmmmmmmmmmmm/ \r\n"

			      +color+ " smmmmmmmmmmmmmmmmmmd+ ```  /hmmmmmmmmmmmmmmmmmmy \r\n"

			      +color+ " dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm \r\n"

			      +color+ "`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm.\r\n"

			      +color+ "`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm-\r\n"

			      +color+ "`Nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm-\r\n"

			      +color+ " mmmmmmmmmmmmmmmmmmmm+ `...`/dmmmmmmmmmmmmmmmmmmm`\r\n"

			      +color+ " smmmmmmmmmmmmmmmmh/`         /ymmmmmmmmmmmmmmmmh \r\n"

			      +color+ " -mmmmmmmmmmmmmy/`              `/smmmmmmmmmmmmm: \r\n"

			      +color+ "  smmmmmmmhs+-                      ./shmmmmmmmh  \r\n"

			      +color+ "  `oo+/:.                                .-/+oo`  \r\n"  +  ConsoleColors.RESET));



		order.add(new BowTie("White", "Medium", 5.25,

				"" + color + "`````````//:-```````````````````````````````````````````-://````````````\r\n"

				  +color+ "```````````+mmmddhs+:-.`````````````````````````````.-:+shddmmm/```````````\r\n"

				  +color+ "```````````+mmmmmmmmmdhy+-```````````````````````:+yhdmmmmmmmmm:```````````\r\n"

				  +color+ "```````````/mmmmmmmmmmmmmdy/.`````````````````./ydmmmmmmmmmmmmm-```````````\r\n"

				  +color+ "```````````+mmmmmmmmmmmmmmmmho-`````````````-odmmmmmmmmmmmmmmmm:```````````\r\n"

				  +color+ "```````````smmmmmmmmmmmmmmmmmmdy:....```../ydmmmmmmmmmmmmmmmmmm+```````````\r\n"

				  +color+ "``````````.hmmmmmmmmmmmmmmmmmmmmmdhhhhhhhdmmmmmmmmmmmmmmmmmmmmmy```````````\r\n"

				  +color+ "``````````-mmmmmmmmmmmmmmmNNNmmmmNmmmmmmmmNmmmNNNmmmmmmmmmmmmmmd```````````\r\n"

				  +color+ "``````````/mmmmmmmmmmmmmNNNNNNNNNNmmmmmmmmNNNNNNNNNmmmmmmmmmmmmm-``````````\r\n"

				  +color+ "``````````/mmmmmmmmmmmmmmNNNNNNNNNmmmmmmmmNNNNNNNNmmmmmmmmmmmmmm:``````````\r\n"

				  +color+ "``````````/mmmmmmmmmmmmmNNNNmmmmmNmmmmmmmmmmmmmNNNNmmmmmmmmmmmmm-``````````\r\n"

				  +color+ "``````````-mmmmmmmmmmmmmmmmmmmmmdyydddhhhhmmmmmmmmmmmmmmmmmmmmmd```````````\r\n"

				  +color+ "``````````.hmmmmmmmmmmmmmmmmmmdy:``.---.../ydmmmmmmmmmmmmmmmmmmy```````````\r\n"

				  +color+ "```````````smmmmmmmmmmmmmmmdho-````````````.:ohdmmmmmmmmmmmmmmm+```````````\r\n"

				  +color+ "```````````+mmmmmmmmmmmmdho:``````````````````.:ohdmmmmmmmmmmmm:```````````\r\n"

				  +color+ "```````````/mmmmmmmmdds+-````````````````````````.:+yddmmmmmmmm-```````````\r\n"

				  +color+ "```````````+mmmddhs+:.```````````````````````````````.:+shddmmm:```````````\r\n"

				  +color+ "```````````-++/:.`````````````````````````````````````````-:/+/.```````````\r\n"

				  +color+ "```````````````````````````````````````````````````````````````````````````" +  ConsoleColors.RESET));



		order.add(new BowTie("White", "Large", 6.25, "" + color

		  +color+ "````````````````````````````````````````````````````````````````````````````````````````````````````\r\n"

		  +color+ "```````````````-syyo/:..````````````````````````````````````````````````````.-:/oyys.```````````````\r\n"

		  +color+ "``````````````.smmmmmmdhys+:..````````````````````````````````````````..:+syhdmmmmmmo```````````````\r\n"

		  +color+ "``````````````.smmmmmmmmmmmmdhs+:.````````````````````````````````.:+shdmmmmmmmmmmmm+```````````````\r\n"

		  +color+ "```````````````+mmmmmmmmmmmmmmmmmho-````````````````````````````:shmmmmmmmmmmmmmmmmm:```````````````\r\n"

		  +color+ "```````````````+mmmmmmmmmmmmmmmmmmmmy/.``````````````````````.+ymmmmmmmmmmmmmmmmmmmm:```````````````\r\n"

		  +color+ "```````````````ommmmmmmmmmmmmmmmmmmmmmdo-``````````````````-odmmmmmmmmmmmmmmmmmmmmmm/```````````````\r\n"

		  +color+ "``````````````.ymmmmmmmmmmmmmmmmmmmmmmmmds:`````````````./ymmmmmmmmmmmmmmmmmmmmmmmmmo```````````````\r\n"

		  +color+ "``````````````.dmmmmmmmmmmmmmmmmmmmmmmmmmmmh++++//////oohmmmmmmmmmmmmmmmmmmmmmmmmmmmh```````````````\r\n"

		  +color+ "``````````````:mmmmmmmmmmmmmmmmmmmmmmmmmmmmmNmmmmmmmmmmmNmmmmmmmmmmmmmmmmmmmmmmmmmmmm.``````````````\r\n"

		  +color+ "``````````````+mmmmmmmmmmmmmmmmmmmmNNmmmmmmmNmmmmmmmmmmmNmmmmmmNNmmmmmmmmmmmmmmmmmmmm:``````````````\r\n"

		  +color+ "`````````````.smmmmmmmmmmmmmmmmNNNNNNNNNNNNNNmmmmmmmmmmmNNNNNNNNNNNNNmmmmmmmmmmmmmmmm+``````````````\r\n"

		  +color+ "`````````````.ymmmmmmmmmmmmmmmmmmmmmNNNNNNNNNmmmmmmmmmmmNNNNNNNNmmmmmmmmmmmmmmmmmmmmms``````````````\r\n"

		  +color+ "`````````````.hmmmmmmmmmmmmmmmmmNNNNNNNNNmmmNmmmmmmmmmmmNmmNNNNNNNNNmmmmmmmmmmmmmmmmmy``````````````\r\n"

		  +color+ "`````````````.ymmmmmmmmmmmmmmmmNNNNNNmmmmmmmNmmmmmmmmmmmmmmmmmmNNNNNNmmmmmmmmmmmmmmmms``````````````\r\n"

		  +color+ "`````````````.smmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdmmmdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm+``````````````\r\n"

		  +color+ "``````````````/mmmmmmmmmmmmmmmmmmmmmmmmmmmmy:-+ossooo+/+hmmmmmmmmmmmmmmmmmmmmmmmmmmmm-``````````````\r\n"

		  +color+ "``````````````-dmmmmmmmmmmmmmmmmmmmmmmmmmy:`````````````./ymmmmmmmmmmmmmmmmmmmmmmmmmh```````````````\r\n"

		  +color+ "``````````````.ymmmmmmmmmmmmmmmmmmmmmmho-`````````````````.:ohmmmmmmmmmmmmmmmmmmmmmms```````````````\r\n"

		  +color+ "``````````````.smmmmmmmmmmmmmmmmmmmho-.``````````````````````.:shmmmmmmmmmmmmmmmmmmm+```````````````\r\n"

		  +color+ "```````````````ommmmmmmmmmmmmmmdy+-.````````````````````````````.:oydmmmmmmmmmmmmmmm:```````````````\r\n"

		  +color+ "```````````````+mmmmmmmmmmmdhs/-```````````````````````````````````.-/shdmmmmmmmmmmm:```````````````\r\n"

		  +color+ "```````````````ommmmmmmdyo/-.``````````````````````````````````````````.:/shdmmmmmmm/```````````````\r\n"

		  +color+ "```````````````+yyyyo/:.```````````````````````````````````````````````````.-:+oyyyy:```````````````\r\n"

		  +color+ "`````````````````.````````````````````````````````````````````````````````````````.`````````````````" +  ConsoleColors.RESET));



		order.add(new BowTie("Black", "Small", 8.25,

				"" + color + "                                                 \r\n"

				  +color+ " .o::::////:-.                      .-:////::::o. \r\n"

				  +color+ " s`        `.://+/.            ./+//:.`        `s \r\n"

				  +color+ ".+               `/s:        :s/`               +.\r\n"

				  +color+ "+.                  /y/:::-:y/                  .+\r\n"

				  +color+ "s                    +`     .                    s\r\n"

				  +color+ "s                    o      -                    s\r\n"

				  +color+ "s                  `.s      o.`                  s\r\n"

				  +color+ "s          `-:::---` //...-+/ `---:::-.          s\r\n"

				  +color+ "/-         ```      `s+..-.+s.      ```         -/\r\n"

				  +color+ "`o                `+o.      .o+`                o`\r\n"

				  +color+ " +-            -/+/.          `/++-            -+ \r\n"

				  +color+ "  s`     `-////-                  -////-`     `s  \r\n"

				  +color+ "  .o::///:.                            .:///::o.  \r\n"

				  +color+ "                                                  " +  ConsoleColors.RESET));



		order.add(new BowTie("Black", "Medium", 9.25,

				"" + color + "                                                                         \r\n"

				  +color+ "  `++++++///:-..`                                         ``.-:://++++++`  \r\n"

				  +color+ "  o+``````..-:/++oo++/:.                           .-/++ooo+/:-..``````+o  \r\n"

				  +color+ " -h`              ``.-/+so/-                   -/oso/-.```             `h- \r\n"

				  +color+ " s/                     `.:oy/`             `/ys/.`                     /s \r\n"

				  +color+ "`d`                         .oh/`         `/ho.                         `d`\r\n"

				  +color+ ":y                            -sh/:/++/:-/hs-                            y:\r\n"

				  +color+ "o+                              s/.``````-/`                             +o\r\n"

				  +color+ "h-                              h         .                              -h\r\n"

				  +color+ "d`                             `d         :                              `d\r\n"

				  +color+ "d`                             `d         s`                             `d\r\n"

				  +color+ "h.                        `..--.d         d---..`                        .h\r\n"

				  +color+ "s/               `..--:://:-.`  o+..```.-os  `.-://:::-..`               :s\r\n"

				  +color+ ":s              `-::::-.`      `+d+///+/od+`      `.--:::-`              s:\r\n"

				  +color+ "`d`                           .sy-       -yy-                           `d`\r\n"

				  +color+ " o+                         .+y/`         `/yo.                         +o \r\n"

				  +color+ " `h`                    `./os/`             `/so/.`                    `h` \r\n"

				  +color+ "  +o                `.:+so/.                   ./os+:.`                o+  \r\n"

				  +color+ "   y:         ``.-/ooo/-`                         `-/+oo/:.``         :y   \r\n"

				  +color+ "   .h.```..:/+o++:-`                                   `-:/+o+/:-.```.h.   \r\n"

				  +color+ "    -o+++//-.`                                               `.-://++o-    \r\n"

				  +color+ "                                                                           " +  ConsoleColors.RESET));

		

		order.add(new BowTie("Black", "Large", 10.25, "" + color

		  +color+ "                                                                                                  \r\n"

		  +color+ "    -++++//::--.```                                                              ```..--:///+++-    \r\n"

		  +color+ "   :d/---::/++ooossooo+/:-.`                                            `..-:++oosssoo++//:---/d/   \r\n"

		  +color+ "  .d/            ``.--:/oossso+:.`                                `.:+osssso+:--.``            /d.  \r\n"

		  +color+ "  oh                       `.-/oyys/.`                        `./syys/:.``                      ho  \r\n"

		  +color+ " .d:                            `.:shy+.                    ./yhs/.`                            :d. \r\n"

		  +color+ " /d`                                `/ydo.                .+hy/.                                `d/ \r\n"

		  +color+ " yo                                   `:hdo.            .+dh/`                                   oy \r\n"

		  +color+ ".d:                                     `+dd+:+oosoo+/-+dd+`                                     :d`\r\n"

		  +color+ ":d`                                       .hs:.```````-+o.                                       `d:\r\n"

		  +color+ "oy                                        -h            -                                         yo\r\n"

		  +color+ "yo                                        :h            .`                                        oy\r\n"

		  +color+ "d/                                        /h            :`                                        /d\r\n"

		  +color+ "m/                                        /h            o-                                        /d\r\n"

		  +color+ "d/                                       .od            y+.                                       +h\r\n"

		  +color+ "yo                                 `.://:`/d           `d+`://:.`                                 oy\r\n"

		  +color+ "oh                        `.-::++++/:.    `ys.       `-sh.    `:/++++/:-.`                        ho\r\n"

		  +color+ "-m.                   -+ossoo/:.``         :ddsssssyyydm:         ``.:/+osso+-                   .m-\r\n"

		  +color+ "`h/                                      `+dh: ```````:hd+`                                      /h`\r\n"

		  +color+ " +h`                                    -ydo`          `+dy-                                    `h+ \r\n"

		  +color+ " .d:                                  .ods-              .sdo-                                  :d. \r\n"

		  +color+ "  oy                               `/shs-`                `-shy/.                               ho  \r\n"

		  +color+ "  .d:                          `-/shs/.                      ./syy+-`                          :d.  \r\n"

		  +color+ "   /h.                     `-/syyo:.                            .-+sys/-`                     .h+   \r\n"

		  +color+ "    ys               ``-/osss+:.`                                  `.-+ssso/-.`              `sy    \r\n"

		  +color+ "    .h/        `.-:+osso+:.`                                            `.-/osso+:-.`        /h.    \r\n"

		  +color+ "     :h/--:/+oosoo+:..`                                                      ``.:/+osoo+/:--/h:     \r\n"

		  +color+ "      -+++/:-..`                                                                    ``.-:/+++-      \r\n"

		  +color+ "                                                                                                    " +  ConsoleColors.RESET));



		order.add(new BowTie("Striped", "Small", 8.25,

				"" + color + "                                                 \r\n"

				  +color+ "          ...`                      `..`          \r\n"

				  +color+ "         :+:-`.--`              `-:/:.`.:         \r\n"

				  +color+ "        `.`.-/++:.`..  ````  .:+/-``.:++/`        \r\n"

				  +color+ "        .:++/-.`-:+++/.`.:/++/-`.:/++:-``.        \r\n"

				  +color+ "        -:-`.-/++/-``+++/-``:-/++/:.`.:++-        \r\n"

				  +color+ "        .-/+o+:.`.:+o+.-/oo++o/-`.:/oo/-`.        \r\n"

				  +color+ "         +/-``-/oo+:.   ``   ``:oo+:.`.:+         \r\n"

				  +color+ "         `-/oo+:-`              `.`.+oo+-         \r\n"

				  +color+ "          ...                        .``          \r\n"

				  +color+ "                                                  " +  ConsoleColors.RESET));



		order.add(new BowTie("Striped", "Medium", 9.25,

				"" + color + "                                                                           \r\n"

				  +color+ "               ....``                                 ``...`               \r\n"

				  +color+ "              :/++/:.``.`                         `.:///:.``-              \r\n"

				  +color+ "             -+/-.` `-:+//:``                 `.:///:-`` `-//-             \r\n"

				  +color+ "             -` `.:/++++/-```-.`  ``````   `.:/+/:.` `.:/+++//             \r\n"

				  +color+ "             :-:/+++/:.```.:/+++:``.://////++/:.```-//+++/:.`-             \r\n"

				  +color+ "             o+++/-.```-/++++/:-+/-` `.-/+o:.``.:/++++/-```.-+`            \r\n"

				  +color+ "             +:-` `.:/++++/-```.o+++/:.` `:.-/++++/:.` `.:+++o             \r\n"

				  +color+ "             -``-/+oo++:.` `-/+o/-/+ooo+/-/ooo+/-.``.-/+oo+/::             \r\n"

				  +color+ "             :+ooo+/-.``.:/+ooo+/``.-:+++//+/-``.-:+ooo+/-` `-             \r\n"

				  +color+ "             -o+/-` `-/+oooo+:.`    ```    ```./+ooo+:.` `-/+-             \r\n"

				  +color+ "              :``.:/oooo+/-.                   .-/:.``.:+oooo              \r\n"

				  +color+ "              `:+ooo+/-.`                         ```:+ooo+:.              \r\n"

				  +color+ "               `--.`                                   `..``               \r\n"

				  +color+ "                                                                           " +  ConsoleColors.RESET));



		order.add(new BowTie("Striped", "Large", 10.25, "" + color

	   	  +color+ "                                                                                                    \r\n"

	   	  +color+ "                                                                                                    \r\n"

	   	  +color+ "                    `....``                                              `.....`                    \r\n"

	      +color+ "                   :+++++/:-.```                                    `.-:////:.``-                   \r\n"

	      +color+ "                  -+++/:-`   `-//-.                              .-//++/:-`   `.::                  \r\n"

	      +color+ "                  +/:.`   `-:/+++++/-``                      `.:/+++/:.`   `-:/+++`                 \r\n"

	      +color+ "                 -.`  `.:/++++++/:.` `.:-`      ````      `-/++++/-.`  `.-/++++++/-                 \r\n"

	      +color+ "                 - `-:/++++++/-``  `.:/+++/-...://////:--/+++//-.`  `.:/++++++/-.`-                 \r\n"

	      +color+ "                 //++++++/:.`   .-/+++++++/+.`  `.:/++++o++/-.` `.-/++++++/:-`   `:                 \r\n"

	      +color+ "                 +++++/:.`  `.:/++++++/:---o+/:.`   `-/+o/.` `.:/++++++/:.`  `.:/++                 \r\n"

	      +color+ "                 /+/-`   `-/+++++++/-.`  `-o+++++/-`   `--.-/+++++++/-`   `-:++++++                 \r\n"

	      +color+ "                 :`  `.:/+oooo++/-`   `-/+o/:+oooooo+:.`.oooooo+/:.`  `.-/+ooooo+/:                 \r\n"

	      +color+ "                 -`-:+ooooo+/:.`  `.:/ooooo/ `.:/+ooooo+oooo+/:.`  `.:+ooooo++:.` -                 \r\n"

	      +color+ "                 .oooooo+/-`   `-/+oooooo+/-`....-/++/:--//-`  `.:/+ooooo+/-.   `-.                 \r\n"

	      +color+ "                  ooo+:.`  `.:/ooooooo+:.`                ``..:+oooooo+:.`  `.-/+o                  \r\n"

	      +color+ "                  ::.   `-/+oooooo+/-.                        .-/+o+:.`  `.:+oooo:                  \r\n"

	      +color+ "                   -``-/ooooooo+:.`                              `...``-/ooooooo+                   \r\n"

	      +color+ "                   `/ooooo+/:.`                                      `.:/+ooo/-:`                   \r\n"

	      +color+ "                     .--.`                                                `..``                     \r\n"

	      +color+ "                                                                                                    " +  ConsoleColors.RESET));



		order.add(new BowTie("Polkadote", "Small", 6.25,

				"" + color + "    :ssosso/.                      ./osssss:     \r\n"

				  +color+ "   -hds  `/::ohy/`              `:yho://`  sdh-   \r\n"

				  +color+ "  -m.    `o:  /y+ys-          .sh+y+  :o`    .m-  \r\n"

				  +color+ "  d:.y: `+:    .o..sy:osssss/yy-.o.    :+` :y.:d  \r\n"

				  +color+ " .M:`:` `+:  ` .+.`:yd-    `+d:`.+.    -+` .:`-N. \r\n"

				  +color+ " -Ns` .:`   /m- . `yN/      `mh: . .m/    -. `sN: \r\n"

				  +color+ " `N`  /y. -.   :d: `sm+-..-/hd` :d:   `-``y+  `N. \r\n"

				  +color+ "  ydh`   `y/ .o- `+h+`-++++/.oh+` -o. /y.   `hdh  \r\n"

				  +color+ "  `do +d.    `++yy/`          `/hy++`    .d+ +m.  \r\n"

				  +color+ "   `sh/.-s:/oyy/.                .+yyo/:o-`:hs`   \r\n"

				  +color+ "     `/sso+:.                        .:+oss+.     \r\n"

				  +color+ "                                                  " +  ConsoleColors.RESET));

		

		order.add(new BowTie("Polkadote", "Medium", 7.25,

				"" + color + "                                                                          \r\n"

				  +color+ "          .--.``                                           ``.--.          \r\n"

				  +color+ "       .omdssyhddhs/.                                 ./shmmdhyydmo.       \r\n"

				  +color+ "     `sMMM.    `../odmy/`                         `/ymds/-.`    .NMMs`     \r\n"

				  +color+ "    .dd.-.    .NM+   /MMNh/`                   `/hNMM/   oMN.    -:-dm.    \r\n"

				  +color+ "   `md`        .:`   `o+`/hNs.               .sNd/.oo.   `:.        `dm`   \r\n"

				  +color+ "   sN. :o:   `-.       `-. .sNy- ./ooooo+:`.yNy- .-`       `-`   -o: .Ns   \r\n"

				  +color+ "  `Ny  yms   sMN`      oMN`  `sMmms/////+yNMy.  `NMo      `mMy   sNy  sN`  \r\n"

				  +color+ "  -Mh/`      `.`   ``  `.`  .+sMo         `hm//` `.        `-`       :yM:  \r\n"

				  +color+ "  :MNm.           .NM/      sNMN           :MMN-     :NN-           `mMM/  \r\n"

				  +color+ "  -M/    :mm-      :/` :yo`   +M/         `yN.  `oy: `//`     .dm/    :M/  \r\n"

				  +color+ "  `Ny    .++` `:/`     :hy`  `+NNh+:---:/omMs`  `yh:     `//` `+o.    oM.  \r\n"

				  +color+ "   sNyh:      -NN/  `--    `+md:`:oyyyyys+-:dm+`    --`  :NN-      -ysNh   \r\n"

				  +color+ "   `mMy: `:-        /MM- -sNh:               :hNs- -MM/        -:` -hMN.   \r\n"

				  +color+ "    -md. /MM-        `:ommo.                   .ommo:`        -MM/ `hN:    \r\n"

				  +color+ "     .yNo``` -:` `:+yNdo-                         -odmy+-` `:- ```+Nd.     \r\n"

				  +color+ "       -yNhoyMMmmmho:`                               `/ohmmmMMsoyNh:       \r\n"

				  +color+ "         `-//:-.`                                         `.://+:`         \r\n"

				  +color+ "                                                                           " +  ConsoleColors.RESET));



		order.add(new BowTie("Polkadote", "Large", 8.25, "" + color

		  +color+ "                                                                                                    \r\n"

		  +color+ "            `/syyso+/-.                                                      `-/+osyys/.            \r\n"

		  +color+ "         `/hMms++osyhmMNds/-                                            ./sdNMNmhysoosmMh/`         \r\n"

		  +color+ "        :mMMMo        `-/sdMNy+.                                    ./yNMmyo:.        /MMMm:        \r\n"

		  +color+ "      `sMd+ys-     `ymh.   `/mMMdo.                              .+dMMN+.   .hmy`     .yhodMy`      \r\n"

		  +color+ "     `hMs`         .mMm:    -MMMhmMh/`                        `/hMNdMMM:    :mMm.         `sMd`     \r\n"

		  +color+ "     yMs             `       ./- `:yMNs.                    .oNMh/` :+:       `             yMy     \r\n"

		  +color+ "    /Mm` `:/.                       .oNMy.   `-///////-`  .sNNs.                       .:-  `mM/    \r\n"

		  +color+ "    dM/  oMMM`   .dNm-         oNNo   `+NMyomMNdddddddNMdyMNo`   oNNo         -dNd.   `NMMo  /Mm`   \r\n"

		  +color+ "   .MN`  `+o:    `hmd-         ommo     `dMNs-        `-sMM:     ommo         .hmh.    /so.  `NM-   \r\n"

		  +color+ "   /MNy+`                 ``         `+ssMN-             -NN+o:          `                  /smM+   \r\n"

		  +color+ "   +MMMM-                hMMo        :MMMMs               yMMMM.       /NMh`               .MMMMo   \r\n"

		  +color+ "   /Md:.    `/s+`        odh:  `--`   .:yMh              `mMo/.  `--`  :dms`       `/o/`    .:hMo   \r\n"

		  +color+ "   -MN`     -MMM/              hMMh     `dMy.           .hMh`    hMMh              :MMM/      dM/   \r\n"

		  +color+ "   `NM-      ./-   `/o/`       :yy:    `+NMNMho/:::://ohMMMo`    :yy:        /o+`   -/:      `MM.   \r\n"

		  +color+ "    sMhsy+`        :MMM:    ``       `oNMy.`/shmmmmmmdhs:-yMNo`       ``    .MMM+         :sosMh    \r\n"

		  +color+ "    `NMMMN.         -/-    /NMd`   -sNMy.                  -yMNs-   `dMN/    ./-         `NMMMM-    \r\n"

		  +color+ "     :MM+`  `shs.          -hds`.+dMmo.                      .omMd+``sdh-          .shs`  `+MM+     \r\n"

		  +color+ "      :NM+  -NMN:            .+hMNy:`                          `:yNMh+.            :NMN-  /NM+      \r\n"

		  +color+ "       .dMd: `.`  ``    `./smMmy:`                                `/yNMms/.     ``  `.` -hMm:       \r\n"

		  +color+ "        `/mMd+.``dMMy+sdNMmy+-                                       `-ohNMmhs+sNMh` ./hMNo`        \r\n"

		  +color+ "           :smMMMMMNmhs+:.                                               `./oydmMMMMNMNy/`          \r\n"

		  +color+ "              `..``                                                             ``.--.`             \r\n"

		  +color+ "                                                                                                    " +  ConsoleColors.RESET));



		order.add(new BowTie("Swirl", "Small", 1000000,

				"" + color + "                                                 \r\n"

				  +color+ "        ` ``                             `..      \r\n"

				  +color+ "     .oo+.+sso/.`                ```o+.-/+o+.     \r\n"

				  +color+ "     ++-oso+++o+o+-.`         ..od:od.omosss-     \r\n"

				  +color+ "     -:h/+sssssso:+mh/.`````-ooy/o:sd-mh+m+d+`    \r\n"

				  +color+ "     .d:so+yoos:od-/m/mddhs/+yy/h+h+NohNohys+.    \r\n"

				  +color+ "     .m.h+ydyhsd+No/N+NNm+-ooyosymNy+dsshhso+.    \r\n"

				  +color+ "     `sy+yyyysoyd+/dsyNNy/yoys++oooo:-oyooo+/`    \r\n"

				  +color+ "     `o+ssyysooo+so:oNMNhyshhssssooso:-/+ooo/`    \r\n"

				  +color+ "     `osssooooo+//ohNho+/:::+yyysoys/ho/mddy:     \r\n"

				  +color+ "     `yhysooso+//+so/.`      `./sy/yy-d:ommy-     \r\n"

				  +color+ "      sNNNNNmsso+/-`            `..:+:so/md/.     \r\n"

				  +color+ "      ./oo+/:..`                      ``..-.`     \r\n"

				  +color+ "                                                  " +  ConsoleColors.RESET));



		order.add(new BowTie("Swirl", "Medium", 2000000,

				"" + color + "                                                                          \r\n"

				  +color+ "                                                              ``-`         \r\n"

				  +color+ "        `.-:s-`+s+:.`                                 `-/:.``.`-+/.        \r\n"

				  +color+ "        /mds/.:+shmmNd+.``                       `-/`:dd/ -oydmmdo-`       \r\n"

				  +color+ "       `ho.`+dds/---:+osyd+.``                `.sNm:`hm+`+mms:/+++:`       \r\n"

				  +color+ "       `/`:hd/`:oyhdhyo/.-+ymdo-`           .om+.sm-`mN-.dNy.hmsdd+.       \r\n"

				  +color+ "       `-:my./ddo/:-:/odms.`oNNso:.``     -hdo:hs`os.hMo-dMs:Nd-ods-`      \r\n"

				  +color+ "       `-hd`+mo.+hdhdy/`+md.`oNh-mNNNmddyys+dd./N/+m:sMd/yMm/smdyso:`      \r\n"

				  +color+ "        -m+.dh`sNy-+/+Ns.hNo`-md.mmmmmh:``/`hm/ym+hMs+hMy+hMms/++++:`      \r\n"

				  +color+ "        .ms`ym/+dNNmhomm+yNy/oMN:NNNNy`.smdhd++symMMMs-+Nd//smNmhyo:`      \r\n"

				  +color+ "        .sm/.ommhhhddy+omm/.+Nm+yNNNd:-mh//o///////+sh/`-hmy/--///+-`      \r\n"

				  +color+ "        .:smdo++oo+:/ohmy:-sNo-+mMMMs+ho/smmhyyyhddy+-.:-`-ohmdhyy+-       \r\n"

				  +color+ "        `y/-/shdmmdys+:./sms.`oNMMMMmyhymdyo+osso+::ohd+.-++-.-///+.       \r\n"

				  +color+ "        `odmhyo+//:/+oydy/..+mMMmhyyso+++oymNdhssymdo-/dm/.sNNdhyo/.       \r\n"

				  +color+ "        `+:-:/++oooo+:-`-/shhhdy+-..```````-:+ydy+./dm/-hN:.dNmmNh:`       \r\n"

				  +color+ "        `yNmhyso++oosso/::/sso/-`            `-/sdm+-hm-`hh`:mmmms-`       \r\n"

				  +color+ "        `+mmNNNNNNNdo+ssyyo/-.`                 `.-//ohy:yN/.hNms+-        \r\n"

				  +color+ "         -NNNNNmmmdyso+/:-``                        ``.--:/++yhh//.        \r\n"

				  +color+ "         `-+ssso+/--.``                                    ```...``        \r\n"

				  +color+ "           ``````                                                          \r\n"

				  +color+ "                                                                           " +  ConsoleColors.RESET));



		order.add(new BowTie("Swirl", "Large", 3000000, "" + color

		  +color+ "                                                                                   ``..             \r\n"

		  +color+ "               `/:``//:.`                                                  `..``....-os-`           \r\n"

		  +color+ "           .shhddo.`:syhhyso/-`                                       ``+yhy:```-:/++///-`          \r\n"

		  +color+ "          `ymds:..:oyhhdmmmNNh+-..`                              .:oy.`+mms` -odmmmmmmms:`          \r\n"

		  +color+ "          -my-``/hddyo:-..-:/osyhmd/.``                       `.smmm+`.dmh.`:dmmy/-:///+/.          \r\n"

		  +color+ "          .s` -ymh+.`.:+oooo/:-..:osooyo:`                 `:yo--smm: :mms``yNNy.-hdddds+-`         \r\n"

		  +color+ "          .-`/dms.`/ydmdhhhhdmdho:`./hNNmy+-`            `:++ymd:`/d+`-NNy..hMM+-yNh-+NNy:`         \r\n"

		  +color+ "          .-:dm+`:hmh+:-:::--:+ymms.`.sNNh/oo:---.```  `:hNNy--hd-`od.-mMm::hMMo:yMm:-sho/.         \r\n"

		  +color+ "          `-yms`-dmo.-shddhhy+.`+mmh.`.hNN+-dNNmmmhddhyhyoomm:`+Ny-+N/:yMMo/sMMd/+dNmso++/-`        \r\n"

		  +color+ "          `:mm.`hms`/dmy:-::smd-`smmo  :mms-mmmmNmmNh/--/:`dNo:sMy/yMs+omMd++hMMh+/oyhdhy+-`        \r\n"

		  +color+ "          `-mm`.mm+`oNNysdmy/yMh:+NNd-.:Nms-mmmmmmd/` .:+.+Nd+odhoyNMNy++hMm+/smMNhs+/-.-+-`        \r\n"

		  +color+ "           .dm:`omm+/sdmmmdysdNd+omNy/+sMNy/NNNNNm:`.sdNdhdy//+shmNMMMNs--oNms::+hmNNmddy/.`        \r\n"

		  +color+ "           .oNh-.+dNmhyyyhdmdyoodNm/--yNNs+yNNNNN+.-dNh/:s+:://++++osyhd:``:dNdo:.-:/+o++/.`        \r\n"

		  +color+ "          `.:yNd+::+shhhys+:-:sdmh:.-sNdo:smMMMNh::hd+//ommdhyyyyso/:-.-//-`.+hmmhso//:/+:.         \r\n"

		  +color+ "           ./-+hmmdyyssooosyhddy+--+dmo..:dNMMMMh+od+:smNdo/:://+syhddh+-`-::..-+shdmmmmo:`         \r\n"

		  +color+ "           .ho:-:+syhdddhyso/:--:sdds-`.omNMMMMMNyshydmhysosyyyyyo/::/odmy/`./s+:..--:::+-`         \r\n"

		  +color+ "           .smmdyo+/:-:--..-/oyhdy+.`.+dMMMNmdhhhyssssssymNNNmdhhdmmho--+dNh:.:dNmhyso+/+-`         \r\n"

		  +color+ "           `::+shdddddhhhhddhyo/-`.:smNNNNds+//::--....-:/osooo/:--+hNmo--yNm:.:mNmmmmmh/-`         \r\n"

		  +color+ "           `ss+:-.-----::---...-/+sssssshs+:.```         `.-/sdNNds-./dNy..sNd..smmmmNms/.`         \r\n"

		  +color+ "           `sNNmdhysooooossyys+/:--/syso/-.`                `.-/oymmo--dmo``ym+`.dmmmmmo:`          \r\n"

		  +color+ "           `/mmmNNNNNNNNNNms/:/ooyyso+:-``                     `.-:/o+/ymN:-+Nm.`+mmmmo+-`          \r\n"

		  +color+ "           `-NNNNNNNNNNMMmsoyhhso+/:-``                           ``..-:/+++ohd//oNNNh.+-`          \r\n"

		  +color+ "            .hmmNNmmmdhdhyoo+/:-..``                                    ``...-::/+ssy+/:.`          \r\n"

		  +color+ "            `.:+sssso++/:-..```                                                ```.....``           \r\n"

		  +color+ "              ``..-...``                                                                            "+  ConsoleColors.RESET));



	}



}