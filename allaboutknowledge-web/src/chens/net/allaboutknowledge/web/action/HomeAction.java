/**
 * 
 */
package chens.net.allaboutknowledge.web.action;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.seam.international.status.Messages;
import org.jboss.seam.remoting.annotations.WebRemote;
import org.jboss.solder.core.FullyQualified;

import chens.net.allaboutknowledge.jpa.impl.AAKJpaImplCore;
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
		Gender g = (Gender) AAKJpaImplCore.getModelById(Gender.class, "93c964f0-d607-11e1-9b23-0800200c9a66");
		try {
			g.setGender("Where");
			AAKJpaImplCore.updateModel(g);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		messages.error("Message recorded " + g.getGender());
		messages.info("Message recorded");
		//throw new Exception("EEE");
		User user = new User();
		user.userName = "zhijiang chen";
		user.secret = "99058700";
		
		
		return user;
	}
}

class User{
	
	String userName;
	String secret;
}
