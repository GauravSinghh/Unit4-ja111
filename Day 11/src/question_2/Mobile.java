package question_2;

import java.util.*;
public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String mobile,String... modelName) {
	int count=0;
		for(int i =0;i<outdatedModels.length;i++)
		
			for(int j=0;j<modelName.length;j++)
			{
				if(outdatedModels[i].equals(modelName[j])) {
					count++;
					System.out.println(modelName[j]+"_OUTDATED");
					
			}
		}
		if(count==0) {
			System.out.println(mobile+" model ais not outdated");
		}
		
	}
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		
		mob.searchOutdatedModel("Samsung" ,"note9", "note7");
		
		
	}
}
