package com.github.kenichiro22.gwt.test.gwtbootstrap.test.client;

import com.github.gwtbootstrap.client.ui.Alert;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestWidget extends Composite {

	private static TestWidgetUiBinder uiBinder = GWT
			.create(TestWidgetUiBinder.class);

	interface TestWidgetUiBinder extends UiBinder<Widget, TestWidget> {
	}
	
	@UiField
	Alert alert;

	public TestWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Alert getAlert(){
	  return alert;
	}
}
