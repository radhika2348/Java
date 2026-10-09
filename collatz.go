package main




func checknum(n int) int{
	var steps int
	if n==1{
		return 0
	}

    for n>1{
		//steps++
       if n%2==0{
			n=n/2
			steps++
			
		
		}else{
			n=3*n+1
			steps++
		}
		//return steps
		//steps++
		
		

	}	
	return steps
	
}