/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cidarlab.unitedwor;

import org.cidarlab.icerestapijava.DOM.AccessToken;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sbolstandard.core2.SBOLDocument;

/**
 *
 * @author prash
 */
public class UnitedTest {
    
    public UnitedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testICEtoSBOLStack(){
        String password = "supersafepassword";
        String email = "prash@bu.edu";
        String partId = "JPUB_007685";
        String sbolstackurl = "http://sbolstack.org/";
        String iceurl = "https://public-registry.jbei.org";
        System.out.println(United.convertICEJSONtoSBOLDocument(United.getICEpart(iceurl, (United.getICEAccessToken(iceurl, email, password)).getSessionId(), partId)).toString());
        United.saveSBOLtoSBOLStack(sbolstackurl, United.convertICEJSONtoSBOLDocument(United.getICEpart(iceurl, (United.getICEAccessToken(iceurl, email, password)).getSessionId(), partId)));
    }
    
    
    
}
