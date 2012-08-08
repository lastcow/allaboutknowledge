/**
 * 
 */
package chens.net.allaboutknowledge.web.action;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.jboss.seam.international.status.Messages;
import org.jboss.seam.remoting.annotations.WebRemote;
import org.jboss.solder.core.FullyQualified;

import chens.net.allaboutknowledge.jpa.impl.JpaResource;
import chens.net.allaboutknowledge.jpa.model.Gender;

/**
 * @author lastcow
 *
 */
@FullyQualified @Named
public class HomeAction {
	
	@Inject Messages messages;

	@WebRemote
	public User getStr(String name) {
		Gender g = JpaResource.getGender();
		
		messages.error("Message recorded " + g.getGender());
		messages.info("Message recorded");
		//throw new Exception("EEE");
		User user = new User();
		user.userName = "zhijiang chen";
		user.secret = "99058700";
		
		Gender gender = new Gender();
		gender.setGender("Unknow");
		JpaResource.createNewGender(gender);
		
		return user;
	}
}

class User{
	
	String userName;
	String secret;
}
