package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.Modal;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;
import com.googlecode.gwt.test.utils.GwtReflectionUtils;

@PatchClass(Modal.class)
public class ModalPatcher {
   @PatchMethod
   public static void changeVisibility(Modal modal, Element e, String visibility){
      if("show".equals(visibility)){
         show(modal);
      }
      else if("hide".equals(visibility)){
         hide(modal);
      }
      else if("toggle".equals(visibility)){
         if(modal.isVisible()){
            hide(modal);
         }
         else{
            show(modal);
         }
      }
   }

   private static void hide(Modal modal) {
      GwtReflectionUtils.callPrivateMethod(modal, "onHide", new Object[]{null});
      modal.setVisible(false);
      GwtReflectionUtils.callPrivateMethod(modal, "onHidden", new Object[]{null});
   }

   private static void show(Modal modal) {
      GwtReflectionUtils.callPrivateMethod(modal, "onShow", new Object[]{null});
      modal.setVisible(true);
      GwtReflectionUtils.callPrivateMethod(modal, "onShown", new Object[]{null});
   }
   
   @PatchMethod
   public static void setHandlerFunctions(Modal modal, Element e){   
   }

   @PatchMethod
   public static void unsetHandlerFunctions(Modal modal, Element e){   
   }

   @PatchMethod
   public static void configure(Modal modal, Element e, boolean k, boolean b, boolean s) {
   }
   
   @PatchMethod
   public static void configure(Modal modal, Element e, boolean k, String b, boolean s) {
   }
   
   @PatchMethod
   public static void reconfigure(Modal modal, Element e, boolean k, boolean b, boolean s) {
   }
   
   @PatchMethod
   public static void reconfigure(Modal modal, Element e, boolean k, String b, boolean s) {
   }
}
