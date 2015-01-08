package com.snlabs.aarogyatelangana.account.service.impl;

import com.snlabs.aarogyatelangana.account.beans.*;
import com.snlabs.aarogyatelangana.account.dao.FormDao;
import com.snlabs.aarogyatelangana.account.service.FormService;
import com.snlabs.aarogyatelangana.account.service.PatientService;

public class FormServiceImpl implements FormService {

	FormDao formDao;

	PatientService patientService;

	@Override
	public int createForm(Form form) {
		try {
			if (formDao.save(form) > 0) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public FormDao getFormDao() {
		return formDao;
	}

	public void setFormDao(FormDao formDao) {
		this.formDao = formDao;
	}

	@Override
	public Form searchForm(int formId) {
		return formDao.findByFormId(formId);
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	@Override
	public Form searchFormByDateRange(String fromDate, String toDate) {
		return formDao.searchFormByDateRange(fromDate, toDate);
	}

	@Override
	public int saveSectionA(SectionA section) {
		try {
			return formDao.saveSectionA(section);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int saveNonInvasiveDetails(NonInvasive nonInvasive) {
		if (formDao.saveNonInvasive(nonInvasive) > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int saveInvasiveDetails(Invasive invasive) {
		if (formDao.saveInvasive(invasive) > 0) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public int saveDeclarationDetails(Declaration declaration) {
		if (formDao.saveDeclaration(declaration) > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
