package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.base.AlertBase;
import com.github.gwtbootstrap.client.ui.event.CloseEvent;
import com.github.gwtbootstrap.client.ui.event.ClosedEvent;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@link AlertBase}
 * 
 * @author Kenichiro Tanaka
 *
 */
@PatchClass(AlertBase.class)
public class AlertBasePatcher {

	@PatchMethod
	public static void configure(AlertBase alertBase, Element e) {
	}

	@PatchMethod
	public static void setHandlerFunctions(AlertBase alertBase, Element e) {
	}

	@PatchMethod
	public static void close(AlertBase alertBase, Element e) {
		alertBase.fireEvent(new CloseEvent());
		alertBase.fireEvent(new ClosedEvent());
	}
}
