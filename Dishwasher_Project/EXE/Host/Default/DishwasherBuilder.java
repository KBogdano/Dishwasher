/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: DishwasherBuilder
//!	Generated Date	: Wed, 3, Apr 2019 
	File Path	: EXE/Host/Default/DishwasherBuilder.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/DishwasherBuilder.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DishwasherBuilder 
public class DishwasherBuilder implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDishwasherBuilder = new AnimClass("Default.DishwasherBuilder",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Dishwasher itsDishwasher;		//## classInstance itsDishwasher 
    
    protected Dishwasher itsDishwasher_0;		//## classInstance itsDishwasher_0 
    
    protected Display itsDisplay;		//## classInstance itsDisplay 
    
    protected Display itsDisplay_0;		//## classInstance itsDisplay_0 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  DishwasherBuilder(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDishwasherBuilder.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Dishwasher getItsDishwasher() {
        return itsDishwasher;
    }
    
    //## auto_generated 
    public Dishwasher newItsDishwasher(RiJThread p_thread) {
        itsDishwasher = new Dishwasher(p_thread);
        animInstance().notifyRelationAdded("itsDishwasher", itsDishwasher);
        return itsDishwasher;
    }
    
    //## auto_generated 
    public void deleteItsDishwasher() {
        animInstance().notifyRelationRemoved("itsDishwasher", itsDishwasher);
        itsDishwasher=null;
    }
    
    //## auto_generated 
    public Dishwasher getItsDishwasher_0() {
        return itsDishwasher_0;
    }
    
    //## auto_generated 
    public Dishwasher newItsDishwasher_0(RiJThread p_thread) {
        itsDishwasher_0 = new Dishwasher(p_thread);
        animInstance().notifyRelationAdded("itsDishwasher_0", itsDishwasher_0);
        return itsDishwasher_0;
    }
    
    //## auto_generated 
    public void deleteItsDishwasher_0() {
        animInstance().notifyRelationRemoved("itsDishwasher_0", itsDishwasher_0);
        itsDishwasher_0=null;
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public Display newItsDisplay(RiJThread p_thread) {
        itsDisplay = new Display(p_thread);
        animInstance().notifyRelationAdded("itsDisplay", itsDisplay);
        return itsDisplay;
    }
    
    //## auto_generated 
    public void deleteItsDisplay() {
        animInstance().notifyRelationRemoved("itsDisplay", itsDisplay);
        itsDisplay=null;
    }
    
    //## auto_generated 
    public Display getItsDisplay_0() {
        return itsDisplay_0;
    }
    
    //## auto_generated 
    public Display newItsDisplay_0(RiJThread p_thread) {
        itsDisplay_0 = new Display(p_thread);
        animInstance().notifyRelationAdded("itsDisplay_0", itsDisplay_0);
        return itsDisplay_0;
    }
    
    //## auto_generated 
    public void deleteItsDisplay_0() {
        animInstance().notifyRelationRemoved("itsDisplay_0", itsDisplay_0);
        itsDisplay_0=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsDishwasher = newItsDishwasher(p_thread);
        itsDishwasher_0 = newItsDishwasher_0(p_thread);
        itsDisplay = newItsDisplay(p_thread);
        itsDisplay_0 = newItsDisplay_0(p_thread);
        itsDisplay.setItsDishwasher(itsDishwasher);
        itsDisplay_0.setItsDishwasher(itsDishwasher_0);
        itsDisplay_0.setItsDishwasher_1(itsDishwasher_0);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsDishwasher.startBehavior();
        done &= itsDishwasher_0.startBehavior();
        done &= itsDisplay.startBehavior();
        done &= itsDisplay_0.startBehavior();
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return DishwasherBuilder.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDishwasherBuilder; 
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
        
        msg.add("itsDisplay", true, true, itsDisplay);
        msg.add("itsDishwasher", true, true, itsDishwasher);
        msg.add("itsDisplay_0", true, true, itsDisplay_0);
        msg.add("itsDishwasher_0", true, true, itsDishwasher_0);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(DishwasherBuilder.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            DishwasherBuilder.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            DishwasherBuilder.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/Default/DishwasherBuilder.java
*********************************************************************/

