
public class car
	{
		private String color;
		private String name;
		private int hp;
		private int rice;
		public car(String c, String n, int h, int r)
		{
		color = c;
		name = n;
		hp = h;
		rice = r;
		}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getHp()
			{
				return hp;
			}
		public void setHp(int hp)
			{
				this.hp = hp;
			}
		public int getRice()
			{
				return rice;
			}
		public void setRice(int rice)
			{
				this.rice = rice;
			}
	
	}
