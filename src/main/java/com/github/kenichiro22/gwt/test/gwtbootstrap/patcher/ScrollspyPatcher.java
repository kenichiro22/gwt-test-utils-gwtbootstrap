package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.Scrollspy;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@code Scrollspy}.
 * <p>
 * This patcher do nothing only for avoiding {@code UnsatisfiedLinkError}.
 * 
 * @author ktana
 *
 */
@PatchClass(Scrollspy.class)
public class ScrollspyPatcher {

   @PatchMethod
   public static void jsConfigure(Scrollspy spy, Element e, String target,int offset){
   }
   
   @PatchMethod
   public static void refresh(Scrollspy spy, Element e){
   }
}
