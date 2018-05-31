package com.goldfish.knight;

import java.io.PrintStream;

public class LayDragonQuest implements Quest {

	private PrintStream printStream;
	
	public LayDragonQuest(PrintStream printStream ) {
		this.printStream = printStream;
	}
	
	@Override
	public void embark() {
		printStream.println("Lay Dragon Quest");
	}

}
