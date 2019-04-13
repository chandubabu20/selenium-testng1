package basics; 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	
    @Test(dataProvider="testdata")
    public void Test(int s1,int s2,String s3) 
    {
    	System.out.println("s1="+s1+" and s2="+s2+" and s3="+s3);
    }
    
        
    @DataProvider(name="testdata")
    public Object[][] testData() 
    {
    	Object[][] data=new Object[1][3];
    	data [0][0] =425;
    	data [0][1] =500;
    	data [0][2]="chandu";
    	return data;
    }
     
    }

