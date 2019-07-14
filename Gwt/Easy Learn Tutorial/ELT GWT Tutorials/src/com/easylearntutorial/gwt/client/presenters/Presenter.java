package com.easylearntutorial.gwt.client.presenters;

import com.google.gwt.user.client.ui.Panel;

public interface Presenter {
	public void bind();//bind is for initializing stuff
	public void go(Panel panel); //sends in panel and starts rendering
	
	
}
