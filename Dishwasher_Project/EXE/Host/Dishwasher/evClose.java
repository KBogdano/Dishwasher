/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evClose
//!	Generated Date	: Fri, 5, Apr 2019 
	File Path	: EXE/Host/Dishwasher/evClose.java
*********************************************************************/

package Dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Dishwasher/evClose.java                                                                  
//----------------------------------------------------------------------------

//## package Dishwasher 


//## event evClose() 
public class evClose extends RiJEvent implements AnimatedEvent {
    
    public static final int evClose_Dishwasher_id = 18618;		//## ignore 
    
    
    // Constructors
    
    public  evClose() {
        lId = evClose_Dishwasher_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evClose_Dishwasher_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Dishwasher.evClose");
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
    }
    public String toString() {
          String s="evClose(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Dishwasher/evClose.java
*********************************************************************/

