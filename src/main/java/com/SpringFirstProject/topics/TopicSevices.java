package com.SpringFirstProject.topics;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicSevices {
	
	private List<Topic> listoftopic=new ArrayList<>(Arrays.asList(
			new Topic("Spring1","1111111","1111111111"),
			new Topic("Spring2","2222222222","22222222222"),
			new Topic("Spring3","3333333333","333333333333")
			));
	
	public List<Topic> getalltopics(){
	return listoftopic;	
	}
	
	public Topic GetTopicByID(String id) {
		
		for (Topic topic : listoftopic) {	
			if (topic.getId().equals(id)) {
			return topic ;
			}
			
		};
		return null;
		
		
	}
	
	public void PostTopics(Topic t){  //addtopic
		
		listoftopic.add(t);
		
	}
	
	public void deleteTopic(String id){
		//listoftopic.remove(id);
		listoftopic.removeIf(t -> t.getId().equals(id));
		
	}
	
	public void UpdateTopic(String id ,Topic topic){
		/*int i=0;
		for (Topic tp : listoftopic) {
			
			if(tp.getId().equals(id)) {
				listoftopic.set(i, topic);
			}
			i++;
			return;
		}*/
		for(int i=0;i<listoftopic.size();i++) {
			Topic tt=listoftopic.get(i);
			if(tt.getId().equals(id)) {
				listoftopic.set(i, topic);
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	

	
	
/*	public Topic GetTopicByID(String Id) {
		return list.stream().filter(t ->t.getId().equals(Id)).findFirst().get();
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
}
