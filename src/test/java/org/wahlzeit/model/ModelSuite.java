/*
 * ModelSuite.java
 * 
 * Version 1.0
 * 
 * 12.11.2017
 */

package org.wahlzeit.model;
import org.junit.runner.*;
import org.junit.runners.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({


org.wahlzeit.model.AccessRightsTest.class,
org.wahlzeit.model.CoordinateTest.class,
org.wahlzeit.model.FlagReasonTest.class,
org.wahlzeit.model.GenderTest.class,
org.wahlzeit.model.GuestTest.class,
org.wahlzeit.model.LocationTest.class,
org.wahlzeit.model.PhotoFilterTest.class,
org.wahlzeit.model.TagsTest.class,
org.wahlzeit.model.UserStatusTest.class,
org.wahlzeit.model.ValueTest.class,

})
public class ModelSuite {

}
