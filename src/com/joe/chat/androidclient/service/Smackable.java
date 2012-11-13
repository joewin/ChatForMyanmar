package com.joe.chat.androidclient.service;

import com.joe.chat.androidclient.exceptions.ChatMMException;


public interface Smackable {
	boolean doConnect(boolean create_account) throws ChatMMException;
	boolean isAuthenticated();

	void addRosterItem(String user, String alias, String group) throws ChatMMException;
	void removeRosterItem(String user) throws ChatMMException;
	void renameRosterItem(String user, String newName) throws ChatMMException;
	void moveRosterItemToGroup(String user, String group) throws ChatMMException;
	void renameRosterGroup(String group, String newGroup);
	void requestAuthorizationForRosterItem(String user);
	void addRosterGroup(String group);
	
	void setStatusFromConfig();
	void sendMessage(String user, String message);
	
	void registerCallback(XMPPServiceCallback callBack);
	void unRegisterCallback();
	
	String getNameForJID(String jid);
}
