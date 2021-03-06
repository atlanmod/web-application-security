/*
 * generated by Xtext
 */
package org.xtext.anomaly.report.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.anomaly.report.ui.internal.ReportActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReportExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ReportActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ReportActivator.getInstance().getInjector(ReportActivator.ORG_XTEXT_ANOMALY_REPORT_REPORT);
	}
	
}
