/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package com.openshift3.client.capability.server;

import com.openshift3.client.capability.ICapability;
import com.openshift3.client.model.IConfig;
import com.openshift3.client.model.template.ITemplate;

/**
 * Add capability to process a template
 */
public interface ITemplateProcessing extends ICapability {
	
	/**
	 * Process the template to substitute the parameters
	 * where necessary
	 * 
	 * @param template        The template to process
	 * @param namespace     The namespace to use when processing the template
	 * @return a config of resources
	 */
	IConfig process(ITemplate template, String namespace);
}
