//$Id: WhereJoinTable.java 14736 2008-06-04 14:23:42Z hardy.ferentschik $
package org.hibernate.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * Where clause to add to the colleciton join table
 * The clause is written in SQL
 *
 * @author Emmanuel Bernard
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WhereJoinTable {
	String clause();
}
