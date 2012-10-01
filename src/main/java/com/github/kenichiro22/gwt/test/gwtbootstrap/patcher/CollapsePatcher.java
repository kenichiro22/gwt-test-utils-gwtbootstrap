package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import java.util.HashMap;
import java.util.Map;

import com.github.gwtbootstrap.client.ui.Collapse;
import com.github.gwtbootstrap.client.ui.constants.VisibilityChange;
import com.github.gwtbootstrap.client.ui.event.HiddenEvent;
import com.github.gwtbootstrap.client.ui.event.HideEvent;
import com.github.gwtbootstrap.client.ui.event.ShowEvent;
import com.github.gwtbootstrap.client.ui.event.ShownEvent;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@link Collapse}.
 * 
 * @author Kenichiro Tanaka
 *
 */
@PatchClass(Collapse.class)
public class CollapsePatcher {
   private static Map<Collapse, Boolean> shownCollapse = new HashMap<Collapse, Boolean>();

   @PatchMethod
   public static void configure(String selector, String parent, boolean toggle) {
      // TODO:
   }

   @PatchMethod
   public static void configure(Collapse collapse, Element e, String parent, boolean toggle) {
      shownCollapse.put(collapse, toggle);
   }

   @PatchMethod
   public static void changeVisibility(String target, String c) {
   }

   @PatchMethod
   public static void changeVisibility(Collapse collapse, Element e, String c) {
      if(!shownCollapse.containsKey(collapse)){
         shownCollapse.put(collapse, collapse.isToggle());
      }
      
      if(VisibilityChange.SHOW.get().equals(c) && !shownCollapse.get(collapse)){
         show(collapse);
      }
      else if(VisibilityChange.HIDE.get().equals(c) && shownCollapse.get(collapse)){
         hide(collapse);
      }
      else if(VisibilityChange.TOGGLE.get().equals(c)){
         if(shownCollapse.get(collapse)){
            hide(collapse);
         }
         else{
            show(collapse);
         }
      }
   }

   private static void hide(Collapse collapse) {
      collapse.getWidget().fireEvent(new HideEvent());
      shownCollapse.put(collapse, false);
      collapse.getWidget().fireEvent(new HiddenEvent());
   }

   private static void show(Collapse collapse) {
      collapse.getWidget().fireEvent(new ShowEvent());
      shownCollapse.put(collapse, true);
      collapse.getWidget().fireEvent(new ShownEvent());
   }

   @PatchMethod
   public static void removeDataIfExists(Collapse collapse, Element e) {
   }

   @PatchMethod
   public static void setHandlerFunctions(Collapse collapse, Element e) {
   }
}
