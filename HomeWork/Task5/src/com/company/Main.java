package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProgramsList programsList=new ProgramsList(8, LocalTime.parse("08:00"),LocalTime.parse("20:00"));
        СhannelList chanellist = new СhannelList();
        TV tv = new TV();
        tv.showTV(chanellist, programsList);

    }
}
