package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.base.HoverBase;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@link HoverBase}.
 * 
 * <p>
 * This patcher do nothing only for avoiding {@code UnsatisfiedLinkError}.
 * 
 * @author Kenichiro Tanaka
 *
 */
@PatchClass(HoverBase.class)
public class HoverBasePatcher {
   @PatchMethod
   public static void removeDataIfExists(HoverBase hoverBase, Element e, String dataName){
   }
}
