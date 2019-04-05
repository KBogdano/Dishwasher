/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evKeyPress
//!	Generated Date	: Fri, 5, Apr 2019 
	File Path	: EXE/Host/Dishwasher/evKeyPress.java
*********************************************************************/

package Dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Dishwasher/evKeyPress.java                                                                  
//----------------------------------------------------------------------------

//## package Dishwasher 


//## event evKeyPress(char) 
public class evKeyPress extends RiJEvent implements AnimatedEvent {
    
    public static final int evKeyPress_Dishwasher_id = 18619;		//## ignore 
    
    public char key;
    
    // Constructors
    
    public  evKeyPress() {
        lId = evKeyPress_Dishwasher_id;
    }
    public  evKeyPress(char p_key) {
        lId = evKeyPress_Dishwasher_id;
        key = p_key;
    }
    
    public boolean isTypeOf(long id) {
        return (evKeyPress_Dishwasher_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Dishwasher.evKeyPress");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("key", key);
    }
    public String toString() {
          String s="evKeyPress(";      
          s += "key=" + AnimInstance.animToString(key) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Dishwasher/evKeyPress.java
*********************************************************************/

