/**
 *  Copyright (c) 2015-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *
 */
package ts.eclipse.ide.angular2.internal.cli.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import ts.eclipse.ide.angular2.internal.cli.AngularCLIMessages;

/**
 * Wizard to generate Angular2 Service with "ng generate service $name".
 *
 */
public class NewNgServiceWizard extends AbstractNewNgGenerateWizard {

	public NewNgServiceWizard() {
	}

	@Override
	protected NgGenerateBlueprintWizardPage createMainPage(IContainer folder) {
		return new NewNgServiceWizardPage(folder);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		super.setWindowTitle(AngularCLIMessages.NewNgServiceWizard_windowTitle);
	}

	@Override
	protected void appendOperationParameters(StringBuilder sb) {
		super.appendOperationParameters(sb);
		NewNgServiceWizardPage mainPage = (NewNgServiceWizardPage)getMainPage();
		sb.append(' ').append("--flat ").append(mainPage.isFlat());
		sb.append(' ').append("--spec ").append(mainPage.isSpec());
	}
}
