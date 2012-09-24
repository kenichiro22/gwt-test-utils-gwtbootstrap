package com.github.kenichiro22.gwt.test.gwtbootstrap;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.github.gwtbootstrap.client.ui.Alert;
import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.TabLink;
import com.github.gwtbootstrap.client.ui.event.CloseEvent;
import com.github.gwtbootstrap.client.ui.event.CloseHandler;
import com.github.gwtbootstrap.client.ui.event.ClosedEvent;
import com.github.gwtbootstrap.client.ui.event.ClosedHandler;
import com.github.kenichiro22.gwt.test.gwtbootstrap.test.client.GwtBootstrapModule;
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
	
	@Test
	public void testDropDown(){
	  // onLoad
    GwtBootstrapModule module = new GwtBootstrapModule();
    module.onModuleLoad();
	  
	}
	
	@Test
	public void testAlertBase(){
	  // onAttach
	  GwtBootstrapModule module = new GwtBootstrapModule();
	  module.onModuleLoad();
	  
	  Alert alert = module.getWidget().getAlert();

	  final CloseHandler closeHandler = mock(CloseHandler.class);
    alert.addCloseHandler(closeHandler);
	  
    final ClosedHandler closedHandler = mock(ClosedHandler.class);
    alert.addClosedHandler(closedHandler);
    
    alert.close();
    
    verify(closeHandler).onClose(any(CloseEvent.class));
    verify(closedHandler).onClosed(any(ClosedEvent.class));
	}
	
	@Test
	public void testTabLink(){
	  TabLink tabLink = new TabLink();
	  tabLink.setText("Tab");
	  tabLink.show();
	}
}
