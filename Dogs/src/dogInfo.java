import java.util.ArrayList;

public class dogInfo
	{

		public static void main(String[] args)
			{
				ArrayList<Dogs>info = new ArrayList<Dogs>();
				info.add(new Dogs("Sckoob", "Golden Retreiver", 7, 137));
				info.add(new Dogs("Jake", "Labrador", 4, 123));
				info.add(new Dogs("Payton", "German Shepard", 2, 140));
				info.add(new Dogs("Scott", "Great Dane", 8, 154));
				
				
				for (int i = 0; i < info.size(); i++)
					{
						System.out.println(info.get(i).getNameOfDog() + " the " + info.get(i).getBreed() + " is " + info.get(i).getAge() + "-years-old and weighs " + info.get(i).getWeight() + " pounds");
					}
				System.out.println();
				for (int)
				System.out.println("The average age is " + info.get().getAge());
			}		
		

	}
