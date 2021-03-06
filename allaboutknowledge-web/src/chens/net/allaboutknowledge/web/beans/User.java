/**
 * 
 */
package chens.net.allaboutknowledge.web.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.jboss.solder.core.FullyQualified;


@FullyQualified @Named
@SessionScoped
/**
 * @author lastcow
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4703050258987999907L;
	private String userName;
	
	/**
	 * 
	 */
	public User() {
		this.setUserName("zhijiang chen");
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
