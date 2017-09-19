
public class Dogs
	{
		
		private String nameOfDog;
		private String breed;
		private int age;
		private int weight;
		
		public Dogs(String nameOfDog, String breed, int age, int weight)
		{
			this.nameOfDog = nameOfDog;
			this.breed = breed;
			this.age = age;
			this.weight = weight;
		}

		public String getNameOfDog()
			{
				return nameOfDog;
			}

		public void setNameOfDog(String nameOfDog)
			{
				this.nameOfDog = nameOfDog;
			}

		public String getBreed()
			{
				return breed;
			}

		public void setBreed(String breed)
			{
				this.breed = breed;
			}

		public int getAge()
			{
				return age;
			}

		public void setAge(int age)
			{
				this.age = age;
			}

		public int getWeight()
			{
				return weight;
			}

		public void setWeight(int weight)
			{
				this.weight = weight;
			}
		
	}
