int main()
{
	int a, b;
	int i;
	a = 0;
	b = 1;
	if(a > b)
	{
		do
		{
			b = a + b;
			i = i + 1;
		}while(a < b && i < 10);
	}
	else
	{
		for(i = 0; i < 10; i = i+1)
		{
			a = a + i;
		}
	}

	while(a <= b || i >= 10)
	{
		switch(a)
		{
			case 1:
				i = i + 1;
				break;
			case 2:
				i = i + 2;
			case 3:
				i = i + b;
				break;
			default:
				i = 123.123 + 100;
		}
	}
}