package com.rahul.SpringCoreAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //:- use if you interface implement multiple class @Primary give a Priority first
public class MediaTek implements MobileProcessor
{

	@Override
	public void process() {
		System.out.println("2 nd  beat CPU");
		
	}

}
