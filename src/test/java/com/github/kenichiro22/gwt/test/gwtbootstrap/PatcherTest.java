package com.github.kenichiro22.gwt.test.gwtbootstrap;

import org.junit.Test;

import com.github.gwtbootstrap.client.ui.Button;
import com.googlecode.gwt.test.GwtModule;

@GwtModule("com.github.kenichiro22.gwt.test.gwtbootstrap.test.GwtBootstrapTest")
public class PatcherTest extends GwtBootstrapTest {

	public void setUpGwtBootstrap() {
		
	}
	
	@Test
	public void testButtonLoadingState(){
	  Button b = new Button("button");
	  b.state().complete();
	}
}
