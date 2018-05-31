package com.goldfish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goldfish.knight.BraveKnight;
import com.goldfish.knight.Knight;
import com.goldfish.knight.LayDragonQuest;
import com.goldfish.knight.Quest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new LayDragonQuest(System.out);
	}
}
