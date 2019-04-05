/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: CleansingEngineer
//!	Generated Date	: Fri, 5, Apr 2019 
	File Path	: EXE/Host/Dishwasher/CleansingEngineer.java
*********************************************************************/

package Dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Dishwasher/CleansingEngineer.java                                                                  
//----------------------------------------------------------------------------

//## package Dishwasher 


//## actor CleansingEngineer 
public class CleansingEngineer implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCleansingEngineer = new AnimClass("Dishwasher.CleansingEngineer",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  CleansingEngineer() {
        try {
            animInstance().notifyConstructorEntered(animClassCleansingEngineer.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCleansingEngineer; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CleansingEngineer.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CleansingEngineer.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CleansingEngineer.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Dishwasher/CleansingEngineer.java
*********************************************************************/

