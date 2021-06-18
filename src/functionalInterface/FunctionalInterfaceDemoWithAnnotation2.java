package functionalInterface;

/**
 * @author abinash
 * In this case, the interface is explicitly defined with annotation but no abstract method has been defined in that.
 * So, this will give a compile time error.
 * 
 *  CE: unexpected @FunctionalInterface annotation.
 *  No abstract method found in interface  FunctionalInterfaceDemoWithAnnotation2
 */
@FunctionalInterface
public interface FunctionalInterfaceDemoWithAnnotation2 {

}
