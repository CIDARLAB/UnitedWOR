/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cidarlab.unitedwor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import org.cidarlab.icerestapijava.DOM.AccessToken;
import org.cidarlab.icerestapijava.ICE;
import org.json.JSONObject;
import org.sbolstack.frontend.StackException;
import org.sbolstack.frontend.StackFrontend;
import org.sbolstandard.core2.SBOLDocument;
import org.sbolstandard.core2.SBOLReader;
import uk.ac.ncl.intbio.core.io.CoreIoException;

/**
 *
 * @author prash
 */
public class United {

    public static AccessToken getICEAccessToken(String iceURL, String email, String password) {
        ICE ice = new ICE(iceURL);
        return ice.createAccessToken(email, password);
    }

    public static JSONObject getICEpart(String iceURL, String sessionId, String partId) {
        ICE ice = new ICE(iceURL);
        return ice.getPart(sessionId, partId);
    }
    
    public static SBOLDocument convertICEJSONtoSBOLDocument(JSONObject iceObject){
        
        InputStream stream = new ByteArrayInputStream(iceObject.toString().getBytes(StandardCharsets.UTF_8));
        SBOLDocument doc = new SBOLDocument();
        try {
            doc = SBOLReader.read(stream);
            
            //doc = SBOLReader.read()
        } catch (CoreIoException ex) {
            Logger.getLogger(United.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XMLStreamException ex) {
            Logger.getLogger(United.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FactoryConfigurationError ex) {
            Logger.getLogger(United.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
    }
    
    
    public static boolean saveSBOLtoSBOLStack(String stackURL, SBOLDocument doc){
        StackFrontend stack = new StackFrontend(stackURL);
        try {
            stack.upload(doc);
        } catch (StackException ex) {
            Logger.getLogger(United.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public static boolean saveSBOLtoSBOLStackStore(String stackURL, String store, SBOLDocument doc){
        StackFrontend stack = new StackFrontend(stackURL);
        try {
            stack.upload(store, doc);
        } catch (StackException ex) {
            Logger.getLogger(United.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public static JSONObject convertSBOLDocumentToJSONObject(SBOLDocument doc){
        
        JSONObject object = new JSONObject();
        //For some reason I can't access SBOL's write to JSON
        //But the idea is that you can save this to a JSON Object and then convert it to a part and then save that to ICE.
        
        
        
        return object;
    }
    

}
