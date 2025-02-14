import java.util.Scanner;

class EVM

{

	public static void main(String[] args) 

	{

		Scanner sc =  new Scanner(System.in);

		System.out.println("\n\t\t *** WELCOME *** \n");

		System.out.println("\t\t DO VOTE FOR CHANGE \n");



		System.out.print("Enter the Population: ");

		int population = sc.nextInt();



		int bjp=0,ss=0,aap=0,mns=0,nota=0;



		for (int i=1; i<=population; i++ )

		{

			System.out.println("\n--------PARTY NAMES--------");

			System.out.println("1. BJP");

			System.out.println("2. SHIVSENA");

			System.out.println("3. AAP");

			System.out.println("4. MNS");

			System.out.println("5. NOTA \n");



			System.out.print("Enter the option Number do you want to Vote: ");

			int opsn = sc.nextInt();

			if (opsn>=1&&opsn<=5)

			{

				if (opsn==1)

				{

					bjp++;

					System.out.println("\n VOTE FOR BJP SUCCESSFUL! \n");

				}

				if (opsn==2)

				{

					ss++;

					System.out.println("\n VOTE FOR SHIVSENA SUCCESSFUL! \n");

				}

				if (opsn==3)

				{

					aap++;

					System.out.println("\n VOTE FOR AAP SUCCESSFUL! \n");

				}

				if (opsn==4)

				{

					mns++;

					System.out.println("\n VOTE FOR MNS SUCCESSFUL! \n");

				}

				if (opsn==5)

				{

					nota++;

					System.out.println("\n VOTE FOR NOTA SUCCESSFUL! \n");

				}

			}      //first if end here.

			if (!(opsn>=1&&opsn<=5))

			{

				i--;

				System.out.println("\n ERROR!!, PLEASE ENTER VALID NUMBER!");

			}

		} //for loop end here.



		System.out.println("\n *** RESULT OF VOTINGS *** ");



		if (bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)

		{

			System.out.println("\n BJP WON BY "+bjp+" VOTES");

			return;

		}

		if (ss>=bjp&&ss>=aap&&ss>=mns&&ss>=nota)

		{

			System.out.println("\n SHIVE SENA WON BY "+ss+" VOTES");

			return;

		}

		if (aap>=bjp&&aap>=ss&&aap>=mns&&aap>=nota)

		{

			System.out.println("\n AAP WON BY "+aap+" VOTES");

			return;

		}

		if (mns>=bjp&&mns>=ss&&mns>=aap&&mns>=nota)

		{

			System.out.println("\n MNS WON BY "+mns+" VOTES");

			return;

		}

		if (nota>=bjp&&nota>=ss&&nota>=aap&&nota>=mns)

		{

			System.out.println("\n NOTA HAS "+nota+" VOTES");

			return;

		}



	}

}