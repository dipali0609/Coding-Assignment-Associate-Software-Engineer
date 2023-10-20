//Q.2.B. Perform sorting of an array in descending order. 

   const a = [67,3,51,78,1,4,11,8]; 
   for(var i=0;i<a.length;i++)
	{
		for(var j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
			var temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}

   for(var i=0;i<a.length;i++)
	{
	console.log(a[i]);
	}
