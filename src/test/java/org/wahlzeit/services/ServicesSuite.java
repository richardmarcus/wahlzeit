/*
 * HandlersSuite.java
 * 
 * Version 1.0
 * 
 * 12.11.2017
 */
package org.wahlzeit.services;
import org.junit.runner.*;
import org.junit.runners.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({

org.wahlzeit.services.EmailAddressTest.class,
org.wahlzeit.services.LogBuilderTest.class,

})
public class ServicesSuite {

}
