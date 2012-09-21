package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

@PatchClass(Button.LoadingStateBehavior.class)
public class ButtonLoadingStateBehaviorPatcher {

  @PatchMethod
  static void setLoadingBehavior(Button.LoadingStateBehavior lsb, Element e, String behavior){
    // Nothing to do.
  }
}
