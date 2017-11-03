package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantActivatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/jdk8u45-b14/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, June 2, 2015 11:08:45 AM CEST
*/


/**
	 * When the POA has the RETAIN policy it uses servant 
	 * managers that are ServantActivators. 
	 */
public interface ServantActivatorOperations  extends org.omg.PortableServer.ServantManagerOperations
{

  /**
  	 * This operation is invoked by the POA whenever the 
  	 * POA receives a request for an object that is not 
  	 * currently active, assuming the POA has the 
  	 * USE_SERVANT_MANAGER and RETAIN policies.
  	 * @param oid object Id associated with the object on 
  	 *            the request was made.
  	 * @param adapter object reference for the POA in which
  	 *                the object is being activated.
  	 * @return Servant corresponding to oid is created or 
  	 *         located by the user supplied servant manager.
  	 * @exception ForwardRequest to indicate to the ORB 
  	 *            that it is responsible for delivering 
  	 *            the current request and subsequent 
  	 *            requests to the object denoted in the 
  	 *            forward_reference member of the exception.
  	 */
  org.omg.PortableServer.Servant incarnate (byte[] oid, org.omg.PortableServer.POA adapter) throws org.omg.PortableServer.ForwardRequest;

  /**
  	 * This operation is invoked whenever a servant for 
  	 * an object is deactivated, assuming the POA has 
  	 * the USE_SERVANT_MANAGER and RETAIN policies.
  	 * @param oid object Id associated with the object 
  	 *            being deactivated.
  	 * @param adapter object reference for the POA in which
  	 *                the object was active.
  	 * @param serv contains reference to the servant
  	 *        associated with the object being deactivated.
  	 * @param cleanup_in_progress if TRUE indicates that
  	 *        destroy or deactivate is called with 
  	 *        etherealize_objects param of TRUE.  FALSE
  	 *        indicates that etherealize was called due to
  	 *        other reasons.
  	 * @param remaining_activations indicates whether the
  	 *        Servant Manager can destroy a servant.  If
  	 *        set to TRUE, the Servant Manager should wait
  	 *        until all invocations in progress have
  	 *        completed.
  	 */
  void etherealize (byte[] oid, org.omg.PortableServer.POA adapter, org.omg.PortableServer.Servant serv, boolean cleanup_in_progress, boolean remaining_activations);
} // interface ServantActivatorOperations
