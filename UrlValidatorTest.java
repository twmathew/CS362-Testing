/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("START");
       System.out.println("RESULT"+urlVal.isValid("http://www.amazon.com"));
       System.out.println("\n");
       System.out.println("RESULT"+urlVal.isValid("https://en.wimipedia.org/wigi/C*ow_(disambiguation)"));
       /*System.out.println(urlVal.isValid("http://www.google.com"));
       System.out.println(urlVal.isValid("008.008.008.008"));
       System.out.println(urlVal.isValid("https://en.wikipedia.org/wiki/Cow_(disambiguation)"));
       System.out.println(urlVal.isValid("https://en.wikipedia.org/wiki/Cow_(disambiguation)"));
       System.out.println(urlVal.isValid("https://en.wikipedia.org/wiki/Cow_(disambiguation)"));
       System.out.println(urlVal.isValid("b"));
       System.out.println(urlVal.isValid("a"));
       System.out.println(urlVal.isValid("http://w"));
       */
       System.out.println("\n DONE");
       
   }
   
   
   public void testYourFirstPartition()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("START");
       System.out.println("START testing scheme");
       System.out.println(urlVal.isValidScheme("http"));
       System.out.println(urlVal.isValidScheme("https"));
       System.out.println(urlVal.isValidScheme("ie."));
       System.out.println(urlVal.isValidScheme("ftp"));
       System.out.println(urlVal.isValidScheme("HELLOPEEPS"));
       System.out.println("DONE testing scheme");
       System.out.println(urlVal.isValid("https://en.wikipedia.org/wii/Cow_(disambiguation)"));
       System.out.println(urlVal.isValid("https://en.wikipedia.org/wiki/Cow_(disambiguation)"));
       System.out.println(urlVal.isValid("b"));
       System.out.println(urlVal.isValid("a"));
       System.out.println(urlVal.isValid("http://w"));      
       System.out.println("DONE");
   }
   
   public void testYourSecondPartition()
   {
       //UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       UrlValidator urlVal = new UrlValidator(null,null,UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("****************START*******************");
       System.out.println(urlVal.isValidScheme("www.amazon.com"));
       System.out.println(urlVal.isValidScheme("www.amazon.com"));
       System.out.println(urlVal.isValidScheme("www.amazon.com"));
       System.out.println(urlVal.isValidScheme("www.amazon.com"));
       System.out.println(urlVal.isValidScheme("httpk:"));
       System.out.println(urlVal.isValidScheme("httpm"));
       System.out.println(urlVal.isValidScheme("http://"));
       System.out.println(urlVal.isValidScheme("https:"));
       System.out.println(urlVal.isValidScheme("https://"));
       System.out.println("****************DONE*******************");
   }
   
   
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       String myURL = ""; 
       String[] myScheme = {"http","https","etc.","hello","ftp"};
       String[] myAuthority = {"go.com","www.google.com.","255.0.0.0","256.256.256.2546"};
       String[] myPath = {"/fatd","/berr","/fjdksljlfds","/fdsfdsre"};
       String[] myQueries = {"?action=view","?action=edit&mode=up",""};
       String[] Fragment = {"","","","","","",""};
       for(int i = 0;i<5;i++)
       {
           for(int w =0; w < 2; w++) 
           {
               for(int x =0 ; x < 4 ; x++) 
               {
                   for(int y =0; y<3 ; y++) 
                   {
                       myURL = myScheme[i]+"://"+ myAuthority[w] + myPath[x];// + myQueries[y];
                       System.out.println("MY URL: "+myURL);
                       System.out.println(urlVal.isValid(myURL));
                   }
               }
               System.out.println("MANUAL TEST: "+urlVal.isValid("https://www.google.com.et/?gws_rd=ssl"));
               System.out.println("MANUAL TEST: "+urlVal.isValid("http://200.0.0"));
               System.out.println("MANUAL TEST: "+urlVal.isValid("http://256.256.256.256"));
           }
       }
   }
   public void testAnyOtherUnitTest()
   {
       
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
}