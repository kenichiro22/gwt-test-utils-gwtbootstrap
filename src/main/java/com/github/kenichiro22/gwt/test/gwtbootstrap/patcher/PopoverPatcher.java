package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.Popover;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@code Popover}.
 * <p>
 * This patcher do nothing only for avoiding {@code UnsatisfiedLinkError}.
 * 
 * @author Kenichiro Tanaka
 * 
 */
@PatchClass(Popover.class)
public class PopoverPatcher {
   
   @PatchMethod
   public static void changeVisibility(Popover popover, Element e, String visibility){
   }
   
   @PatchMethod
   public static void configure(Popover popover, Element element, boolean animated,
            String placement, String trigger, int showDelay, int hideDelay){
   }
}
