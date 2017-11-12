/*
 * AllTests.java
 * 
 * Version 1.1 (added hierarchy)
 * 
 * 12.11.2017
 */
package org.wahlzeit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({

	org.wahlzeit.model.ModelSuite.class,
	org.wahlzeit.handlers.HandlersSuite.class,
	org.wahlzeit.services.ServicesSuite.class,
	org.wahlzeit.utils.UtilsSuite.class,
	org.wahlzeit.services.mailing.MailingServicesSuit.class,
	

})


/**
 * (By-Hand) Test Suite including all JUnit-Tests so far
 */

public class AllTests { /** do nothing **/ }