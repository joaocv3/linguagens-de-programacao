/*
 * generated by Xtext 2.14.0
 */
package org.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import tutorial.ui.internal.TutorialActivator;

public class TutorialUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TutorialActivator.getInstance().getInjector("org.Tutorial");
	}

}
