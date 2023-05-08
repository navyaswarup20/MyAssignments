class ArmstrongNumBetweenRange{
	public int[] armstrongNumbersInRange(int min , int max) {
		int arr[] = new int[4];
		List<Integer> list=new ArrayList<>();
		for(int i=min;i<=max;i++) {
		 int answer=0;
		 int newNum1=i;
		 int newNum2=i;
		 int count=0;
		 while(newNum1!=0) {
			int r=newNum1%10;
			 count++;
			 newNum1=newNum1/10;
		 }
		 while(newNum2!=0) {
		 int r=newNum2%10;
		 answer=(int)(answer+Math.pow(r, count));
		 newNum2=newNum2/10;
		 }
		 if(i==answer)
		 {
			list.add(i);
		 }

		int size=list.size();
			//arr[]=new int[size];
		 for(int j=0;j<size;j++) {
			 arr[j]=list.get(j);
		 }  
	 }
return arr;
	}
}