package org.omg.PortableServer;


/**
* org/omg/PortableServer/_ServantActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u101/7261/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, June 22, 2016 1:22:40 AM PDT
*/


/**
	 * When the POA has the RETAIN policy it uses servant 
	 * managers that are ServantActivators. 
	 */
public class _ServantActivatorStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.PortableServer.ServantActivator
{
  final public static java.lang.Class _opsClass = ServantActivatorOperations.class;



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
  public org.omg.PortableServer.Servant incarnate (byte[] oid, org.omg.PortableServer.POA adapter) throws org.omg.PortableServer.ForwardRequest
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("incarnate", _opsClass);
      ServantActivatorOperations  $self = (ServantActivatorOperations) $so.servant;

      try {
         return $self.incarnate (oid, adapter);
      } finally {
          _servant_postinvoke ($so);
      }
  } // incarnate


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
  public void etherealize (byte[] oid, org.omg.PortableServer.POA adapter, org.omg.PortableServer.Servant serv, boolean cleanup_in_progress, boolean remaining_activations)
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("etherealize", _opsClass);
      ServantActivatorOperations  $self = (ServantActivatorOperations) $so.servant;

      try {
         $self.etherealize (oid, adapter, serv, cleanup_in_progress, remaining_activations);
      } finally {
          _servant_postinvoke ($so);
      }
  } // etherealize

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/PortableServer/ServantActivator:2.3", 
    "IDL:omg.org/PortableServer/ServantManager:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ServantActivatorStub
