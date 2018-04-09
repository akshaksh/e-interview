package hackerearth.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Breakup {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m=null;
		int lines=sc.nextInt();
		String messages[]=new String[lines];
		String current_message="";
		String split_texts[]=null;
		Map<Integer,Integer> freuency=new HashMap<>();
		int weight=0; String value="";
		int max=0; int counter=0; int day=0;
		sc.nextLine();
		for(int i=0;i<lines;i++){
			messages[i]=sc.nextLine();
		}
		for(int i=0;i<lines;i++){
			current_message=messages[i];
			split_texts=current_message.split(":");
			if(split_texts[0].trim().indexOf("G") != -1)
				weight=2;
			else
				weight=1;
			current_message=split_texts[1].trim();
			m = p.matcher(current_message);
			while (m.find()) {
							value=m.group();
							if(freuency.containsKey(Integer.parseInt(value))){
								freuency.put(Integer.parseInt(value),freuency.get(Integer.parseInt(value))+weight);
							}
							else{
								freuency.put(Integer.parseInt(value),weight);
							}
				}
			
		}
		Set<Entry<Integer, Integer>> entrySet = freuency.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
					Map.Entry<Integer, Integer> record=iterator.next();
					if(max == record.getValue())
						{counter++;}
					else if(max<record.getValue()){
						max=record.getValue();
						counter=1;
						day=record.getKey();
					}
						
		}
		if((freuency.size() != 0) && counter == 1 && (day == 19 || day == 20)){
			System.out.println("Date");
		}
		else{
			System.out.println("No Date");
		}
		sc.close();
		
	}
}
