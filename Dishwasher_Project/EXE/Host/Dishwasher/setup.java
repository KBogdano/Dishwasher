/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: setup
//!	Generated Date	: Fri, 5, Apr 2019 
	File Path	: EXE/Host/Dishwasher/setup.java
*********************************************************************/

package Dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Dishwasher/setup.java                                                                  
//----------------------------------------------------------------------------

//## package Dishwasher 


//## event setup() 
public class setup extends RiJEvent implements AnimatedEvent {
    
    public static final int setup_Dishwasher_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  setup() {
        lId = setup_Dishwasher_id;
    }
    
    public boolean isTypeOf(long id) {
        return (setup_Dishwasher_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Dishwasher.setup");
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
          String s="setup(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Dishwasher/setup.java
*********************************************************************/

