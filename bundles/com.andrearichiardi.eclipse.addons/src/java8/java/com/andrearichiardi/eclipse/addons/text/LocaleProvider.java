/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package com.andrearichiardi.eclipse.addons.text;

import java.util.Locale;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Provide the current locale
 */
public interface LocaleProvider {
	/**
	 * @return the current locale
	 */
	public @NonNull Locale getLocale();
}
