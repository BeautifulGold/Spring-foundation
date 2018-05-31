package com.goldfish.knight;

public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkonquest() {
		quest.embark();
	}
} 
