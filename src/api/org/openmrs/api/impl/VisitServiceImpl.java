/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.api.impl;

import java.util.List;

import org.openmrs.Visit;
import org.openmrs.api.VisitService;
import org.openmrs.api.db.hibernate.VisitDAO;

public class VisitServiceImpl extends BaseOpenmrsService implements VisitService {
	
	private VisitDAO visitDAO;
	
	public List<Visit> getAllVisits() {
		return getVisitDAO().getAllVisits();
	}
	
	public Visit saveVisit(Visit visit) {
		return getVisitDAO().saveVisit(visit);
	}
	
	public VisitDAO getVisitDAO() {
		return visitDAO;
	}
	
	public void setVisitDAO(VisitDAO visitDAO) {
		this.visitDAO = visitDAO;
	}
}
