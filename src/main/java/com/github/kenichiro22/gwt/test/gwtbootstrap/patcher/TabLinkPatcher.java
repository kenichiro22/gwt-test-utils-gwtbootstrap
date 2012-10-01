package com.github.kenichiro22.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.client.ui.TabLink;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@link TabLink}.
 * <p>
 * This patcher do nothing only for avoiding {@link UnsatisfiedLinkError}.
 * 
 * @author Kenichiro Tanaka
 *
 */
@PatchClass(TabLink.class)
public class TabLinkPatcher {

	@PatchMethod
	public static void show(TabLink tabLink) {
		// TOOD: Not implement yet ??
	}
}
