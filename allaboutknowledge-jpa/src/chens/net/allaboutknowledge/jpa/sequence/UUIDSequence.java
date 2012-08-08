/**
 * 
 */
package chens.net.allaboutknowledge.jpa.sequence;

import java.util.UUID;
import java.util.Vector;

import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.internal.databaseaccess.Accessor;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.sequencing.Sequence;
import org.eclipse.persistence.sessions.Session;

/**
 * @author lastcow
 *
 */
public class UUIDSequence extends Sequence implements SessionCustomizer{

	public UUIDSequence() {
		super();
	}
 
	public UUIDSequence(String name) {
		super(name);
	}
	
	@Override
	public void customize(Session session) throws Exception {
		UUIDSequence sequence = new UUIDSequence("system-uuid");
 
		session.getLogin().addSequence(sequence);
	}

	@Override
	public Object getGeneratedValue(Accessor accessor,
			AbstractSession writeSession, String seqName) {
		return UUID.randomUUID().toString().toUpperCase();
	}

	@Override
	public Vector getGeneratedVector(Accessor arg0, AbstractSession arg1,
			String arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onConnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDisconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean shouldAcquireValueAfterInsert() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldUseTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}