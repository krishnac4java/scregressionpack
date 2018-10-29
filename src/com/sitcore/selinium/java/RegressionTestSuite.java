package com.sitcore.selinium.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   Opportunity_Creation_All_Record_Types.class,
   /*US_1292.class,
   US_1293.class,
   US_1294.class,
   US_1383.class,
   US_1087.class,
   US_1090.class,
   US_1258.class,
   US_1246.class,
   US_1263.class,
   US_1295.class,
   US_1343.class,
   US_512.class,
   US_779.class,
   US_567.class,*/
   //US_1595.class,
   SendEmail.class
})
public class RegressionTestSuite {

}
