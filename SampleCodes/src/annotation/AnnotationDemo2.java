package annotation;
/*
 * 159-Program to create own Annotation in java.
 * -> @interface is used to create your own Annotation.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//creating Marker Annotation (Annotation that don't have any field)
@Target(ElementType.TYPE)	/*Meta Annotation : (Here we have to mention on which level 
								you are going to use this annotation, here we are using
								it for class level.)
						 * @Target(ElementType.TYPE) - class level
						 * @Target(ElementType.METHOD) - method level
						 * @Target(ElementType.FIELD)	- field level
						 * @Target(ElementType.CONSTRUCTOR) - constructor level */

@Retention(RetentionPolicy.RUNTIME)	/*Meta Annotation : Till what point you want this annotation
										@Retention(RetentionPolicy.RUNTIME)	- It will be available till
																				run time.
										@Retention(RetentionPolicy.SOURCE)	- It will be available till
											source file, not available in compile file.
										@Retention(RetentionPolicy.CLASS)	- It will be available in
																			.class file also.
						
									*/
@interface DumbPhone {
	
}

//creating Single Value Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "Android";	//If coder don't mention the value
									//use default value as Android
}

//creating Multi Value Annotation
@Inherited	/*In future if some class inherited NokiaNSeries class
				then these annotations will be available for that class 
				also because NokiaNSeries used this annotation. */
@Documented	/*If you want to introduce your annotation in the documentation.*/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VerySmartPhone {
	String os() default "Symbian";
	int version() default 2;
}

@VerySmartPhone(os="Android", version=6)	//These values overrides the specified default value
class NokiaNSeries {
	
}

public class AnnotationDemo2 {

	public static void main(String[] args) {
		
		

	}

}
