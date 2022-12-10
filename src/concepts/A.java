package concepts;


	 class A
	{
	    protected char c = 'A';
		
	    char getValue()
	    {
	        return c;
	    }
		
		
	}
	
	 class B extends A
	{
	    protected char c = 'B';
		
	    char getValue()
	    {
	        return c;   
	    }  
	    char getSuperValue()
	    {
	        return super.c;   
	    }
		
		
		
		
	}
	

