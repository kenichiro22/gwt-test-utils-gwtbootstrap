package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.base.DropdownBase;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

@PatchClass(DropdownBase.class)
public class DropDownBaseTest {

  @PatchMethod
  public static void configure(DropdownBase dropdownBase, Element e){
  }
}
