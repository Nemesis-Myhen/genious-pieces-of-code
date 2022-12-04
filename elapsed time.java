while(true){
	long startTime = System.nanoTime();
	long futureTime = startTime + 100000000;
	//the code
	long elapsedTime = System.nanoTime() - startTime;
	while(System.nanoTime()<futureTime){continue;}
	System.out.print("startTime:"+startTime+"|elapsedTime:"+elapsedTime+"|futureTime:"+futureTime+"\n");
}
