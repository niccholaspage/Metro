package com.niccholaspage.Metro.base.chat;

import org.spout.api.chat.ChatArguments;
import org.spout.api.chat.style.ChatStyle;

public class SpoutChatFormat extends ChatFormat {
	private final ChatStyle style;
	
	public SpoutChatFormat(ChatStyle style){
		this.style = style;
	}
	
	public String toString(){
		return new ChatArguments(style).asString();
	}
	
	public String stripColors(String message){
		return ChatStyle.strip(message);
	}
}
