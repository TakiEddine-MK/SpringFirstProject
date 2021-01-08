package com.SpringFirstProject.topics;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {


	@Autowired
	private TopicSevices tpser;	

	@RequestMapping("/topics")
	public List<Topic> getalltopics() {
		return tpser.getalltopics();
	}
	
/*	@RequestMapping("/topics/{id}")
	public Topic gettopicbyID(@PathVariable String id) {
		//return tpser.GetTopicByID(id);
		//if (tpser.GetTopicByID(id).equals(null)) {
			//return null;
		//}
		return tpser.GetTopicByID(id);
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		tpser.PostTopics(topic);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value = "/topics/{id}")
	public void DeletTopic(@PathVariable String id) {
		tpser.deleteTopic(id);
		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
	public void UpdateTopic(@RequestBody Topic topic ,@PathVariable String id) {
		tpser.UpdateTopic(id, topic);
		
	}
	
	
	
	*/

	
	
}
