package org.nishant.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.nishant.springboot.entity.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("1","one","one is one"),
			new Topic("2","two","two is two"),
			new Topic("3","three","three is three")
			);

	public List<Topic> getTopics() {
		return topics;
	}
	
}
