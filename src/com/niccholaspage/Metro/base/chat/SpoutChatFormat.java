package com.niccholaspage.Metro.base.chat;

import org.spout.api.chat.style.ChatStyle;

public class SpoutChatFormat extends ChatFormat {
	private final String style;
	
	public SpoutChatFormat(String style){
		this.style = style;
	}
	
	public String toString(){
		return "{{" + style + "}}";
	}
	
	public String stripColors(String message){
		return ChatStyle.strip(message);
	}
}
