
public class Sort {
	
	private int[] tab;
	
	Sort(int[] tab)
	{
		this.tab = tab;
	}
	
	private void zamien(int a, int b)
	{
		int temp=tab[a];
		tab[a]=tab[b];
		tab[b]=temp;
	}
	
	private void bsort()
	{
	for(int i=0; i<tab.length; i++)
		for(int i2=0; i2<tab.length-1; i2++)
			if(tab[i]<tab[i2])
				zamien(i, i2 );
		
	}
	

	public static void main(String[] args) 
	{
	int[] tab ={3, 453, 53, 46, 75, 76, 23, 352};
	Sort sort=new Sort(tab);
	sort.bsort();
	for(int i=0; i<tab.length; i++)
	{
	System.out.print(tab[i]);
	System.out.print(" ");
	}	
	}

}
